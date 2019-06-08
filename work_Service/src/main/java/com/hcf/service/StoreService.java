package com.hcf.service;

import com.hcf.helpClass.Cart;
import com.hcf.helpClass.WebTable;
import com.hcf.pojo.TbGoods;
import com.hcf.pojo.TbStore;

import java.util.List;

public interface StoreService {

    public int modifyPwd(String userid, String pwd, String newpwd);

    //获取购物车的数据
    public WebTable<Cart> getCart(String[] goodsid,String userid);

    //获取食物清单
    public List<TbGoods> getGoods(int page,int limit,String storeid);

    //获取商铺清单
    public List<TbStore> getStore(int page,int limit);

    //获取商铺清单 有条件
    public List<TbStore> getStoreByType(int page,int limit,String type);

    //获取商铺信息
    public TbStore getStoreInfo(String storeid);

    public int modifyStoreInfo(TbStore store);

    public int addStore(TbStore store);
}
