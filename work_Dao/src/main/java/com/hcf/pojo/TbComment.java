package com.hcf.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbComment implements Serializable {
    private Integer cmtid;

    private String cmtseller;

    private String cmtpayer;

    private String cmtorderd;

    private String cmtorder;

    private String cmtgoods;

    private String cmtcontext;

    private String cmtpicture;

    private Integer cmtstars;

    private Date cmttime;

    private static final long serialVersionUID = 1L;

    public Integer getCmtid() {
        return cmtid;
    }

    public void setCmtid(Integer cmtid) {
        this.cmtid = cmtid;
    }

    public String getCmtseller() {
        return cmtseller;
    }

    public void setCmtseller(String cmtseller) {
        this.cmtseller = cmtseller == null ? null : cmtseller.trim();
    }

    public String getCmtpayer() {
        return cmtpayer;
    }

    public void setCmtpayer(String cmtpayer) {
        this.cmtpayer = cmtpayer == null ? null : cmtpayer.trim();
    }

    public String getCmtorderd() {
        return cmtorderd;
    }

    public void setCmtorderd(String cmtorderd) {
        this.cmtorderd = cmtorderd == null ? null : cmtorderd.trim();
    }

    public String getCmtorder() {
        return cmtorder;
    }

    public void setCmtorder(String cmtorder) {
        this.cmtorder = cmtorder == null ? null : cmtorder.trim();
    }

    public String getCmtgoods() {
        return cmtgoods;
    }

    public void setCmtgoods(String cmtgoods) {
        this.cmtgoods = cmtgoods == null ? null : cmtgoods.trim();
    }

    public String getCmtcontext() {
        return cmtcontext;
    }

    public void setCmtcontext(String cmtcontext) {
        this.cmtcontext = cmtcontext == null ? null : cmtcontext.trim();
    }

    public String getCmtpicture() {
        return cmtpicture;
    }

    public void setCmtpicture(String cmtpicture) {
        this.cmtpicture = cmtpicture == null ? null : cmtpicture.trim();
    }

    public Integer getCmtstars() {
        return cmtstars;
    }

    public void setCmtstars(Integer cmtstars) {
        this.cmtstars = cmtstars;
    }

    public Date getCmttime() {
        return cmttime;
    }

    public void setCmttime(Date cmttime) {
        this.cmttime = cmttime;
    }
}