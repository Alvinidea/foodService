package com.hcf.helpClass;

import com.hcf.pojo.TbResp;
import com.hcf.pojo.TbUser;
import com.hcf.pojo.TbUserdetail;

import java.util.Date;

public class ShowResp {
    String userid;
    String username;
    String userpic;
    int userlevel;

    int respid;
    int respreview;
    int resppost;
    String respcontext;
    Date resptime;
    String resppic;

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
    public void setResp(TbResp resp)
    {
        if(resp == null)
        {

        }
        else {
            setRespid(resp.getRespid());
            setRespcontext(resp.getRespcontext());
            setResppost(resp.getResppost());
            setRespreview(resp.getRespreview());
            setResptime(resp.getResptime());
            setResppic(resp.getResppic());
        }
    }
    public void  setAll(TbUser user,TbUserdetail userd,TbResp review)
    {
        setUser(user);
        setUserPhoto(userd);
        setResp(review);
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

    public int getRespid() {
        return respid;
    }

    public void setRespid(int respid) {
        this.respid = respid;
    }

    public int getRespreview() {
        return respreview;
    }

    public void setRespreview(int respreview) {
        this.respreview = respreview;
    }

    public int getResppost() {
        return resppost;
    }

    public void setResppost(int resppost) {
        this.resppost = resppost;
    }

    public String getRespcontext() {
        return respcontext;
    }

    public void setRespcontext(String respcontext) {
        this.respcontext = respcontext;
    }

    public Date getResptime() {
        return resptime;
    }

    public void setResptime(Date resptime) {
        this.resptime = resptime;
    }

    public String getResppic() {
        return resppic;
    }

    public void setResppic(String resppic) {
        this.resppic = resppic;
    }
}
