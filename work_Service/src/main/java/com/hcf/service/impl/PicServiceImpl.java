package com.hcf.service.impl;

import com.hcf.mapper.TbPostsMapper;
import com.hcf.mapper.TbStoreMapper;
import com.hcf.mapper.TbUserdetailMapper;
import com.hcf.pojo.*;
import com.hcf.service.PicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Date;

@Service
public class PicServiceImpl implements PicService {

    @Autowired
    private TbStoreMapper storeMapper;
    @Autowired
    private TbUserdetailMapper tbUserdetailMapper;
    @Autowired
    private TbPostsMapper tbPostsMapper;
    @Override
    public int setStoreInfo_Pic(String storeid, String address) {
        TbStore store = new TbStore();
        store.setStoreid(storeid);
        store.setStorepicture(address);
        int ret = storeMapper.updateByPrimaryKeySelective(store);
        return ret;
    }

    public int setUser_Pic(String userid, String address) {
        TbUserdetail user = new TbUserdetail();
        user.setUserdeatailid(userid);
        user.setUseridd(userid);
        user.setUserphotod(address);
        int ret = tbUserdetailMapper.updateByPrimaryKeySelective(user);
        return ret;
    }

    public int setPost_PicWithOne(String id, String address) {
        TbPosts posts = new TbPosts();
        posts.setPostpic(address);
        posts.setPostid(Integer.parseInt(id));
        int ret = tbPostsMapper.updateByPrimaryKeySelective(posts);
        return ret;
    }
    public int setGoods_PicWithOne(String id, String address)
    {
        return 1;
    }

    private void saveAddress(String id,String type,String dbPath)
    {
        switch (type)
        {
            case "storepicture":
                setStoreInfo_Pic(id,dbPath);
                break;
            case "userphotod":
                setUser_Pic(id,dbPath);
                break;
            case "postpic":
                setPost_PicWithOne(id,dbPath);
                break;
            case "goodspic":
                setGoods_PicWithOne(id,dbPath);
                break;
        }
    }
    @Override
    public int upload(MultipartFile multipartFile, HttpSession session,String id,String type) {
        if (!StringUtils.isEmpty(multipartFile) && multipartFile.getSize()>0){
            String filename = multipartFile.getOriginalFilename();
            String suffix = filename.substring(filename.lastIndexOf(".") + 1);
            if (filename.endsWith("jpg")||filename.endsWith("png")){
                //ServletContext servletContext = request.getServletContext();
                //String path = servletContext.getRealPath("/pic");
                //动态获取存放文件的本地路径【绝对路径】
                //String realPath = session.getServletContext().getRealPath("/")+"/pic/" +id+new Date().getTime()+"."+suffix;
                String dbPath = "/pic/" +id+new Date().getTime()+"."+suffix;
                String realPath = session.getServletContext().getRealPath("/")+dbPath;
                File newfile = new File(realPath);
                try {
                    //存储图片地址 到 db
                    saveAddress(id,type,dbPath);
                    //存储图片
                    multipartFile.transferTo(newfile);
                    return 0;//RetResult.successRet(null);
                } catch (IOException e) {
                    e.printStackTrace();
                    return 1;//RetResult.errorRet(1,"文件上传异常");
                }
            }else {
                return 2;//RetResult.errorRet(2,"不支持该上传类型");
            }
        }else {
            return 3;//RetResult.errorRet(3,"文件为空");
        }
    }

    @Override
    public String uploads(MultipartFile[] multipartFiles, HttpSession session,String id,String type) {
        for (MultipartFile multipartFile : multipartFiles) {
            if (!StringUtils.isEmpty(multipartFile) && multipartFile.getSize() > 0) {
                String filename = multipartFile.getOriginalFilename();
                String suffix = filename.substring(filename.lastIndexOf(".") + 1);
                if (filename.endsWith("jpg") || filename.endsWith("png")) {
                    //ServletContext servletContext = request.getServletContext();
                    //String path = servletContext.getRealPath("/pic");
                    //动态获取存放文件的本地路径【绝对路径】
                    //String realPath = session.getServletContext().getRealPath("/") + "/pic/" + id + new Date().getTime() + "." + suffix;
                    String dbPath = "/pic/" + id + new Date().getTime() + "." + suffix;
                    String realPath = session.getServletContext().getRealPath("/") +dbPath;
                    File newfile = new File(realPath);
                    try {
                        //存储图片地址 到 db
                        //saveAddress(id, type, dbPath);

                        //存储图片
                        multipartFile.transferTo(newfile);
                        return dbPath;//RetResult.successRet(null);

                    } catch (IOException e) {
                        e.printStackTrace();
                        return "1";//RetResult.errorRet(1,"文件上传异常");
                    }
                } else {
                    return "2";//RetResult.errorRet(2,"不支持该上传类型");
                }
            } else {
                return "3";//RetResult.errorRet(3,"文件为空");
            }
        }
        return null;
    }
}
