<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/13
  Time: 8:47
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
    <link rel="stylesheet" type="text/css" href="/test/space.css">

    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="application/javascript" src="/lib/layui/layui.js"></script>
    <link rel="stylesheet" href="/lib/layui/css/layui.css"/>
    <link >
</head>
<body style="">
<style>
    .alvin-container{
        float: left;
        position: relative;
        width: 98%;
    }
    .alvin-left-nav{
        padding: 2px;
        margin: 8px;
        width: 25%;
        background-color: #fcc88a;
    }
    .alvin-left-item{
        align-content: center;
        width: 80%;
        height: 40px;
        background-color: #27A9E3;
        padding: 2px;
        margin: 8px;
    }
    .alvin-main-body{
        width: 95%;
        background-color: #8FCDA0;
    }
</style>
<style>
    .alvin-panel-main{padding: 10px 15px;}
    /* 赞助商 */
    .alvin-zanzhu{border-radius: 6px ;display: block; position: relative;
        height: 60px; line-height: 60px; margin-top: 10px; padding: 0 20px; text-align: center; font-size: 16px; font-weight: 300;
        background-color: #8FCDA0; color: #fff;}
    .alvin-zanzhu:first-child{margin-top: 0;}
    .alvin-zanzhu:hover{opacity: 0.9; color: #fff;}
    .alvin-zanzhu-img{height: auto; max-width: 100%; padding: 0; text-align: center; background-color: #eee;}
    .alvin-zanzhu-img img{max-width: 100%;}
    .alvin-module-height{height: 800px}
    .alvin-right-main{width: 100%;position: relative}
    .alvin-right-panel{z-index:34; float: left; position:absolute; width: 100%;height: 100%}

    #demoiframe{
        width: 100%; height: 100%;
    }
</style>
<div class="top-bar" id="J_top_bar">
    <ul class="bar-left left">
        <li><a title="成工美食" href="/food/index" target="_blank"
               style="background:url(/pic/logo.jpg) no-repeat scroll left center;
                                background:url(/pic/logo.jpg) no-repeat scroll left center/108px auto;
                                width:108px">
            <i>成工美食</i>首页</a></li>
        <li> <a title="社区" href="/forum/forum_main" target="_blank">社区</a></li>
        <li> <a title="话题" href="/store/store_main" target="_blank">商城</a></li>
        <li> <a title="跑腿" href="/way/wayIndex" target="_blank">跑腿</a></li>
        <li> <a title="活动" href="/food/index" target="_blank">个人中心</a></li>
        <li class="top_bar_more"><i></i>
            <div>
                <a title="烘焙" href="https://hongbei.meishichina.com/" target="_blank">待开发</a>
                <a title="妈妈派" href="https://mamapai.meishichina.com/" target="_blank">待开发</a>
            </div>
        </li>
    </ul>
    <div class="right" id="J_top_bar_user">
        <ul class="clear bar-info right bar-noLogin alvin-logout">
            <li class="bar-link bar-item bar-login">
                <a href="/pre/login" target="_blank">登录</a>
            </li>
        </ul>
        <ul class="clear bar-info right bar-noLogin alvin-login" >
            <li class="bar-link bar-item bar-reg">
                <a href="/user/user_info" target="_blank">个人中心</a>
            </li>
            <li class="bar-link bar-item bar-reg">
                <a href="/pre/logout" target="_blank">Logout</a>
            </li>
        </ul>
    </div>
</div>
<div class="space_wrap">
    <div class="space_info w">
        <div class="mod clear">
            <div class="pic">
                <a id="userid" >
                    <img id="userphotod" class="imgLoad" src="/pic/alvin.jpg"
                         width="150" height="150" alt="">
                </a>
            </div>
            <div class="detail">
                <div class="subname">
                    <em><a id="username" href="#username">name</a></em>
                    <i class="space_icon man"></i>
                    <br>
                    <i id="userapplytime" class="messagenum">2018-12-31加入</i>
                </div>
                <div class="subtools clear">
                    <div class="right">
                        <ul class="substatus">
                            <li>
                                <a title="等级"  rel="nofollow">
                                    <b id="userlevel" class="followedcount">4</b><br>等级
                                </a>
                            </li>
                            <li class="last">
                                <a title="访问"  rel="nofollow">
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
<div class="space_nav_wrap">
    <ul userid="1501511488" >
    </ul>
</div>
<div class="layui-container">
    <div class="layui-container">
        <div class="layui-row layui-col-space15">
            <div class="layui-col-md3 " >
                <div class="alvin-module-height">
                    <div class="layui-card">
                        <div class="layui-card-header">个人操作</div>
                        <div class="layui-card-body">
                            <div class="alvin-panel-main">
                                <a id="store_info" href="/user/user_info_detail" target="demoiframe" class="alvin-zanzhu">
                                    个 人 信 息</a>
                                <a id="store_order" href="/user/user_info_orderItem" target="demoiframe" class="alvin-zanzhu">
                                    我 的 订 单</a>
                                <a style="display: none" id="store_waitPay" href="/user/user_info_orderPay" target="demoiframe" class="alvin-zanzhu">
                                    等 待 付 款</a>
                                <a id="store_post" href="/user/user_info_postItem" target="demoiframe" class="alvin-zanzhu">
                                    我 的 帖 子</a>
                                <a id="user_way" href="/user/myWay" target="demoiframe" class="alvin-zanzhu">
                                    我 的 跑 腿</a>
                                <a id="store_password" href="/user/user_info_pwd" target="demoiframe" class="alvin-zanzhu">
                                    账 户 信 息</a>
                                <a  href="/store/store_info" target="_blank" class="alvin-zanzhu ">
                                    我 的 商 铺 </a>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="layui-col-md9 ">
                <div class="alvin-right-main alvin-module-height">
                    <iframe src="/user/user_info_detail" frameborder="0" id="demoiframe" name="demoiframe" ></iframe>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    //<iframe src="/user/user_info_detail" frameborder="0" id="demoiframe" name="demoiframe" ></iframe>
    layui.use(['layer','element'],function () {

        var isFromCart = localStorage.getItem("IntoUserWaitPayFromCart");
        if(isFromCart == "true" || isFromCart == true)
        {
            //$("#demoiframe").attr("src","/user/user_info_orderPay");
        }
        initInfo();
        initphoto();
        isLogin();
    });
    function initInfo() {
        $.ajax({
            type:"Post"
            ,url:"/user/getUser_info"
            ,success:function (data) {
                $("#username").text(data.username);
                $("#userapplytime").text(data.storeapplytime);
                $("#userid").attr('/user/user_info');
                $("#userlevel").text(data.userlevel);
            }
        })
    }
    function initphoto() {
        $.ajax({
            type:"Post"
            ,url:"/user/getUser_photo"
            ,success:function (data) {
                $("#userphotod").attr('src',data);
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
