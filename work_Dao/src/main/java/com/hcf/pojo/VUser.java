package com.hcf.pojo;

import java.io.Serializable;
import java.util.Date;

public class VUser implements Serializable {
    private String userid;

    private String username;

    private String userphotod;

    private String useremail;

    private String userphone;

    private String useraddress;

    private Date userapplytime;

    private Integer userstatus;

    private String userpwd;

    private Integer userlevel;

    private Integer userpower;

    private String userinfo;

    private Integer useraged;

    private Integer usersexd;

    private String usernamed;

    private String userhabitd;

    private static final long serialVersionUID = 1L;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserphotod() {
        return userphotod;
    }

    public void setUserphotod(String userphotod) {
        this.userphotod = userphotod == null ? null : userphotod.trim();
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }

    public Date getUserapplytime() {
        return userapplytime;
    }

    public void setUserapplytime(Date userapplytime) {
        this.userapplytime = userapplytime;
    }

    public Integer getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(Integer userstatus) {
        this.userstatus = userstatus;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public Integer getUserlevel() {
        return userlevel;
    }

    public void setUserlevel(Integer userlevel) {
        this.userlevel = userlevel;
    }

    public Integer getUserpower() {
        return userpower;
    }

    public void setUserpower(Integer userpower) {
        this.userpower = userpower;
    }

    public String getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(String userinfo) {
        this.userinfo = userinfo == null ? null : userinfo.trim();
    }

    public Integer getUseraged() {
        return useraged;
    }

    public void setUseraged(Integer useraged) {
        this.useraged = useraged;
    }

    public Integer getUsersexd() {
        return usersexd;
    }

    public void setUsersexd(Integer usersexd) {
        this.usersexd = usersexd;
    }

    public String getUsernamed() {
        return usernamed;
    }

    public void setUsernamed(String usernamed) {
        this.usernamed = usernamed == null ? null : usernamed.trim();
    }

    public String getUserhabitd() {
        return userhabitd;
    }

    public void setUserhabitd(String userhabitd) {
        this.userhabitd = userhabitd == null ? null : userhabitd.trim();
    }
}