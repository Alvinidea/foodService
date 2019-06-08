package com.hcf.pojo;

import java.io.Serializable;
import java.util.Date;

public class VCmt implements Serializable {
    private Integer cmtid;

    private String cmtseller;

    private String cmtpayer;

    private Integer cmtorder;

    private String cmtgoods;

    private String cmtcontext;

    private String cmtpicture;

    private Integer cmtstars;

    private Date cmttime;

    private String orderpaymethod;

    private String storename;

    private String username;

    private String goodsname;

    private Double goodsprice;

    private Double goodsdiscount;

    private String goodspic;

    private Integer orderstatus;

    private Date orderovertime;

    private Date orderbegintime;

    private String ordersaddress;

    private String orderpaddress;

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

    public Integer getCmtorder() {
        return cmtorder;
    }

    public void setCmtorder(Integer cmtorder) {
        this.cmtorder = cmtorder;
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

    public String getOrderpaymethod() {
        return orderpaymethod;
    }

    public void setOrderpaymethod(String orderpaymethod) {
        this.orderpaymethod = orderpaymethod == null ? null : orderpaymethod.trim();
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename == null ? null : storename.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public Double getGoodsdiscount() {
        return goodsdiscount;
    }

    public void setGoodsdiscount(Double goodsdiscount) {
        this.goodsdiscount = goodsdiscount;
    }

    public String getGoodspic() {
        return goodspic;
    }

    public void setGoodspic(String goodspic) {
        this.goodspic = goodspic == null ? null : goodspic.trim();
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Date getOrderovertime() {
        return orderovertime;
    }

    public void setOrderovertime(Date orderovertime) {
        this.orderovertime = orderovertime;
    }

    public Date getOrderbegintime() {
        return orderbegintime;
    }

    public void setOrderbegintime(Date orderbegintime) {
        this.orderbegintime = orderbegintime;
    }

    public String getOrdersaddress() {
        return ordersaddress;
    }

    public void setOrdersaddress(String ordersaddress) {
        this.ordersaddress = ordersaddress == null ? null : ordersaddress.trim();
    }

    public String getOrderpaddress() {
        return orderpaddress;
    }

    public void setOrderpaddress(String orderpaddress) {
        this.orderpaddress = orderpaddress == null ? null : orderpaddress.trim();
    }
}