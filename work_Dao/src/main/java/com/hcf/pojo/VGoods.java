package com.hcf.pojo;

import java.io.Serializable;

public class VGoods implements Serializable {
    private String goodsid;

    private String goodsseller;

    private String goodsname;

    private Double goodsprice;

    private Double goodsdiscount;

    private Integer goodscmtnum;

    private String goodspic;

    private Integer goodsstars;

    private String goodsother;

    private String storename;

    private String storeaddress;

    private Integer storetype;

    private static final long serialVersionUID = 1L;

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid == null ? null : goodsid.trim();
    }

    public String getGoodsseller() {
        return goodsseller;
    }

    public void setGoodsseller(String goodsseller) {
        this.goodsseller = goodsseller == null ? null : goodsseller.trim();
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

    public Integer getGoodscmtnum() {
        return goodscmtnum;
    }

    public void setGoodscmtnum(Integer goodscmtnum) {
        this.goodscmtnum = goodscmtnum;
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

    public String getGoodsother() {
        return goodsother;
    }

    public void setGoodsother(String goodsother) {
        this.goodsother = goodsother == null ? null : goodsother.trim();
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

    public Integer getStoretype() {
        return storetype;
    }

    public void setStoretype(Integer storetype) {
        this.storetype = storetype;
    }
}