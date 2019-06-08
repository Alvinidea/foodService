package com.controller;

import com.hcf.helpClass.ShowPost;
import com.hcf.mapper.TbGoodsMapper;
import com.hcf.mapper.TbPostsMapper;
import com.hcf.mapper.TbStoreMapper;
import com.hcf.pojo.TbGoods;
import com.hcf.pojo.TbPosts;
import com.hcf.pojo.TbStore;
import com.hcf.service.FoodService;
import com.hcf.service.ForumService;
import com.hcf.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/food")
public class IndexComtroller {

    @Autowired
    private StoreService storeService;
    @Autowired
    private ForumService forumService;
    @Autowired
    private FoodService foodService;

    @RequestMapping("/index")
    public String index_home()
    {
        return "index";
    }


    /***
     * 首页获取展示信息
     * @return
     */
    @RequestMapping("/topSix_store")
    @ResponseBody
    public List<TbStore> topFive_store(int page,int limit)
    {
        List<TbStore> list1 = storeService.getStoreByType(1,limit/2,"11");
        List<TbStore> list2 = storeService.getStoreByType(1,limit/2,"12");
        for(int i=0;i<limit/2;i++)
        {
            list1.add(list2.get(i));
        }
        return list1;
    }

    @RequestMapping("/topSix_post")
    @ResponseBody
    public List<TbPosts> topSix_post(int page, int limit)
    {
        return forumService.getPostBySituation(page,limit,"");
    }

    //四个食堂菜  四个小店菜
    @RequestMapping("/topNum_food")
    @ResponseBody
    public List<String> topNum_food(int page, int limit)
    {
        return foodService.gettopNum_food(page,limit, "");
    }

    //食材展示
    @RequestMapping("/topNum_post")
    @ResponseBody
    public List<TbPosts> topNum_post(int page, int limit)
    {
        return forumService.getPostBySituation(page,limit,"食材");
    }

    //话题展示
    @RequestMapping("/topSix_topic")
    @ResponseBody
    public List<ShowPost> topSix_topic(int page, int limit)
    {
        return forumService.getPostByType( page, limit, "话题");
    }
}
