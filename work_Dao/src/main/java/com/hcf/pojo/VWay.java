package com.hcf.pojo;

import java.io.Serializable;
import java.util.Date;

public class VWay implements Serializable {
    private Integer id;

    private String deliver;

    private String orderid;

    private Double price;

    private Date overtime;

    private Date begintime;

    private Integer status;

    private String payercmt;

    private String sellercmt;

    private Integer star;

    private String other;

    private String ordersaddress;

    private String orderpaddress;

    private String orderother;

    private Date orderbegintime;

    private Date orderovertime;

    private String storeaddress;

    private String storephone;

    private String storename;

    private Integer storetype;

    private String username;

    private String orderpayer;

    private String orderseller;

    private String userphone;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeliver() {
        return deliver;
    }

    public void setDeliver(String deliver) {
        this.deliver = deliver == null ? null : deliver.trim();
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getOvertime() {
        return overtime;
    }

    public void setOvertime(Date overtime) {
        this.overtime = overtime;
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPayercmt() {
        return payercmt;
    }

    public void setPayercmt(String payercmt) {
        this.payercmt = payercmt == null ? null : payercmt.trim();
    }

    public String getSellercmt() {
        return sellercmt;
    }

    public void setSellercmt(String sellercmt) {
        this.sellercmt = sellercmt == null ? null : sellercmt.trim();
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
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

    public String getOrderother() {
        return orderother;
    }

    public void setOrderother(String orderother) {
        this.orderother = orderother == null ? null : orderother.trim();
    }

    public Date getOrderbegintime() {
        return orderbegintime;
    }

    public void setOrderbegintime(Date orderbegintime) {
        this.orderbegintime = orderbegintime;
    }

    public Date getOrderovertime() {
        return orderovertime;
    }

    public void setOrderovertime(Date orderovertime) {
        this.orderovertime = orderovertime;
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

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename == null ? null : storename.trim();
    }

    public Integer getStoretype() {
        return storetype;
    }

    public void setStoretype(Integer storetype) {
        this.storetype = storetype;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getOrderpayer() {
        return orderpayer;
    }

    public void setOrderpayer(String orderpayer) {
        this.orderpayer = orderpayer == null ? null : orderpayer.trim();
    }

    public String getOrderseller() {
        return orderseller;
    }

    public void setOrderseller(String orderseller) {
        this.orderseller = orderseller == null ? null : orderseller.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }
}