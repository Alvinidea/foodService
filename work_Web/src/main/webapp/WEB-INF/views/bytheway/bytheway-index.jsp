<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/28
  Time: 14:51
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
    <link rel="alternate" media="only screen and (max-width: 640px)" href="https://m.meishichina.com/">
    <link rel="shortcut icon" href="https://static.meishichina.com/v6/img/lib/f.ico">
    <link rel="apple-touch-icon" href="https://static.meishichina.com/v6/img/lib/wapico.png">
    <link rel="stylesheet" type="text/css" href="/test/all.css">
    <link rel="stylesheet" type="text/css" href="/test/wwwindex2.css">

    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="application/javascript" src="/lib/layui/layui.js"></script>
    <link rel="stylesheet" href="/lib/layui/css/layui.css"/>
</head>
<body style="">

<style>
    /*购物车标记*/
    .alvin-cart-right{
        position: fixed;
        right:10px;top:45% ;
        height: 100px;width: 15px;
        padding:10px;margin: 10px;
        font-size: 16px;
        font-family: "Microsoft YaHei UI";
        background-color:#93D1FF;
        border-radius: 8px;
    }
    .alvin-cart-right:hover{
        background-color: #dddddd;
        color: #CC0000;
    }

</style>
<div class="alvin-cart-right" onclick="alvin_show('','/user/myWay',800,560)">
    <i class="layui-icon layui-icon-cart"></i>我的跑腿
</div>
<div class="top-bar" id="J_top_bar">
    <ul class="bar-left left">
        <li><a title="成工美食" href="/food/index" target="_blank"
               style="background:url(/pic/logo.jpg) no-repeat scroll left center;
                                background:url(/pic/logo.jpg) no-repeat scroll left center/108px auto;
                                width:108px">
            <i>成工美食</i>首页</a></li>
        <li> <a title="社区" href="/forum/forum_main" target="_blank">论坛</a></li>
        <li> <a title="话题" href="/store/store_main" target="_blank">商城</a></li>
        <li> <a title="话题" href="/store/store_main" target="_blank">跑腿</a></li>
        <li class="alvin-login">
            <a title="活动" href="/user/user_info" target="_blank">个人中心</a>
        </li>
        <li class="top_bar_more"><i></i>
            <div>
                <a title="烘焙" href="https://hongbei.meishichina.com/" target="_blank">烘焙</a>
                <a title="妈妈派" href="https://mamapai.meishichina.com/" target="_blank">妈妈派</a>
            </div>
        </li>
    </ul>
    <div class="right" id="J_top_bar_user">
        <ul class="clear bar-info right bar-noLogin alvin-logout" id="J_barUser">
            <li class="bar-link bar-item bar-reg">
                <a href="/user/register" target="_blank">注册</a>
            </li>
            <li class="bar-link bar-item bar-login">
                <a href="/pre/login" target="_blank">登录</a>
            </li>
        </ul>
        <ul class="clear bar-info right bar-noLogin alvin-login" id="J_barUser2">
            <li class="bar-link bar-item bar-login">
                <a href="/pre/logout" target="_self">退出</a>
            </li>
            <li class="bar-link bar-item bar-login">
                <a href="/user/user_info" target="_blank">个人中心</a>
            </li>
        </ul>
    </div>
</div>
<div class="layui-container">
    <div style="height: 320px;width:100%;">
    <br>
    <hr>
    <div class="layui-carousel" id="index_carousel">
        <div carousel-item>
            <div><img src="https://i3.meishichina.com/attachment/magic/2019/03/26/2019032615535661071358197577.jpg"
                      style="width: 100%;"></div>
            <div><img src="https://i3.meishichina.com/attachment/magic/2019/04/09/2019040915547941182668197577.jpg"
                      style="width: 100%;"></div>
            <div><img src="https://i3.meishichina.com/attachment/magic/2019/03/19/2019031915529664717418197577.jpg"
                      style="width: 100%;"></div>
            <div><img src="https://i3.meishichina.com/attachment/magic/2019/03/13/2019031315524432737218197577.jpg"
                      style="width: 100%;"></div>
        </div>
    </div>
    </div>
