package com.hcf.service;

import com.hcf.helpClass.Cart;
import com.hcf.helpClass.WaitPay;
import com.hcf.helpClass.WebTable;
import com.hcf.pojo.*;

import java.util.List;

public interface OrderService {

    public List<Cart> strCartToList(String str);

    public String generateOrder(String str,String address,String orderOther);

    //商家获取订单列表
    public WebTable<TbOrders> getOrdersBySeller(String sellerid);

    //买家获取订单列表
    public WebTable<TbOrders> getOrdersByPayer(String payerid);
    //买家获取订单列表  用支付方式和 订单状态
    public WebTable<TbOrders> getOrdersByStoreSituation(String seller,String method,int status);

    public WebTable<TbOrders> getOrdersByUserSituation(String seller,String method,int status);

    public WebTable<TbOrders> getOrders(int page,int limit,String seller,String payer,String method,int status);
    //根据订单id获取订单细节
    public WebTable<TbOrderdetail> getOrdersDetail(String orderid);

    //根据订单id获取订单细节
    public Boolean changeOrders(String orderid,int status);

    //根据条件获取不同的订单数目
    public int getCount(String userid,int status,String sp);


    //根据订单id获取订单细节
    public WebTable<VOrderdgoods> getOrdersDGoods(String orderid);
//---------------------------------------------------------------------------------------

    public List<TbComment> createComment(String cmtStr);

    public int generateOrderCmt(String cmtstr);

    public int generateOrderCmt(List<TbComment> list);
    /**
     * 获取订单信息
     * @param orderid
     * @return
     */
    public List<TbOrderdetail> getOD(String orderid);
    public TbStore getSt(String orderid);
    public TbOrders getOrder(String orderid);
    public WaitPay getWaitPayInfo(String orderid);
    public List<WaitPay> getWaitPay(String userid);


    public void modifyOrderStatus(String orderid,int status);

    public void modifyOrderStatusAndmethod(String orderid,String ordermethod,int status);
}
