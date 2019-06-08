package com.hcf.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbPosts implements Serializable {
    private Integer postid;

    private String postuser;

    private String posttitle;

    private String postcontext;

    private String posttype;

    private String postpic;

    private Date posttime;

    private Integer poststatus;

    private Integer postscan;

    private Integer postthumb;

    private static final long serialVersionUID = 1L;

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getPostuser() {
        return postuser;
    }

    public void setPostuser(String postuser) {
        this.postuser = postuser == null ? null : postuser.trim();
    }

    public String getPosttitle() {
        return posttitle;
    }

    public void setPosttitle(String posttitle) {
        this.posttitle = posttitle == null ? null : posttitle.trim();
    }

    public String getPostcontext() {
        return postcontext;
    }

    public void setPostcontext(String postcontext) {
        this.postcontext = postcontext == null ? null : postcontext.trim();
    }

    public String getPosttype() {
        return posttype;
    }

    public void setPosttype(String posttype) {
        this.posttype = posttype == null ? null : posttype.trim();
    }

    public String getPostpic() {
        return postpic;
    }

    public void setPostpic(String postpic) {
        this.postpic = postpic == null ? null : postpic.trim();
    }

    public Date getPosttime() {
        return posttime;
    }

    public void setPosttime(Date posttime) {
        this.posttime = posttime;
    }

    public Integer getPoststatus() {
        return poststatus;
    }

    public void setPoststatus(Integer poststatus) {
        this.poststatus = poststatus;
    }

    public Integer getPostscan() {
        return postscan;
    }

    public void setPostscan(Integer postscan) {
        this.postscan = postscan;
    }

    public Integer getPostthumb() {
        return postthumb;
    }

    public void setPostthumb(Integer postthumb) {
        this.postthumb = postthumb;
    }
}