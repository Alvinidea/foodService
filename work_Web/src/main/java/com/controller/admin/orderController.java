package com.controller.admin;

import com.hcf.helpClass.WebTable;
import com.hcf.mapper.TbOrdersMapper;
import com.hcf.pojo.TbOrders;
import com.hcf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin/order")
public class orderController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/order_list")
    public String order_list()
    {
        return "manage/order/order-list";
    }

    @RequestMapping("/order_list2")
    public String order_list2()
    {
        return "manage/order/order-list2";
    }

    @RequestMapping("/order_add")
    public String order_add()
    {
        return "manage/order/order-add";
    }

    @RequestMapping("/order_cmt")
    public String order_cmt()
    {
        return "manage/order/order-cmt";
    }

    @RequestMapping("/getOrderList")
    @ResponseBody
    public WebTable<TbOrders> getOderList(int page, int limit
            , String payerid,String payername
            , String sellerid,String sellername
            , String orderid,String method,int status)
    {
        return adminService.getOrders(page,limit,payerid,payername,sellerid,sellername,orderid,method,status);
    }

    @RequestMapping("/getCmtList")
    @ResponseBody
    public WebTable<TbOrders> getCmtList(int page, int limit)
    {
        return adminService.getOrdersBySituation(page,limit,"",-1,"","");
    }
}