package com.hcf.service;

import com.hcf.helpClass.SuccessAndRepeat;
import com.hcf.pojo.TbUser;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public interface ExcelService {


    public int upload(MultipartFile multipartFile, HttpSession session, String id, String type);

    public List<TbUser> read(HttpSession session) ;

    //去重  本身的重复 数据库ID的重复
    public SuccessAndRepeat<TbUser> getRepeat(List<TbUser> userList);

    public int insert(List<TbUser> userList);


}
