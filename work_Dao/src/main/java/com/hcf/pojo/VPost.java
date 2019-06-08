package com.hcf.pojo;

import java.io.Serializable;
import java.util.Date;

public class VPost implements Serializable {
    private String username;

    private Integer userlevel;

    private Integer userstatus;

    private String userphotod;

    private Integer postthumb;

    private Integer postscan;

    private Integer poststatus;

    private Date posttime;

    private String postpic;

    private String posttype;

    private String postcontext;

    private String posttitle;

    private String postuser;

    private Integer postid;

    private Integer userpower;

    private String usernamed;

    private static final long serialVersionUID = 1L;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getUserlevel() {
        return userlevel;
    }

    public void setUserlevel(Integer userlevel) {
        this.userlevel = userlevel;
    }

    public Integer getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(Integer userstatus) {
        this.userstatus = userstatus;
    }

    public String getUserphotod() {
        return userphotod;
    }

    public void setUserphotod(String userphotod) {
        this.userphotod = userphotod == null ? null : userphotod.trim();
    }

    public Integer getPostthumb() {
        return postthumb;
    }

    public void setPostthumb(Integer postthumb) {
        this.postthumb = postthumb;
    }

    public Integer getPostscan() {
        return postscan;
    }

    public void setPostscan(Integer postscan) {
        this.postscan = postscan;
    }

    public Integer getPoststatus() {
        return poststatus;
    }

    public void setPoststatus(Integer poststatus) {
        this.poststatus = poststatus;
    }

    public Date getPosttime() {
        return posttime;
    }

    public void setPosttime(Date posttime) {
        this.posttime = posttime;
    }

    public String getPostpic() {
        return postpic;
    }

    public void setPostpic(String postpic) {
        this.postpic = postpic == null ? null : postpic.trim();
    }

    public String getPosttype() {
        return posttype;
    }

    public void setPosttype(String posttype) {
        this.posttype = posttype == null ? null : posttype.trim();
    }

    public String getPostcontext() {
        return postcontext;
    }

    public void setPostcontext(String postcontext) {
        this.postcontext = postcontext == null ? null : postcontext.trim();
    }

    public String getPosttitle() {
        return posttitle;
    }

    public void setPosttitle(String posttitle) {
        this.posttitle = posttitle == null ? null : posttitle.trim();
    }

    public String getPostuser() {
        return postuser;
    }

    public void setPostuser(String postuser) {
        this.postuser = postuser == null ? null : postuser.trim();
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public Integer getUserpower() {
        return userpower;
    }

    public void setUserpower(Integer userpower) {
        this.userpower = userpower;
    }

    public String getUsernamed() {
        return usernamed;
    }

    public void setUsernamed(String usernamed) {
        this.usernamed = usernamed == null ? null : usernamed.trim();
    }
}