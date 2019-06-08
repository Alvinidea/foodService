package com.hcf.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbUser implements Serializable {
    private String userid;

    private String username;

    private String useremail;

    private String userphone;

    private String useraddress;

    private Date userapplytime;

    private Integer userstatus;

    private String userpwd;

    private Integer userlevel;

    private Integer userpower;

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
}