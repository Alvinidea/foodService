package com.hcf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hcf.helpClass.WebTable;
import com.hcf.mapper.TbGoodsMapper;
import com.hcf.mapper.TbOrderdetailMapper;
import com.hcf.mapper.TbOrdersMapper;
import com.hcf.mapper.TbStoreMapper;
import com.hcf.pojo.*;
import com.hcf.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private TbGoodsMapper goodsMapper;
    @Autowired
    private TbStoreMapper storeMapper;
    @Autowired
    private TbOrdersMapper ordersMapper;
    @Autowired
    private TbOrderdetailMapper orderdetailMapper;

    @Override
    public WebTable<TbGoods> getGoodsBySellerId(int page, int limit, String seller) {
        WebTable<TbGoods> table = new WebTable<>();
        TbGoodsExample example = new TbGoodsExample();
        TbGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andGoodssellerEqualTo(seller);
        List<TbGoods> list = goodsMapper.selectByExample(example);
        table.setData(list);
        return table;
    }

    @Override
    public WebTable<TbGoods> getGoodsBySellerId(int page, int limit, String goodsid, String goodsname, String seller) {
        //PageHelper.startPage(page, limit);
        WebTable<TbGoods> table = new WebTable<>();
        TbGoodsExample example = new TbGoodsExample();
        TbGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andGoodssellerEqualTo(seller);
        if (!goodsid.equals("")){
            criteria.andGoodsidEqualTo(goodsid);
        }
        if (! goodsname.equals("")){
            criteria.andGoodsnameLike(goodsname);
        }

        List<TbGoods> list = goodsMapper.selectByExample(example);

        //PageInfo<TbGoods> pageInfo = new PageInfo<>(list);
        //List<TbGoods> goodsList = pageInfo.getList();

        table.setData( list,list.size());
        return table;
    }

    public int updateGoodsInfo(TbGoods goods)
    {
        int ret =-1;
        ret = goodsMapper.updateByPrimaryKeySelective(goods);
        return ret;
    }

    public int delGoodsById(String id)
    {
        int ret=-1;
        ret = goodsMapper.deleteByPrimaryKey(id);
        return ret;
    }

    public int addGoods(TbGoods goods,String seller)
    {
        int ret=-1;
        goods.setGoodsid(seller+new Date().getTime());
        goods.setGoodsseller(seller);
        goods.setGoodscmtnum(0);
        goods.setGoodsstars(0);
        ret = goodsMapper.insertSelective(goods);
        return ret;
    }

    @Override
    public int getCount(String userid) {
        int count=0;
        TbGoodsExample foodExample = new TbGoodsExample();
        TbGoodsExample.Criteria criteria = foodExample.createCriteria();
        criteria.andGoodssellerEqualTo(userid);
        count = goodsMapper.countByExample(foodExample);
        return  count;
    }

    @Override
    public List<TbGoods> getGoodsBySituation(int page, int limit, String type) {
        PageHelper.startPage(page,limit);
        TbGoodsExample example = new TbGoodsExample();
        TbGoodsExample.Criteria criteria = example.createCriteria();
        if(type == "lowprice")
            criteria.andGoodspriceBetween(0.0,9.0);
        else if( type == "midprice")
            criteria.andGoodspriceBetween(9.0,25.0);
        else if( type == "highprice")
            criteria.andGoodspriceGreaterThanOrEqualTo(25.0);
        else if( type == "highstar")
            criteria.andGoodsstarsGreaterThan(50);
        else if( type == "lowstar")
            criteria.andGoodsstarsLessThan(50);
        else if( type == "highcmt")
            criteria.andGoodscmtnumGreaterThan(50);
        else if( type == "lowcmt")
            criteria.andGoodscmtnumLessThan(50);

        List<TbGoods> list = goodsMapper.selectByExample(example);

        //得到分页助手帮忙查询的数据
        PageInfo<TbGoods> postsPageInfo = new PageInfo<>(list);
        //封装了一页显示的用户信息的集合
        List<TbGoods> resps = postsPageInfo.getList();
        return  resps;
    }

    @Override
    public List<String> gettopNum_food(int page, int limit, String type)
    {
        int i;
        List<TbGoods> goods = getGoodsBySituation(page, limit,type);
        List<String> list = new ArrayList<>();
        for(i=0;i < goods.size()-1;i++)
        {
            //title,url_storeid,pic,username
            String str = new String("");
            TbStore store = storeMapper.selectByPrimaryKey(goods.get(i).getGoodsseller());
            str += goods.get(i).getGoodsname()+",";
            str += store.getStoreid()+",";
            str += goods.get(i).getGoodspic()+",";
            str += store.getStoreid()+",";
            list.add(str);
        }
        String str = new String("");
        TbStore store = storeMapper.selectByPrimaryKey(goods.get(i).getGoodsseller());
        str += goods.get(i).getGoodsname()+",";
        str += store.getStoreid()+",";
        str += goods.get(i).getGoodspic()+",";
        str += store.getStoreid();
        list.add(str);
        return list;
    }

    @Override
    public List<TbGoods> getGoodsByOrderSituation(int page, int limit,String id, String type) {
        List<TbGoods> goods = new ArrayList<>();
        PageHelper.startPage(page,limit);
        TbOrdersExample example = new TbOrdersExample();
        TbOrdersExample.Criteria criteria = example.createCriteria();
        criteria.andOrderpayerEqualTo(id);
        List<TbOrders> list = ordersMapper.selectByExample(example);
        //得到分页助手帮忙查询的数据
        PageInfo<TbOrders> postsPageInfo = new PageInfo<>(list);
        //封装了一页显示的用户信息的集合
        List<TbOrders> resps = postsPageInfo.getList();
        for(TbOrders order:resps)
        {
            TbOrderdetailExample tbOrderdetailExample = new TbOrderdetailExample();
            TbOrderdetailExample.Criteria criteria1 = tbOrderdetailExample.createCriteria();
            criteria1.andOrderidEqualTo(order.getOrderid());
            List<TbOrderdetail> tbOrderdetails =  orderdetailMapper.selectByExample(tbOrderdetailExample);
            for(TbOrderdetail orderdetail:tbOrderdetails)
            {
                goods.add(goodsMapper.selectByPrimaryKey(orderdetail.getGoodsid()));
                if(goods.size() == 4)
                    return goods;
            }
        }
        return  goods;
    }

    @Override
    public List<String> getPayerfood(int page, int limit,String id, String type)
    {
        int i;
        List<String> list = new ArrayList<>();
        List<TbGoods> goods = getGoodsByOrderSituation(page, limit,id,type);
        if(goods.size() == 0)
            return list;
        for(i=0;i < goods.size()-1;i++)
        {
            //title,url_storeid,pic,username
            String str = new String("");
            TbStore store = storeMapper.selectByPrimaryKey(goods.get(i).getGoodsseller());
            str += goods.get(i).getGoodsname()+",";
            str += store.getStoreid()+",";
            str += goods.get(i).getGoodspic()+",";
            str += store.getStoreid()+",";
            list.add(str);
        }
        String str = new String("");
        TbStore store = storeMapper.selectByPrimaryKey(goods.get(i).getGoodsseller());
        str += goods.get(i).getGoodsname()+",";
        str += store.getStoreid()+",";
        str += goods.get(i).getGoodspic()+",";
        str += store.getStoreid();
        list.add(str);
        return list;
    }
}
