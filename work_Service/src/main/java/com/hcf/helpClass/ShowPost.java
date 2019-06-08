package com.hcf.helpClass;

import com.hcf.pojo.TbPosts;
import com.hcf.pojo.TbUser;
import com.hcf.pojo.TbUserdetail;

import java.util.Date;

public class ShowPost {
    //帖子id
    private Integer postid;
    //发帖用户id
    private String postuser;
    //标题
    private String posttitle;
    //发帖内容
    private String postcontext;
    //帖子类型
    private String posttype;
    //帖子图片 需要分割用；
    private String postpic;
    //发帖时间 存在数据库是date   在这儿需要处理
    private Date posttime;
    //帖子浏览量
    private Integer postscan;
    //帖子点赞
    private Integer postthumb;

    private String userid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    private String username;

    private Integer userlevel;

    private String userPhotoD;


    public void setPosttime(Date posttime) {
        this.posttime = posttime;
    }

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
        this.postuser = postuser;
    }

    public String getPosttitle() {
        return posttitle;
    }

    public void setPosttitle(String posttitle) {
        this.posttitle = posttitle;
    }

    public String getPostcontext() {
        return postcontext;
    }

    public void setPostcontext(String postcontext) {
        this.postcontext = postcontext;
    }

    public String getPosttype() {
        return posttype;
    }

    public void setPosttype(String posttype) {
        this.posttype = posttype;
    }

    public String getPostpic() {
        return postpic;
    }

    public void setPostpic(String postpic) {
        this.postpic = postpic;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPhotoD() {
        return userPhotoD;
    }

    public void setUserlevel(Integer userlevel) {
        this.userlevel = userlevel;
    }

    public void setUserPhotoD(String userPhotoD) {
        this.userPhotoD = userPhotoD;
    }

    public void setValfromPosts(TbPosts ps)
    {
        setPostcontext(ps.getPostcontext());
        setPostid(ps.getPostid());
        setPostpic(ps.getPostpic());
        setPostscan(ps.getPostscan());
        setPostthumb(ps.getPostthumb());
        setPosttitle(ps.getPosttitle());
        setPosttype(ps.getPosttype());
        setPosttime(ps.getPosttime());
    }
    public void setValFromUser(TbUser user)
    {
        if(user == null)
        {
            setUserid("user is null");
            setPostuser("user is null");
            setUsername("user is null");
            setUserlevel(-1);
        }else {
            setUserid(user.getUserid());
            setPostuser(user.getUserid());
            setUsername(user.getUsername());
            setUserlevel(user.getUserlevel());
        }
    }
    public void setValFromUserD(TbUserdetail pic)
    {
        if(pic == null)
            setUserPhotoD("please upload your pic");
        else
            setUserPhotoD(pic.getUserphotod());
    }
    public void setVal(TbPosts ps,TbUser user,TbUserdetail pic)
    {
        setValFromUser(user);
        setValfromPosts(ps);
        setValFromUserD(pic);
    }
}
