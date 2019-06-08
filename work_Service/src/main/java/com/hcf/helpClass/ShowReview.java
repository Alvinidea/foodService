package com.hcf.helpClass;

import com.hcf.pojo.TbReview;
import com.hcf.pojo.TbUser;
import com.hcf.pojo.TbUserdetail;

import java.util.Date;

public class ShowReview {

    String userid;
    String username;
    String userpic;
    int userlevel;

    int reviewid;
    int reviewpost;
    String reviewcontext;
    Date reviewtime;
    String reviewpic;
    int reviewthumb;

    public int getRespnum() {
        return respnum;
    }

    public void setRespnum(int respnum) {
        this.respnum = respnum;
    }

    int respnum;

    public void setUser(TbUser user)
    {
        if(user == null)
        {
            setUserid("is null");
            setUsername("is null");
            setUserlevel(0);
        }
        else{
            setUserid(user.getUserid());
            setUsername(user.getUsername());
            setUserlevel(user.getUserlevel());
        }
    }
    public void setUserPhoto(TbUserdetail userd)
    {
        if(userd == null)
            setUserpic("");
        else
            setUserpic(userd.getUserphotod());
    }
    public void setReview(TbReview review)
    {
        if(review == null)
        {

        }
        else {
            setReviewid(review.getReviewid());
            //setUserpic(review.getReviewpic());
            setReviewcontext(review.getReviewcontext());
            setReviewpost(review.getReviewpost());
            setReviewTime(review.getReviewtime());
            setReviewthumb(review.getReviewthumb());
        }
    }

    public void  setAll(TbUser user,TbUserdetail userd,TbReview review,int respNum)
    {
        setUser(user);
        setUserPhoto(userd);
        setReview(review);
        this.respnum = respNum;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpic() {
        return userpic;
    }

    public void setUserpic(String userpic) {
        this.userpic = userpic;
    }

    public int getUserlevel() {
        return userlevel;
    }

    public void setUserlevel(int userlevel) {
        this.userlevel = userlevel;
    }

    public int getReviewid() {
        return reviewid;
    }

    public void setReviewid(int reviewid) {
        this.reviewid = reviewid;
    }

    public int getReviewpost() {
        return reviewpost;
    }

    public void setReviewpost(int reviewpost) {
        this.reviewpost = reviewpost;
    }

    public String getReviewcontext() {
        return reviewcontext;
    }

    public void setReviewcontext(String reviewcontext) {
        this.reviewcontext = reviewcontext;
    }

    public Date getReviewTime() {
        return reviewtime;
    }

    public void setReviewTime(Date reviewTime) {
        this.reviewtime = reviewTime;
    }

    public String getReviewpic() {
        return reviewpic;
    }

    public void setReviewpic(String reviewpic) {
        this.reviewpic = reviewpic;
    }

    public int getReviewthumb() {
        return reviewthumb;
    }

    public void setReviewthumb(int reviewthumb) {
        this.reviewthumb = reviewthumb;
    }
}
