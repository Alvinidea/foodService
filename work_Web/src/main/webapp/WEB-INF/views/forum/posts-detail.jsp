<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/3
  Time: 19:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta property="qc:admins" content="10660160706551301301616375">
    <title>成工美食_原创校园生活美食平台，师生全都是吃货！</title>
    <meta name="keywords" content="校园,美食">
    <meta name="description" content="校园,美食">
    <meta name="msapplication-tooltip" content="成工美食">
    <meta name="renderer" content="webkit">    <link rel="stylesheet" href="../../../css/font.css">
    <link rel="stylesheet" href="../../../css/xadmin.css">
    <link rel="stylesheet" href="/lib/layui/css/layui.css">
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
/*这是评论框的样式-->*/
.alvin_span_list{position: relative; left:90%; top: 2px; padding-right: 0!important;}
.alvin_span_list i{position: relative; padding: 0 3px 0 15px; }
.alvin_iconfont {
    font-family:"Microsoft YaHei UI";
    font-size:16px;
    font-style:normal;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
}
.alvin_icon-pinglun1{position: relative; top: 2px;}
</style>
<div class="layui-container">
    <ul class="layui-nav " style="background-color: #27A9E3" >
        <li class="layui-nav-item">
            <a href="/food/index">首页<span class="layui-badge">5</span></a>
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
        <li class="layui-nav-item alvin-login">
            <a href="/user/user_info">个人中心<span class="layui-badge-dot"></span></a>
        </li>

        <li class="layui-nav-item"><span > ..............................</span></li>

        <li class="layui-nav-item  alvin-login" lay-unselect="" >
            <a href="javascript:;"><img src="//t.cn/RCzsdCq" class="layui-nav-img">我</a>
            <dl class="layui-nav-child">
                <dd ><a href="/user/user_info">个人信息</a></dd>
                <dd ><a href="/pre/logout">退出登录</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item alvin-logout">
            <a href="/pre/login">登录<span class="layui-badge-dot"></span></a>
        </li>
    </ul>
