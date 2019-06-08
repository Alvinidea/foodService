<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/3
  Time: 19:10
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
<%--数据
用户id                userid
                      userid2
用户头像              userPic
用户名                username
                      username2
                      username3
用户申请时间          userapplytime
用户状态              userstatus
用户等级              userlevel
帖子数目              postnum

#MadeofFood
#Post_TopHothh
--%>
<body style="">
    <div class="top-bar" id="J_top_bar">
        <ul class="bar-left left">
            <li><a title="成工美食" href="/food/index" target="_blank"
                   style="background:url(/pic/logo.jpg) no-repeat scroll left center;
                                    background:url(/pic/logo.jpg) no-repeat scroll left center/108px auto;
                                    width:108px">
                <i>成工美食</i>首页</a></li>
            <li> <a title="社区" href="/forum/forum_main" target="_blank">社区</a></li>
            <li> <a title="话题" href="/store/store_main" target="_blank">商城</a></li>
            <li> <a title="话题" href="/way/wayIndex" target="_blank">跑腿</a></li>
            <li> <a title="个人中心" href="/user/user_info" target="_blank">个人中心</a></li>
            <li class="top_bar_more"><i></i>
                <div>
                    <a title="烘焙" href="https://hongbei.meishichina.com/" target="_blank">烘焙</a>
                    <a title="妈妈派" href="https://mamapai.meishichina.com/" target="_blank">妈妈派</a>
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
            </ul>
        </div>
    </div>
    <div class="space_wrap">
        <div class="space_info w">
            <div class="mod clear">
                <div class="pic">
                    <a id="userid2" >
                        <img id="userphotod" class="imgLoad" src="/pic/alvin.jpg"
                             width="150" height="150" alt="">
                    </a>
                </div>
                <div class="detail">
                    <div class="subname">
                        <em><a id="username">
                            小丫superstar</a>
                        </em>
                        <i class="space_icon woman"></i>
                        <br>
                        <i id="userapplytime" class="messagenum">2018-12-31加入</i>
                    </div>
                    <div class="subtools clear">
                        <div class="right">
                            <ul class="substatus">
                                <li>
                                    <a title="等级"  rel="nofollow">
                                        <b id="userlevel" class="followedcount">5</b><br>等级
                                    </a>
                                </li>
                                <li>
                                    <a title="关注"  rel="nofollow">
                                        <b id="userstatus" class="followingcount">2</b><br>
                                        关注
                                    </a>
                                </li>
                                <li class="last">
                                    <a title="访问" rel="nofollow">
                                        <b class="viewnum">7899</b><br>
                                        访问
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="space_nav_wrap">
        <ul userid="11251129" id="userid">
            <li><a title="个人信息" href="#" class="on">个人信息</a></li>
            <li><a title="帖子" href="#">菜谱 </a></li>
            <li><a title="收藏" href="#" rel="nofollow">收藏</a></li>
            <li style="float:right">
                <a title="个人动态" href="#" rel="nofollow">个人动态</a></li>
        </ul>
    </div>
    <div class="wrap">
        <div class="w clear">
            <div class="ui_title mt10">
                <div class="ui_title_wrap clear">
                    <h3 class="on"><span id="username2" >小丫superstar</span>的订单</h3>
                    <a href="javascript:void(0)" class="recipe_ser"></a>
                    <span  class="right" >
                        共<span id="orderNum">104</span>篇
                    </span>
                </div>
            </div>
            <div class="big4_list clear mt10">
                <ul id="MadeofFood">
                    <!--
                    <li>
                        <a title="米酒芝麻饼" target="_blank">
                            <i>
                                <img alt="米酒芝麻饼" class="imgLoad"
                                     src="//static.meishichina.com/v6/img/blank.gif">
                            </i>
                            <p>米酒芝麻饼</p>
                        </a>
                    </li>
                    <li>
                        <a title="酱香饼" href="https://home.meishichina.com/recipe-452183.html" target="_blank">
                            <i>
                                <img alt="酱香饼" class="imgLoad" src="//static.meishichina.com/v6/img/blank.gif" data-src="https://i3.meishichina.com/attachment/recipe/2019/04/11/2019041115549738854049702111.jpg?x-oss-process=style/c320">
                            </i>
                            <p>酱香饼</p>
                        </a>
                    </li>
                    <li>
                        <a title="银耳莲子百合羹" href="https://home.meishichina.com/recipe-452185.html" target="_blank">
                            <i>
                                <img alt="银耳莲子百合羹" class="imgLoad" src="//static.meishichina.com/v6/img/blank.gif" data-src="https://i3.meishichina.com/attachment/recipe/2019/04/11/20190411155496593599110104208.jpg?x-oss-process=style/c320">
                            </i>
                            <p>银耳莲子百合羹</p>
                        </a>
                    </li>
                    <li>
                        <a title="茶树菇炒肉片" href="https://home.meishichina.com/recipe-452281.html" target="_blank">
                            <i>
                                <img alt="茶树菇炒肉片" class="imgLoad" src="//static.meishichina.com/v6/img/blank.gif" data-src="https://i3.meishichina.com/attachment/recipe/2019/04/09/2019040915548006213329702111.jpg?x-oss-process=style/c320">
                            </i>
                            <p>茶树菇炒肉片</p>
                        </a>
                    </li>
                    -->
                </ul>

            </div>
            <div id="moreOrder" class="layui-btn layui-btn-primary layui-btn-radius" style="width: 100%">
                M O R E
            </div>
            <div class="ui_title mt10">
                <div class="ui_title_wrap clear">
                    <h3 class="on" ><span id="username3">小丫superstar</span>的话题</h3>
                    <span class="right" >共
                        <span id="postNum">104</span>个</span>
                </div>
            </div>
            <div class="pin_list clear">
                <ul id="Post_TopicHot">
                </ul>

            </div>
            <div id="morePost" class="layui-btn layui-btn-primary layui-btn-radius" style="width: 100%">
                M O R E
            </div>
        </div>
    </div>

    <script src="/js/DateUtil.js"></script>
    <script>
        layui.use(['layer','element'], function(){
            var layer = layui.layer;
            var element = layui.element;

            var id = getUrlParam("userid");

            isLogin();
            initInfo(id);
            initphoto(id);
            showNum(id);


            var pagePost = 1;
            var pageOrder = 1;
            getHotPost_six(element,pagePost,id);
            getOrder(element,pageOrder,id);
            $('#morePost').on('click',function () {
                pagePost +=1;
                getHotPost_six(element,pagePost,id);
            });
            $('#moreOrder').on('click',function () {
                pageOrder+=1;
                getOrder(element,pageOrder,id);
            });
        });

        function initInfo(id) {
            $.ajax({
                type:"Post"
                ,url:"/forum/getUser_info"
                ,data:{id:id}
                ,success:function (data) {
                    $("#username").text(data.username);
                    $("#username2").text(data.username);
                    $("#username3").text(data.username);
                    $("#userapplytime").text(getTime(data.userapplytime));
                    $("#userid").attr('href','/user/user_info');
                    $("#userid2").attr('href','/user/user_info');
                    $("#userlevel").text(data.userlevel);
                }
            })
        }
        function initphoto(id) {
            $.ajax({
                type:"Post"
                ,url:"/forum/getUser_photo"
                ,data:{id:id}
                ,success:function (data) {
                    $("#userphotod").attr('src',data);
                }
            })
        }

        //最火的帖子
        // prime是从0开始   偶数时候：左边   质数时候：右边
        function createLowerPost(prime,user_id,user_pic,
                                 username,post_id,posttime,
                                 postcontext,scanNum,respNum,imgs) {
            var str1 = "<li ";
            var str2;
            if( prime%2 ==1) //判断放在左边还是右边
                str2 =  " class=\"clear\">";
            else
                str2 =  ">";
            var str3 = "<div class=\"u\"> <a href=/forum/look_user_info?userid="
                + user_id //个人url的id   "https://home.meishichina.com/space-10714798.html"
                + " target=\"_blank\"><img width=\"40\" height=\"40\" class=\"imgLoad\"src=\'"
                + user_pic          // 图片位置"/pic/blank.gif"
                + "\'></a><div> <a href=/forum/look_user_info?userid="
                + user_id            //"https://home.meishichina.com/space-10714798.html"
                + " class=\"t\" target=\"_blank\">"
                + username          //username
                +"</a><span>"
                + posttime          //发送时间  33
                +"分钟前</span> </div> </div>"
                + "<div class=\"c clear\"> <a href=/forum/posts_detail?postid="
                + post_id //"https://home.meishichina.com/pai-991968.html" //帖子url的id
                + " target=\"_blank\">"
                + postcontext       //context
                + "</a></div> <a class=\"clear\" href= /forum/posts_detail?postid="
                + post_id   //"https://home.meishichina.com/pai-991968.html"   //url
                + " target=\"_blank\">";
            var strImg = "";//<img class="imgLoad" src="/pic/blank.gif" >
            for(var num=0;num< 1;num++)//imgs.length
            {
                strImg+="<img class=\"imgLoad alvin-topic-pic\" src=\'"
                    +imgs //imgs[num]
                    +"\' >"
            }
            var str4 = "</a><span>"
                + scanNum
                +"个浏览，"
                + respNum
                +"条回复 </span> </div> </li>"
            return str = str1+str2+str3+strImg+str4;
        }
        function getHotPost_six(element,page,id) {
            $.ajax({
                type:'POST'
                ,url:'/forum/six_post'
                ,data:{page:page,limit:6,id:id}
                ,success:function (data) {
                    var len = data.length;
                    if(len == 0) {
                        layer.alert("没有了呢！");
                        return;
                    }else{
                        for(var i=0;i< len;i++) {
                            var str = createLowerPost(
                                i
                                , data[i].postuser
                                ,data[i].userPhotoD//----------------------头像地址
                                ,data[i].username// ----------------------用户名称
                                ,data[i].postid
                                ,i+1
                                ,data[i].postcontext
                                ,data[i].postscan+""
                                ,data[i].postthumb+""
                                ,data[i].postpic);
                            $('#Post_TopicHot').append(str);
                            element.init();
                        }
                    }

                }
                ,error:function () {
                    layer.alert("底层话题获取error！");
                }
            })
        }

        //生成食堂的四个菜
        function createCarteen(title,url_storeid,pic,username) {
            var str = "<li><a title=\""
                + title
                + "\"href=\"/store/store_goods?storeid="
                + url_storeid
                +"\" target=\"_blank\">"
                + "<i> <img alt=\""
                + title
                + "\" class=\"imgLoad\" src=\""
                + pic
                + "\"></i><p>"
                + title
                +"</p> </a><a title=\""
                + username
                +"\"href=\"/store/store_goods?storeid="
                + url_storeid
                +"\" target=\"_blank\" class=\"u\">"
                + username
                +"</a></li>";
            return str;
        }
        function getOrder(element,page,id) {
            $.ajax({
                type:'POST'
                ,url:'/forum/viewUserOrder'
                ,data:{page:page,limit:4,id:id}
                ,success:function (data) {
                    var len = data.length;
                    if(len == 0) {
                        layer.alert("没有了呢！");
                        return;
                    }
                    else{
                        for(var t=0;t< len;t++) {
                            var list = data[t].split(',');
                            var str = createCarteen(list[0],list[1],list[2],list[3]);
                            $('#MadeofFood').append(str);
                            element.init();
                        }
                    }
                }
                ,error:function () {

                }
            })
        }

        function showNum(id)
        {
            $.ajax({
                type:'POST'
                ,url:'/forum/viewUserNum'
                ,data:{id:id}
                ,success:function (data) {
                    $('#orderNum').text(data[0]);
                    $('#postNum').text(data[1]);
                }
                ,error:function () {

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

        function getUrlParam(name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
            var r = window.location.search.substr(1).match(reg);  //匹配目标参数
            if (r != null) return unescape(r[2]); return null; //返回参数值
        }
    </script>
    <style>
        .alvin-topic-pic{
            width: 90px;
            height: 90px;
            margin: 5px; padding: 2px;
            border-radius: 6px;
        }
        .alvin-topic-pic:hover{
            width: 95px;
            height: 95px;
            margin: 5px; padding: 2px;
            border-radius: 6px;
        }
    </style>
</body>
</html>
