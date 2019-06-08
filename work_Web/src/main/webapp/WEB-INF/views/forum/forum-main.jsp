<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/3
  Time: 9:09
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
    <![endif]-->

    <link rel="stylesheet" href="../../../fonts/font_24081_qs69ykjbea.css">
    <link rel="stylesheet" href="../../../lib/layui/css/layui.css">
    <link rel="stylesheet" href="../../../css/flyglobal.css?t=15537621615096" charset="utf-8">
    <link id="layuicss-layer" rel="stylesheet" href="../../../lib/layui/css/modules/layer/default/layer.css" media="all">
    <script src="https://hm.baidu.com/hm.js?d214947968792b839fd669a4decaaffc"></script>
    <script type="application/javascript" src="../../../lib/layui/layui.js"></script>
    <script type="application/javascript" src="../../../lib/layui/lay/modules/layer.js"></script>
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <![endif]-->
</head>
<body style="height: 100%" >
<div id="top"></div>
<div class="fly-header layui-bg-black">
    <div class="layui-container">
        <a class="fly-logo" href="/food/index">
            <img src="/pic/logo.jpg" style="width: 50px;height: 50px;border-radius: 6px;" alt="layui">
        </a>
        <ul class="layui-nav fly-nav layui-hide-xs">
            <li class="layui-nav-item layui-this">
            <a href="/food/index"><i class="layui-icon layui-icon-home"></i>首页</a>
            </li>
            <li class="layui-nav-item">
                <a href="/forum/forum_main"><i class="iconfont icon-jiaoliu"></i>论坛</a>
            </li>
            <li class="layui-nav-item">
                <a href="/store/store_main"><i class="layui-icon layui-icon-cart"></i>商城</a>
            </li>
            <li class="layui-nav-item">
                <a href="/way/wayIndex"><i class="layui-icon layui-icon-tree"></i>跑腿</a>
            </li>
            <span class="layui-nav-bar" style="left: 0px; top: 55px; width: 0px; opacity: 0;"></span>
        </ul>
        <ul class="layui-nav fly-nav-user">
            <li class="layui-nav-item alvin-login">
                <a class="fly-nav-avatar" href="/user/user_info" id="LAY_header_avatar">
                    <cite class="layui-hide-xs">个人信息</cite>
                    <img src="//thirdqq.qlogo.cn/g?b=oidb&amp;k=cx0a7Ofj8aL52eQiaD6yLLA&amp;s=100">
                    <span class="layui-nav-more"></span>
                </a>
            </li>
            <li class="layui-nav-item alvin-logout">
                <a class="fly-nav-avatar" href="/pre/login" id="LAY_header_avatar2">
                    <cite class="layui-hide-xs">
                        <i class="layui-icon layui-icon-username"></i>登录
                    </cite>
                    <span class="layui-nav-more"></span>
                </a>
            </li>
            <span class="layui-nav-bar"></span>
        </ul>
    </div>
</div>
<div class="fly-panel fly-column">
    <div class="layui-container">
        <ul class="layui-clear">
            <li class="layui-hide-xs  layui-this"><a href="/forum/forum_main">论坛首页</a></li>

        </ul>
        <div class="fly-column-right layui-hide-xs">
            <span class="fly-search LAY_search"><i class="layui-icon"></i></span>
            <button class="layui-btn" onclick="x_admin_show('发帖','../forum/send_post',800,600)">
                <i class="layui-icon"></i>发表新帖</button>
        </div>
    </div>
