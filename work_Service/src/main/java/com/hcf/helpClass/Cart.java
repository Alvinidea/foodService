package com.hcf.helpClass;

public class Cart {

    private int cartid;
    private String cartgoodsid;
    private String goodsname;
    private int goodsnum;
    private String cartpayer;
    private String cartseller;
    private double cartprice;
    private String goodspic;
    private double carttotalprice;
    private String cartOther;

    public String getGoodspic() {
        return goodspic;
    }

    public void setGoodspic(String goodspic) {
        this.goodspic = goodspic;
    }

    public int getCartid() {
        return cartid;
    }

    public void setCartid(int cartid) {
        this.cartid = cartid;
    }

    public String getCartgoodsid() {
        return cartgoodsid;
    }

    public void setCartgoodsid(String cartgoodsid) {
        this.cartgoodsid = cartgoodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public int getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(int goodsnum) {
        this.goodsnum = goodsnum;
    }

    public String getCartpayer() {
        return cartpayer;
    }

    public void setCartpayer(String cartpayer) {
        this.cartpayer = cartpayer;
    }

    public String getCartseller() {
        return cartseller;
    }

    public void setCartseller(String cartseller) {
        this.cartseller = cartseller;
    }

    public double getCartprice() {
        return cartprice;
    }

    public void setCartprice(double cartprice) {
        this.cartprice = cartprice;
    }

    public double getCarttotalprice() {
        return carttotalprice;
    }

    public void setCarttotalprice(double carttotalprice) {
        this.carttotalprice = carttotalprice;
    }

    public String getCartOther() {
        return cartOther;
    }

    public void setCartOther(String cartOther) {
        this.cartOther = cartOther;
    }
}
