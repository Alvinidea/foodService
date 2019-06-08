package com.controller.admin;

import com.hcf.helpClass.WebTable;
import com.hcf.mapper.TbUserMapper;
import com.hcf.mapper.VUserMapper;
import com.hcf.pojo.VUser;
import com.hcf.pojo.VWay;
import com.hcf.service.AdminService;
import com.hcf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin/way")
public class onWayController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private UserService userService;

    @RequestMapping("/way_list")
    public String member_list()
    {
        return "manage/way/way-list";
    }

    @RequestMapping("/getWayList")
    @ResponseBody
    public WebTable<VWay> getWaylist(int page, int limit , String deliver,
                                         String userid, String  storeid,
                                         String paddress, String saddress,
                                         int status)
    {//需要分页
        System.out.println(page+"  "+limit);
        WebTable<VWay> allUser = adminService.getWays(page,limit ,
                deliver, userid, storeid, paddress, saddress, status);
        return allUser;
    }

    @RequestMapping("/getVUser")
    @ResponseBody
    public VUser getWaylist(String userid)
    {
        return adminService.getVUserById( userid);
    }
}