</div>
<div class="layui-container">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md8">
            <div class="fly-panel layui-hide-xs">
                <div class="layui-row fly-panel-main" style="padding: 15px;">
                    <div class="layui-carousel fly-topline" id="FLY_topline"
                         lay-anim="fade" lay-indicator="inside" lay-arrow="hover" style="width: 100%; height: 180px;">
                        <div class="layui-carousel" id="index_carousel">
                            <div carousel-item>
                                <div><img src="https://i3.meishichina.com/attachment/magic/2019/03/26/2019032615535661071358197577.jpg"
                                          srcset="https://i3.meishichina.com/attachment/magic/2019/03/26/2019032615535661075958197577.jpg 2x"></div>
                                <div><img src="https://i3.meishichina.com/attachment/magic/2019/04/09/2019040915547941182668197577.jpg"
                                          srcset="https://i3.meishichina.com/attachment/magic/2019/04/09/2019040915547941184248197577.jpg 2x"></div>
                                <div><img src="https://i3.meishichina.com/attachment/magic/2019/03/19/2019031915529664717418197577.jpg"
                                          srcset="https://i3.meishichina.com/attachment/magic/2019/03/19/2019031915529664712138197577.jpg 2x"></div>
                                <div><img src="https://i3.meishichina.com/attachment/magic/2019/03/13/2019031315524432737218197577.jpg"
                                          srcset="https://i3.meishichina.com/attachment/magic/2019/03/13/2019031315524432734608197577.jpg 2x"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!--<div class="fly-panel">
                <div class="fly-panel-title fly-filter">
                    <a>置顶</a>
                </div>
                <ul class="fly-list">
                    <li>
                        <a href="/u/6497232" class="fly-avatar">
                            <img src="//cdn.layui.com/avatar/6497232.jpg?t=1523408456711" alt="岁月小偷">
                        </a> <h2> <a class="layui-badge">讨论</a>
                        <a href="/jie/50497/">layui 表格反转的一个简单实现方式</a>
                    </h2>
                        <div class="fly-list-info">
                            <a href="/u/6497232" link=""> <cite>岁月小偷</cite>
                                <i class="iconfont icon-renzheng" title="认证信息：2018-2019 年度 layui “社区之光”"></i>
                                <i class="layui-badge fly-badge-vip">VIP3</i>
                            </a> <span>10小时前</span> <span class="fly-list-kiss layui-hide-xs" title="悬赏飞吻">
                            <i class="iconfont icon-kiss"></i> 80</span>
                            <span class="fly-list-nums">
                                <i class="iconfont icon-pinglun1" title="回答"></i> 7
                            </span>
                        </div>
                        <div class="fly-list-badge">
                            <span class="layui-badge layui-bg-red">精帖</span>
                        </div>
                    </li>
                    <li>
                        <a href="/u/6497232" class="fly-avatar">
                            <img src="//cdn.layui.com/avatar/6497232.jpg?t=1523408456711" alt="岁月小偷">
                        </a> <h2> <a class="layui-badge">讨论</a> <a href="/jie/49908/">让 layui table 固定列也能监听滚动</a> </h2>
                        <div class="fly-list-info"> <a href="/u/6497232" link=""> <cite>岁月小偷</cite>
                            <i class="iconfont icon-renzheng" title="认证信息：2018-2019 年度 layui “社区之光”"></i>
                            <i class="layui-badge fly-badge-vip">VIP3</i> </a> <span>2019-3-21 </span>
                            <span class="fly-list-kiss layui-hide-xs" title="悬赏飞吻"><i class="iconfont icon-kiss"></i> 80</span>
                            <span class="fly-list-nums"> <i class="iconfont icon-pinglun1" title="回答"></i> 57 </span>
                        </div>
                        <div class="fly-list-badge"> <span class="layui-badge layui-bg-red">精帖</span>
                        </div>
                    </li>
                    <li>
                        <a href="/u/6497232" class="fly-avatar">
                            <img src="//cdn.layui.com/avatar/6497232.jpg?t=1523408456711" alt="岁月小偷">
                        </a>
                        <h2>
                            <a class="layui-badge">讨论</a>
                            <a href="/jie/49749/">tablePlug 插件的小小升级</a>
                        </h2>
                        <div class="fly-list-info">
                            <a href="/u/6497232" link="">
                                <cite>岁月小偷</cite>
                                <i class="iconfont icon-renzheng" title="认证信息：2018-2019 年度 layui “社区之光”"></i>
                                <i class="layui-badge fly-badge-vip">VIP3</i>
                            </a> <span>2019-3-18 </span>
                            <span class="fly-list-kiss layui-hide-xs" title="悬赏飞吻"><i class="iconfont icon-kiss"></i> 80</span>
                            <span class="fly-list-nums"> <i class="iconfont icon-pinglun1" title="回答"></i> 38 </span>
                        </div>
                            <div class="fly-list-badge">
                                <span class="layui-badge layui-bg-red">精帖</span>
                            </div>
                    </li>
                </ul>
            </div> -->
            <div class="fly-panel" style="margin-bottom: 0;">
                <div class="fly-panel-title fly-filter">
                    <a  class="layui-this">筛选：</a>
                    <span class="fly-mid"></span>
                    <a href ="" id="allPost" class="layui-this">帖子类型</a>
                    <div class="layui-input-inline">
                            <select name="postType" id="postType"  class="layui-this">
                            <option value="" selected>所有</option>
                            <option value="分享">分享</option>
                            <option value="教学">教学</option>
                            <option value="食材">食材</option>
                            <option value="学习">学习</option>
                            <option value="话题">话题</option>
                        </select>
                    </div>
                    <span class="fly-mid"></span>
                </div>
                <ul id="postsList" class="fly-list">
                    <!--
                    <li style="height: 200px" >
                        <a href="/u/35166600" class="fly-avatar">
                            <img src="//thirdqq.qlogo.cn/g?b=oidb&amp;k=OdWBtz6xxRdaF6V4gtXmeA&amp;s=100" alt="flylayer">
                        </a>
                        <h2>
                            <a class="layui-badge">提问</a>
                            <a href="/jie/50498/">table怎么出来带checkbox和行号</a>
                        </h2>
                        <br/>
                        <div>
                            <img src="//thirdqq.qlogo.cn/g?b=oidb&amp;k=cx0a7Ofj8aL52eQiaD6yLLA&amp;s=100"/>
                            <img src="//thirdqq.qlogo.cn/g?b=oidb&amp;k=cx0a7Ofj8aL52eQiaD6yLLA&amp;s=100"/>
                            <img src="//thirdqq.qlogo.cn/g?b=oidb&amp;k=cx0a7Ofj8aL52eQiaD6yLLA&amp;s=100"/>
                            <img src="//thirdqq.qlogo.cn/g?b=oidb&amp;k=cx0a7Ofj8aL52eQiaD6yLLA&amp;s=100"/>
                        </div>
                        <div class="fly-list-info">
                            <a href="/u/35166600" link="">
                                <cite>flylayer</cite>
                                <i class="layui-badge fly-badge-vip">VIP4</i>
                            </a>
                            <span>38分钟前</span>
                            <span class="fly-list-kiss layui-hide-xs" title="悬赏飞吻"><i class="iconfont icon-kiss"></i> 20</span>
                            <span class="fly-list-nums"> <i class="iconfont icon-pinglun1" title="回答"></i> 1 </span>
                        </div>
                        <div class="fly-list-badge">
                        </div>
                    </li>
                    -->
                </ul>
                <div style="text-align: center;height: 100px">
                        <button id="morePost" class="layui-btn layui-btn-radius" >更多分享</button>
                </div>
            </div>
        </div>
        <div class="layui-col-md4">
            <div class="fly-panel fly-rank fly-rank-reply" id="LAY_replyRank">
                <h3 class="fly-panel-title">访问榜</h3>
                <dl id="SeqScan">
                    <!--
                    <dd>
                        <a href=
                                   "/u/2430456"
                        >
                        <img src="//cdn.layui.com/avatar/2430456.jpg?t=1504089075922">
                            <cite>
                                HiTerry
                            </cite>
                            <i>
                                95次回答
                            </i>
                        </a></dd>
                        -->
                </dl>
            </div>
            <dl class="fly-panel fly-list-one" id="SeqThumb">
                <dt class="fly-panel-title">点赞榜</dt>
                <!--
                <dd>
                    <a href=
                               "/jie/50311/"
                    >
                        TP5怎么与layuiAdmin结合？
                    </a>
                    <span><i class="iconfont icon-pinglun1"></i>
                        17
                    </span>
                </dd>
                <dd> <a href="/jie/50271/">layui form表单提交</a>
                    <span>
                    <i class="iconfont icon-pinglun1"></i> 14
                    </span>
                </dd>
                <dd> <a href="/jie/50271/">layui form表单提交</a>
                    <span>
                    <i class="iconfont icon-pinglun1"></i> 14
                    </span>
                </dd>
                <dd> <a href="/jie/50271/">layui form表单提交</a>
                    <span>
                    <i class="iconfont icon-pinglun1"></i> 14
                    </span>
                </dd>
                -->
            </dl>
            <div class="fly-panel fly-link">
                <h3 class="fly-panel-title">友情链接</h3>
                <dl class="fly-panel-main">
                    <dd><a href="http://layim.layui.com/" target="_blank">WebIM</a>
                    </dd>
                    <dd> </dd>
                    <dd>
                        <a href="http://layer.layui.com/" target="_blank">layer</a>
                    </dd>
                    <dd> </dd>
                </dl>
            </div>
        </div>
    </div>
