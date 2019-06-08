package com.controller.admin;

import com.hcf.helpClass.WebTable;
import com.hcf.pojo.TbPosts;
import com.hcf.pojo.TbUser;
import com.hcf.pojo.VPost;
import com.hcf.pojo.VReview;
import com.hcf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin/forum")
public class forumController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/posts_list")
    public String posts_list() { return "manage/forum/posts-list"; }

    @RequestMapping("/review_list")
    public String review_list() { return "manage/forum/review-list"; }

    @RequestMapping("/resp_list")
    public String resp_list() { return "manage/forum/resp-list"; }

    @RequestMapping("/getPostList")
    @ResponseBody
    public WebTable<VPost> getPostList(int page, int limit,
                                       String postuser,String posttype,String posttitle,
                                       int poststatus,int postscan,int postthumb) {
        return adminService.getPostBySituation(page,limit,postuser
                , posttype,posttitle,-1, -1, -1);
    }


    @RequestMapping("/getReviewList")
    @ResponseBody
    public WebTable<VReview> getReviewList(int page, int limit,String postid) {
        return adminService.getReviewBySituation(page,limit,""
                , Integer.parseInt(postid), -1);
    }

    @RequestMapping("/getOwerOfReview")
    @ResponseBody
    public TbUser getOwerOfReview(String reviewpost) {
        return adminService.getPostUserByID(Integer.parseInt(reviewpost));
    }
}
