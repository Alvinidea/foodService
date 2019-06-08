package com.hcf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hcf.mapper.*;
import com.hcf.pojo.*;
import com.hcf.service.WayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class WayServiceImpl implements WayService {

    @Autowired
    private TbOrderdetailMapper orderdetailMapper;
    @Autowired
    private TbOrdersMapper orderMapper;
    @Autowired
    private VOrderwayMapper vOrderwayMapper;
    @Autowired
    private TbGoodsMapper goodsMapper;
    @Autowired
    private TbBythewayMapper tbBythewayMapper;
    @Autowired
    private VWayMapper vWayMapper;
    @Autowired
    private TbUserMapper userMapper;
    @Autowired
    private TbStoreMapper storeMapper;
    @Override
    public List<VOrderway> getOrders(int page, int limit, int orderStatus, int goodsnum,
                                    String storeId, String storeName, String userId, String userName,
                                    String sellAd, String payAd) {
        PageHelper.startPage(page,limit);
        VOrderwayExample example =  new VOrderwayExample();
        VOrderwayExample.Criteria criteria = example.createCriteria();
        criteria.andOrderstatusEqualTo(orderStatus);
        if(goodsnum > 0)
            criteria.andOrderdetailnumBetween(goodsnum-1,goodsnum+1);
        if( ! storeId.equals(""))
            criteria.andOrdersellerEqualTo(storeId);
        if( ! userId.equals(""))
            criteria.andOrderpayerEqualTo(userId);
        if( ! storeName.equals(""))
            criteria.andStorenameLike("%"+storeName+"%");
        if( ! userName.equals(""))
            criteria.andUsernameLike("%"+userName+"%");
        if( ! sellAd.equals(""))
            criteria.andOrdersaddressLike("%"+sellAd+"%");
        if( ! payAd.equals(""))
            criteria.andOrderpaddressLike("%"+payAd+"%");
        List<VOrderway> list =  vOrderwayMapper.selectByExample( example);
        PageInfo<VOrderway> pageInfo = new PageInfo<>(list);
        List<VOrderway> rets = pageInfo.getList();
        return rets;
    }

    @Override
    public List<TbGoods> getOrderD(String id) {
        List<TbGoods> tbGoods = new ArrayList<>();
        TbOrderdetailExample example= new TbOrderdetailExample();
        TbOrderdetailExample.Criteria criteria = example.createCriteria();
        criteria.andOrderidEqualTo(id);
        List<TbOrderdetail>  list = orderdetailMapper.selectByExample(example);
        for(TbOrderdetail orderdetail:list)
        {
            TbGoods good = goodsMapper.selectByPrimaryKey(orderdetail.getGoodsid());
            good.setGoodsother(orderdetail.getOrdergnumd()+"");
            tbGoods.add(good);
        }
        return tbGoods;
    }

    @Override
    public TbBytheway createWayOrder(String id,String deliver) {
        setOrderStatus(id,4);//4跑腿中
        TbBytheway bytheway = new TbBytheway();
        bytheway.setBegintime(new Date());
        bytheway.setDeliver(deliver);
        bytheway.setOrderid(id);
        bytheway.setOther("");
        bytheway.setPrice(1.0);
        bytheway.setStatus(1);
        bytheway.setStar(0);
        //bytheway.setOvertime("");
        bytheway.setPayercmt("");
        bytheway.setSellercmt("");
        tbBythewayMapper.insertSelective(bytheway);
        return  bytheway;
    }

    @Override
    public int setOrderStatus(String id,int st) {
       TbOrders orders= orderMapper.selectByPrimaryKey(id);
       orders.setOrderstatus(st);
       return orderMapper.updateByPrimaryKeySelective(orders);
    }

    @Override
    public List<VWay> getWayOrder(int page,int limit,int status,String id) {
        PageHelper.startPage(page,limit);
        VWayExample vWayExample = new VWayExample();
        VWayExample.Criteria criteria = vWayExample.createCriteria();
        criteria.andDeliverEqualTo(id);
        criteria.andStatusEqualTo(status);
        List<VWay> list = vWayMapper.selectByExample(vWayExample);
        PageInfo pageInfo = new PageInfo<>(list);
        return pageInfo.getList();
    }

    @Override
    public TbBytheway suerWayOrder(String id) {
        TbBytheway tbBytheway=tbBythewayMapper.selectByPrimaryKey(Integer.parseInt(id));
        setOrderStatus(tbBytheway.getOrderid(), 6);
        if(tbBytheway == null)
            return null;
        tbBytheway.setStatus(2);
        tbBythewayMapper.updateByPrimaryKeySelective(tbBytheway);
        return tbBytheway;
    }
}
