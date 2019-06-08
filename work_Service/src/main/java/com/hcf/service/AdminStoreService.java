package com.hcf.service;

import com.hcf.helpClass.WebTable;
import com.hcf.pojo.TbStore;
import com.hcf.pojo.VGoods;


public interface AdminStoreService {
    //查询用户
    public WebTable<TbStore> getAllStore(int page,int limit) ;

    public WebTable<TbStore> getStoreByInfo(int page,int limit
            ,String storeName,String storeAddress,String storeId
            ,int storeType,int storeAverPrice,int storeLevel,int storeCmtNum) ;

    public WebTable<VGoods> getGoodsByInfo(int page, int limit
            , String storeId
            , int storeType, int storeStar) ;

    public WebTable<VGoods> getGoods(int page, int limit,String storeid,String goodsid,
                                     String goodsname,int goodsCmt,int goodsStar);
}
