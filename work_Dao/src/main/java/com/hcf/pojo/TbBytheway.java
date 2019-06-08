package com.hcf.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbBytheway implements Serializable {
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
}