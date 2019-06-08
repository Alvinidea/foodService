package com.controller.picture;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hcf.helpClass.imgCode;
import com.hcf.pojo.TbStore;
import com.hcf.pojo.TbUser;
import com.hcf.pojo.TbUserdetail;
import com.hcf.service.PicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/pic")
public class picture {

    @Autowired
    private PicService picService;


    //管理员设置商品图片
    @RequestMapping("/upload_storePic_BySuper")
    @ResponseBody
    public int uploadBySuper(@RequestParam("file") MultipartFile multipartFile,String storeid, HttpSession session){
        return picService.upload(multipartFile,session,storeid,"storepicture");
    }
    //设置商品图片
    @RequestMapping("/upload_storePic")
    @ResponseBody
    public int upload(@RequestParam("file") MultipartFile multipartFile, HttpSession session){
        TbStore store = (TbStore) session.getAttribute("store");
      return picService.upload(multipartFile,session,store.getStoreid(),"storepicture");
    }

    //设置用户图片
    @RequestMapping("/upload_userPhoto")
    @ResponseBody
    public int upload_userPhoto(@RequestParam("file") MultipartFile multipartFile, HttpSession session){
        TbUser user = (TbUser) session.getAttribute("user");
        return picService.upload(multipartFile,session,user.getUserid(),"userphotod");
    }

    //设置单张post图片
    @RequestMapping("/upload_postPhoto")
    @ResponseBody
    public int upload_postPhoto(@RequestParam("file") MultipartFile multipartFile, HttpSession session){
        TbUser user = (TbUser)session.getAttribute("user");

        return picService.upload(multipartFile,session,
                user.getUserid(),"postpic");
    }

    //设置多张post图片
    @RequestMapping("/upload_postPhotos")
    public void upload_postPhotos(@RequestParam("file") MultipartFile[] multipartFiles
            , HttpSession session, HttpServletResponse response) throws IOException {
        TbUser user = (TbUser)session.getAttribute("user");
        String ret = picService.uploads(multipartFiles,session, user.getUserid(),"postpic");
        System.out.println(ret);
        //因为未使用ResponseBody  所以用HttpServletResponse
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("piclocation", ret);
        JSONObject json = new JSONObject(map);
        response.getWriter().print(json);
    }

    //设置单张goods图片
    @RequestMapping("/upload_goodsPhoto")
    @ResponseBody
    public void upload_goodsPhoto(@RequestParam("file") MultipartFile[] multipartFile
            , HttpSession session,HttpServletResponse response) throws IOException{
        TbStore store = (TbStore)session.getAttribute("store");

        String ret = picService.uploads(multipartFile,session,
                store.getStoreid(),"goodspic");
        System.out.println(ret);
        //因为未使用ResponseBody  所以用HttpServletResponse
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("piclocation", ret);
        JSONObject json = new JSONObject(map);
        response.getWriter().print(json);
    }
}
