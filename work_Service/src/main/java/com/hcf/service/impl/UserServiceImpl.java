package com.hcf.service.impl;

import com.hcf.mapper.TbStoreMapper;
import com.hcf.mapper.TbSuperMapper;
import com.hcf.mapper.TbUserMapper;
import com.hcf.mapper.TbUserdetailMapper;
import com.hcf.pojo.*;
import com.hcf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private TbUserMapper userMapper;
    @Autowired
    private TbStoreMapper storeMapper;
    @Autowired
    private TbSuperMapper superMapper;

    @Autowired
    private TbUserdetailMapper userdetailMapper;



    @Override
    public TbUser getUser(String id)
    {
        return userMapper.selectByPrimaryKey(id);
    }
    @Override
    public void createUserDetail(String userid) {
        TbUserdetail userd = userdetailMapper.selectByPrimaryKey(userid);
        if(userd == null)
        {
            TbUserdetail userdetail = new TbUserdetail();
            userdetail.setUseridd(userid);
            userdetail.setUserdeatailid(userid);
            userdetail.setUseraged(18);
            userdetail.setUsersexd(1);
            userdetail.setUserhabitd("");
            userdetail.setUsernamed("");
            userdetail.setUserphotod("/pic/logo.jpg");
            userdetailMapper.insert(userdetail);
        }
    }

    @Override
    public int modifyPwd(String userid, String pwd, String newpwd) {
        int ret =-1;
        TbUser user = new TbUser();
        TbUser old = userMapper.selectByPrimaryKey(userid);
        if( !old.getUserpwd().equals(pwd))
            return 2;//2 代表输入的旧密码 与 密码 不一致  3  输入的新旧密码不一致
        if( pwd.equals(newpwd))
            return 3;//3  输入的新旧密码不一致
        user.setUserpwd(newpwd);
        user.setUserid(userid);
        ret = userMapper.updateByPrimaryKeySelective(user);
        return ret;
    }

    @Override
    public int checkUserCode(String id, String pwd, HttpSession session) {
        TbUser user = userMapper.selectByPrimaryKey(id);
        if(user == null || user.getUserstatus() == 0)//无此用户或者用户已被禁用
            return -1;
        String upwd =user.getUserpwd();

        if(!upwd.equals( pwd))
            return 3;
        session.setAttribute("user", user);

        //如果商铺 也有普通账号   则也设置普通user的session
        //判断条件   （商铺与普通账号的id一致）
        TbStore store = storeMapper.selectByPrimaryKey(id);
        if(store != null)
        {
            session.setAttribute("store",store);
        }
        return 1;
    }

    @Override
    public int checkManaCode(String id, String pwd, HttpSession session) {
        TbSuper user = superMapper.selectByPrimaryKey(id);
        if(user == null)
            return -1;
        String upwd =user.getPwd();
        if(!upwd.equals( pwd))
            return 3;
        session.setAttribute("super", user);
        return 1;

    }

    @Override
    public int checkStoreCode(String id, String pwd, HttpSession session) {
        TbStore store = storeMapper.selectByPrimaryKey(id);
        if(store == null)
            return -1;
        String upwd =store.getStoreownerid();
        if( !upwd.equals( pwd))
            return 3;
        session.setAttribute("store", store);
        //如果商铺 也有普通账号   则也设置普通user的session
        //判断条件   （商铺与普通账号的id一致）
        TbUser user = userMapper.selectByPrimaryKey(id);
        if(user != null)
        {
            session.setAttribute("user",user);
        }
        return 1;
    }

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

    public int checkCode(String id, String pwd, HttpSession session) {
        TbUser user = userMapper.selectByPrimaryKey(id);
        String upwd =user.getUserpwd();
        if(user == null)
            return -1;
        if(upwd == pwd)
            return 3;
        if(user.getUserpower() == 1) {
            session.setAttribute("user", user);
            return 1;
        }
        else if(user.getUserpower() == 2) {
            session.setAttribute("manage",user);
            return 2;
        }
        else
            return 4;
    }


    @Override
    public String getUserPhoto(String id) {
        TbUserdetail userd = userdetailMapper.selectByPrimaryKey(id);
        if(userd == null)
            return "";
        return userd.getUserphotod();
    }

    @Override
    public TbUserdetail getUserDetail(TbUser user) {
        return userdetailMapper.selectByPrimaryKey(user.getUserid());
    }

    @Override
    public int updataUser(TbUser user, TbUser newuser) {
        if(user.getUserid().equals(newuser.getUserid()) == true)
        {
            return userMapper.updateByPrimaryKeySelective(newuser);
        }
        return -1;
    }

    @Override
    public int updataUserD(TbUserdetail user, TbUserdetail newuser) {
        newuser.setUseridd(user.getUseridd());
        newuser.setUserdeatailid(user.getUserdeatailid());
        return userdetailMapper.updateByPrimaryKeySelective(newuser);
    }


}