</div>
<hr><br>
<div>
    <div class="layui-container" style="">
        <div class="layui-collapse">
            <div class="layui-colla-item">
                <h2 class="layui-colla-title">查询想要的</h2>
                <div class="layui-colla-content layui-show">
                    <form class="layui-form" action="">
                        <div class="layui-form-item">
                            <div class="layui-inline">
                                <label class="layui-form-label">发货地址</label>
                                <div class="layui-input-inline">
                                    <input type="text" name="sellAd" lay-verify="sellAd" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-inline">
                                <label class="layui-form-label">收货地址</label>
                                <div class="layui-input-inline">
                                    <input type="text" name="payAd" lay-verify="payAd" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-inline">
                                <label class="layui-form-label">商家</label>
                                <div class="layui-input-inline">
                                    <input type="text" name="storeName" lay-verify="storeName" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-inline">
                                <label class="layui-form-label">买家</label>
                                <div class="layui-input-inline">
                                    <input type="text" name="userName" lay-verify="userName" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-inline">
                                <div class="layui-input-block">
                                    <div class="layui-btn" lay-submit="" lay-filter="demo1" id="find">找一找</div>
                                    <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="layui-collapse" lay-filter="test" id="WayList">

            <!--
                        <div id="11"
                             class="layui-colla-item">
                            <div class="layui-colla-title" style="height:64px;line-height:64px;">
                                <div class="layui-btn layui-btn-primary layui-btn-sm layui-btn-radius" style="background-color: #93D1FF"
                                     onclick="acceptOrder('11')">
                                    <i class="layui-icon layui-icon-flag" style="color: #27A9E3"></i>接单
                                </div>
                                <i class="layui-icon layui-icon-location"></i>发货地址：
                                <span>地址</span>|商铺名称：<span>商铺名称</span>
                                <i class="layui-icon layui-icon-location"></i>收货地址：
                                <span>地址</span>
                                商品数目：
                                <span> 4 份</span> |
                                订单时间：
                                <span>time</span>
                            </div>
                            <div class="layui-colla-content">
                                <p><img src="/pic/alvin.jpg" style="width: 30px;height: 30px">---- 商品名称 -----5份</p><br>
                                <p><img src="/pic/logo.jpg" style="width: 30px;height: 30px">商品名称-5份</p><br>
                            </div>
                        </div>-->
        </div>
        <br><hr>
        <div class="layui-btn layui-btn-primary layui-btn-radius"
             style="width: 100%;align-self: center"
             id="getMore">获取更多</div>
    </div>
</div>

