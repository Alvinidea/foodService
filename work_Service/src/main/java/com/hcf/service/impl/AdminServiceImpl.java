package com.hcf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hcf.helpClass.WebTable;
import com.hcf.mapper.*;
import com.hcf.pojo.*;
import com.hcf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    public TbUserMapper userMapper;
    @Autowired
    private VUserMapper vUserMapper;
    @Autowired
    private TbUserdetailMapper userdetailMapper;
    @Autowired
    private  TbOrdersMapper orderMapper;
    @Autowired
    private VPostMapper vpostMapper;
    @Autowired
    private TbPostsMapper postsMapper;
    @Autowired
    private VReviewMapper vReviewMapper;

    @Autowired
    private VWayMapper vWayMapper;

    public VUser getVUserById(String userid)
    {
        VUserExample example= new VUserExample();
        VUserExample.Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userid);
        List<VUser> users = vUserMapper.selectByExample(example);
        if(users != null && users.size() != 0)
            return users.get(0);
        return null;
    }
    @Override
    public WebTable<TbUser> getAllUser() {
        TbUserExample example = new TbUserExample();

        List<TbUser> userList = userMapper.selectByExample(example);
        WebTable<TbUser> list = new WebTable<TbUser>();
        list.setData(userList);
       return list;
    }
    @Override
    public WebTable<VUser> getAllVUser(int page,int limit)
    {
        PageHelper.startPage(page,limit);
        VUserExample example = new VUserExample();
        List<VUser> list = vUserMapper.selectByExample(example);
        PageInfo<VUser> pageInfo = new PageInfo<>(list);

        List<VUser> ret = pageInfo.getList();
        WebTable<VUser> table =new WebTable<>();
        table.setData(ret);
        return table;
    }

    //查询用户
    public WebTable<VUser> getVUser(int page,int limit,
                                    String userid,String username,
                                    String userphone, String useremail,int intstatus)
    {
        PageHelper.startPage(page,limit);
        VUserExample example = new VUserExample();

        VUserExample.Criteria criteria = example.createCriteria();
        if( !userid.equals(""))
        {criteria.andUseridEqualTo(userid);}
        if(!username.equals(""))
        {criteria.andUsernamedEqualTo(username);}
        if(!userphone.equals(""))
        {criteria.andUserphoneEqualTo(userphone);}
        if(!useremail.equals(""))
        {criteria.andUseremailEqualTo(useremail);}
        if(intstatus != -1)
        {
            criteria.andUserstatusEqualTo(intstatus);
        }
        List<VUser> list = vUserMapper.selectByExample(example);
        PageInfo<VUser> pageInfo = new PageInfo<>(list);

        List<VUser> ret = pageInfo.getList();
        WebTable<VUser> table =new WebTable<>();
        table.setData(ret);
        return table;
    }
    @Override
    public Boolean delInfo(String id,String type) {
        int ret =-1;
        TbUserExample example = new TbUserExample();
        switch (type)
        {
            case "userid": {
                ret = userMapper.deleteByPrimaryKey(id);
                break;
            }
        }

        if( ret == 1)
            return true;
        else return  true;
    }
    @Override
    public TbUser getUser(String userid)
    {
        TbUser user = userMapper.selectByPrimaryKey(userid);
        return user;
    }

    public int setUserStatus(String userid,int status)
    {
        TbUser user = userMapper.selectByPrimaryKey(userid);
        user.setUserstatus(status);
        return userMapper.updateByPrimaryKeySelective(user);
    }
    //更新用户信息
    @Override
    public Boolean updateUser(TbUser user)
    {
        int ret = -1;
        ret = userMapper.updateByPrimaryKeySelective(user);
        return ret ==1? true:false;
    }
