package com.hcf.service;

import com.hcf.helpClass.WebTable;
import com.hcf.pojo.*;

import java.util.List;

public interface WayService {

    public List<VOrderway> getOrders(int page, int limit, int orderStatus, int goodsnum,
                                    String storeId, String storeName,
                                    String userId, String username,
                                    String sellAd, String payAd);

    public List<TbGoods> getOrderD(String id);

    public TbBytheway createWayOrder(String id,String deliver);

    public int setOrderStatus(String id,int st);

    public List<VWay> getWayOrder(int page,int limit,int status,String id);

    public TbBytheway suerWayOrder(String id);
}
