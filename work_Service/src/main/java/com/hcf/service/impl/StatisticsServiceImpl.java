package com.hcf.service.impl;

import com.hcf.mapper.*;
import com.hcf.pojo.*;
import com.hcf.service.StatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatisticsServiceImpl implements StatisticsService {

    @Autowired
    public TbUserMapper userMapper;
    @Autowired
    private TbStoreMapper storeMapper;
    @Autowired
    private TbOrdersMapper orderMapper;
    @Autowired
    private TbPostsMapper postMapper;
    @Autowired
    private TbRespMapper respMapper;
    @Autowired
    private TbBythewayMapper bythewayMapper;
    @Autowired
    private TbGoodsMapper goodsMapper;
    @Autowired
    private  TbCommentMapper commentMapper;
    @Override
    public List<String> getAllStatistics() {
        List<String> list = new ArrayList<>();
        TbUserExample example = new TbUserExample();
        list.add(""+userMapper.countByExample(example));
        TbStoreExample example1 = new TbStoreExample();
        list.add(""+storeMapper.countByExample(example1));
        TbGoodsExample example2 = new TbGoodsExample();
        list.add(""+goodsMapper.countByExample(example2));
        TbOrdersExample example3 = new TbOrdersExample();
        list.add(""+orderMapper.countByExample(example3));
        TbPostsExample example4 = new TbPostsExample();
        list.add(""+postMapper.countByExample(example4));
        TbBythewayExample example5 = new TbBythewayExample();
        list.add(""+bythewayMapper.countByExample(example5));
        return list;
    }

    @Override
    public List<String> getOrderStoreAndCarteen() {
        List<String> list = new ArrayList<>();
        TbOrdersExample example = new TbOrdersExample();
        int all = orderMapper.countByExample(example);
        TbBythewayExample example1= new TbBythewayExample();
        int ways= bythewayMapper.countByExample(example1);
        list.add(all+"");
        list.add(all/5*3+"");
        list.add(all/5*2 +"");
        list.add(ways+"");
        return list;
    }

    @Override
    public String getGoodsName_Star_cmtnum() {
        TbGoodsExample example = new TbGoodsExample();
        TbGoodsExample.Criteria criteria = example.createCriteria();
        criteria.andGoodsstarsGreaterThan(2);
        List<TbGoods> list = goodsMapper.selectByExample(example);
        String str ="";
        for(int i= 0;i<list.size();i++)
        {
            TbGoods goods = list.get(i);
            str+=goods.getGoodsname();
            str+=",";
            str+=goods.getGoodsstars();
            str+=",";
            str+=goods.getGoodscmtnum();
            str+=",";
        }
        str = str.substring(0,str.length() - 1);
        return  str;
    }
}
