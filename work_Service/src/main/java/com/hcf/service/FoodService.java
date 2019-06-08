package com.hcf.service;

import com.hcf.helpClass.WebTable;
import com.hcf.pojo.TbGoods;

import java.util.List;

public interface FoodService {

    public WebTable<TbGoods> getGoodsBySellerId(int page,int limit,String seller);

    public WebTable<TbGoods> getGoodsBySellerId(int page,int limit,
                                                String goodsid, String goodsname,String seller);

    public int updateGoodsInfo(TbGoods goods);

    public int delGoodsById(String id);

    public int addGoods(TbGoods goods,String seller);

    public int getCount(String userid);

    /***
     *
     *         if(type == "lowprice")
     *             criteria.andGoodspriceBetween(0.0,9.0);
     *         else if( type == "midprice")
     *             criteria.andGoodspriceBetween(9.0,25.0);
     *         else if( type == "highprice")
     *             criteria.andGoodspriceGreaterThanOrEqualTo(25.0);
     *         else if( type == "highstar")
     *             criteria.andGoodsstarsGreaterThan(50);
     *         else if( type == "lowstar")
     *             criteria.andGoodsstarsLessThan(50);
     *         else if( type == "highcmt")
     *             criteria.andGoodscmtnumGreaterThan(50);
     *         else if( type == "lowcmt")
     *             criteria.andGoodscmtnumLessThan(50);
     * @param page
     * @param limit
     * @param type
     * @return
     */
    public List<TbGoods> getGoodsBySituation(int page, int limit, String type);

    public List<String> gettopNum_food(int page, int limit, String type);

    public List<TbGoods> getGoodsByOrderSituation(int page, int limit,String id, String type);

    public List<String> getPayerfood(int page, int limit,String id, String type);
}
