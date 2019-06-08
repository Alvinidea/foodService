package com.hcf.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hcf.helpClass.Cart;
import com.hcf.helpClass.WaitPay;
import com.hcf.helpClass.WebTable;
import com.hcf.mapper.*;
import com.hcf.pojo.*;
import com.hcf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private TbOrderdetailMapper orderdetailMapper;
    @Autowired
    private TbOrdersMapper orderMapper;
    @Autowired
    private TbGoodsMapper goodsMapper;
    @Autowired
    private TbUserMapper userMapper;
    @Autowired
    private TbStoreMapper storeMapper;
    @Autowired
    private  TbCommentMapper commentMapper;
    @Autowired
    private  VOrderdgoodsMapper vorderdgoodsMapper;
    //生成订单
    //------------------------------------------------------------------------------------------------
    @Override
    public List<Cart> strCartToList(String str) {
        String[] list = str.split(",");
        List<Cart> carts = new ArrayList<Cart>();
        for(int i=0;i<list.length;i+=5)
        {
            Cart cart = new Cart();
            cart.setCartgoodsid(list[i]);
            cart.setGoodsname(list[i+1]);
            cart.setCartpayer(list[i+2]);
            cart.setCartseller(list[i+3]);
            cart.setGoodsnum(Integer.parseInt(list[i+4]));
            carts.add(cart);
        }
        return carts;
    }
    //返回订单id
    private String generateOrder(List<Cart> carts,String address,String orderOther)
    {
        double orderallprice = 0,allprice,discount=1;
        String payer = carts.get(0).getCartpayer();
        String seller = carts.get(0).getCartseller();
        List<TbOrderdetail> orderdetailList = new ArrayList<TbOrderdetail>();
        TbOrders orders = new TbOrders();
        orders.setOrderid(new Date().getTime()+seller+payer);//设置订单id
        //产生所有子订单
        for(int i=0;i<carts.size();i++)
        {
            Cart cart = carts.get(i);
            TbOrderdetail orderdetail = new TbOrderdetail();
            TbGoods goods = goodsMapper.selectByPrimaryKey(cart.getCartgoodsid());
            orderdetail.setOrderidd(i+new Date().getTime()+"");//子订单id
            //订单id
            orderdetail.setOrderid(orders.getOrderid());
            //设置价格相关
            orderdetail.setOrderpriced(goods.getGoodsprice());
            orderdetail.setOrderdiscountd(goods.getGoodsdiscount());

            //计算总价值
            discount = goods.getGoodsdiscount()/10;
            allprice= goods.getGoodsprice()*discount  *cart.getGoodsnum();
            orderallprice += allprice;

            orderdetail.setOrderallpriced(allprice);
            orderdetail.setOrderdother("");
            //从cart中获取的
            orderdetail.setGoodsid(cart.getCartgoodsid());
            orderdetail.setGoodsname(cart.getGoodsname());
            orderdetail.setOrdergnumd(cart.getGoodsnum());

            orderdetailList.add(orderdetail);
        }
        TbUser user = userMapper.selectByPrimaryKey(payer);
        TbStore store = storeMapper.selectByPrimaryKey(seller);
        //产生订单 除了结束时间 和 id
        orders.setOrderpayer(user.getUserid());
        orders.setOrderpaddress(user.getUseraddress());
        orders.setOrderseller(store.getStoreid());
        orders.setOrdersaddress(store.getStoreaddress());

        orders.setOrderbegintime(new Date());
        orders.setOrderdiscount(1.00);
        orders.setOrderallprice(orderallprice);
        orders.setOrderdetailnum( orderdetailList.size());
        //支付方式   订单状态   备注信息
        orders.setOrderpaymethod("");
        //-------------------------------------------------------------------------------
        orders.setOrderstatus(1);//等待支付的状态
        orders.setOrderother(orderOther);
        //数据库操作
        for(int i=0;i<orderdetailList.size();i++)
        {
            orderdetailMapper.insertSelective(orderdetailList.get(i));
        }
        orderMapper.insertSelective(orders);
        return  orders.getOrderid();
    }
    /**
     *
     * @param str 是所购商品的id组成的串
     * @param address
     * @param orderOther
     * @return
     */
    @Override
    public String generateOrder(String str,String address,String orderOther) {
        List<Cart> carts = strCartToList(str);
        String  orderid =  generateOrder(carts,address,orderOther);
        return  orderid;
    }

    //------------------------------------------------------------------------------------------------

    public WebTable<TbOrders> getOrdersBySituaton(String id,String situation) {
        WebTable<TbOrders> table = new WebTable<>();
        TbOrdersExample example =  new TbOrdersExample();
        TbOrdersExample.Criteria criteria = example.createCriteria();
        if(situation == "store")
            criteria.andOrdersellerEqualTo(id);
        else if(situation == "user")
            criteria.andOrderpayerEqualTo(id);
        List<TbOrders> list =  orderMapper.selectByExample( example);
        table.setData(list);
        return table;
    }

    @Override
    public WebTable<TbOrders> getOrdersBySeller(String sellerid) {
        return getOrdersBySituaton(sellerid,"store");
    }



    /**
     * 商铺获取订单
     * @param user
     * @param method
     * @param status
     * @return
     */

    public WebTable<TbOrders> getOrdersBySituation(String user,String method,int status,String situation)
    {
        WebTable<TbOrders> table = new WebTable<>();
        TbOrdersExample example =  new TbOrdersExample();
        TbOrdersExample.Criteria criteria = example.createCriteria();
        if( situation.equals("seller"))
            criteria.andOrdersellerEqualTo(user);
        else if( situation.equals("payer"))
            criteria.andOrderpayerEqualTo(user);
        if( method != "")
            criteria.andOrderpaymethodEqualTo(method);
        if( status != 0) {
            if(status >=3 &&status <=6)
                criteria.andOrderstatusBetween(3,6);
            else
                criteria.andOrderstatusEqualTo(status);
        }
        List<TbOrders> list =  orderMapper.selectByExample( example);
        table.setData(list);
        return table;
    }
    @Override
    public WebTable<TbOrders> getOrdersByStoreSituation(String user,String method,int status)
    {
        return getOrdersBySituation(user,method,status,"seller");
    }

    public WebTable<TbOrders> getOrders(int page,int limit,String seller,String payer,String method,int status)
    {
        PageHelper.startPage(page,limit);
        WebTable<TbOrders> table = new WebTable<>();
        TbOrdersExample example =  new TbOrdersExample();
        TbOrdersExample.Criteria criteria = example.createCriteria();
        if(!seller.equals(""))
            criteria.andOrdersellerEqualTo(seller);
        else if( !payer.equals(""))
            criteria.andOrderpayerEqualTo(payer);
        if( method != "")
            criteria.andOrderpaymethodEqualTo(method);
        if( status != 0 )
            criteria.andOrderstatusEqualTo(status);
        List<TbOrders> list =  orderMapper.selectByExample( example);
        PageInfo<TbOrders> pageInfo = new PageInfo<>(list);
        table.setData(pageInfo.getList());
        table.count = list.size();
        return table;
    }

    @Override
    public WebTable<TbOrderdetail> getOrdersDetail(String orderid)
    {
        WebTable<TbOrderdetail> table = new WebTable<>();
        TbOrderdetailExample example =  new TbOrderdetailExample();
        TbOrderdetailExample.Criteria criteria = example.createCriteria();
        criteria.andOrderidEqualTo(orderid);
        List<TbOrderdetail> list =  orderdetailMapper.selectByExample( example);
        table.setData(list);
        return table;
    }

    public WebTable<VOrderdgoods> getOrdersDGoods(String orderid)
    {
        WebTable<VOrderdgoods> table = new WebTable<>();
        VOrderdgoodsExample example =  new VOrderdgoodsExample();
        VOrderdgoodsExample.Criteria criteria = example.createCriteria();
        criteria.andOrderidEqualTo(orderid);
        List<VOrderdgoods> list =  vorderdgoodsMapper.selectByExample( example);
        table.setData(list);
        return table;
    }

    @Override
    public Boolean changeOrders(String orderid,int status)
    {
        TbOrders order = orderMapper.selectByPrimaryKey(orderid);
        if(order == null)
            return false;
        order.setOrderstatus(status);
        orderMapper.updateByPrimaryKeySelective(order);
        return true;
    }


    //根据条件获取不同的订单数目
    public int getCount(String userid,int status,String sp)
    {
        int count=0;
        TbOrdersExample orderExample = new TbOrdersExample();
        TbOrdersExample.Criteria criteria = orderExample.createCriteria();
        if(sp == "seller")
            criteria.andOrdersellerEqualTo(userid);
        else if( sp == "payer")
            criteria.andOrderpayerEqualTo(userid);
        if(status != -1)
            criteria.andOrderstatusEqualTo(status);
        count = orderMapper.countByExample(orderExample);
        return  count;
    }

    //--------------------------------------------------------------------------------
    // 创建评论
    //--------------------------------------------------------------------------------
    @Override
    public List<TbComment> createComment(String cmtStr) {
        String[] split = cmtStr.split(",");
        String orderid = split[0];
        TbOrders tbOrders = orderMapper.selectByPrimaryKey(orderid);
        if(tbOrders == null)
            return null;
        List<TbComment> list = new ArrayList<>();
        for(int i= 1;i<split.length;i+=3)
        {
            TbComment comment = new TbComment();
            TbOrderdetail orderdetail = orderdetailMapper.selectByPrimaryKey(split[i]);
            if(orderdetail == null)
                return null;
            comment.setCmtorder(orderid);
            comment.setCmtorderd(split[i]);
            comment.setCmtcontext(split[i+1]);
            comment.setCmtstars(Integer.parseInt(split[i+2]));

            comment.setCmtgoods(orderdetail.getGoodsid());
            comment.setCmtpicture("");
            comment.setCmtpayer(tbOrders.getOrderpayer());
            comment.setCmtseller(tbOrders.getOrderseller());
            comment.setCmttime(new Date());
            //设置商品的评论
            setGoodsStarAndCmtNum(orderdetail.getGoodsid(),comment.getCmtstars());

            list.add(comment);
        }
        setStoreCmtNum(tbOrders.getOrderseller(),list.size());
        return list;
    }
    //设置商品的评论
    private int setGoodsStarAndCmtNum(String goodsid,int star)
    {
        TbGoods goods = goodsMapper.selectByPrimaryKey(goodsid);
        int num = goods.getGoodscmtnum();
        int stars = goods.getGoodsstars()*num+star;
        num+=1;
        goods.setGoodscmtnum(num);
        goods.setGoodsstars(stars/num);
        return goodsMapper.updateByPrimaryKeySelective(goods);
    }
    //设置商铺评论数目
    private int setStoreCmtNum(String storeid,int add)
    {
        TbStore store = storeMapper.selectByPrimaryKey(storeid);
        int num = store.getStorecmtnum();
        num+=add;
        store.setStorecmtnum(num);
        return storeMapper.updateByPrimaryKeySelective(store);
    }

    public int generateOrderCmt(List<TbComment> list)
    {
        if(list.size() == 0)
            return 0;
        for(int i=0;i<list.size();i++) {
            commentMapper.insert(list.get(i));
        }
        return 1;
    }
    @Override
    public int generateOrderCmt(String cmtstr) {
        int ret =  generateOrderCmt(createComment(cmtstr));
        return ret;
    }






    @Override
    public WebTable<TbOrders> getOrdersByUserSituation(String user,String method,int status)
    {
        return getOrdersBySituation(user,method,status,"payer");
    }


    @Override
    public WebTable<TbOrders> getOrdersByPayer(String id) {
        return getOrdersBySituaton(id,"user");
    }

    @Override
    public List<TbOrderdetail> getOD(String orderid)
    {
        TbOrderdetailExample example = new TbOrderdetailExample();
        TbOrderdetailExample.Criteria criteria = example.createCriteria();
        criteria.andOrderidEqualTo(orderid);
        return orderdetailMapper.selectByExample(example);
    }
    @Override
    public TbStore getSt(String orderid)
    {
        TbOrders order = getOrder(orderid);
        return storeMapper.selectByPrimaryKey(order.getOrderseller());
    }
    @Override
    public TbOrders getOrder(String orderid)
    {
        return  orderMapper.selectByPrimaryKey(orderid);
    }
    @Override
    public WaitPay getWaitPayInfo(String orderid)
    {
        WaitPay waitPay = new WaitPay();
        waitPay.setOrder(getOrder(orderid));
        waitPay.setStore(getSt(orderid));
        waitPay.setList(getOD(orderid));
        return waitPay;
    }
    public List<WaitPay> getWaitPay(String payer)
    {
        TbOrdersExample example = new TbOrdersExample();
        TbOrdersExample.Criteria criteria = example.createCriteria();
        criteria.andOrderpayerEqualTo(payer);
        criteria.andOrderstatusEqualTo(1);
        List<TbOrders> tbOrders = orderMapper.selectByExample(example);
        List<WaitPay> list = new ArrayList<>();
        if(tbOrders.size() != 0)
        {
            for(TbOrders order : tbOrders)
            {
                WaitPay waitPay = getWaitPayInfo(order.getOrderid());
                list.add(waitPay);
            }
        }
        return list;
    }


    public void modifyOrderStatus(String orderid,int status)
    {
        TbOrders orders = orderMapper.selectByPrimaryKey(orderid);
        orders.setOrderstatus(status);
        orderMapper.updateByPrimaryKeySelective(orders);
    }

    public void modifyOrderStatusAndmethod(String orderid,String ordermethod,int status)
    {
        TbOrders orders = orderMapper.selectByPrimaryKey(orderid);
        orders.setOrderstatus(status);
        orders.setOrderpaymethod(ordermethod);
        orderMapper.updateByPrimaryKeySelective(orders);
    }
}
