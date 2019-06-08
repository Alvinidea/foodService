package com.controller.admin;

import com.hcf.helpClass.WebTable;
import com.hcf.pojo.TbUser;
import com.hcf.pojo.VUser;
import com.hcf.service.AdminService;
import com.hcf.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/admin/mem")
public class memController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private ExcelService excelService;


    @RequestMapping("/member_list")
    public String member_list()
    {
        return "manage/members/member-list";
    }

    @RequestMapping("/member_list1")
    public String member_list1()
    {
        return "manage/members/member-list1";
    }

    @RequestMapping("/test")
    public String test()
    {
        return "manage/members/table_test2";
    }

    @RequestMapping("/member_list3")
    public String member_list3()
    {
        return "manage/members/table_test2";
    }


    @RequestMapping("/member_add")
    public String member_add()
    {
        return "manage/members/member-add";
    }

    @RequestMapping("/member_edit")
    public String member_edit()
    {
        return "manage/members/member-edit";
    }

    @RequestMapping("/member_del")
    public String member_del()
    {
        return "manage/members/member-del";
    }

    @RequestMapping("/member_password")
    public String member_password()
    {
        return "manage/members/member-password";
    }



    @RequestMapping("/getUserlist")
    @ResponseBody
    public WebTable<VUser> getMember_list(int page, int limit ,String userid,String username,
                                          String userphone, String useremail,int status)
    {//需要分页
        System.out.println(page+"  "+limit);
        WebTable<VUser> allUser = adminService.getVUser(page,limit, userid,username, userphone,useremail,status);
        return allUser;
    }

    //搜索用户
    @RequestMapping("/searchUser")
    @ResponseBody
    public WebTable<TbUser> searchUser(int page, int limit,int type,String sign)
    {//需要分页
        System.out.println(page+"  "+limit);
        WebTable<TbUser> allUser = adminService.getAllUser();
        return allUser;
    }
    @RequestMapping("/member_del_op")
    @ResponseBody
    public String member_del_op(String id,String type)
    {
        Boolean ret=true ;
        ret = adminService.delInfo(id,type);
        return  ret ? "success":"fail";
    }

    //修改用户信息用户
    @RequestMapping("/modifyUser")
    @ResponseBody
    public String modifyUser(TbUser user)
    {
        Boolean ret;
        ret = adminService.updateUser(user);
        return ret==true? "success":"fail";
    }
    //修改用户信息用户
    @RequestMapping("/getUser")
    @ResponseBody
    public TbUser getUser(String userid)
    {//需要分页
        System.out.println(userid);
        TbUser user = adminService.getUser(userid);
        return user;
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public String addUser(TbUser user)
    {
        Boolean ret;
        ret = adminService.addUser(user);
        return ret==true? "success":"fail";
    }

    @RequestMapping("/setUserStatus")
    @ResponseBody
    public String setUserStatus(String userid,String userstatus)
    {
        int ret = adminService.setUserStatus(userid,Integer.parseInt(userstatus));
        return ret==1? "success":"fail";
    }

}
