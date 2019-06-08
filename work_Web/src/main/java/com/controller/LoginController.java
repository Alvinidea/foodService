package com.controller;
import com.hcf.helpClass.CpachaUtil;
import com.hcf.pojo.TbStore;
import com.hcf.pojo.TbSuper;
import com.hcf.pojo.TbUser;
import com.hcf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
@RequestMapping("/pre")
public class LoginController {

    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }

    @RequestMapping("/loginToIndex")
    public @ResponseBody String loginToIndex(String userid, String userpwd, HttpSession session)
    {
        System.out.println(userid+"   " +userpwd);
        userService.createUserDetail(userid);
        return ""+userService.checkUserCode(userid,userpwd,session);
    }

    @RequestMapping("/mlogin")
    public String MLogin()
    {
        return "manage/login";
    }
    @RequestMapping("/mloginToIndex")
    public @ResponseBody String MloginToIndex(String userid, String userpwd, HttpSession session)
    {
        System.out.println(userid+"   " +userpwd);
        return ""+userService.checkManaCode(userid,userpwd,session);
    }

    @RequestMapping("/slogin")
    public String SLogin()
    {
        return "store/store-login";
    }
    @RequestMapping("/sloginToIndex")
    public @ResponseBody String SloginToIndex(String userid, String userpwd, HttpSession session)
    {
        System.out.println(userid+"   " +userpwd);
        return ""+userService.checkStoreCode(userid,userpwd,session);
    }

    @RequestMapping("/index")
    public String index() { return "manage/index"; }

    @RequestMapping("/welcome")
    public String welcome() { return "manage/welcome"; }


    @RequestMapping("/logout")
    public String logout(HttpSession session)
    {
        TbUser user = (TbUser)session.getAttribute("user");
        TbSuper manage = (TbSuper) session.getAttribute("super");
        TbStore store = (TbStore) session.getAttribute("store");
        if(store != null)
        {
            session.removeAttribute("store");
            return "redirect:slogin";
        }
        if(user != null)
        {
            session.removeAttribute("user");
            return "redirect:login";
        }
        if(manage != null) {
            session.removeAttribute("super");
            return "redirect:mlogin";
        }
        return "redirect:login";
    }

    //判断是否已经登录    前端通过此接口决定是否显示某些标签
    @RequestMapping("/isLogin")
    @ResponseBody
    public String isLogin(HttpSession session)
    {
        TbUser user = (TbUser)session.getAttribute("user");
        TbSuper manage = (TbSuper) session.getAttribute("super");
        TbStore store = (TbStore) session.getAttribute("store");
        if(user != null || manage != null || store != null) {
            return "login";
        }
        return "logout";
    }

    /**
     * 获取生成验证码显示到 UI 界面
     * @param request
     * @param response
     * @throws Exception
     * @throws IOException
     */
    @RequestMapping(value="/getCode")
    public void getCode(HttpServletRequest request, HttpServletResponse response)
            throws Exception, IOException {
        //设置相应类型,告诉浏览器输出的内容为图片
        response.setContentType("image/jpeg");

        //设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);

        CpachaUtil randomValidateCode = new CpachaUtil();
        try {
            randomValidateCode.getRandcode(request, response);//输出图片方法
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value="/validateCode")
    @ResponseBody
    public int validateCode(String code,HttpSession session)
    {
        String vcode = (String)session.getAttribute(CpachaUtil.RANDOMCODEKEY);
        if(vcode.equals(code) == true)
        {
            return 1;
        }
        return 0;
    }

}
