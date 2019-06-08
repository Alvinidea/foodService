package com.controller.store;

import com.hcf.helpClass.Cart;
import com.hcf.helpClass.WebTable;
import com.hcf.mapper.TbPostsMapper;
import com.hcf.pojo.TbGoods;
import com.hcf.pojo.TbStore;
import com.hcf.pojo.TbUser;
import com.hcf.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/store")
public class ustoreController
{
    @Autowired
    private UserService userService;
    @Autowired
    private StoreService storeService;
    @Autowired
    private FoodService foodService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private ForumService forumService;

    @RequestMapping("/store_main")
    public String Store_main()
    {
        return "store/store-main";
    }

    @RequestMapping("/store_goods")
    public String Store_goods()
    {
        return "store/store-goods";
    }

    @RequestMapping("/store_cart")
    public String Store_cart() { return "store/store-cart"; }


    //获取商铺列表
    @RequestMapping("/get_store_op")
    @ResponseBody
    public List<TbStore> get_store_op(int page, int limit)
    {
        List<TbStore> table =  storeService.getStore(page,limit);
        return table;
    }
    //获取商铺列表
    @RequestMapping("/get_store_opWithType")
    @ResponseBody
    public List<TbStore> get_store_op2(int page, int limit,String type)
    {
        List<TbStore> table =  storeService.getStoreByType(page,limit,type);
        return table;
    }

    //获取商品列表
    @RequestMapping("/get_goods_op")
    @ResponseBody
    public List<TbGoods> get_goods_op(int page,int limit,String storeid)
    {
        List<TbGoods> table =  storeService.getGoods(page,limit,storeid);
        return table;
    }
//获取购物车数据
    @RequestMapping("/cart_data")
    @ResponseBody
    public  WebTable<Cart> Cart_data(int page, int limit, String[] goodsid, HttpSession session)
    {
        TbUser user = (TbUser) session.getAttribute("user");
        WebTable<Cart> table =  storeService.getCart(goodsid,user.getUserid());
        return table;
    }

    //未登录的获取商铺自身数据
    @RequestMapping("/visit_StoreInfo")
    @ResponseBody
    public TbStore getStore_infoById(String storeid)
    {
        TbStore store = storeService.getStoreInfo(storeid);
        return store;
    }

    /**
     * 商铺信息处理的控制器
     *
     * */
    @RequestMapping("/store_info")
    public String Store_info(){ return "store/store-info";}

    @RequestMapping("/store_info_detail")
    public String Store_info_detail(){ return "store/store-info-detail";}

    @RequestMapping("/store_info_pwd")
    public String Store_info_pwd(){ return "store/store-info-pwd";}

    //商铺更改密码 操作
    @RequestMapping("/store_info_pwd_op")
    @ResponseBody
    public String Store_info_pwd(String pwd,String newpwd,HttpSession session){
        TbStore store = (TbStore)session.getAttribute("store");
        int ret = storeService.modifyPwd(store.getStoreid(),pwd,newpwd);
        switch (ret)
        {//2 代表输入的旧密码 与 密码 不一致  3  输入的新旧密码不一致
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 0:
                return "0";
            default:
                return "-1";
        }
    }

    //获取统计数据
    @RequestMapping("/get_Store_S_detail")
    @ResponseBody
    public int[] Store_info_detail_Statistic(HttpSession session)
    {
        TbStore store = (TbStore)session.getAttribute("store");

        int[] list  = new int[5];
        //int postNum =
        list[0]= forumService.getCount(store.getStoreid());
        //int foodNum =
        list[1]=foodService.getCount(store.getStoreid());
        //int finished =
        list[2]=orderService.getCount(store.getStoreid(),6,"seller");
        //int waitSure=
        list[3]=orderService.getCount(store.getStoreid(),2,"seller");
        //int waitSend=
        list[4]=orderService.getCount(store.getStoreid(),3,"seller");
        return list;
    }

    //获取商铺自身数据
    @RequestMapping("/getStore_info")
    @ResponseBody
    public TbStore getStore_info(HttpSession session)
    {
        TbStore store = (TbStore)session.getAttribute("store");
        TbStore store2 = storeService.getStoreInfo(store.getStoreid());
        session.removeAttribute("store");
        session.setAttribute("store",store2);
        return store2;
    }


    //修改商铺自身数据
    @RequestMapping("/modify_storeInfo")
    @ResponseBody
    public String modify_info(String storeid,String storename,String storeaddress,
                              String storephone,String storelevel,String storeiswork)
    {
        TbStore store= new TbStore();
        store.setStoreownerid(storeid);
        store.setStoreaddress(storeaddress);
        store.setStoreid(storeid);
        //store.setStoreiswork(Integer.parseInt(storeiswork));
        store.setStorelevel(Integer.parseInt(storelevel));
        store.setStorename(storename);
        store.setStorephone(storephone);
        int ret = storeService.modifyStoreInfo(store);
        return  ret == 1? "success":"fail";
    }

    @RequestMapping("/store_info_infoItem")
    public String Store_info_infoItem(){ return "store/store-info-infoItem";}

    @RequestMapping("/store_info_foodItem")
    public String Store_info_foodItem(){ return "store/store-info-foodItem";}

    @RequestMapping("/foodItem")
    @ResponseBody
    public WebTable<TbGoods> foodItem(int page,int limit,
                                      String goodsid, String goodsname,HttpSession session){
        TbStore store = (TbStore)session.getAttribute("store");
        WebTable<TbGoods> table = foodService.getGoodsBySellerId(page,limit
                ,goodsid,goodsname,store.getStoreid());
        return table;
    }

    @RequestMapping("/editItem")
    public String editItem(){
        return "store/store-info-foodItem-edit";
    }
    @RequestMapping("/editItem_op")
    @ResponseBody
    public String editItem_op(TbGoods goods){
        int ret = foodService.updateGoodsInfo(goods);
        return ret == 1 ? "success" : "fail";
    }
    @RequestMapping("/delItem_op")
    @ResponseBody
    public String delItem_op(String goodsid){
        int ret = foodService.delGoodsById(goodsid);
        return ret == 1 ? "success" : "fail";
    }

    @RequestMapping("/addItem")
    public String addItem(){
        return "store/store-info-foodItem-add";
    }
    @RequestMapping("/addItem_op")
    @ResponseBody
    public String addItem_op(TbGoods goods,HttpSession session){
        int ret =-1;
        TbStore store = (TbStore)session.getAttribute("store");
        ret = foodService.addGoods(goods,store.getStoreid());
        return ret == 1 ? "success" : "fail";
    }

    //订单信息
    @RequestMapping("/store_info_orderItem")
    public String Store_info_orderItem(){ return "store/store-info-orderItem";}

    //订单信息
    @RequestMapping("/store_info_orderItem_Detail")
    public String Store_info_orderItem_Detail(){ return "store/store-info-orderItem-Detail";}

    //等待操作的订单信息
    @RequestMapping("/store_info_orderItem_waitOp")
    public String Store_info_orderItem_waitOp(){ return "store/store-info-orderItem-waitSure";}

    @RequestMapping("/store_info_postItem")
    public String Store_info_postItem(){ return "store/store-info-postItem";}
}
