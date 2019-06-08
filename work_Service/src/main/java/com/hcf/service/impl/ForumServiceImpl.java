package com.hcf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hcf.helpClass.ShowPost;
import com.hcf.helpClass.ShowResp;
import com.hcf.helpClass.ShowReview;
import com.hcf.mapper.*;
import com.hcf.pojo.*;
import com.hcf.service.ForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ForumServiceImpl implements ForumService{

    @Autowired
    public TbPostsMapper tbPostsMapper;
    @Autowired
    public TbUserMapper tbUserMapper;
    @Autowired
    public TbUserdetailMapper tbUserdetailMapper;
    @Autowired
    public TbReviewMapper reviewMapper;
    @Autowired
    public TbRespMapper respMapper;
    @Autowired
    public VPostMapper vPostMapper;

    //-----------------------------------------------------------------------------
    public List<VPost> getVPostList(int page, int limit,String userid,String posttype
    ,int scan,int thumb)
    {
        //开启分页助手
        PageHelper.startPage(page,limit);
        //开始查询
        VPostExample vPostsExample = new VPostExample();
        VPostExample.Criteria criteria = vPostsExample.createCriteria();
        if( !userid.equals("")) {
            criteria.andPostuserEqualTo(userid);
        }
        if(scan != -1 )
            //criteria.andPostscanBetween(scan-20,scan+20);
            criteria.andPostscanGreaterThan(scan);
        if( thumb != -1)
            //criteria.andPostthumbBetween(thumb-10,thumb+10);
            criteria.andPostthumbGreaterThan(thumb);
        if( posttype.equals("食材"))
            criteria.andPosttypeEqualTo(posttype);
        if( posttype.equals("分享"))
            criteria.andPosttypeEqualTo(posttype);
        if( posttype.equals("教学"))
            criteria.andPosttypeEqualTo(posttype);
        if( posttype.equals("话题"))
            criteria.andPosttypeEqualTo(posttype);
        if( posttype.equals("学习"))
            criteria.andPosttypeEqualTo(posttype);

        List<VPost> list = vPostMapper.selectByExample(vPostsExample);
        //得到分页助手帮忙查询的数据
        PageInfo<VPost> postsPageInfo = new PageInfo<>(list);
        //封装了一页显示的用户信息的集合
        List<VPost> posts = postsPageInfo.getList();

        return  posts;
    }
    //-------------------------------------------------------------------------------

    /***
     * 使用TbPosts列表 生成 ShowPost 列表
     * @param posts
     * @return
     */
    private  List<ShowPost> getSPList(List<TbPosts> posts)
    {
        List<ShowPost> listS = new ArrayList<>();

        for(TbPosts post : posts)
        {
            TbUser user = tbUserMapper.selectByPrimaryKey(post.getPostuser());
            TbUserdetail tbUserdetail = tbUserdetailMapper.selectByPrimaryKey(post.getPostuser());
            ShowPost sp = new ShowPost();
            sp.setVal(post,user,tbUserdetail);
            listS.add(sp);
        }
        return listS;
    }

    @Override
    public List<ShowPost> getPostPage(int page, int limit) {
        return  getPostPage(page,limit,"");
    }

    @Override
    public List<ShowPost> getPostByType(int page,int limit,String type)
    {
        //获取符合条件的 post列表
        List<TbPosts> posts = getPostBySituation(page,limit,type);
        //生成ShowPost列表
        List<ShowPost> listS = getSPList( posts);
        return listS;
    }

    @Override
    public List<ShowPost> getPostPage(int page, int limit,String id) {
       return getPostPage(page,limit,id,"");
    }


    public List<ShowPost> getPostPage(int page, int limit,String id,String type)
    {
        //开启分页助手
        PageHelper.startPage(page,limit);
        //开始查询
        TbPostsExample tbPostsExample = new TbPostsExample();
        TbPostsExample.Criteria criteria = tbPostsExample.createCriteria();
        if( !id.equals("")) {
            criteria.andPostuserEqualTo(id);
        }
        if(type.equals("topscan"))
            criteria.andPostscanGreaterThan(50);
        else if( type.equals("downscan"))
            criteria.andPostscanLessThanOrEqualTo(50);
        else if( type.equals("topthumb"))
            criteria.andPostthumbGreaterThanOrEqualTo(50);
        else if( type.equals("食材"))
            criteria.andPosttypeEqualTo(type);
        else if( type.equals("分享"))
            criteria.andPosttypeEqualTo(type);
        else if( type.equals("教学"))
            criteria.andPosttypeEqualTo(type);
        else if( type.equals("话题"))
            criteria.andPosttypeEqualTo(type);
        else if( type.equals("学习"))
            criteria.andPosttypeEqualTo(type);

        List<TbPosts> list =  tbPostsMapper.selectByExample(tbPostsExample);
        //得到分页助手帮忙查询的数据
        PageInfo<TbPosts> postsPageInfo = new PageInfo<>(list);
        //封装了一页显示的用户信息的集合
        List<TbPosts> posts = postsPageInfo.getList();

        List<ShowPost> listS = getSPList( posts);
        return listS;
    }


    /***
     * 通过条件获取帖子列表
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
     * @param type
     * @return
     */
    @Override
    public List<TbPosts> getPostBySituation(int page, int limit,String type) {
        PageHelper.startPage(page,limit);
        TbPostsExample example = new TbPostsExample();
        TbPostsExample.Criteria criteria = example.createCriteria();
        if(type.equals("topscan"))
            criteria.andPostscanGreaterThan(50);
        else if( type.equals("downscan"))
            criteria.andPostscanLessThanOrEqualTo(50);
        else if( type.equals("topthumb"))
            criteria.andPostthumbGreaterThanOrEqualTo(50);
        else if( type.equals("食材"))
            criteria.andPosttypeEqualTo(type);
        else if( type.equals("分享"))
            criteria.andPosttypeEqualTo(type);
        else if( type.equals("教学"))
            criteria.andPosttypeEqualTo(type);
        else if( type.equals("话题"))
            criteria.andPosttypeEqualTo(type);
        else if( type.equals("学习"))
            criteria.andPosttypeEqualTo(type);

        List<TbPosts> list = tbPostsMapper.selectByExample(example);

        //得到分页助手帮忙查询的数据
        PageInfo<TbPosts> postsPageInfo = new PageInfo<>(list);
        //封装了一页显示的用户信息的集合
        List<TbPosts> resps = postsPageInfo.getList();
        return  resps;
    }
    //查询all
    @Override
    public List<ShowPost> getAllPosts()
    {
        TbPostsExample tbPostsExample = new TbPostsExample();
        List<TbPosts> list =  tbPostsMapper.selectByExample(tbPostsExample);
        List<ShowPost> listS = getSPList(list);
        return listS;
    }
    //删除
    @Override
    public Boolean delPost(String id,String type)
    {
        return true;
    }

    @Override
    public Boolean addPost(TbPosts posts,String uid)
    {
        int ret=-1;
        //设置 post user 。。。等信息
        posts.setPostuser(uid);
        //posts.setPostpic("");
        posts.setPosttime(new Date());
        posts.setPoststatus(1);
        ret = tbPostsMapper.insertSelective(posts);
        return ret==1 ;
    }
    @Override
    public List<TbReview> getReview(String postid)
    {
        return null;
    }

    public int getCount(String userid)
    {
        int count=0;
        TbPostsExample postsExample = new TbPostsExample();
        TbPostsExample.Criteria criteria = postsExample.createCriteria();
        criteria.andPostuserEqualTo(userid);
        count = tbPostsMapper.countByExample(postsExample);
        return  count;
    }



    /**
     *
     *通过id获取帖子
     * */
    public ShowPost getPostInfoById(String postid)
    {
        //开始查询
        TbPosts post =  tbPostsMapper.selectByPrimaryKey(Integer.parseInt(postid));
        TbUser user = tbUserMapper.selectByPrimaryKey(post.getPostuser());
        TbUserdetail tbUserdetail = tbUserdetailMapper.selectByPrimaryKey(post.getPostuser());

        ShowPost sp = new ShowPost();
        sp.setVal(post,user,tbUserdetail);
        return sp;
    }
    //获取帖子评论数目
    @Override
    public String getReviewNum(String postid) {
        TbReviewExample example = new TbReviewExample();
        TbReviewExample.Criteria criteria = example.createCriteria();
        criteria.andReviewpostEqualTo(Integer.parseInt(postid));
        return ""+reviewMapper.countByExample(example);
    }

    /***
     * //通过id获取评论
     * @param page
     * @param limit
     * @param postid
     * @return
     */
    public List<ShowReview> getReviewById(int page,int limit,String postid)
    {
        //开启分页助手
        PageHelper.startPage(page,limit);
        TbReviewExample reviewExample = new TbReviewExample();
        TbReviewExample.Criteria criteria = reviewExample.createCriteria();
        criteria.andReviewpostEqualTo(Integer.parseInt(postid));
        List<TbReview> list =  reviewMapper.selectByExample(reviewExample);

        //得到分页助手帮忙查询的数据
        PageInfo<TbReview> postsPageInfo = new PageInfo<>(list);
        //封装了一页显示的用户信息的集合
        List<TbReview> reviews = postsPageInfo.getList();

        Collections.sort(reviews,new Comparator () {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof TbReview && o2 instanceof TbReview){
                    TbReview e1 = (TbReview) o1;
                    TbReview e2 = (TbReview) o2;
                    return -e1.getReviewtime().compareTo(e2.getReviewtime());
                }
                throw new ClassCastException("不能转换为Emp类型");
            }
        });
        List<ShowReview> srs = new ArrayList<ShowReview>();
        for(TbReview rev : reviews)
        {
            TbUser user = tbUserMapper.selectByPrimaryKey(rev.getReviewer());
            TbUserdetail userd = tbUserdetailMapper.selectByPrimaryKey(rev.getReviewer());
            TbRespExample respExample = new TbRespExample();
            TbRespExample.Criteria criteria1 = respExample.createCriteria();
            criteria1.andRespreviewEqualTo(rev.getReviewid());
            int num = respMapper.countByExample(respExample);
            ShowReview sr = new ShowReview();
            sr.setAll(user,userd,rev,num);
            srs.add(sr);
        }
        /*
        Collections.sort(srs,new Comparator () {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof ShowReview && o2 instanceof ShowReview){
                    ShowReview e1 = (ShowReview) o1;
                    ShowReview e2 = (ShowReview) o2;
                    return -e1.getReviewTime().compareTo(e2.getReviewTime());
                }
                throw new ClassCastException("不能转换为Emp类型");
            }
        });
        */
        return srs;
    }

    //获取回复信息
    public List<ShowResp>  getRespById(int page, int limit, String reviewid)
    {
        //开启分页助手
        PageHelper.startPage(page,limit);
        TbRespExample respExample = new TbRespExample();
        TbRespExample.Criteria criteria = respExample.createCriteria();
        //通过评价id   获取回复
        criteria.andRespreviewEqualTo(Integer.parseInt(reviewid));
        List<TbResp> list = respMapper.selectByExample(respExample);

        //得到分页助手帮忙查询的数据
        PageInfo<TbResp> postsPageInfo = new PageInfo<>(list);
        //封装了一页显示的用户信息的集合
        List<TbResp> resps = postsPageInfo.getList();

        Collections.sort(resps,new Comparator () {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof TbResp && o2 instanceof TbResp){
                    TbResp e1 = (TbResp) o1;
                    TbResp e2 = (TbResp) o2;
                    return -e1.getResptime().compareTo(e2.getResptime());
                }
                throw new ClassCastException("不能转换为Emp类型");
            }
        });
        List<ShowResp> srs = new ArrayList<ShowResp>();
        for(TbResp resp : resps) {
            TbUser user = tbUserMapper.selectByPrimaryKey(resp.getRespfromwho());
            TbUserdetail userd = tbUserdetailMapper.selectByPrimaryKey(resp.getRespfromwho());
            int num = respMapper.countByExample(respExample);
            ShowResp sr = new ShowResp();
            sr.setAll(user,userd,resp);
            srs.add(sr);
        }
        return srs;
    }

    /***
     * 帖子评论
     * @param postid
     * @param context
     * @param reviewer
     * @return
     */
    public int setReview(String postid, String context, TbUser reviewer)
    {
        TbReview tbReview = new TbReview();
        tbReview.setReviewer(reviewer.getUserid());
        tbReview.setReviewcontext(context);
        tbReview.setReviewpic("");
        tbReview.setReviewpost(Integer.parseInt(postid));
        tbReview.setReviewthumb(0);
        tbReview.setReviewtime(new Date());
        return reviewMapper.insert(tbReview);
    }

    /***
     * 评论回复
     * @param reviewid
     * @param context
     * @param resper
     * @return
     */
    public int setResp(String reviewid, String context, TbUser resper)
    {
        TbReview towho = reviewMapper.selectByPrimaryKey(Integer.parseInt(reviewid));
        TbResp resp = new TbResp();

        resp.setRespcontext(context);
        resp.setRespfromwho(resper.getUserid());
        resp.setResptowho(towho.getReviewer());
        resp.setResppost(towho.getReviewpost());
        resp.setRespreview(towho.getReviewid());
        resp.setResptime(new Date());
        resp.setRespstatus(1);
        resp.setResppic("");

        return respMapper.insert(resp);
    }

    public int setPostScan(String postid)
    {
        TbPosts posts = tbPostsMapper.selectByPrimaryKey(Integer.parseInt(postid));
        int num = posts.getPostscan()+1;
        posts.setPostscan(num);
        tbPostsMapper.updateByPrimaryKeySelective(posts);
        return num;
    }

    public int setPostThumb(String postid)
    {
        TbPosts posts = tbPostsMapper.selectByPrimaryKey(Integer.parseInt(postid));
        int num = posts.getPostthumb()+1;
        posts.setPostthumb(num);
        tbPostsMapper.updateByPrimaryKeySelective(posts);
        return num;
    }
}