//添加用户    只是id和密码

    public Boolean addUser(TbUser user)
    {
        int ret =-1;
        user.setUserphone("");
        user.setUseremail("");
        user.setUserstatus(1);
        user.setUserlevel(1);
        user.setUseraddress("成都工业学院");
        user.setUserapplytime(new Date());
        user.setUserpower(1);
        user.setUserpwd("000000");
        TbUserdetail tbUserdetail = new TbUserdetail();
        tbUserdetail.setUserdeatailid(user.getUserid());
        tbUserdetail.setUseridd(user.getUserid());
        tbUserdetail.setUserphotod("/pic/logo.jpg");
        userdetailMapper.insertSelective(tbUserdetail);
        ret =  userMapper.insert(user);
        return ret == 1? true:false;
    }

    //------------------------------------Order-------------------------------------

    /***
     *
     * @param page
     * @param limit
     * @param method
     * @param status 订单状态
     * @param sp      卖家 买家
     * @param user      卖/买家 id
     * @return
     */
    public WebTable<TbOrders> getOrdersBySituation(int page,int limit
            ,String method,int status,String sp,String user)
    {
        PageHelper.startPage(page,limit);
        TbOrdersExample example =  new TbOrdersExample();
        TbOrdersExample.Criteria criteria = example.createCriteria();
        if( sp.equals("seller"))
            criteria.andOrdersellerEqualTo(user);
        else if( sp.equals("payer"))
            criteria.andOrderpayerEqualTo(user);
        if( method != "")
            criteria.andOrderpaymethodEqualTo(method);
        if( status != -1)
            criteria.andOrderstatusEqualTo(status);
        List<TbOrders> list =  orderMapper.selectByExample( example);
        PageInfo pageInfo = new PageInfo(list);
        List<TbOrders> pagelist = pageInfo.getList();
        WebTable<TbOrders> table = new WebTable<>();
        table.setData(pagelist);
        return table;
    }
    public WebTable<TbOrders> getOrders(int page, int limit
            , String payerid,String payername
            , String sellerid,String sellername
            , String orderid,String method,int status)
    {
        PageHelper.startPage(page,limit);
        TbOrdersExample example =  new TbOrdersExample();
        TbOrdersExample.Criteria criteria = example.createCriteria();
        if( !payerid.equals(""))
            criteria.andOrderpayerEqualTo(payerid);
        if( !sellerid.equals(""))
            criteria.andOrdersellerEqualTo(sellerid);
        if( !payername.equals(""))
           ;
        if( !sellername.equals(""))
            ;
        if( !orderid.equals(""))
            criteria.andOrderidEqualTo(orderid);
        if( !method.equals(""))
            criteria.andOrderpaymethodEqualTo(method);
        if( status != -1)
            criteria.andOrderstatusEqualTo(status);
        List<TbOrders> list =  orderMapper.selectByExample( example);
        PageInfo pageInfo = new PageInfo(list);
        List<TbOrders> pagelist = pageInfo.getList();
        WebTable<TbOrders> table = new WebTable<>();
        table.setData(pagelist);
        return table;
    }

    //------------------------------------Store-------------------------------------



    //------------------------------------Post-------------------------------------
    public WebTable<VPost> getPostBySituation(int page, int limit,String postUser
            , String postType,String posttitle, int postStatus, int postScan, int postthumb)
    {
        PageHelper.startPage(page,limit);
        VPostExample example = new VPostExample();
        VPostExample.Criteria criteria = example.createCriteria();
        if( ! postUser.equals("") )
            criteria.andPostuserEqualTo(postUser);
        if( ! postType.equals(""))
            criteria.andPosttypeEqualTo(postType);
        if( !posttitle.equals(""))
            criteria.andPosttitleLike(posttitle);
        if( postStatus <= 1 && postStatus >= 0)
            criteria.andPoststatusEqualTo(postStatus);
        if( postScan != -1)
            criteria.andPostscanBetween(postScan-50,postScan+50);
        if( postthumb != -1)
            criteria.andPostthumbBetween(postthumb-50,postthumb+50);

        List<VPost> vPosts = vpostMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(vPosts);
        List<VPost> list = pageInfo.getList();
        WebTable<VPost> table = new WebTable<>();
        table.setData(list);
        table.count = vpostMapper.countByExample(example);
        return  table;
    }


    public WebTable<VReview> getReviewBySituation(int page, int limit, String reviewer
            , int postId, int reviewthumb)
    {
        PageHelper.startPage(page,limit);
        VReviewExample example = new VReviewExample();
        VReviewExample.Criteria criteria = example.createCriteria();
        if( ! reviewer.equals("") )
            criteria.andReviewerEqualTo(reviewer);
        else if( postId != -1)
            criteria.andReviewpostEqualTo(postId);
        else if( reviewthumb != -1)
            criteria.andReviewthumbBetween(reviewthumb-50,reviewthumb+50);

        List<VReview> vPosts = vReviewMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(vPosts);
        List<VReview> list = pageInfo.getList();
        WebTable<VReview> table = new WebTable<>();
        table.setData(list);
        table.count = vReviewMapper.countByExample(example);
        return  table;
    }

    @Override
    public TbUser getPostUserByID(int postId)
    {
         TbPosts post = postsMapper.selectByPrimaryKey(postId);
         return userMapper.selectByPrimaryKey(post.getPostuser());
    }

    //------------------------------------------Way-------------------------------------------
    public WebTable<VWay> getWays(int page, int limit ,
                                   String deliver,
                                   String  userid, String  storeid,
                                   String  paddress, String saddress,
                                   int status)
    {
        PageHelper.startPage(page,limit);
        VWayExample example = new VWayExample();
        VWayExample.Criteria criteria = example.createCriteria();
        if( ! deliver.equals("") )
            criteria.andDeliverEqualTo(deliver);
        if( ! userid.equals(""))
            criteria.andOrderpayerEqualTo(userid);
        if( !storeid.equals(""))
            criteria.andOrdersellerEqualTo(storeid);
        if( ! paddress.equals(""))
            criteria.andOrderpaddressLike(paddress);
        if( !saddress.equals(""))
            criteria.andOrdersaddressLike(saddress);
        if( status != -1)
            criteria.andStatusEqualTo(status);

        List<VWay> vPosts = vWayMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(vPosts);
        List<VWay> list = pageInfo.getList();
        WebTable<VWay> table = new WebTable<>();
        table.setData(list);
        table.count = vWayMapper.countByExample(example);
        return  table;
    }
}
