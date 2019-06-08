package com.controller.admin;

import com.hcf.helpClass.WebTable;
import com.hcf.pojo.TbStore;
import com.hcf.pojo.VGoods;
import com.hcf.service.AdminStoreService;
import com.hcf.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/admin/store")
public class storeController {

    @Autowired
    private AdminStoreService adminStoreService;
    @Autowired
    private StoreService storeService;
    @RequestMapping("/store_list")
    public String store_list() { return "manage/store/store-list"; }

    @RequestMapping("/store_edit")
    public String store_edit() { return "manage/store/store-edit"; }

    @RequestMapping("/store_add")
    public String store_add() { return "manage/store/store-add"; }

    @RequestMapping("/goods_list")
    public String goods_list() { return "manage/store/goods-list"; }

    @RequestMapping("/cmt_list")
    public String cmt_list() { return "manage/store/cmt-list"; }

    @RequestMapping("/getStoreList")
    @ResponseBody
    public WebTable<TbStore> getStoreList(int page,int limit,String storeid, String storename,
                                          String address,int type)
    {
        WebTable<TbStore> storeWebTable = adminStoreService.getStoreByInfo( page,limit
            ,storename,address,storeid
            , type,-1,-1,-1);
        return storeWebTable;
    }

    @RequestMapping("/getGoodsList")
    @ResponseBody
    public WebTable<VGoods> getGoodsList(int page, int limit,String storeid,String goodsid,
                                         String goodsname)
    {
        WebTable<VGoods> storeWebTable = adminStoreService.getGoods(page,limit,storeid,goodsid,
           goodsname,-1,-1);
        return storeWebTable;
    }

    @RequestMapping("/getStore_info")
    @ResponseBody
    public TbStore getStoreList(String storeid)
    {
        TbStore store = storeService.getStoreInfo(storeid);
        return store;
    }

    //修改商铺自身数据
    @RequestMapping("/modifyStoreInfo")
    @ResponseBody
    public String modify_info(String storeid,String storename,String storeaddress,
                              String storephone,String storelevel,String storeiswork)
    {
        TbStore store= new TbStore();
        store.setStoreownerid(storeid);
        store.setStoreaddress(storeaddress);
        store.setStoreid(storeid);
        store.setStoreiswork(Integer.parseInt(storeiswork));
        store.setStorelevel(Integer.parseInt(storelevel));
        store.setStorename(storename);
        store.setStorephone(storephone);
        int ret = storeService.modifyStoreInfo(store);
        return  ret == 1? "success":"fail";
    }

    //修改商铺自身数据
    @RequestMapping("/addStore")
    @ResponseBody
    public String addStore(String storeid,String storename,String storeaddress,
                              String storelevel,int type)
    {
        TbStore store= new TbStore();
        store.setStoreownerid(storeid);
        store.setStoreaddress(storeaddress);
        store.setStoreid(storeid);
        store.setStoreiswork(0);
        store.setStoretype(type);
        store.setStorelevel(Integer.parseInt(storelevel));
        store.setStorename(storename);
        store.setStorephone("");
        store.setStorepicture("/pic/logo.jpg");
        int ret = storeService.addStore(store);
        return  ret == 1? "success":"fail";
    }
}