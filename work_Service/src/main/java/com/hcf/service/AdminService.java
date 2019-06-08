package com.hcf.service;

import com.hcf.helpClass.WebTable;
import com.hcf.pojo.*;

import java.util.List;

public interface AdminService {
    //------------------------------------User-------------------------------------
    //查询用户
    public WebTable<TbUser> getAllUser();

    public VUser getVUserById(String userid);

    //查询用户
    public WebTable<VUser> getAllVUser(int page,int limit);

    //查询用户
    public WebTable<VUser> getVUser(int page,int limit,
                                    String userid,String username,
                                    String userphone, String useremail,int intstatus);
    //删除用户
    public Boolean delInfo(String id,String type) ;

    public TbUser getUser(String uerid) ;

    public Boolean updateUser(TbUser user);

    public Boolean addUser(TbUser user);

    public int setUserStatus(String userid,int status);

    //------------------------------------Order-------------------------------------

    public WebTable<TbOrders> getOrdersBySituation(int page,int limit
            ,String method,int status,String sp,String user);

    public WebTable<TbOrders> getOrders(int page, int limit
            , String payerid,String payername
            , String sellerid,String sellername
            , String orderid,String method,int status);

    //------------------------------------Post-------------------------------------

    public WebTable<VPost> getPostBySituation(int page, int limit,String postUser
            , String postType, String posttitle,int postStatus, int postScan, int postthumb);

    public WebTable<VReview> getReviewBySituation(int page, int limit, String reviewer
            , int postId, int reviewthumb);

    public TbUser getPostUserByID(int postId);

    //--------------------------------------------way-----------------------------------------
    public WebTable<VWay> getWays(int page, int limit ,
                                          String deliver,
                                          String  userid, String  storeid,
                                          String  paddress, String saddress,
                                          int status);


}
