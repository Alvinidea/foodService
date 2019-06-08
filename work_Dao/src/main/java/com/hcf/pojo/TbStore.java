package com.hcf.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbStore implements Serializable {
    private String storeid;

    private String storeownerid;

    private String storename;

    private String storeaddress;

    private String storephone;

    private String storepicture;

    private Integer storecmtnum;

    private Integer storetype;

    private Integer storeaverprice;

    private Integer storelevel;

    private Date storeapplytime;

    private Integer storeiswork;

    private static final long serialVersionUID = 1L;

    public String getStoreid() {
        return storeid;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid == null ? null : storeid.trim();
    }

    public String getStoreownerid() {
        return storeownerid;
    }

    public void setStoreownerid(String storeownerid) {
        this.storeownerid = storeownerid == null ? null : storeownerid.trim();
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename == null ? null : storename.trim();
    }

    public String getStoreaddress() {
        return storeaddress;
    }

    public void setStoreaddress(String storeaddress) {
        this.storeaddress = storeaddress == null ? null : storeaddress.trim();
    }

    public String getStorephone() {
        return storephone;
    }

    public void setStorephone(String storephone) {
        this.storephone = storephone == null ? null : storephone.trim();
    }

    public String getStorepicture() {
        return storepicture;
    }

    public void setStorepicture(String storepicture) {
        this.storepicture = storepicture == null ? null : storepicture.trim();
    }

    public Integer getStorecmtnum() {
        return storecmtnum;
    }

    public void setStorecmtnum(Integer storecmtnum) {
        this.storecmtnum = storecmtnum;
    }

    public Integer getStoretype() {
        return storetype;
    }

    public void setStoretype(Integer storetype) {
        this.storetype = storetype;
    }

    public Integer getStoreaverprice() {
        return storeaverprice;
    }

    public void setStoreaverprice(Integer storeaverprice) {
        this.storeaverprice = storeaverprice;
    }

    public Integer getStorelevel() {
        return storelevel;
    }

    public void setStorelevel(Integer storelevel) {
        this.storelevel = storelevel;
    }

    public Date getStoreapplytime() {
        return storeapplytime;
    }

    public void setStoreapplytime(Date storeapplytime) {
        this.storeapplytime = storeapplytime;
    }

    public Integer getStoreiswork() {
        return storeiswork;
    }

    public void setStoreiswork(Integer storeiswork) {
        this.storeiswork = storeiswork;
    }
}