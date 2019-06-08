package com.controller.order;

import com.hcf.helpClass.Cart;
import com.hcf.helpClass.WebTable;
import com.hcf.mapper.TbOrderdetailMapper;
import com.hcf.mapper.TbOrdersMapper;
import com.hcf.pojo.*;
import com.hcf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;
//获取订单的信息的控制器
@Controller
@RequestMapping("/order")
public class uorderController {


    @Autowired
    private OrderService orderService;

    /***
     *    通用接口   创建订单   获取订单信息
     * @param cart
     * @param address
     * @param orderOther
     * @return
     */
    @RequestMapping("/create_order")
    @ResponseBody
    public String createOrder(String cart, String address,String orderOther)
    {
        String orderid;
        orderid = orderService.generateOrder(cart,address,orderOther);
        //System.out.println(cart+address);
        //System.out.println(orderid);
        return orderid;
    }

    @RequestMapping("/store_order")
    @ResponseBody
    public WebTable<TbOrders> getStoreOrder(int page,int limit,HttpSession session)
    {
        TbStore store = (TbStore)session.getAttribute("store");
        WebTable<TbOrders> table = orderService.getOrders(page,limit,
                store.getStoreid(),"",
                "",0);
        return table;
    }


    /***
     *     通用接口
     *     获取更改订单状态 +1
     */

    @RequestMapping("/acquire_Order")
    @ResponseBody
    public String acquire_Order(String orderid,int status)
    {
        Boolean ret = orderService.changeOrders(orderid,status);
        return ret ?"success":"fail";
    }

    /***
     * 商铺信息专用接口  中的获取信息操作
     * @param page
     * @param limit
     * @return
     */
    @RequestMapping("/search_orderNear")
    @ResponseBody
    public WebTable<TbOrders> getOrder_near(int page, int limit, HttpSession session)
    {
        TbStore store = (TbStore)session.getAttribute("store");
        WebTable<TbOrders> table =
                orderService.getOrdersByStoreSituation(store.getStoreid(),"",2);
        return table;
    }

    @RequestMapping("/search_orderSituation")
    @ResponseBody
    public WebTable<TbOrders> getOrder_Situation(int page,int limit,
                                                 String method,int status,
                                                 HttpSession session)
    {
        TbStore store = (TbStore)session.getAttribute("store");
        WebTable<TbOrders> table =
                orderService.getOrdersByStoreSituation(store.getStoreid(),method,status);
        return table;
    }

    @RequestMapping("/order_Detail")
    @ResponseBody
    public WebTable<VOrderdgoods> getOrder_Detail(int page,int limit,String orderid)
    {
        //WebTable<TbOrderdetail> table = orderService.getOrdersDetail(orderid);
        WebTable<VOrderdgoods> table = orderService.getOrdersDGoods(orderid);
        return table;
    }

    /***
     * 用户个人信息订单获取接口
     * 用户获取订单信息
     * @param page
     * @param limit
     * @param method
     * @param status
     * @param session
     * @return
     */
    @RequestMapping("/search_UserorderSituation")
    @ResponseBody
    public WebTable<TbOrders> getUserOrder_Situation(int page,int limit,
                                                     String method,int status,
                                                     HttpSession session)
    {
        TbUser user = (TbUser)session.getAttribute("user");
        WebTable<TbOrders> table =
                orderService.getOrdersByUserSituation(user.getUserid(),method,status);
        return table;
    }

    @RequestMapping("/user_order")
    @ResponseBody
    public WebTable<TbOrders> getUserOrder(HttpSession session)
    {
        TbUser user = (TbUser)session.getAttribute("user");
        WebTable<TbOrders> table = orderService.getOrdersByPayer(user.getUserid());
        return table;
    }
    //-------------------------------------------------------------------------------
    @RequestMapping("/bytheway")
    public String getBytheWay()
    {
       return "/bytheway/bytheway-index";
    }
}

