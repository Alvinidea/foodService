package com.hcf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hcf.helpClass.Cart;
import com.hcf.helpClass.ShowPost;
import com.hcf.helpClass.WebTable;
import com.hcf.mapper.TbGoodsMapper;
import com.hcf.mapper.TbStoreMapper;
import com.hcf.mapper.TbUserMapper;
import com.hcf.pojo.*;
import com.hcf.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private TbStoreMapper tbStoreMapper;


    @Autowired
    private TbUserMapper userMapper;

    @Autowired
    private TbGoodsMapper tbGoodsMapper;

    @Override
    public int modifyPwd(String userid, String pwd, String newpwd) {
        /*
        int ret =-1;
        TbStore user = new TbStore();
        TbStore old = tbStoreMapper.selectByPrimaryKey(userid);
        if( !old.getStoreid().equals(pwd))
            return 2;//2 代表输入的旧密码 与 密码 不一致  3  输入的新旧密码不一致
        if(pwd.equals(newpwd))
            return 3;//3  输入的新旧密码不一致
        user.setStoreownerid(newpwd);
        user.setStoreid(userid);
        ret = tbStoreMapper.updateByPrimaryKeySelective(user);
        return ret;
        */
        int ret =-1;
        TbUser user = new TbUser();
        TbUser old = userMapper.selectByPrimaryKey(userid);
        if( !old.getUserpwd().equals(pwd))
            return 2;//2 代表输入的旧密码 与 密码 不一致  3  输入的新旧密码不一致
        if( pwd.equals(newpwd))
            return 3;//3  输入的新旧密码不一致
        user.setUserpwd(newpwd);
        user.setUserid(userid);
        ret = userMapper.updateByPrimaryKeySelective(user);
        return ret;
    }

    @Override
    public WebTable<Cart> getCart(String[] goodsid,String userid){
        List<Cart> list = new ArrayList<Cart>();
        for(int i=0;i<goodsid.length;i++)
        {
            TbGoods goods = tbGoodsMapper.selectByPrimaryKey(goodsid[i]);
            if(goods == null)
                continue;
            Cart cart = new Cart();
            cart.setCartid(i+1);
            cart.setCartpayer(userid);
            cart.setCartseller(goods.getGoodsseller());
            cart.setGoodsname(goods.getGoodsname());
            cart.setCartgoodsid(goods.getGoodsid());
            cart.setGoodspic(goods.getGoodspic());
            cart.setCartprice(goods.getGoodsprice());
            cart.setGoodsnum(1);
            cart.setCarttotalprice(goods.getGoodsprice());
            list.add(cart);
        }
        WebTable<Cart> table = new WebTable<Cart>();
        table.setData(list);
        return table;
    }

    public List<TbGoods> getGoods(int page,int limit,String storeid)
    {
        //开启分页助手
        PageHelper.startPage(page,limit);

        TbGoodsExample tbGoodsExample = new TbGoodsExample();
        TbGoodsExample.Criteria criteria = tbGoodsExample.createCriteria();
        criteria.andGoodssellerEqualTo(storeid);
        List<TbGoods> list = tbGoodsMapper.selectByExample(tbGoodsExample);

        //得到分页助手帮忙查询的数据
        PageInfo<TbGoods> postsPageInfo = new PageInfo<>(list);
        //封装了一页显示的用户信息的集合
        List<TbGoods> foods = postsPageInfo.getList();
        return foods;
    }
    //获取商店信息
    public List<TbStore> getStore(int page,int limit)
    {
        //开启分页助手
        PageHelper.startPage(page,limit);
        //开始查询
        TbStoreExample storeExample = new TbStoreExample();
        List<TbStore> list = tbStoreMapper.selectByExample(storeExample);
        //得到分页助手帮忙查询的数据
        PageInfo<TbStore> postsPageInfo = new PageInfo<>(list);
        //封装了一页显示的用户信息的集合
        List<TbStore> stores = postsPageInfo.getList();

        return stores;
    }

    //获取商铺清单 有条件
    /**
     *   //var type = "11";
     *   // 10 所有商铺  11代表食堂 12 普通商铺  13 待开发
     *   // 20 评论数目高   21 低
     *   // 30 商家等级高   31 低
     * */
    public List<TbStore> getStoreByType(int page,int limit,String type)
    {
        //开启分页助手
        PageHelper.startPage(page,limit);
        //开始查询
        TbStoreExample storeExample = new TbStoreExample();
        TbStoreExample.Criteria criteria = storeExample.createCriteria();
        switch ( Integer.parseInt(type))
        {
            case 10:
                break;
            case 11:
                criteria.andStoretypeEqualTo(11);
                break;
            case 12:
                criteria.andStoretypeEqualTo(12);
                break;
            case 13:
                criteria.andStoretypeEqualTo(13);
                break;
            case 20:
                criteria.andStorecmtnumBetween(99,100000);
                break;
            case 21:
                criteria.andStorecmtnumBetween(0,100);
                break;
            case 30:
                criteria.andStorelevelBetween(5,99);
                break;
            case 31:
                criteria.andStorelevelBetween(0,6);
                break;
        }
        List<TbStore> list = tbStoreMapper.selectByExample(storeExample);
        //得到分页助手帮忙查询的数据
        PageInfo<TbStore> postsPageInfo = new PageInfo<>(list);
        //封装了一页显示的用户信息的集合
        List<TbStore> stores = postsPageInfo.getList();

        return stores;
    }

    //获取商铺信息
    @Override
    public TbStore getStoreInfo(String storeid)
    {
        TbStore store = tbStoreMapper.selectByPrimaryKey(storeid);
        return store;
    }

    //修改商铺信息
    @Override
    public int modifyStoreInfo(TbStore store) {
        return tbStoreMapper.updateByPrimaryKeySelective(store);
    }

    public int addStore(TbStore store)
    {
        return tbStoreMapper.insertSelective(store);
    }
}
