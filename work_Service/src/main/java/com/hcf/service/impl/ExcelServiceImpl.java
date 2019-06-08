package com.hcf.service.impl;

import com.hcf.helpClass.ExcelUtil;
import com.hcf.helpClass.SuccessAndRepeat;
import com.hcf.mapper.TbUserMapper;
import com.hcf.mapper.TbUserdetailMapper;
import com.hcf.pojo.TbUser;
import com.hcf.pojo.TbUserdetail;
import com.hcf.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ExcelServiceImpl implements ExcelService {

    @Autowired
    private TbUserMapper userMapper;
    @Autowired
    private TbUserdetailMapper userdetailMapper;

    private final static String EXCEL_ADDRESS = "EXCEL_XLSX_ADDRESS";

    private void saveFileAddress(String id,String type,String dbPath)
    {
        switch (type)
        {
            case "user":
                break;
            case "store":
                break;
            case "super":
                break;
            case "goods":
                break;
        }
    }

    @Override
    public int upload(MultipartFile multipartFile, HttpSession session, String id, String type) {
        if (!StringUtils.isEmpty(multipartFile) && multipartFile.getSize()>0){
            String filename = multipartFile.getOriginalFilename();
            String suffix = filename.substring(filename.lastIndexOf(".") + 1);
            if (filename.endsWith("xlsx")){
                //ServletContext servletContext = request.getServletContext();
                //String path = servletContext.getRealPath("/pic");
                //动态获取存放文件的本地路径【绝对路径】

                String dbPath = "/excel/" + id + new Date().getTime()+"."+suffix;
                String realPath = session.getServletContext().getRealPath("/") +dbPath;
                File newfile = new File(realPath);
                try {
                    //存储图片地址 到 db
                    saveFileAddress(id,type,dbPath);
                    //存储地址
                    session.setAttribute(EXCEL_ADDRESS,realPath);
                    //存储图片
                    multipartFile.transferTo(newfile);
                    return 0;//RetResult.successRet(null);
                } catch (IOException e) {
                    e.printStackTrace();
                    return 1;//RetResult.errorRet(1,"文件上传异常");
                }
            }else {
                return 2;//RetResult.errorRet(2,"支持类型为 .xlsx");
            }
        }else {
            return 3;//RetResult.errorRet(3,"文件为空");
        }
    }


    @Override
    public int insert(List<TbUser> userList) {
        for(int i=0;i<userList.size();i++)
        {
            TbUser user = userList.get(i);
            TbUserdetail tbUserdetail = new TbUserdetail();
            tbUserdetail.setUserdeatailid(user.getUserid());
            tbUserdetail.setUseridd(user.getUserid());
            tbUserdetail.setUserphotod("/pic/logo.jpg");
            userMapper.insertSelective(user);
            userdetailMapper.insertSelective(tbUserdetail);
        }
        return 1;
    }

    public List<TbUser> read(HttpSession session)
    {
        String path = (String)session.getAttribute(EXCEL_ADDRESS);
        try {
            //ExcelUtil.readExcel2003(path);
            List<TbUser> users = ExcelUtil.readExcel2007(path);
            insert(users);
            return users;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public SuccessAndRepeat<TbUser> getRepeat(List<TbUser> userList)
    {
        return null;
    }

}
