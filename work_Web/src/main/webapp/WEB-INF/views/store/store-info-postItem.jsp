<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/13
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Forum</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
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
<body>
    <div class="fly-panel" style="margin-bottom: 0;">
        <div class="fly-panel-title fly-filter">
            <a href="/column/all/" class="layui-this">综合</a>
            <span class="fly-mid"></span>
            <a href="/column/all/solved/">高星级</a>
            <span class="fly-mid"></span>
            <a href="/column/all/wonderful/">高评论</a>
        </div>
        <ul id="postsList" class="fly-list">
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
        </ul>
        <div style="text-align: center;height: 100px">
            <button id="morePost" class="layui-btn layui-btn-radius" >更多分享</button>
        </div>
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
    <script>
        layui.use(['element','layer'],function(){
            var element = layui.element;
            var layer = layui.element;
            //getInitPosts(element); 这是测试
            var page=1;
            getPostsList(element,page,10);

            $("#morePost").on('click',function () {
                page+=1;
                getPostsList(element,page,10);
            })
        });
        //后端获取帖子列表
        function getPostsList(element,page,limit) {
            $.ajax({
                type:"Post"
                ,url:"/forum/get_storeposts_op"
                ,data:{page:page,limit:limit}
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
                //$("#postsList").append("<li style=\"height: 200px\"><a href=\"/u/35166600\" class=\"fly-avatar\"><img src=\"//thirdqq.qlogo.cn/g?b=oidb&amp;k=OdWBtz6xxRdaF6V4gtXmeA&amp;s=100\" alt=\"flylayer\"></a><h2><a class=\"layui-badge\">提问</a><a href=\"/jie/50498/\">table怎么出来带checkbox和行号</a></h2><br/><div><img src=\"//thirdqq.qlogo.cn/g?b=oidb&amp;k=cx0a7Ofj8aL52eQiaD6yLLA&amp;s=100\"/><img src=\"//thirdqq.qlogo.cn/g?b=oidb&amp;k=cx0a7Ofj8aL52eQiaD6yLLA&amp;s=100\"/><img src=\"//thirdqq.qlogo.cn/g?b=oidb&amp;k=cx0a7Ofj8aL52eQiaD6yLLA&amp;s=100\"/><img src=\"//thirdqq.qlogo.cn/g?b=oidb&amp;k=cx0a7Ofj8aL52eQiaD6yLLA&amp;s=100\"/></div> <div class=\'fly-list-info\'><a href=\"/u/35166600\" link=\"\"><cite>flylayer</cite><i class=\"layui-badge fly-badge-vip\">VIP4</i></a><span class=\"fly-list-kiss layui-hide-xs\" title=\"悬赏飞吻\"><i class=\"iconfont icon-kiss\"></i> 20</span><span class=\"fly-list-nums\"> <i class=\"iconfont icon-pinglun1\" title=\"回答\"></i> 1 </span></div> <div class=\"fly-list-badge\"> </div> </li>");
                var str =createPostSign(
                    "/forum/look_user_info?userid="+data[i].postuser//----------------------个人信息url
                    ,data[i].userphotod//----------------------头像地址
                    ,data[i].posttype//----------------------帖子类型
                    ,"/forum/posts_detail?postid="+data[i].postid//----------------------帖子url
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
                +"<span class=\"fly-list-nums\"> <i class=\"iconfont icon-pinglun1\" title=\"回答\"></i> 回复" +
                reviewNum//----------------------回复量
                + "</span>"
                +"</div> <div class=\"fly-list-badge\"> </div> </li>"
            return postdata;
        }

        function picSplit(pic) {
            if(pic.indexOf(',') != -1) {
                var list = pic.split(',');
                var str = "";
                for (var li=0;li<list.length-1; li++) {
                    str += "<img src=" + list[li] + " class=\'alvin-pic-size\'>"
                }
                return str
            }
            else {
                return "<img src=" + pic + " class=\'alvin-pic-size\'>";
            }
        }

        //时间转换
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

    </script>
</body>
</html>
