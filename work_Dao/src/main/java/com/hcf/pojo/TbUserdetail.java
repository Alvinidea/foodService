package com.hcf.pojo;

import java.io.Serializable;

public class TbUserdetail implements Serializable {
    private String userdeatailid;

    private String useridd;

    private String usernamed;

    private Integer usersexd;

    private Integer useraged;

    private String userinfo;

    private String userhabitd;

    private String userphotod;

    private static final long serialVersionUID = 1L;

    public String getUserdeatailid() {
        return userdeatailid;
    }

    public void setUserdeatailid(String userdeatailid) {
        this.userdeatailid = userdeatailid == null ? null : userdeatailid.trim();
    }

    public String getUseridd() {
        return useridd;
    }

    public void setUseridd(String useridd) {
        this.useridd = useridd == null ? null : useridd.trim();
    }

    public String getUsernamed() {
        return usernamed;
    }

    public void setUsernamed(String usernamed) {
        this.usernamed = usernamed == null ? null : usernamed.trim();
    }

    public Integer getUsersexd() {
        return usersexd;
    }

    public void setUsersexd(Integer usersexd) {
        this.usersexd = usersexd;
    }

    public Integer getUseraged() {
        return useraged;
    }

    public void setUseraged(Integer useraged) {
        this.useraged = useraged;
    }

    public String getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(String userinfo) {
        this.userinfo = userinfo == null ? null : userinfo.trim();
    }

    public String getUserhabitd() {
        return userhabitd;
    }

    public void setUserhabitd(String userhabitd) {
        this.userhabitd = userhabitd == null ? null : userhabitd.trim();
    }

    public String getUserphotod() {
        return userphotod;
    }

    public void setUserphotod(String userphotod) {
        this.userphotod = userphotod == null ? null : userphotod.trim();
    }
}