<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/18
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resp</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
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
<div class="layui-container">
    <div class="layui-card">
        <div class="layui-card-body">
            <form class="layui-form" action="">
                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">
                        <i class="layui-icon layui-icon-form"></i>
                        <i class="layui-icon layui-icon-edit" style="color: #2D93CA"></i>
                    </label>
                    <div class="layui-input-block">
                        <textarea id="respContext" placeholder="请输入内容" class="layui-textarea"
                                  style="border-radius: 10px"></textarea>
                    </div>
                </div>
                <div class="layui-form-item">
                    <a class="layui-btn layui-btn-normal" style="width: 100%;color: #2D93CA;border-radius: 9px;
                                   background: linear-gradient(to right,#DADADA,#FFA859);"
                       lay-submit="" lay-filter="demo2" id="respReview">回复</a>
                </div>
            </form>
        </div>
    </div>
    <div class="layui-card">
        <div class="layui-card-header" >
            <i class="layui-icon layui-icon-align-left"></i>
            <i class="layui-icon layui-icon-edit" style="color: #2D93CA"></i>
        </div>
        <div class="layui-card-body">
            <hr>
            <ul id="respList">
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
                <button id="moreResp" class="layui-btn layui-btn-radius" >更多回复</button>
            </div>
        </div>
    </div>
</div>


<script>
    layui.use(['element','layer','carousel'],function () {
        var layer = layui.layer;
        var element = layui.element;
        //导航的hover效果、二级菜单等功能，需要依赖element模块

        //获取url的id
        var reviewid = getUrlParam("reviewid");
        console.log(reviewid);

        var limit =3;
        var page  = 1
        getRespList(element,page,limit,reviewid);
//注册点击事件 获取更多回复
        $("#moreResp").on('click',function () {
            page = page+1;
            getRespList(element,page,limit,reviewid);

        });

        $("#respReview").on('click',function () {
            $.ajax({
                type:"Post"
                ,url:"/forum/set_resp"
                ,data:{
                    reviewid:reviewid
                    ,context:$("#respContext").val()
                }
                ,success:function (data) {
                    if(data =='success')
                    {
                        var loading = layer.msg('提交评论中',{icon:16,time:800});
                        setTimeout(function () {
                            layer.close(loading);
                            window.location.reload();//刷新当前页面.
                        },800);
                    }
                    else
                        layer.alert("请登录！");
                },error:function () {
                    layer.alert("error！");
                }
            })
        });
    });

    function getRespList(element,page,limit,id) {
        $.ajax({
            type:"Post"
            ,url:"/forum/get_resp_op"
            ,data:{
                page:page
                ,limit:limit
                ,reviewid:id
            }
            ,success:function (data) {
                var len = data.length;
                for (var i = 0; i < len; i++) {
                    appendResp(element, data[i]);
                }
                if(len == 0)
                    layer.msg("没有了哦！",{icon:15,time:800})
            }
        })
    }
    //前台渲染
    function appendResp(element,data)
    {
        var str = createRespSign(
            data.respreview
            ,data.userid//----------------------个人信息url
            ,data.userpic//----------------------头像地址
            ,data.username// ----------------------用户名称
            ,data.userlevel//--------------用户等级
            ,getTime(data.resptime)//----------------------帖子类型
            ,data.respcontext//----------------------帖子标题
            ,0
        );
        $("#respList").append(str);
        element.init();
    }
    //创建回复显示串
    function createRespSign(reviewid,userid,userpicd,username,
                            userlevel,resptime,respcontext,
                            respNum) {
        var str ="<div class=\"respSignOnlyKey\"style=\"height: 100px\" id="+
            reviewid//评论id
            +"><a href="+
            "/forum/look_user_info?userid="+userid    //个人信息页面
            +" ><img src=\'"+
            userpicd //头像
            +"\' class=\"layui-nav-img\"><cite>"+
            username                    //用户名称
            +"</cite><i class=\"layui-badge\">等级"+
            userlevel                   //用户等级
            +"</i><cite>"+
            resptime                  //评论时间
            +"</cite></a><div>"+
            respcontext               //评论内容
            +"</div><div><span class=\"alvin_span_list\"> "
            +"<i class=\"alvin_iconfont alvin_icon-pinglun1\" title=\"回答\"></i>" +
            "回复"+
            respNum                     //回复数目
            +"</span></div><hr></div>";
        return str;
    }
    //获取url参数
    function getUrlParam(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
        var r = window.location.search.substr(1).match(reg);  //匹配目标参数
        if (r != null) return unescape(r[2]); return null; //返回参数值
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
        }
        else if(interval / 60/60/24 < 24)
        {
            return parseInt(interval/60/ 60/24)+"天前"
        }
        else if(interval / 60/60/24/7 < 4)
        {
            return parseInt(interval/60/ 60/24/7)+"周前"
        }
        else if(interval / 60/60/24/30 < 12)
        {
            return parseInt(interval/60/ 60/24/30)+"月前"
        }
        else
        {
            return parseInt(interval/60/ 60/24/360)+"年前"
        }
    }

</script>
</body>
</html>

