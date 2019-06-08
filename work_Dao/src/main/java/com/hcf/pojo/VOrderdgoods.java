package com.hcf.pojo;

import java.io.Serializable;

public class VOrderdgoods implements Serializable {
    private String orderidd;

    private String goodsid;

    private String goodsname;

    private String orderid;

    private Double orderpriced;

    private Integer ordergnumd;

    private Double orderdiscountd;

    private Double orderallpriced;

    private String orderdother;

    private String goodsseller;

    private String goodspic;

    private Integer goodsstars;

    private static final long serialVersionUID = 1L;

    public String getOrderidd() {
        return orderidd;
    }

    public void setOrderidd(String orderidd) {
        this.orderidd = orderidd == null ? null : orderidd.trim();
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Double getOrderpriced() {
        return orderpriced;
    }

    public void setOrderpriced(Double orderpriced) {
        this.orderpriced = orderpriced;
    }

    public Integer getOrdergnumd() {
        return ordergnumd;
    }

    public void setOrdergnumd(Integer ordergnumd) {
        this.ordergnumd = ordergnumd;
    }

    public Double getOrderdiscountd() {
        return orderdiscountd;
    }

    public void setOrderdiscountd(Double orderdiscountd) {
        this.orderdiscountd = orderdiscountd;
    }

    public Double getOrderallpriced() {
        return orderallpriced;
    }

    public void setOrderallpriced(Double orderallpriced) {
        this.orderallpriced = orderallpriced;
    }

    public String getOrderdother() {
        return orderdother;
    }

    public void setOrderdother(String orderdother) {
        this.orderdother = orderdother == null ? null : orderdother.trim();
    }

    public String getGoodsseller() {
        return goodsseller;
    }

    public void setGoodsseller(String goodsseller) {
        this.goodsseller = goodsseller == null ? null : goodsseller.trim();
    }

    public String getGoodspic() {
        return goodspic;
    }

    public void setGoodspic(String goodspic) {
        this.goodspic = goodspic == null ? null : goodspic.trim();
    }

    public Integer getGoodsstars() {
        return goodsstars;
    }

    public void setGoodsstars(Integer goodsstars) {
        this.goodsstars = goodsstars;
    }
}