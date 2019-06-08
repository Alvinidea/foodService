package com.controller.forum;


import com.hcf.helpClass.ShowPost;
import com.hcf.helpClass.ShowResp;
import com.hcf.helpClass.ShowReview;
import com.hcf.pojo.*;
import com.hcf.service.FoodService;
import com.hcf.service.ForumService;
import com.hcf.service.OrderService;
import com.hcf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/forum")
public class mforumcontroller {

    @Autowired
    private ForumService forumService;
    @Autowired
    private UserService userService;
    @Autowired
    private FoodService foodService;
    @Autowired
    private OrderService orderService;

/**
 * 返回页面
 * */
    @RequestMapping("/forum_main")
    public String posts_list() { return "forum/forum-main"; }

    @RequestMapping("/posts_detail")
    public String postsdetail() { return "forum/posts-detail"; }


    @RequestMapping("/review_detail")
    public String reviewdetail() { return "forum/review-detail"; }

    //论坛 看别人的信息
    @RequestMapping("/look_user_info")
    public String userinfo() { return "forum/user-info"; }

    @RequestMapping("/send_post")
    public String send_post()
    { return "forum/send-post"; }

    /**
     * 获取数据的接口
     *
     * */

    @RequestMapping("/get_SeqScan")
    @ResponseBody
    public List<VPost> get_SeqScan(int page, int limit)
    {
        //List<ShowPost> list = forumService.getAllPosts();
        List<VPost> list = forumService.getVPostList(page,limit,"", ""
                ,500, -1);
        return list != null ? list:null;
    }

    @RequestMapping("/get_SeqThumb")
    @ResponseBody
    public List<VPost> get_SeqThumb(int page, int limit)
    {
        //List<ShowPost> list = forumService.getAllPosts();
        List<VPost> list = forumService.getVPostList(page,limit,"", ""
                ,-1, 500);
        return list != null ? list:null;
    }

    @RequestMapping("/get_posts_op")
    @ResponseBody
    public List<VPost> get_posts_op(int page, int limit)
    {
        //List<ShowPost> list = forumService.getAllPosts();
        List<VPost> list = forumService.getVPostList(page,limit,"", ""
            ,-1, -1);
        return list != null ? list:null;
    }

    @RequestMapping("/get_posts_bySituation")
    @ResponseBody
    public List<VPost> getPostsBySituation(int page, int limit,String type)
    {
        //List<ShowPost> list = forumService.getAllPosts();
        List<VPost> list = forumService.getVPostList(page,limit,"", type
                ,-1, -1);
        return list != null ? list:null;
    }

    @RequestMapping("/send_post_op")
    @ResponseBody
    public String send_post_op(TbPosts posts,HttpSession session)
    {
        Boolean ret;
        TbUser user = (TbUser) session.getAttribute("user");
        ret = forumService.addPost(posts,user.getUserid());
        return ret? "success":"fail";
    }

    @RequestMapping("/send_postpic_op")
    @ResponseBody
    public String send_postpic_op(TbPosts posts,HttpSession session)
    {
        Boolean ret;
        TbUser user = (TbUser) session.getAttribute("user");
        ret = forumService.addPost(posts,user.getUserid());
        return ret? "success":"fail";
    }

    /**
     *  帖子详情的页面 获取帖子详情
     *
     * */

    @RequestMapping("/setPostScan")
    @ResponseBody
    public int setPostScan(String postid)
    {
        return forumService.setPostScan(postid);
    }

    @RequestMapping("/setPostThumb")
    @ResponseBody
    public int setPostThumb(String postid)
    {
        return forumService.setPostThumb(postid);
    }

//帖子详情页获取帖子信息 和 个人页面
    @RequestMapping("/get_post_data")
    @ResponseBody
    public ShowPost get_post_data(String postid)
    {
        ShowPost sp = forumService.getPostInfoById(postid);
        return sp;
    }

    //帖子详情页获取帖子信息 和 个人页面
    @RequestMapping("/getReviewNum")
    @ResponseBody
    public String getReviewNum(String postid)
    {
        return forumService.getReviewNum(postid);
    }

    //帖子详情页获取对该帖子的评价信息
    @RequestMapping("/get_review_op")
    @ResponseBody
    public List<ShowReview> get_review_op(int page, int limit, String postid)
    {
        return forumService.getReviewById(page,limit,postid);
    }

    //帖子详情页获取对该帖子的评价信息
    @RequestMapping("/get_resp_op")
    @ResponseBody
    public List<ShowResp> get_resp_op(int page, int limit, String reviewid)
    {
        return forumService.getRespById(page,limit,reviewid);
    }

    //评论
    @RequestMapping("/set_review")
    @ResponseBody
    public String set_review(String postid, String context, HttpSession session)
    {
        TbUser user = (TbUser) session.getAttribute("user");
        if(user == null)
            return "fail";
        forumService.setReview(postid,context,user);
        return "success";
    }

    //评论
    @RequestMapping("/set_resp")
    @ResponseBody
    public String set_resp(String reviewid ,String context, HttpSession session)
    {
        TbUser user = (TbUser) session.getAttribute("user");
        if(user == null)
            return "fail";
        forumService.setResp(reviewid,context,user);
        return "success";
    }



    /**
     *   商铺获取数据的接口
     *
     * */
    @RequestMapping("/get_storeposts_op")
    @ResponseBody
    public List<VPost> get_storePosts_op(int page, int limit,HttpSession session)
    {
        //List<ShowPost> list = forumService.getAllPosts();
        TbStore store = (TbStore)session.getAttribute("store");
        List<VPost> list = forumService.getVPostList(page,limit,store.getStoreid(), ""
                ,-1, -1);
        return list != null ? list:null;
    }


    /**
     *   用户获取数据的接口
     *
     * */
    @RequestMapping("/get_UserPosts_op")
    @ResponseBody
    public List<VPost> get_userPosts_op(int page, int limit,HttpSession session)
    {
        //List<ShowPost> list = forumService.getAllPosts();
        TbUser user = (TbUser)session.getAttribute("user");
        List<VPost> list = forumService.getVPostList(page,limit,user.getUserid(), ""
                ,-1, -1);
        return list != null ? list:null;
    }


    //话题展示
    @RequestMapping("/six_post")
    @ResponseBody
    public List<ShowPost> six_post(int page, int limit,String id)
    {
        return forumService.getPostPage(page,limit,id);
    }

    @RequestMapping("/getUser_info")
    @ResponseBody
    public TbUser getUser_info(String id)
    {
        TbUser user = userService.getUser(id);
        return user;
    }

    @RequestMapping("/getUser_photo")
    @ResponseBody
    public String getUser_photo(String id)
    {
        String str = userService.getUserPhoto(id);
        return str;
    }


    //四个食堂菜  四个小店菜
    @RequestMapping("/viewUserOrder")
    @ResponseBody
    public List<String> viewUserOrder(int page,int limit,String id)
    {
        return foodService.getPayerfood(page,limit,id, "");
    }


    @RequestMapping("/viewUserNum")
    @ResponseBody
    public List<String> viewUserNum(String id)
    {
        List<String> list =new ArrayList<>();
        list.add(""+orderService.getCount(id,-1,"payer"));
        list.add(""+forumService.getCount(id));
        return list;
    }
}
