package com.hcf.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbOrders implements Serializable {
    private String orderid;

    private String orderseller;

    private String orderpayer;

    private String ordersaddress;

    private String orderpaddress;

    private Integer orderdetailnum;

    private Double orderdiscount;

    private Double orderallprice;

    private Integer orderstatus;

    private String orderpaymethod;

    private String orderother;

    private Date orderbegintime;

    private Date orderovertime;

    private static final long serialVersionUID = 1L;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getOrderseller() {
        return orderseller;
    }

    public void setOrderseller(String orderseller) {
        this.orderseller = orderseller == null ? null : orderseller.trim();
    }

    public String getOrderpayer() {
        return orderpayer;
    }

    public void setOrderpayer(String orderpayer) {
        this.orderpayer = orderpayer == null ? null : orderpayer.trim();
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

    public Integer getOrderdetailnum() {
        return orderdetailnum;
    }

    public void setOrderdetailnum(Integer orderdetailnum) {
        this.orderdetailnum = orderdetailnum;
    }

    public Double getOrderdiscount() {
        return orderdiscount;
    }

    public void setOrderdiscount(Double orderdiscount) {
        this.orderdiscount = orderdiscount;
    }

    public Double getOrderallprice() {
        return orderallprice;
    }

    public void setOrderallprice(Double orderallprice) {
        this.orderallprice = orderallprice;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getOrderpaymethod() {
        return orderpaymethod;
    }

    public void setOrderpaymethod(String orderpaymethod) {
        this.orderpaymethod = orderpaymethod == null ? null : orderpaymethod.trim();
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
}