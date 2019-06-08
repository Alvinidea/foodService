<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/8
  Time: 21:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>post </title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="stylesheet" href="../../../css/font.css">
    <link rel="stylesheet" href="../../../css/xadmin.css">
    <link rel="stylesheet" href="/test/space.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="../../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../../js/xadmin.js"></script>
    <script type="text/javascript" src="../../../js/cookie.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<style>
    /*购物车标记*/
    .alvin-cart-right{
        position: fixed;
        right:10px;top:45% ;
        height: 80px;width: 15px;
        padding:10px;margin: 10px;
        font-size: 16px;
        font-family: "Microsoft YaHei UI";
        background-color: #eb7350;
        border-radius: 8px;
    }
    .alvin-cart-right:hover{
        background-color: #df5000;
        color: #dddddd;
    }

    .alvin-more-right{
        position: fixed;
        right:10px;top:25% ;
        height: 110px;width: 15px;
        padding:10px;margin: 10px;
        font-size: 16px;
        font-family: "Microsoft YaHei UI";
        background-color: #27A9E3;
        border-radius: 8px;
    }
    .alvin-more-right:hover{
        background-color: #fcc88a;
        color: #2D93CA;
    }
</style>
<style>
    /* 商品浏览页面*/
    .alvin-panel{margin-bottom: 15px; border-radius: 2px;
        background-color: #fff; box-shadow: 0 1px 2px 0 rgba(0,0,0,.05);}
    .alvin-goods-module{ position:relative;
        width: 255px;
        height: 140px;
        float: left;
        margin: 12px 12px 12px 12px;
        padding: 3px 3px 3px 3px;
        border-radius: 7px;

        box-shadow: 0 1px 2px 0 rgba(0,0,0,.1);}
    .alvin-goods-pic{position: absolute; left: 15px; top: 15px;}
    .alvin-goods-pic a{}
    .alvin-goods-pic a img{display: block; width: 90px; height: 90px; margin: 0; border-radius: 2px;}
    .alvin-goods-nameprice{position: absolute;left: 115px;top: 15px}
    .alvin-goods-name{height: 30px; line-height: 20px; border-radius: 2px;}
    .alvin-goods-name a{line-height: 20px; border-radius: 2px;}
    .alvin-goods-averPrice{height: 30px; line-height: 20px; border-radius: 2px;}
    .alvin-goods-averPrice span{}
    .alvin-goods-discount{height: 30px; line-height: 20px; border-radius: 2px;}
    .alvin-goods-lsc div{}
    .alvin-goods-cmt{position: absolute;left: 15px;top: 110px; padding:0px 3px 0px 3px;
        font-size: 13px; color: #df5000;border-radius: 5px;}
    .alvin-goods-cmt button{}
    .alvin-goods-star{position: absolute;left: 75px;top: 110px;padding:0px 3px 0px 3px;
        font-size: 13px; color: #df5000;border-radius: 5px;}
    .alvin-goods-buycar{position: absolute;left: 135px;top: 110px;padding:0px 3px 0px 3px;
        font-size: 13px; color: #FFA859;border-radius: 5px;}
    .alvin-goods-buycar button{width: 90px}
</style>
<style>
    /*商铺信息div*/
    .alvin-goods-main{height: 100%}
    .alvin-store-info{height: 220px;background-color: #CC0000}
</style>
<style>
    /* 底部 */
    .alvin-footer {margin: 50px 0 0; padding: 20px 0 30px; line-height: 30px; text-align: center; color: #737573; border-top: 1px solid #e2e2e2;}
    .alvin-footer a{padding:0 6px; font-weight: 300; color: #333;}
    .alvin-footer a:hover{color: #777;}
    .alvin-union{margin-top: 10px; color: #999;}
    .alvin-union>*{display: inline-block; vertical-align: middle;}
    .alvin-union a[upyun] img{width: 80px;}
    .alvin-union span{position: relative; top: 3px;}
    .alvin-union span a{padding: 0; display: inline; color: #999;}
    .alvin-union span a:hover{text-decoration: underline;}
</style>
<style>
    .alvin-click-cart:hover{background-color: #FFA859}
    .alvin-click-cart:active{background-color: #eb7350}
</style>

<div class="alvin-cart-right" onclick="alvin_show('我的购物车','/store/store_cart',650,600)">
    <i class="layui-icon layui-icon-cart"></i>购物车
</div>
<div class="alvin-more-right" id="moreFood" >
    <i class="layui-icon layui-icon-add-circle"></i>更多菜品
</div>
<div class="layui-container">
    <ul class="layui-nav " style="background-color: #2D93CA" >
        <li class="layui-nav-item">
            <a href="/food/index">首页<span class="layui-badge">5</span></a>
        </li>
        <li class="layui-nav-item">
            <a href="/user/user_info">个人中心<span class="layui-badge-dot"></span></a>
        </li>
        <li class="layui-nav-item">
            <a href="/forum/forum_main">论坛<span class="layui-badge-dot"></span></a>
        </li>
        <li class="layui-nav-item">
            <a href="/store/store_main">商城<span class="layui-badge-dot"></span></a>
        </li>
        <li class="layui-nav-item">
            <a href="/way/wayIndex">跑腿<span class="layui-badge-dot"></span></a>
        </li>
        <li class="layui-nav-item"><span > ..............................</span></li>

        <li class="layui-nav-item  alvin-login" lay-unselect="" >
            <a href="javascript:;"><img src="//t.cn/RCzsdCq" class="layui-nav-img">我</a>
            <dl class="layui-nav-child">
                <dd><a href="/user/user_info">个人信息</a></dd>
                <dd><a href="/pre/logout">退出登录</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item alvin-logout">
            <a href="/pre/login">登录<span class="layui-badge-dot"></span></a>
        </li>
    </ul>
</div>
<div class="layui-container" style="border-radius: 8px">
    <hr>
    <div class="alvin-store-info">
        <div class="space_wrap">
            <div class="space_info w">
                <div class="mod clear">
                    <div class="pic">
                        <a id="userid2" href="https://home.meishichina.com/space-11251129.html">
                            <img id="storepicture" class="imgLoad" src="/pic/alvin.jpg"
                                 width="150" height="150" alt="">
                        </a>
                    </div>
                    <div class="detail">
                        <div class="subname">
                            <em><a id="storename" href="#storename">name</a></em>
                            <i class="space_icon woman"></i>
                            <br>
                            <i id="storeapplytime" class="messagenum">2018-12-31加入</i>
                        </div>
                        <div class="subtools clear">
                            <div class="right">
                                <ul class="substatus">
                                    <li>
                                        <a title="状态" href="https://home.meishichina.com/space-11251129-do-followed.html" rel="nofollow">
                                            <b id="storeiswork" class="followedcount">4</b><br>等级
                                        </a>
                                    </li>
                                    <li>
                                        <a title="等级" href="https://home.meishichina.com/space-11251129-do-following.html" rel="nofollow">
                                            <b id="storelevel" class="followingcount">3</b><br>
                                            关注
                                        </a>
                                    </li>
                                    <li class="last">
                                        <a title="访问" href="https://home.meishichina.com/space-11251129-do-visitor.html" rel="nofollow">
                                            <b class="viewnum">7899</b><br>
                                            访问
                                        </a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<br>
<div class="layui-container">
    <div style="margin-top: 5px;height: 40px;width:100%; background-color: #8FCDA0">
        <ul class="layui-nav" style="background-color: #2D93CA" >

        </ul>
    </div>
</div>
<div class="layui-container">
    <div class="alvin-goods-main">

        <br><hr>
        <div class="layui-container">
            <div id="goodsList" class="alvin-panel">
                <!--
                <div class="alvin-goods-module">
                    <div class="alvin-goods-main">
                        <div class="alvin-goods-pic">
                            <a href="store_goods"> <img src="/pic/alvin.jpg"/></a>
                        </div>
                        <div class="alvin-goods-nameprice">
                            <div class="alvin-goods-name">
                                <a href="store_goods">红烧里脊</a>
                            </div>
                            <div class="alvin-goods-averPrice">
                                价格：<span>2.1</span>
                            </div>
                            <div class="alvin-goods-discount">
                                折扣：<span>1</span>折
                            </div>
                        </div>
                    </div>
                    <div class="alvin-goods-lsc">
                        <div class="alvin-goods-star">
                            <i class="layui-icon">&#xe658;</i>5
                        </div>
                        <div class="alvin-goods-cmt">
                            <i class="layui-icon">&#xe60a;</i>5
                        </div>
                        <div class="alvin-goods-buycar ">
                            <span class="layui-btn layui-btn-radius layui-btn-sm"
                                  onclick="addGoods(1501511488)">
                                <i class="layui-icon layui-icon-cart"></i>加入购物车
                            </span>
                        </div>
                    </div>
                </div>
                -->
            </div>
        </div>
    </div>
</div>
<div class="layui-container" >
    <div class="alvin-footer">
        <p>
            <a href="/store/store_main">美食商城</a> 2019 ©
            <a href="/store/store_main">Food</a>
        </p>

    </div>
</div>
<script src="/js/DateUtil.js"></script>
<script>
    var listL = [];
    localStorage.setItem('cartData',listL);
    layui.use(['carousel','layer','element'], function(){
        var carousel = layui.carousel;
        var layer = layui.layer;
        var element = layui.element;
        //登录与非登录状态区别
        isLogin();
        //轮播
        carousel.render({
            elem: '#index_carousel'
            ,width: '100%' //设置容器宽度
            ,height:'100%'
            ,arrow: 'hover' //悬停显示箭头
            ,autoplay:true
            ,interval:2000
            ,anim: 'fade' //切换动画方式
        });
        var page = 1;
        //这儿要获取url的信息
        var storeid = getUrlParam('storeid');

        //获取商铺信息
        initInfo(storeid);

        getGoodsList(element,page,10,storeid);

        $("#moreFood").on('click',function () {
            page =  page+1;
            getGoodsList(element,page,5,storeid);
        })
    });

    function  showGoods(goodsid) {
        layer.alert(goodsid);
    }
    //添加商品
    function addGoods(goodsid) {
        var loading= layer.msg('加载中', {
            icon: 16
            ,shade: 0.01
        });
        setTimeout(function () {
            layer.close(loading);
            var flag = isExistInCart(goodsid);
            //获取cartData的数据
            var list = localStorage.getItem("cartData").split(',');
            if (flag == -1) {
                list.push(goodsid);
            }
            localStorage.setItem("cartData", list);
            //layer.alert("添加"+goodsid);
        },300);
    }
    //查看购物车是否存在此商品id 存在则返回下标位置 否则返回null
    function isExistInCart(goodsid) {
        var list = localStorage.getItem("cartData").split(',');
        var len = list.length;
        for(var i =0;i < len;i++)
            if(goodsid == list[i])
                return i;
        return -1;
    }
    //展示layer
    function alvin_show(title,url,w,h){
        //购物车页面
        console.log(localStorage.getItem('cartData'));
        //打开layer
        x_admin_show(title,url,w,h);
    }
    //后端获取商铺列表
    function getGoodsList(element,page,limit,storeid) {
        $.ajax({
            type:"Post"
            ,url:"/store/get_goods_op"
            ,data:{
                page:page
                ,limit:limit
                ,storeid:storeid}
            ,success:function (data) {
                //增加单个商品模块
                var len = data.length;
                for (var i = 0; i < len; i++) {
                    appendModule(element, data[i]);
                }
                if (len == 0)
                    layer.alert("这是所有的了呢！");
            }
        });
    }
    //前台渲染
    function appendModule(element,data) {
             var str = createGoodsSign(
                 data.goodsid
                ,data.goodspic
                ,data.goodsname
                ,data.goodsprice
                ,data.goodsdiscount
                ,data.goodsstars
                ,data.goodscmtnum
            );
            $("#goodsList").append(str);
            element.init();
    }
    //创建html代码
    function createGoodsSign(goodsid,pic,goodsname,goodsprice
        ,goodsdiscount,goodsstars,goodscmtnum) {
        var str ="<div class=\"alvin-goods-module\"> <div class=\"alvin-goods-main\"> "
            + " <div class=\"alvin-goods-pic\"> <a href=\""
            //+ "store_goods?goodsid="+goodsid//位置
            +"\"> <img src= \'"
            + pic//图片位置
            +"\' /></a></div><div class=\"alvin-goods-nameprice\"><div class=\"alvin-goods-name\">"
            +"<a href="
            //+"store_goods?goodsid="+goodsid
            + ">"
            +goodsname
            +"</a></div><div class=\"alvin-goods-averPrice\">价格：<span>"
            +goodsprice
            +"</span></div><div class=\"alvin-goods-discount\">"
            +" 折扣：<span>"
            +goodsdiscount
            +"</span>折</div> </div> </div><div class=\"alvin-goods-lsc\">"
            +"<div class=\"alvin-goods-star\"><i class=\"layui-icon\">&#xe658;</i>"
            +goodsstars
            +"</div><div class=\"alvin-goods-cmt\"><i class=\"layui-icon\">&#xe60a;</i>"
            +goodscmtnum
            +"</div><div class=\"alvin-goods-buycar  alvin-click-cart \"><span class=\"layui-btn layui-btn-primary layui-btn-radius layui-btn-sm\""
            +"onclick=\"addGoods(\'"
            +goodsid
            +"\')\"> <i class=\"layui-icon layui-icon-cart\"></i>加入购物车"
            +"</span> </div> </div> </div>";
        return str;
    }

    function getUrlParam(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
        var r = window.location.search.substr(1).match(reg);  //匹配目标参数
        if (r != null) return unescape(r[2]); return null; //返回参数值
    }
    //获取统计数据
    function getStatistic() {
        $.ajax({
            type:"Post"
            ,url:"/store/get_Store_S_detail"
            ,success:function (list) {
                $('#postNum').text(list[0]);
                $('#foodNum').text(list[1]);
                $('#finished').text(list[2]);
                $('#waitSure').text(list[3]);
                $('#waitSend').text(list[4]);
            }
        })
    }

    function initInfo(id) {
        $.ajax({
            type:"Post"
            ,url:"/store/visit_StoreInfo"
            ,data:{storeid:id}
            ,success:function (data) {
                $("#storepicture").attr('src',data.storepicture);
                $("#storename").text(data.storename);
                $("#storeapplytime").text(getTime(data.storeapplytime));
                $("#userid2").attr('/store/store_info');
                $("#storeiswork").text(data.storeiswork);
                $("#storelevel").text(data.storelevel);
            }
        })
    }

    function isLogin() {
        $.ajax({
            type:'GET'
            ,url:'/pre/isLogin'
            ,success:function (data) {
                if (data == "login") {
                    $(".alvin-login").show();//显示div
                    $(".alvin-logout").hide();//隐藏div
                }
                if (data == "logout") {
                    $(".alvin-logout").show();//显示div
                    $(".alvin-login").hide();//隐藏div
                }
            }
            ,error:function () {

            }
        })

    }
</script>
</body>
</html>
