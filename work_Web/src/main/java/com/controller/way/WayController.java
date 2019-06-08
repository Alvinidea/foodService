package com.controller.way;

import com.hcf.pojo.TbBytheway;
import com.hcf.pojo.TbGoods;
import com.hcf.pojo.TbUser;
import com.hcf.pojo.VOrderway;
import com.hcf.service.UserService;
import com.hcf.service.WayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/way")
public class WayController {
    @Autowired
    private UserService userService;
    @Autowired
    private WayService wayService;
    @RequestMapping("/wayIndex")
    public String getWayIndexView()
    {
        return "bytheway/bytheway-index";
    }

    @ResponseBody
    @RequestMapping("/getWayOrdersOp")
    public List<VOrderway> getOrdersOp(int page, int limit, int goodsnum,
                              String storeId, String storeName, String userId, String userName,
                              String sellAd, String payAd)
    {
        List<VOrderway> list =  wayService.getOrders(page,limit,3,goodsnum, storeId,storeName, userId,userName,
            sellAd, payAd);
        return  list;
    }
    @ResponseBody
    @RequestMapping("/getWayOrdersDetailOp")
    public List<TbGoods> getOrdersOp(String id)
    {
        List<TbGoods> list =  wayService.getOrderD(id);
        return  list;
    }


    @ResponseBody
    @RequestMapping("/createWayOp")
    public TbBytheway createWayOrdersOp(String id, HttpSession session)
    {
        TbUser user = (TbUser) session.getAttribute("user");
        if(user == null)
            return null;
        TbBytheway oder =  wayService.createWayOrder(id,user.getUserid());
        return  oder;
    }

    @ResponseBody
    @RequestMapping("/sureWayOp")
    public TbBytheway sureWayOp(String id, HttpSession session)
    {
        TbBytheway oder =  wayService.suerWayOrder(id);
        return  oder;
    }

}
