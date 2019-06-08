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
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta property="qc:admins" content="10660160706551301301616375">
    <title>成工美食_原创校园生活美食平台，师生全都是吃货！</title>
    <meta name="keywords" content="校园,美食">
    <meta name="description" content="校园,美食">
    <meta name="msapplication-tooltip" content="成工美食">
    <meta name="renderer" content="webkit">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="stylesheet" href="../../../css/font.css">
    <link rel="stylesheet" href="../../../css/xadmin.css">
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
    /* 商店浏览页面*/
    .alvin-panel{margin-bottom: 15px; border-radius: 2px;
        background-color: #fff; box-shadow: 0 1px 2px 0 rgba(0,0,0,.05);}
    .alvin-store-module{ position:relative;
        width: 255px;
        height: 140px;
        float: left;
        margin: 7px 7px 7px 7px;
        padding: 3px 3px 3px 3px;
        border-radius: 7px;
        box-shadow: 0 1px 2px 0 rgba(0,0,0,.1);}
    .alvin-store-pic{position: absolute; left: 15px; top: 15px;}
    .alvin-store-pic a{}
    .alvin-store-pic a img{display: block; width: 90px; height: 90px; margin: 0; border-radius: 2px;}
    .alvin-store-nameprice{position: absolute;left: 115px;top: 15px}
    .alvin-store-name{height: 40px; line-height: 20px; border-radius: 2px;}
    .alvin-store-name a{line-height: 20px; border-radius: 2px;}
    .alvin-store-averPrice{height: 40px; line-height: 20px; border-radius: 2px;}
    .alvin-store-averPrice span{}
    .alvin-store-lsc div{}
    .alvin-store-level{position: absolute;left: 15px;top: 110px; padding:0px 3px 0px 3px;
        font-size: 13px; color: #27A9E3;border-radius: 5px;}
    .alvin-store-cmt{position: absolute;left: 75px;top: 110px;padding:0px 3px 0px 3px;
        font-size: 13px; color: #27A9E3;border-radius: 5px;}
    .alvin-store-star{position: absolute;left: 150px;top: 110px;padding:0px 3px 0px 3px;
        font-size: 13px;font-family: Corbel; background-color:#2D93CA;color: #dddddd;border-radius: 5px;}
</style>
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
<div class="layui-container">
    <br>
    <div style="height: 280px;width:100%;">
        <div class="layui-carousel" id="index_carousel">
        <div carousel-item>
            <div><img src="/images/casul1.jpg" width="100%"></div>
            <div><img src="/images/casul2.jpg"  width="100%"></div>
            <div><img src="https://i3.meishichina.com/attachment/magic/2019/03/19/2019031915529664717418197577.jpg"
                      width="100%"
            ></div>
            <div><img src="https://i3.meishichina.com/attachment/magic/2019/03/13/2019031315524432737218197577.jpg"
                      width="100%"></div>
        </div>
    </div>
    </div>
</div>
<div class="layui-container">
    <div style="margin-top: 5px;height: 40px;width:100%; background-color: #8FCDA0">
        <ul class="layui-nav" style="background-color: #2D93CA" >
            <li id="allFood" class="layui-nav-item">
                <a >所有商铺</a>
            </li>
            <li id="schoolFood" class="layui-nav-item">
                <a >校园食堂</a>
            </li>
            <li id="aroundFood" class="layui-nav-item">
                <a >周围商铺</a>
            </li>
            <li id="smallFood" class="layui-nav-item">
                <a >美味小厨</a>
            </li>
        </ul>
    </div>
</div>
<div class="layui-container">
    <div class="alvin-panel">
        <div id="StoreList">
            <!--  这是例子
            <div class="alvin-store-module">
                <div class="alvin-store-main">
                    <div class="alvin-store-pic">
                        <a href="store_main"> <img src="/pic/alvin.jpg"/></a>
                    </div>
                    <div class="alvin-store-nameprice">
                        <div class="alvin-store-name">
                            <a href="store_main">alvin家里的店铺</a>
                        </div>
                        <div class="alvin-store-averPrice">
                            平均价格：<span>2.1</span>
                        </div>
                    </div>

                </div>
                <div class="alvin-store-level">等级 5</div>
                <div class="alvin-store-star">星级 5</div>
                <div class="alvin-store-cmt">评论 155</div>
            </div>
            -->

        </div>
        <div class="fly-footer" style="margin: 50px 0 0; padding: 20px 0 30px; line-height: 30px; text-align: center; color: #737573; border-top: 1px solid #e2e2e2;">
            <br><br><br><br><br><br><br><br><br><br><br><br>
            <br><br><br><br><br><br><br><br><br><br><br><br>
            <p>
                <a href="/forum/forum_main">美食 商铺</a> 2019 ©
                <a href="/forum/forum_main">ChengG</a>
            </p>

            <p class="fly-union">
                <span>开发者：ALVIN何超凡</span>
            </p>
        </div>
    </div>
</div>

<style>
    /*更多*/
    .alvin-more-right{
        position: fixed;
        right:10px;top:45% ;
        height: 120px;width: 15px;
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
<div class="alvin-more-right" id="moreStore" >
    <i class="layui-icon layui-icon-add-circle"></i>更多商家
</div>

<script>
    layui.use(['carousel','layer','element'], function(){
        var carousel = layui.carousel;
        var layer = layui.layer;
        var element = layui.element;

        var page = 1;
        var pageSchoolFood = 0;
        var pagearoundFood = 0;
        var type = '10';
        //获取所有类型的商铺
        getStoreList(element,page,12,type);

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

        $("#moreStore").on('click',function () {
            var loading= layer.msg('加载中', {
                icon: 16
                ,shade: 0.01
            });
            setTimeout(function () {
                layer.close(loading);
                //getStoreList(element,page,20);
                var tempPage;
                switch (type) {
                    case '10':
                        pagearoundFood=0;
                        pageSchoolFood = 0;
                        page =  page+1;
                        tempPage = page;
                        break;
                    case '11':
                        pagearoundFood=0;
                        pageSchoolFood =pageSchoolFood+1 ;
                        page =  0;
                        tempPage=pageSchoolFood;
                        break;
                    case '12':
                        pagearoundFood=pagearoundFood+1;
                        pageSchoolFood = 0;
                        page = 0;
                        tempPage = pagearoundFood;
                        break;
                    case '13':
                        break;
                }
                selectByType(tempPage,12,type);
            },800);
        })
        $("#allFood").on('click',function () {
            //将另外两种方式的 页数 设置为0
            pagearoundFood= 0;
            pageSchoolFood= 0;
            page = 1;
            type = '10';
            selectByType(page,12,type);
        })
        $("#schoolFood").on('click',function () {
            //将另外两种方式的 页数 设置为0
            pagearoundFood=0;
            page = 0;
            pageSchoolFood=pageSchoolFood+1;
            type = '11';
            selectByType(pageSchoolFood,20,type);
        })
        $("#aroundFood").on('click',function () {
            pageSchoolFood=0;
            page = 0;
            //将另外两种方式的 页数 设置为0
            pagearoundFood = pagearoundFood+1;
            type = '12';
            selectByType(pagearoundFood,20,type);
        })
        $("#smallFood").on('click',function () {
            layer.alert("待开发！");
        })

        function selectByType(page,limit,type) {
            //var type = "11";
            // 10 所有商铺  11代表食堂 12 普通商铺  13 待开发
            // 20 评论数目高   21 低
            // 30 商家等级高   31 低
            var loading= layer.msg('加载中', {
                icon: 16
                ,shade: 0.01
            });
            setTimeout(function () {
                layer.close(loading);
                $.ajax({
                    type:"Post"
                    ,url:"/store/get_store_opWithType"
                    ,data:{
                        page:page
                        ,limit:limit
                        ,type:type
                    }
                    ,success:function (data) {
                        //如果是第一页    则清除子标签
                        if(page == 1 ||page == '1')
                            $("#StoreList").empty();
                        console.log("type:"+type+
                            "\n10 所有商铺  11代表食堂 12 普通商铺  13 待开发\n" +
                            "  20 评论数目高   21 低\n" +
                            "  商家等级高   31 低" );
                        //增加单个商品模块
                        var len = data.length;
                        for(var i=0; i<len;i++) {
                            appendModule(element, data[i]);
                        }
                        if(len == 0)
                            layer.alert("这是所有商铺了呢！")
                    }
                })
            },800);
        }
    });
    //后端获取帖子列表
    function getStoreList(element,page,limit,type) {
        $.ajax({
            type:"Post"
            ,url:"/store/get_store_opWithType"
            ,data:{
                page:page
                ,limit:limit
                ,type:type
            }
            ,success:function (data) {
                //增加单个商品模块
                var len = data.length;
                for(var i=0; i<len;i++) {
                    appendModule(element, data[i]);
                }
                if(len == 0)
                    layer.alert("这是所有商铺了呢！")
            }
        })
    }
    //前台渲染
    function appendModule(element,data) {
        var stype = "小店";
        if(data.storetype == '11' || data.storetype == 11)
            stype = '食堂';
        var str = createStoreSign(
                data.storeid
                ,data.storepicture
                ,data.storename
                ,data.storeaverprice
                ,data.storelevel
                ,data.storecmtnum
                ,stype
            );
            $("#StoreList").append(str);
            element.init();
    }
    //创建html代码
    function createStoreSign(storeid,picloc,storeName,price
        ,level,cmt,type) {
        var str =" <div class=\"alvin-store-module \"> <div class=\"alvin-store-main\">"
            +"<div class=\"alvin-store-pic\"><a href=store_goods?storeid="
            +storeid
            +"> <img src= \'"
            + picloc
            +"\' /></a></div><div class=\"alvin-store-nameprice\"><div class=\"alvin-store-name\">"
            + "<a href=store_goods?storeid="
            + storeid
            + ">"
            + storeName
            +"</a></div><div class=\"alvin-store-averPrice\">平均价格：<span>"
            + price
            +"</span>"
            +"</div></div> </div><div class=\"alvin-store-lsc\"> <div class=\"alvin-store-level\">" +
            "<i class=\"layui-icon layui-icon-star-fill\"></i>"
            +level
            + "</div><div class=\"alvin-store-star\">"
            +type
            +"</div><div class=\"alvin-store-cmt\">" +
            "<i class=\"layui-icon layui-icon-list\"></i>"
            +cmt
            +"</div></div></div>";
        return str;
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
