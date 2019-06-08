package com.hcf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hcf.helpClass.WebTable;
import com.hcf.mapper.TbStoreMapper;
import com.hcf.mapper.VGoodsMapper;
import com.hcf.pojo.*;
import com.hcf.service.AdminStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminStoreServiceImpl implements AdminStoreService {

    @Autowired
    public TbStoreMapper storeMapper;
    @Autowired
    private VGoodsMapper vGoodsMapper;

    @Override
    public WebTable<TbStore> getAllStore(int page,int limit) {
        PageHelper.startPage(page,limit);
        TbStoreExample example = new TbStoreExample();
        List<TbStore> storeList = storeMapper.selectByExample(example);

        WebTable<TbStore> list = new WebTable<TbStore>();
        list.setData(storeList);
        return list;
    }

    /***
     *
     * @param page
     * @param limit
     * @param storeName
     * @param storeAddress
     * @param storeId
     * @param storeType
     * @param storeAverPrice
     * @param storeLevel
     * @param storeCmtNum
     * @return
     */
    @Override
    public WebTable<TbStore> getStoreByInfo(int page,int limit
            ,String storeName,String storeAddress,String storeId
            ,int storeType,int storeAverPrice,int storeLevel,int storeCmtNum)
    {
        /*
         *   //var type = "11";
         *   // 10 所有商铺  11代表食堂 12 普通商铺  13 待开发
         *   // 20 评论数目高   21 低
         *   // 30 商家等级高   31 低
         * */
        PageHelper.startPage(page,limit);
        TbStoreExample example = new TbStoreExample ();
        TbStoreExample.Criteria criteria = example.createCriteria();
        if( ! storeName.equals("") )
            criteria.andStorenameLike(storeName);
        if( ! storeAddress.equals(""))
            criteria.andStoreaddressLike(storeAddress);
        if( ! storeId.equals(""))
            criteria.andStoreidEqualTo(storeId);
        if( storeAverPrice != -1)
            criteria.andStoreaverpriceBetween(storeAverPrice-2,storeAverPrice+2);
        if( storeLevel != -1)
            criteria.andStorelevelBetween(storeLevel-1,storeLevel+1);
        if( storeCmtNum != -1)
            criteria.andStorelevelBetween(storeCmtNum-50,storeCmtNum+50);
        if( storeType != -1)
            criteria.andStoretypeEqualTo(storeType);
        List<TbStore> stores = storeMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(stores);
        List<TbStore> list = pageInfo.getList();
        WebTable<TbStore> table = new WebTable<>();
        table.setData(list);
        table.count = storeMapper.countByExample(example);
        return  table;
    }

    @Override
    public WebTable<VGoods> getGoodsByInfo(int page, int limit
            , String storeId
            , int storeType, int goodsStar)
    {
        PageHelper.startPage(page,limit);
        VGoodsExample example = new VGoodsExample();
        VGoodsExample.Criteria criteria = example.createCriteria();
        if( ! storeId.equals(""))
            criteria.andGoodssellerEqualTo(storeId);
        if( goodsStar != -1)
            criteria.andGoodsstarsBetween(goodsStar-1,goodsStar+1);
        if( storeType != -1)
            criteria.andStoretypeEqualTo(storeType);
        List<VGoods> stores = vGoodsMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(stores);
        List<VGoods> list = pageInfo.getList();
        WebTable<VGoods> table = new WebTable<>();
        table.setData(list);
        table.count = vGoodsMapper.countByExample(example);
        return  table;
    }
    public WebTable<VGoods> getGoods(int page, int limit,String storeid,String goodsid,
                                     String goodsname,int goodsCmt,int goodsStar)
    {
        PageHelper.startPage(page,limit);
        VGoodsExample example = new VGoodsExample();
        VGoodsExample.Criteria criteria = example.createCriteria();
        if( ! storeid.equals(""))
            criteria.andGoodssellerEqualTo(storeid);
        if( !goodsname.equals("") )
            criteria.andGoodsnameLike(goodsname);
        if(!goodsid.equals(""))
            criteria.andGoodsidEqualTo(goodsid);
        if( goodsCmt!=-1)
            criteria.andGoodscmtnumBetween(goodsCmt-10,goodsCmt+10);
        if( goodsStar!=-1)
            criteria.andGoodsstarsBetween(goodsStar-10,goodsStar+10);

        List<VGoods> stores = vGoodsMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(stores);
        List<VGoods> list = pageInfo.getList();
        WebTable<VGoods> table = new WebTable<>();
        table.setData(list);
        table.count = vGoodsMapper.countByExample(example);
        return  table;
    }
}