</div>
<div class="layui-container">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md8">
            <div >
                <div class="layui-col-md12">
                    <div class="layui-card">
                        <div class="layui-card-body">
                            <span class="layui-breadcrumb" lay-separator="  -  ">
                              <a >--------------</a>
                              <a >--------------</a>
                              <a >--------------</a>
                              <a >--------------</a>
                              <a >--------------</a>
                              <a >--------------</a>
                            </span>
                        </div>
                    </div>
                </div>
            </div>
            <div class="layui-hide-xs">
                <div class="layui-row" style="padding: 15px;">
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
            <!---->
            <div class="layui-card">
                <div class="layui-card-body">
                    <h1>
                        <a id="posttype" class="layui-badge">美食</a>
                        <a id="posttitle">table怎么出来带checkbox和行号</a>
                    </h1><br>
                    <a id="userid" href="" class="fly-avatar">
                        <img id="userphotod"
                             src="//thirdqq.qlogo.cn/g?b=oidb&amp;k=OdWBtz6xxRdaF6V4gtXmeA&amp;s=100"
                             class="layui-nav-img">
                        <cite id="username">flylayer</cite>
                        <i class="layui-badge fly-badge-vip">VIP<span id="userlevel">4</span></i>
                    </a>
                    <span id="posttime">38分钟前</span>
                    <br><br>
                    <div id="postpic">
                        <!--
                        <img src="//thirdqq.qlogo.cn/g?b=oidb&amp;k=cx0a7Ofj8aL52eQiaD6yLLA&amp;s=100">
                        <img src="//thirdqq.qlogo.cn/g?b=oidb&amp;k=cx0a7Ofj8aL52eQiaD6yLLA&amp;s=100">
                        <img src="//thirdqq.qlogo.cn/g?b=oidb&amp;k=cx0a7Ofj8aL52eQiaD6yLLA&amp;s=100">
                        <img src="//thirdqq.qlogo.cn/g?b=oidb&amp;k=cx0a7Ofj8aL52eQiaD6yLLA&amp;s=100">
                        -->
                    </div>
                    <div class="layui-card">
                        <div class="layui-card-body">
                            <br>
                            <div id="postcontext"  style="font-size: medium;font-family:'Microsoft YaHei UI'">
                                猪肉为猪科动物家猪的肉，猪在我国的大部分地区皆有饲养。含有丰富的蛋白质及脂肪、碳水化合物、钙、铁、磷等成分。具有补虚强身，滋阴润燥、丰肌泽肤的作用。
                                1.改善贫血
                                猪肉含的半胱氨酸和血红素能促进人体吸收铁铁元素，有补血改善气色的的功效；还含有丰富的铁，铁元素不仅是合成血红蛋白所不可缺少的，而且还是维持人体正常生命活动最重要的十几种酶（如细胞色素C、细胞色素氧化酶等等）组成要素。
                                2.促进发育
                                猪肌肉和其他动物优质肉一样，蛋白质中含人体所必需的八种氨基酸，即色氨酸、苯丙氨酸、赖氨酸、亮氨酸、异亮氨酸、苏氨酸、蛋氨酸和缬氨酸，而且比值很接近人体所需的比值，可以为生长发育提供足够多的营养。
                                3.补肾滋阴
                                猪肉性平味甘，有润肠胃、生津液、补肾气、解热毒的功效，主治热病伤津、消渴羸瘦、肾虚体弱、产后血虚、燥咳、便秘、补虚、滋阴、润燥、滋肝阴、润肌肤、利小便和止消渴。
                                4.保护视力
                                猪肉中还含有维生素A，维生素A是构成视觉细胞中感受弱光的视紫红质的组成成分，能促进视力，提高生殖技能，保持皮肤，骨骼，牙齿和毛发健康生长
                            </div>
                        </div>
                    </div>
                    <div class="fly-list-badge"></div>
                </div>
                <!--评价数 浏览数 星级-->
                <div class="layui-card-body">
                    <ul class="site-doc-icon site-doc-anim ">
                        <li class="layui-inline">
                            <div class="layui-inline ">
                                <i class="layui-icon layui-icon-edit" style="color: #df5000"></i>
                            </div>
                            <span id="reviewnum"class="layui-inline">评价数</span>
                        </li>
                        <li class="layui-inline">
                            <div class="layui-inline ">
                                <i class="layui-icon layui-icon-search" style="color: #df5000"></i>
                            </div>
                            <span id="postscan" class="layui-inline">浏览</span>
                        </li>
                        <li class="layui-inline">
                            <div class="layui-anim layui-anim-up layui-inline "data-anim="layui-anim-scaleSpring">
                                <i class="layui-icon layui-icon-praise" style="color: #df5000"></i>
                            </div>
                            <span id="postthumb" class="layui-inline">点赞</span>
                        </li>
                    </ul>
                </div>
            </div>
            <hr>
            <!--评论-->
            <div class="layui-card">
                <div class="layui-card-body">
                    <div class="layui-form-item layui-form-text">
                        <label class="layui-form-label">
                            <i class="layui-icon layui-icon-form"></i>
                            <i class="layui-icon layui-icon-edit" style="color: #2D93CA"></i>
                        </label>
                        <div class="layui-input-block" >
                            <textarea id="reviewTextarea" placeholder="请输入内容" class="layui-textarea"
                            style="border-radius: 10px"></textarea>
                        </div>
                        <button	id="uploadReview" class="layui-btn layui-btn-radius"
                                   style="width: 100%;color: #2D93CA;
                                   background: linear-gradient(to right,#DADADA,#FFA859);" > 评 论</button>
                    </div>
                    <hr>
                    <ul id="reviewList">
                        <!--
                        <li style="height: 100px">
                                <a href="look_user_info?userid=" >
                                    <img src="//thirdqq.qlogo.cn/g?b=oidb&amp;k=OdWBtz6xxRdaF6V4gtXmeA&amp;s=100" class="layui-nav-img">
                                    <cite>flylayer</cite>
                                    <i class="layui-badge">VIP4</i>
                                    <cite>3小时之前</cite>
                                </a>
                                <div>
                                    这是一个评论！
                                </div>
                                <div>
                                    <span class="alvin_span_list">
                                        <i class="alvin_iconfont alvin_icon-pinglun1" title="回答"></i>
                                        <a val="reviewid" href="javascript:;" class="reply_btn" >回复10</a>
                                    </span>
                                </div>
                            <hr>
                        </li>
                        -->
                    </ul>
                    <div style="text-align: center;height: 100px">
                        <button id="moreReview" class="layui-btn layui-btn-radius" >更多评论</button>
                    </div>
                </div>
            </div>
        </div>
        <div class="layui-col-md4">
            <div >
                <br>
                <h3>招商中</h3>
                <div class="layui-row " style="padding: 15px;">
                    <div class="layui-clear ">
                        <div >
                            <img src="/pic/join1.jpg" style="width: 100%;height: 150px">
                        </div>
                        <hr>
                        <div>
                            <img src="/pic/join2.jpg" style="width: 100%;height: 150px">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<style>
    .alvin-pic-size{width: 200px;height: 200px;padding: 2px;margin: 3px;border-radius: 10px}
    .alvin-pic-style{}
    .alvin-pic-size:hover{width: 203px;height: 203px;padding: 1px;margin: 2px;border-radius: 4px}
    .alvin-pic-bigSize{width: 98%;height: 97%;padding: 2px;margin: 3px;border-radius: 20px}
</style>
<script src="/js/DateUtil.js"></script>
<script>
    layui.use(['element','layer','carousel'],function () {
        var layer = layui.layer;
        var element = layui.element;//导航的hover效果、二级菜单等功能，需要依赖element模块
        var carousel = layui.carousel;
        //获取url的id
        var postid = getUrlParam("postid");
        //layer.alert(postid);
        //显示基础信息
        isLogin();
        setScan(postid);//设置访问加一
        getPostInfo(postid);
        getNumOfReview(postid);
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

        //注册点击事件
        var limit =3;
        var page  = 1;
        getReviewList(element,page,limit,postid);

        $("#moreReview").on('click',function () {
            //getReviewList(element,1,5);
            //test(element,limit);//测试
            page = page+1;
            getReviewList(element,page,limit,postid);

        });

        $("#uploadReview").on('click',function () {
            var context =$("#reviewTextarea").val();
            if(context != "") {
                $.ajax({
                    type: "Post"
                    , url: "/forum/set_review"
                    , data: {
                        postid: postid
                        , context: $("#reviewTextarea").val()
                    }
                    , success: function (data) {
                        if (data == 'success') {
                            var loading = layer.msg('提交评论中',{icon:16,time:800});
                            setTimeout(function () {
                                layer.close(loading);
                                window.location.reload();//刷新当前页面.
                            },800);
                        }
                        else
                            layer.alert("请登录！");

                    }, error: function () {
                        layer.alert("error！");
                    }
                })
            }
        })

        var thumbFlag = 0;
        //点赞
        $('.site-doc-icon .layui-anim').on('click', function() {
            var othis = $(this);
            var anim = othis.data('anim');
            thumbFlag++;
            //停止循环
            if (othis.hasClass('layui-anim-loop')) {
                return othis.removeClass(anim);
            }
            var thumb = parseInt($("#postthumb").text());
            if(thumbFlag %2 ==1) {
                othis.css("background-color", '#fcc88a')
                $("#postthumb").text(thumb+1);
                if(thumbFlag == 1)
                {
                    $.ajax({
                        url:"/forum/setPostThumb"
                        ,type:"Post"
                        ,data:{postid:postid}
                        ,success:function (num) {
                            console.log("点赞："+num)
                        }
                    });
                }
            }else {
                othis.css("background-color", '#DADADA')
                $("#postthumb").text(thumb-1);
            }
            othis.css("color", 'red');
            othis.css('border-radius', '10px');
            othis.removeClass(anim);

            setTimeout(function () {
                othis.addClass('layui-anim-scaleSpring');
            });
            //恢复渐隐
            if (anim === 'layui-anim-fadeout') {
                setTimeout(function () {
                    othis.removeClass(anim);
                }, 1300);
            }
        });

    });
    function setScan(postid){
        $.ajax({
            url:"/forum/setPostScan"
            ,type:"Post"
            ,data:{postid:postid}
            ,success:function (num) {
                console.log("浏览量："+num)
            }
        })
    }

    //刚进入页面时候的获取帖子的信息
    function getPostInfo(id) {
        $.ajax({
            url:"/forum/get_post_data"
            ,type:"Post"
            ,data:{postid:id}
            ,success:function (data) {
                if(data != null)
                {
                    $("#userid").attr('href',"/forum/look_user_info?userid="+data.userid);
                    $("#username").text(data.username);
                    $("#userlevel").text(data.userlevel);
                    $("#userphotod").attr('src',data.userPhotoD);

                    $("#posttitle").text(data.posttitle);
                    //$("#posttime").text(data.posttime);
                    $("#postcontext").text(data.postcontext);
                    $("#posttype").text(data.posttype);

                    $("#postthumb").text(data.postthumb);
                    $("#postscan").text("浏览"+data.postscan);

                    $("#postpic").append(picSplit(data.postpic));
                    element.init();
                }
            }
        })
    }

    function picSplit(pic) {
        if(pic.indexOf(',') != -1) {
            var list = pic.split(',');
            var str = "";
            for (var li=0;li<list.length; li++) {
                str += "<img src=" + list[li] + " class=\'alvin-pic-size alvin-pic-style\' " +
                    "onclick=showPic(" +
                    list[li] +
                    ")>"
            }
            return str
        }
        else {
            return "<img src=" + pic + " class=\'alvin-pic-size\'" +
                "onclick=showPic('" +
                pic +
                "')>"
        }
    }

    function showPic(pic){
        console.log("图片放大");
        layer.open({
            type: 1,
            title: false,
            closeBtn: 0,
            area: '550px',
            skin: 'layui-layer-nobg', //没有背景色
            shadeClose: true,
            content: "<img src=" + pic + " class=\'alvin-pic-bigSize\'>"
        });
    }
    //获取评论信息
    function getNumOfReview(id) {
        $.ajax({
            url:"/forum/getReviewNum"
            ,type:"Post"
            ,data:{postid:id}
            ,success:function (reviewnum) {
                if(reviewnum != null)
                {
                    $("#reviewnum").text("评论数"+reviewnum);
                }
            }
        })
    }

    //获取评论列表
    function getReviewList(element,page,limit,id) {
        $.ajax({
            type:"Post"
            ,url:"/forum/get_review_op"
            ,data:{page:page,limit:limit,postid:id}
            ,success:function (data) {
                var len = data.length;
                for (var i = len-1; i >= 0; i--) {
                    appendReview(element, data[i]);
                }
                if(len == 0){
                    //layer.alert("这是所有评价了呢！")
                }
            }
        })
    }
    //前台渲染
    function appendReview(element,data) {
        console.log(
            "\n id  :  "+data.userid
            +"\npic  :  "+data.userpic
            +"\nname  :  "+data.username
            +"\nlevel  :  "+data.userlevel
            +"\ntime  :  "+data.reviewTime
            +"\ncontext  :  "+data.reviewcontext
            +"\nnum  :  "+data.respnum);
      var str = createReviewSign(
          data.reviewid
          ,data.userid//----------------------个人信息url
            ,data.userpic//----------------------头像地址
            ,data.username// ----------------------用户名称
            ,data.userlevel//--------------用户等级
            ,getTime(data.reviewTime)//----------------------回复时间
            ,data.reviewcontext//----------------------评论内容
            ,data.respnum//回复数目
        );
        $("#reviewList").prepend(str);
        //$("#reviewList").append(str);
        element.init();
    }

    //创建评论串
    function createReviewSign(reviewid,userid,userpicd,username,
                              userlevel,reviewtime,reviewcontext,
                              respNum) {
        var str ="<li style=\"height: 100px\" id="+
            reviewid
            +"><a href="+
            "look_user_info?userid="+userid    //个人信息页面
            +" ><img src=\'"+
            userpicd //头像
            +"\' class=\"layui-nav-img\"><cite>"+
            username                    //用户名称
            +"</cite><i class=\"layui-badge\">等级"+
            userlevel                   //用户等级
            +"</i><cite>"+
            reviewtime                  //评论时间
            +"</cite></a><div>"+
            reviewcontext               //评论内容
            +"</div><div><span class=\"alvin_span_list\"> "
            +"<i class=\"alvin_iconfont alvin_icon-pinglun1\" title=\"回答\"></i>"
            + "<a class='reply_btn' onclick=\"alvin_resp_show(\'回复详情\',\'/forum/review_detail?reviewid="
            + reviewid
            +"\'," +
            respNum   +
            ")\">回复</a>"
            + respNum                     //回复数目
            +"</span></div><hr></li>";
        return str;
    }
    function getUrlParam(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
        var r = window.location.search.substr(1).match(reg);  //匹配目标参数
        if (r != null) return unescape(r[2]); return null; //返回参数值
    }

    function alvin_resp_show(title,url,num){
        layer.open({
            type: 2,
            area: [480+'px', 600 +'px'],
            fix: false, //不固定
            maxmin: true,
            shadeClose: true,
            offset:'rb',
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
