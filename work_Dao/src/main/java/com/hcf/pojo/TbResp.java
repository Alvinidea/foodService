package com.hcf.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbResp implements Serializable {
    private Integer respid;

    private Integer respreview;

    private Integer resppost;

    private String respfromwho;

    private String resptowho;

    private Date resptime;

    private String respcontext;

    private Integer respstatus;

    private String resppic;

    private static final long serialVersionUID = 1L;

    public Integer getRespid() {
        return respid;
    }

    public void setRespid(Integer respid) {
        this.respid = respid;
    }

    public Integer getRespreview() {
        return respreview;
    }

    public void setRespreview(Integer respreview) {
        this.respreview = respreview;
    }

    public Integer getResppost() {
        return resppost;
    }

    public void setResppost(Integer resppost) {
        this.resppost = resppost;
    }

    public String getRespfromwho() {
        return respfromwho;
    }

    public void setRespfromwho(String respfromwho) {
        this.respfromwho = respfromwho == null ? null : respfromwho.trim();
    }

    public String getResptowho() {
        return resptowho;
    }

    public void setResptowho(String resptowho) {
        this.resptowho = resptowho == null ? null : resptowho.trim();
    }

    public Date getResptime() {
        return resptime;
    }

    public void setResptime(Date resptime) {
        this.resptime = resptime;
    }

    public String getRespcontext() {
        return respcontext;
    }

    public void setRespcontext(String respcontext) {
        this.respcontext = respcontext == null ? null : respcontext.trim();
    }

    public Integer getRespstatus() {
        return respstatus;
    }

    public void setRespstatus(Integer respstatus) {
        this.respstatus = respstatus;
    }

    public String getResppic() {
        return resppic;
    }

    public void setResppic(String resppic) {
        this.resppic = resppic == null ? null : resppic.trim();
    }
}