<script src="/js/checkInput.js"></script>
<script>
    layui.use(['table','carousel','layer','element'], function(){
        var table = layui.table;
        var carousel = layui.carousel;
        var layer = layui.layer;
        var element = layui.element;
        var page =1,limit=10;
        var goodsnum=0, storeId="",storeName="", userId="",userName="",
            sellAd="", payAd ="";
        //建造实例 轮转
        carousel.render({
            elem: '#index_carousel'
            ,width: '100%' //设置容器宽度
            ,height:'100%'
            ,arrow: 'hover' //悬停显示箭头
            ,autoplay:true
            ,interval:2000
            ,anim: 'fade' //切换动画方式
        });

        //监听折叠
        element.on('collapse(test)', function(data){
            //layer.msg('展开状态：'+ data.show);
            if(data.show == true) {
                console.log(data);
                console.log($(this).attr("id"));
                var oid = $(this).attr("id");
                getOrderDetailToShow(element, oid);
            }else
             {
                 var oid = $(this).attr("id");
                 var filter = "[fillcontext*="+oid+"]";
                 $(filter).empty();
             }
        });
        isLogin();
        getOrderToShow(element,page,limit);

        //后端获取帖子列表
        function getOrderToShow(element,page,limit) {
            $.ajax({
                type:"Post"
                ,url:"/way/getWayOrdersOp"
                ,data:
                    {page:page,
                        limit:limit,
                        goodsnum:goodsnum,
                        storeId:storeId,storeName:storeName,
                        userId:userId,userName:userName,
                        sellAd:sellAd, payAd :payAd
                    }
                ,success:function (data) {
                    //ret = appendPosts(element,data);
                    console.log(data);
                    for(var it =0;it< data.length;it++) {
                        var str = createStr(data[it].orderid,data[it].ordersaddress,data[it].storename,
                            data[it].orderpaddress, data[it].orderdetailnum,getTime(data[it].orderbegintime));
                        $("#WayList").append(str);
                        element.init();
                    }

                }
            })
        }
        function createStr(id,Saddress,storename,Paddress,num,time){
            var str = "";
            str+="<div id= '" +
                + id
                + "' class=\"layui-colla-item\">" +
                " <div id='" +
                id +
                "'" +
                " class=\"layui-colla-title\" style=\"height:64px;line-height:64px;\">" +
                " <div class=\"layui-btn layui-btn-primary layui-btn-sm layui-btn-radius\" style=\"background-color: #93D1FF\"" +
                " onclick=\"acceptOrder('" +
                id +
                "')\">" +
                " <i class=\"layui-icon layui-icon-flag\" style=\"color: #27A9E3\"></i>接单" +
                "</div>" +
                "<i class=\"layui-icon layui-icon-location\"></i>发货地址：<span>" +
                Saddress +
                "</span> |商铺名称：<span>" +
                storename+"" +
                "</span>" +
                "    <i class=\"layui-icon layui-icon-location\"></i>收货地址：<span>" +
                Paddress +
                " </span>商品数目：<span>" +
                num+
                "份</span> |" +
                "    订单时间：<span>" +
                time +
                "</span>" +
                "    </div>" +
                " <div class=\"layui-colla-content\"" +
                "fillcontext='" +
                id
                +"'></div>" +
                "</div>";
            return str;
        }

        function getOrderDetailToShow(element,id) {
            $.ajax({
                type:"Post"
                ,url:"/way/getWayOrdersDetailOp"
                ,data:
                    {id:id
                    }
                ,success:function (data) {
                    //ret = appendPosts(element,data);
                    var filter = "[fillcontext*="+id+"]";
                    console.log(data);
                    for(var it =0;it< data.length;it++) {
                        var str = createDStr(data[it].goodspic,data[it].goodsname,data[it].goodsother);
                        $(filter).append(str);
                        element.init();
                    }

                }
            })
        }
        function createDStr(pic,name,num){
            var str = "";
            str+="<p><img src='"
                + pic
                +"' style=\"width: 30px;height: 30px\">"
                +name+ "×"
                +num
                +"份</p><br>";
            return str;
        }

        $("#getMore").on("click",function () {
            //getOrderToShow(element,page,limit)
            layer.alert("No more")
        })

        $("#find").on("click",function () {
            storeName = $("[name*=storeName]").val();
            userName= $("[name*=userName]").val();
            sellAd= $("[name*=sellAd]").val();
            payAd = $("[name*=payAd]").val();;
            if(isValidNumber(storeName))
            {
                storeId=storeName;
                storeName="";
            }else{
                storeId="";
            }
            if(isValidNumber(userName))
            {
                userId=userName;
                userName="";
            }else{
                userId="";
            }
            $("#WayList").empty();
            getOrderToShow(element,page,limit);
        })

    });


    function acceptOrder(data){
        var id="#"+data;
        var item =  $(id);//item.hide();
        var filter = $("[fillcontext*="+data+"]");
        item.remove();
        filter.remove();
        console.log("接单+"+data);
        var loading= layer.msg('接单中', {
            icon: 16
            ,shade: 0.01
        });
        setTimeout(function () {
            layer.close(loading);
            $.ajax({
            type:"Post"
            ,url:"/way/createWayOp"
            ,data:
                {id:data
                }
            ,success:function (info) {
                var loading= layer.msg('生成订单中', {
                    icon: 16
                    ,shade: 0.01
                });
                setTimeout(function () {
                    layer.close(loading);
                    console.log(info);
                },800);
            }
        })
        },800);
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

    function getTime(time) {
        //628362060000初始时间
        var timestamp = (new Date()).getTime();
        var interval = timestamp -  time;
        interval = interval/1000;
        if(interval < 60)
        {
            return interval+"秒前"
        }else if(interval / 60 < 60)
        {
            return parseInt(interval/60)+"分钟前"
        }else if(interval / 60/60 < 24)
        {
            return parseInt(interval/60/ 60)+"小时前"
        } else if(interval / 60/60/24 < 24)
        {
            return parseInt(interval/60/ 60/24)+"天前"
        } else if(interval / 60/60/24/7 < 4)
        {
            return parseInt(interval/60/ 60/24/7)+"周前"
        } else if(interval / 60/60/24/30 < 12)
        {
            return parseInt(interval/60/ 60/24/30)+"月前"
        } else
        {
            return parseInt(interval/60/ 60/24/360)+"年前"
        }
    }
    //展示layer
    function alvin_show(title,url,w,h){
        //购物车页面
        //console.log(localStorage.getItem('cartData'));
        //打开layer
        x_admin_show(title,url,w,h);
    }

    function x_admin_show(title,url,w,h){
        if (title == null || title == '') {
            title=false;
        };
        if (url == null || url == '') {
            url="404.html";
        };
        if (w == null || w == '') {
            w=($(window).width()*0.9);
        };
        if (h == null || h == '') {
            h=($(window).height() - 50);
        };
        layer.open({
            type: 2,
            area: [w+'px', h +'px'],
            fix: false, //不固定
            skin: 'demo-class',
            maxmin: true,
            shadeClose: true,
            shade:0.8,
            anim: 1,
            title: title,
            content: url,
            success: function(){
                //窗口加载成功刷新frame
                // location.replace(location.href);
            },
            cancel:function(){
                //关闭窗口之后刷新frame
                // location.replace(location.href);
            },
            end:function(){
                //窗口销毁之后刷新frame
                // location.replace(location.href);
            }
        });
    }
</script>
</body>
</html>
