package com.controller.user;

import com.hcf.helpClass.WaitPay;
import com.hcf.mapper.TbUserMapper;
import com.hcf.pojo.TbStore;
import com.hcf.pojo.TbUser;
import com.hcf.pojo.TbUserdetail;
import com.hcf.pojo.VWay;
import com.hcf.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class userComtroller {

    @Autowired
    private UserService userService;
    @Autowired
    private WayService wayService;
    @Autowired
    private StoreService storeService;
    @Autowired
    private FoodService foodService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private ForumService forumService;

    @RequestMapping("/user_info")
    public String userinfo()
    {
        return "user/user-info";
    }


    @RequestMapping("/user_info_detail")
    public String user_info_detail()
    {
        return "user/user-info-detail";
    }


    @RequestMapping("/user_info_orderItem")
    public String user_info_orderItem()
    {
        return "user/user-info-orderItem";
    }

    @RequestMapping("/user_info_postItem")
    public String user_info_postItem()
    {
        return "user/user-info-postItem";
    }

    @RequestMapping("/user_info_pwd")
    public String user_info_pwd()
    {
        return "user/user-info-pwd";
    }

    @RequestMapping("/user_info_orderItem_Detail")
    public String user_info_orderItem_Detail()
    {
        return "user/user-info-orderItem-Detail";
    }

    @RequestMapping("/user_info_orderPay")
    public String user_info_orderPay()
    {
        return "user/user-info-orderPay";
    }

    @RequestMapping("/user_info_orderPayMethod")
    public String userOrderPayMethod()
    {
        return "user/user-info-orderPayMethod";
    }

    @RequestMapping("/user_info_orderCmt")
    public String userOrderCmt()
    {
        return "user/user-info-orderCmt";
    }
    /***
     * 用户主页操作
     */
    /***
     * 获取用户信息
     * @return
     */
    @RequestMapping("/getUser_info")
    @ResponseBody
    public TbUser getUser_info(HttpSession session)
    {
        TbUser user = (TbUser) session.getAttribute("user");
        TbUser user2 = userService.getUser(user.getUserid());
        session.removeAttribute("user");
        session.setAttribute("user",user2);
        return user;
    }

    @RequestMapping("/getUserDetailInfo")
    @ResponseBody
    public TbUserdetail getTbUserInfoD (HttpSession session)
    {
        TbUser user = (TbUser) session.getAttribute("user");
        return userService.getUserDetail(user);
    }

    /**
     * 获取 用户头像
     * @param session
     * @return
     */
    @RequestMapping("/getUser_photo")
    @ResponseBody
    public String getUser_photo(HttpSession session)
    {
        TbUser user = (TbUser) session.getAttribute("user");
        String str = userService.getUserPhoto(user.getUserid());
        return str;
    }

    //获取统计数据
    @RequestMapping("/get_User_S_detail")
    @ResponseBody
    public int[] user_info_detail_Statistic(HttpSession session)
    {
        TbUser user = (TbUser)session.getAttribute("user");

        int[] list  = new int[4];
        //int postNum =
        list[0]= forumService.getCount(user.getUserid());
        //int finished =
        list[1]=orderService.getCount(user.getUserid(),6,"payer");
        //int waitSure=
        list[2]=orderService.getCount(user.getUserid(),1,"payer");
        //int waitSend=
        list[3]=orderService.getCount(user.getUserid(),2,"payer");
        return list;
    }

    @RequestMapping("/modify_userInfo")
    @ResponseBody
    public String updateTbUserInfo (TbUser newuser,HttpSession session)
    {
        TbUser user = (TbUser) session.getAttribute("user");
        int ret = userService.updataUser(user,newuser);
        return ret==1?"success":"fail";
    }

    @RequestMapping(value = "/modify_userDInfo")
    @ResponseBody
    public String updateTbUserDInfo (TbUserdetail newuser,HttpSession session)
    {
        TbUser user = (TbUser) session.getAttribute("user");
        TbUserdetail userd = userService.getUserDetail(user);
        int ret = userService.updataUserD(userd,newuser);
        return ret==1?"success":"fail";
    }

    //yonghu更改密码 操作
    @RequestMapping("/user_info_pwd_op")
    @ResponseBody
    public String User_info_pwd(String pwd,String newpwd,HttpSession session){
        TbUser user = (TbUser)session.getAttribute("user");
        int ret = userService.modifyPwd(user.getUserid(),pwd,newpwd);
        switch (ret)
        {//2 代表输入的旧密码 与 密码 不一致  3  输入的新旧密码不一致
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 0:
                return "0";
            default:
                return "-1";
        }
    }

    @RequestMapping("/userOrderPay")
    @ResponseBody
    public List<WaitPay> userOrderPay(HttpSession session)
    {
        TbUser user = (TbUser) session.getAttribute("user");
        return orderService.getWaitPay(user.getUserid());
    }

    @RequestMapping("/userOrderSurePay")
    @ResponseBody
    public String userOrdeSurePay(String orderid,String ordermethod,HttpSession session)
    {
        TbUser user = (TbUser) session.getAttribute("user");
        orderService.modifyOrderStatusAndmethod(orderid,ordermethod,2);
        return "success";
    }

    @RequestMapping("/userOrderCancel")
    @ResponseBody
    public String userOrderCancel(String orderid,HttpSession session)
    {
        TbUser user = (TbUser) session.getAttribute("user");
        orderService.modifyOrderStatus(orderid,10);
        return "success";
    }


    @RequestMapping("/userOrderSure")
    @ResponseBody
    public String userOrderSure(String orderid,HttpSession session)
    {
        TbUser user = (TbUser) session.getAttribute("user");
        orderService.modifyOrderStatus(orderid,7);
        return "success";
    }
    @RequestMapping("/cmtOrderDOp")
    @ResponseBody
    public String cmtOrderDOp(String cmt,HttpSession session)
    {
        int ret = orderService.generateOrderCmt(cmt);
        if(ret == 1) {
            //修改订单状态
            orderService.modifyOrderStatus(cmt.split(",")[0], 9);
        }
        return  ret == 1?"success":"fail";
    }

    //-------------------------------------------------------
    @RequestMapping("/myWay")
    public String myWay()
    {
        return "user/user-info-way";
    }

    @ResponseBody
    @RequestMapping("/myWayOrder")
    public List<VWay> myWayOrder(int page,int limit,int status,HttpSession session)
    {
        TbUser user = (TbUser) session.getAttribute("user");
        return wayService.getWayOrder(page,limit,status,user.getUserid());
    }
}
