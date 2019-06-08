package com.hcf.service;


import com.hcf.helpClass.ShowPost;
import com.hcf.helpClass.ShowResp;
import com.hcf.helpClass.ShowReview;
import com.hcf.pojo.TbPosts;
import com.hcf.pojo.TbReview;
import com.hcf.pojo.TbUser;
import com.hcf.pojo.VPost;


import java.util.List;

public interface ForumService {
    //---------------------------------------------------------------------------
    public List<VPost> getVPostList(int page, int limit, String userid, String posttype
            , int scan, int thumb);
    //---------------------------------------------------------------------------

    public List<ShowPost> getPostPage(int page,int limit);

    public List<ShowPost> getPostPage(int page,int limit,String id);

    public List<ShowPost> getPostByType(int page,int limit,String type);

    //查询all
    public List<ShowPost>  getAllPosts();
    //删除
    public Boolean delPost(String id,String type) ;

    public Boolean addPost(TbPosts posts,String uid);

    //根据帖子详情获取评论
    public List<TbReview> getReview(String postid);

    //获取帖子总数目
    public int getCount(String userid);


    /***
     * 首页获取top six post
     * @param page
     * @param limit
     *         if(type == "topscan")
     *             criteria.andPostscanGreaterThan(50);
     *         else if( type == "downscan")
     *             criteria.andPostscanLessThanOrEqualTo(50);
     *         else if( type == "topthumb")
     *             criteria.andPostthumbGreaterThanOrEqualTo(50);
     *         else if( type == "downthumb")
     *             criteria.andPostthumbLessThanOrEqualTo(50);
     * @return
     */
    public List<TbPosts> getPostBySituation(int page ,int limit,String type);

    /**
     * 帖子详情获取页面
     *
     * */
    public int setPostScan(String postid);
    public int setPostThumb(String postid);

    public ShowPost getPostInfoById(String postid);

    public String getReviewNum(String postid);

    public List<ShowReview> getReviewById(int page, int limit, String postid);

    public List<ShowResp>  getRespById(int page, int limit, String reviewid);

    public int setReview(String postid, String context, TbUser reviewer);

    public int setResp(String reviewid,  String context, TbUser reviewer);

}
