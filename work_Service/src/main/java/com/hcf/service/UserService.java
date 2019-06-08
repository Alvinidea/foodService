package com.hcf.service;

import com.hcf.pojo.TbUser;
import com.hcf.pojo.TbUserdetail;
import com.hcf.pojo.VWay;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface UserService {

    public int modifyPwd(String userid,String pwd,String newpwd);

    public TbUser getUser(String id);

    /***
     * 检测并创建用户详情是否存在
     * @param userid
     */
    public void createUserDetail(String userid);
    /**
     * type 1 管理员
     * type 2 用户
     * 返回值:
     * -1 无此账号
     * 1 管理登录成功
     * 2 用户登录成功
     * 3 密码不正确
     * 4 权限错误
     * */
    public int checkUserCode(String id, String pwd, HttpSession session);

    public int checkManaCode(String id, String pwd, HttpSession session);

    public int checkStoreCode(String id, String pwd, HttpSession session);

    public String getUserPhoto(String id);

    public TbUserdetail getUserDetail(TbUser user);

    public int updataUser(TbUser user,TbUser newuser);

    public int updataUserD(TbUserdetail user,TbUserdetail newuser);


}