</div>
<div class="fly-footer">
    <p>
        <a href="/forum/forum_main">美食 社区</a> 2019 ©
        <a href="/forum/forum_main">ChengG</a>
    </p>

    <p class="fly-union">
        <span>开发者：ALVIN何超凡</span>
    </p>
</div>
<div style="position: fixed;
        left: 55px;bottom: 15px;
        width:22px;height: 50px ;
        padding: 10px;
        background-color: #4AB5E2;border-radius: 10px">
    <a href="#top">
        <i class="layui-icon layui-icon-top " >置顶</i>
    </a>

</div>
<style>
    .alvin-photo-size{
        width: 50px;
        height: 50px;
    }
    .alvin-pic-size{
        width: 110px;
        height: 110px;
    }
</style>
<script src="/js/DateUtil.js"></script>
<script>
    layui.use(['carousel','layer','element'], function(){
        var carousel = layui.carousel;
        var layer = layui.layer;
        var element = layui.element;
        //getInitPosts(element); 这是测试
        //  不同类型的页面信息
        var defaultlimit = 8;
        var page = 1;
        var shicaipage=1;
        var xuexipage=1;
        var jiaoxuepage=1;
        var fenxiangpage=1
        var huatipage = 1;
        getPostsList(element, page,defaultlimit );
        getSeqScan(element,1,8);
        getSeqThumb(element,1,6);
        //验证是否已经登录
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

        $("#morePost").on('click',function () {
            var type = $('#postType option:selected').val();
            switch (type)
            {
                case "教学":
                    jiaoxuepage+=1;
                    getPostsListBySituation(element,jiaoxuepage,defaultlimit ,type);
                    break;
                case "食材":
                    shicaipage+=1;
                    getPostsListBySituation(element,shicaipage,defaultlimit ,type);
                    break;
                case "学习":
                    xuexipage+=1;
                    getPostsListBySituation(element,xuexipage,defaultlimit ,type);
                    break;
                case "话题":
                    huatipage+=1;
                    getPostsListBySituation(element,huatipage,defaultlimit ,type);
                    break;
                case "分享":
                    fenxiangpage+=1;
                    getPostsListBySituation(element,fenxiangpage,defaultlimit ,type);
                    break;
                default:
                    page +=1;
                    getPostsList(element,page,defaultlimit);
            }
        });
        
        $("#postType").on('change',function () {
            var type = $('#postType option:selected').val();
            page = 1;
            shicaipage=1;
            xuexipage=1;
            fenxiangpage=1;
            huatipage=1;
            jiaoxuepage=1;
            switch (type) {
                case "教学":
                    $("#postsList").empty();
                    getPostsListBySituation(element,1,defaultlimit ,type);
                    break;
                case "食材":
                    $("#postsList").empty();
                    getPostsListBySituation(element,1,defaultlimit ,type);
                    break;
                case "学习":
                    $("#postsList").empty();
                    getPostsListBySituation(element,1,defaultlimit ,type);
                    break;
                case "话题":
                    $("#postsList").empty();
                    getPostsListBySituation(element,1,defaultlimit ,type);
                    break;
                case "分享":
                    $("#postsList").empty();
                    getPostsListBySituation(element,1,defaultlimit ,type);
                    break;
                default:
                    $("#postsList").empty();
                    getPostsList(element,1,defaultlimit);
            }
        });
    });
    //后端获取帖子列表
    function getPostsList(element,page,limit) {
        $.ajax({
            type:"Post"
            ,url:"/forum/get_posts_op"
            ,data:{page:page,limit:limit}
            ,success:function (data) {
                var  ret=0;
                ret = appendPosts(element,data);
                if(ret == 0)
                    layer.alert("这是所有帖子了呢！")
            }
        })
    }
    //后端获取帖子列表
    function getPostsListBySituation(element,page,limit,type) {
        $.ajax({
            type:"Post"
            ,url:"/forum/get_posts_bySituation"
            ,data:{page:page,limit:limit,type:type}
            ,success:function (data) {
                var  ret=0;
                ret = appendPosts(element,data);
                if(ret == 0)
                    layer.alert("这是所有帖子了呢！")
            }
        })
    }
    //前台渲染
    function appendPosts(element,data) {
        var len = data.length;
        if( len == 0)//若没有数据则返回0
        { return 0;}
        for(var i=0; i<len;i++) {
            console.log(data[i]);
            var str =createPostSign(
                "look_user_info?userid="+data[i].postuser//----------------------个人信息url
                ,data[i].userphotod//----------------------头像地址
                ,data[i].posttype//----------------------帖子类型
                ,"posts_detail?postid="+data[i].postid//----------------------帖子url
                ,data[i].posttitle//----------------------帖子标题
                ,data[i].postpic//----------------------图片显示地址postpic;
                ,data[i].username// ----------------------用户名称
                ,data[i].userlevel+""
                ,getTime(data[i].posttime)
                ,data[i].postscan+""
                ,data[i].postthumb+""
            );
            $("#postsList").append(str);
            element.init();
        }
        return 1;
    }

    function createPostSign(userurl,photoloc,posttype,
                            posturl,posttitle,foodpics,
                            username,level,postTime,
                            scanNum,reviewNum) {
        var postdata = "<li style=\"height: 200px\"> "
        +"<a href=" +
            userurl  //----------------------个人信息url
        +" class=\"fly-avatar\">"
        +"<img src=\'" +
            photoloc//----------------------头像地址
        +"\'class=\'alvin-photo-size\' alt=\"flylayer\">"
        +"</a><h2><a class=\"layui-badge\">" +
            posttype//----------------------帖子类型
        +"</a><a href="+
            posturl //----------------------帖子url
            + ">"+
            posttitle//----------------------帖子标题
        +"</a></h2><br/><div>"
            //----------------------图片显示地址
            //"<img src=" + foodpics +" class=\'alvin-pic-size\'>"
            + picSplit(foodpics)

        + "</div><div class=\'fly-list-info\'><a href=\""
        + userurl  //----------------------个人信息地址
        +"\" link=\"\">"
        +"<cite>"+
            username // ----------------------用户名称
        +"</cite><i class=\"layui-badge fly-badge-vip\">等级" +
            level//----------------------等级
        +"</i></a><span>"+
            postTime//----------------------post时间
        +"</span><span class=\"fly-list-kiss layui-hide-xs\" title=\"浏览\">"
        +"<i class=\"iconfont icon-kiss\" ></i>浏览 " +
            scanNum//----------------------浏览量
        +"</span>"
        +"<span class=\"fly-list-nums\"> <i class=\"iconfont icon-pinglun1\" title=\"回答\"></i> 点赞" +
            reviewNum//----------------------回复量
        + "</span>"
        +"</div> <div class=\"fly-list-badge\"> </div> </li>"
        return postdata;
    }

    //------------------------------------------------------------------------------scan
    function createSeqScan(postid,picloc,username,scan) {
        return "<dd>" +
            "<a href='" +
             "posts_detail?postid="+
                postid +
            "'>" +
            "<img src='" +
            picloc +
            "'>" +
            "<cite>" +
            username +
            "</cite>" +
            "<i>" +
            scan +
            "次浏览</i>" +
            "</a></dd>";
    }

    function appendSeqScan(element,data) {
        var len = data.length;
        if( len == 0)//若没有数据则返回0
        { return 0;}
        for(var i=0; i<len;i++) {
            console.log(data[i]);
            var str = createSeqScan(data[i].postid,picSplitOne(data[i].postpic),data[i].username,data[i].postscan);
            $("#SeqScan").append(str);
            element.init();
        }
        return 1;
    }

    function getSeqScan(element,page,limit) {
        $.ajax({
            type:"Post"
            ,url:"/forum/get_SeqScan"
            ,data:{page:page,limit:limit}
            ,success:function (data) {
                var  ret=0;
                ret = appendSeqScan(element,data);
                if(ret == 0)
                    layer.alert("这是所有帖子了呢！")
            }
        })
    }
    //------------------------------------------------------------------------------thumb

    function createSeqThumb(postid,postthumb,thumb) {
        return "<dd>" +
            "<a href='" +
            "posts_detail?postid="+postid +
            "'>" +
            postthumb +
            "</a>" +
            "<span><i class=\"iconfont icon-pinglun1\"></i>" +
            thumb +
            "</span>" +
            "</dd>";
    }

    function appendSeqThumb(element,data) {
        var len = data.length;
        if( len == 0)//若没有数据则返回0
        { return 0;}
        for(var i=0; i<len;i++) {
            console.log(data[i]);
            var str = createSeqThumb(data[i].postid,data[i].posttitle,data[i].postthumb);
            $("#SeqThumb").append(str);
            element.init();
        }
        return 1;
    }

    function getSeqThumb(element,page,limit) {
        $.ajax({
            type:"Post"
            ,url:"/forum/get_SeqThumb"
            ,data:{page:page,limit:limit}
            ,success:function (data) {
                var  ret=0;
                ret = appendSeqThumb(element,data);
                if(ret == 0)
                    layer.alert("这是所有帖子了呢！")
            }
        })
    }

    function picSplit(pic) {
        if(pic.indexOf(',') != -1) {
            var list = pic.split(',');
            var str = "";
            for (var li=0;li<list.length; li++) {
                str += "<img src=" + list[li] + " class=\'alvin-pic-size\'>"
            }
            return str
        }
        else {
            return "<img src=" + pic + " class=\'alvin-pic-size\'>";
        }
    }
    function picSplitOne(pic) {
        if(pic.indexOf(',') != -1) {
            var list = pic.split(',');
            return list[0];
        }
        else {
            return pic;
        }
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
            maxmin: true,
            shadeClose: true,
            shade:0.4,
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

    //这是测试
    function getInitPosts(element) {
        for(var i=0; i<5;i++) {
            //$("#postsList").append("<li style=\"height: 200px\"><a href=\"/u/35166600\" class=\"fly-avatar\"><img src=\"//thirdqq.qlogo.cn/g?b=oidb&amp;k=OdWBtz6xxRdaF6V4gtXmeA&amp;s=100\" alt=\"flylayer\"></a><h2><a class=\"layui-badge\">提问</a><a href=\"/jie/50498/\">table怎么出来带checkbox和行号</a></h2><br/><div><img src=\"//thirdqq.qlogo.cn/g?b=oidb&amp;k=cx0a7Ofj8aL52eQiaD6yLLA&amp;s=100\"/><img src=\"//thirdqq.qlogo.cn/g?b=oidb&amp;k=cx0a7Ofj8aL52eQiaD6yLLA&amp;s=100\"/><img src=\"//thirdqq.qlogo.cn/g?b=oidb&amp;k=cx0a7Ofj8aL52eQiaD6yLLA&amp;s=100\"/><img src=\"//thirdqq.qlogo.cn/g?b=oidb&amp;k=cx0a7Ofj8aL52eQiaD6yLLA&amp;s=100\"/></div> <div class=\'fly-list-info\'><a href=\"/u/35166600\" link=\"\"><cite>flylayer</cite><i class=\"layui-badge fly-badge-vip\">VIP4</i></a><span class=\"fly-list-kiss layui-hide-xs\" title=\"悬赏飞吻\"><i class=\"iconfont icon-kiss\"></i> 20</span><span class=\"fly-list-nums\"> <i class=\"iconfont icon-pinglun1\" title=\"回答\"></i> 1 </span></div> <div class=\"fly-list-badge\"> </div> </li>");
            var str =createPostSign(
                "个人信息地址"//----------------------个人信息url
                ,"//thirdqq.qlogo.cn/g?b=oidb&amp;k=OdWBtz6xxRdaF6V4gtXmeA&amp;s=100"//----------------------头像地址
                ,"提问"//----------------------帖子类型
                ,"sssssss"//----------------------帖子url
                ,"asdnaslkdanklfdnlkf哈哈哈哈"//----------------------帖子标题
                ,"//thirdqq.qlogo.cn/g?b=oidb&amp;k=cx0a7Ofj8aL52eQiaD6yLLA&amp;s=100"//----------------------图片显示地址
                ,"Alvin"// ----------------------用户名称
                ,4
                ,50
                ,4
            );
            $("#postsList").append(str);
            element.init();
        }
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


