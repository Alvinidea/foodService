<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/5/10
  Time: 13:12
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
<div class="layui-nav" style="height: 50px;background-color: #E9E7E7;padding-top: 5px">
      <span class="layui-breadcrumb" >
        <a href="">首页</a>
        <a>
          <cite>跑腿信息</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"
       href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:25px;border-radius: 3px">ဂ</i></a>
</div>
<hr>
<div class="layui-container">
    <form class="layui-form" action="">
    <div class="layui-form-item" style="width: 80%">
        <div class="layui-inline">
            <div class="layui-input-inline">
                <select id="status" lay-verify="required" >
                    <option value="1" selected="selected" >跑腿中</option>
                    <option value="2">完成啦</option>
                </select>
            </div>
        </div>
        <div class="layui-inline">
            <div class="layui-input-inline">
                <div id="searchByStatus" class="layui-btn-primary layui-btn layui-btn-radius">找找</div>
            </div>
        </div>
    </div>
    </form>
</div>
<hr>
<div class="layui-container">

    <div style="padding: 20px; background-color: #F2F2F2;">
        <div id="WayList" class="layui-row layui-col-space15">
            <!--
            <div class="layui-col-md6">
                <div class="layui-card">
                    <div class="layui-card-header">
                        接单时间：begintime
                        | 发货地址：ordersaddress
                        <br>收货地址：orderpaddress
                    </div>
                    <div class="layui-card-body">
                        <br><br>
                        跑单号码：id | 订单号码：orderid
                        <hr>
                        商家：storename | 商家联系方式：storephone | 商家类型：storetype
                        <hr>
                        买家：username | 买家联系方式：
                        <span style="background-color:#C2BE9E;border-radius: 5px">userphone</span>
                        <hr>
                        买家备注信息：orderother
                        <hr>
                        <div id='id5616' class="layui-btn layui-btn-radius layui-btn-primary finishedWay"
                             style="width: 100%">完成运送</div>
                    </div>
                </div>
            </div>
               -->
        </div>
        <br><hr>
        <div class="layui-btn layui-btn-primary layui-btn-radius"
             style="width: 100%;align-self: center"
             id="getMore">获取更多</div>
    </div>
</div>


<script>
    layui.use(['table','carousel','layer','element'], function(){
        var table = layui.table;
        var carousel = layui.carousel;
        var layer = layui.layer;
        var element = layui.element;
        var page =1,limit=10;
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

        function createHtml(t,begintime ,ordersaddress,orderpaddress
            ,id,orderid,storename ,storephone,storetype
            ,username, userphone,orderother) {
            var str =
                "<div class=\"layui-col-md6\" wayid='" +
                id
                +"'>" +"（" + t + "）：" +
                "                <div class=\"layui-card\">" +
                "                <div class=\"layui-card-header\">" +
                "接单时间：" +
                begintime +
                "| 发货地址：" +
                "<span style=\"background-color:#8FCDA0;border-radius: 5px\">" +
                ordersaddress +
                "</span><br> 收货地址：" +
                "<span style=\"background-color:#C2BE9E;border-radius: 5px\">" +
                orderpaddress +
                "</span></div>" +
                " <div class=\"layui-card-body\"><br><hr>" +
                "跑单号码：" +
                id+
                "| 订单号码：" +
                orderid +
                "<hr>" +
                " 商家：" +
                storename +
                "| 商家联系方式：" +
                storephone +
                "| 商家类型：" +
                storetype +
                "<hr>" +
                " 买家：" +
                username+
                "| 买家联系方式：" +
                "<span style=\"background-color:#fcc88a;border-radius: 5px\">" +
                userphone +
                "</span><hr>" +
                "买家备注信息：" +
                orderother +
                "<hr>" +
                "<div id='" +
                id +
                "'class=\"layui-btn layui-btn-radius layui-btn-primary finishedWay\"" +
                "onclick=finished("+id+")" +
                "            style=\"width: 100%\">完成运送</div>" +
                "</div> </div> </div>";
            return str;
        }
        //后端获取列表
        function getOrderToShow(element,page,limit) {
            var status = $("#status").val();
            $.ajax({
                type:"Post"
                ,url:"/user/myWayOrder"
                ,data: {   page:page,
                        limit:limit
                        ,status:status}
                ,success:function (data) {
                    //ret = appendPosts(element,data);
                    console.log(data);
                    if(data.length == 0)
                    {
                        var loading = layer.msg("无数据啦", {
                            icon: 15
                            ,shade: 0.01
                        })
                        setTimeout(function ()
                        {
                            layer.close(loading);
                        },800);
                    }
                    for(var t=0;data.length;t++)
                    {
                        var html = createHtml(t+1,data[t].begintime ,data[t].ordersaddress,data[t].orderpaddress
                            ,data[t].id,data[t].orderid,data[t].storename ,data[t].storephone,data[t].storetype
                            ,data[t].username, data[t].userphone,data[t].orderother);
                        $("#WayList").append(html);
                        element.init();
                    }
                }
                ,error:function (data) {
                    console.log(data+"error!!!");
                }
            })
        }

        $("#getMore").on("click",function () {
            //getOrderToShow(element,page,limit)
            layer.alert("No more")
        })

        $("#searchByStatus").on('click',function () {
            $("#WayList").empty();
            getOrderToShow(element,page,limit);

        })
    });

    function finished(id) {
        console.log("id:"+id);
        layer.alert(id);
        var loading= layer.msg('确认完成中', {
            icon: 16
            ,shade: 0.01
        });
        setTimeout(function () {
            layer.close(loading);
            $.ajax({
                type:"Post"
                ,url:"/way/sureWayOp"
                ,data:
                    {id:id}
                ,success:function (info) {
                    var loading= layer.msg('您已经完成此次运送！', {
                        icon: 16
                        ,shade: 0.01
                    });
                    setTimeout(function () {
                        layer.close(loading);
                        console.log(info);
                        var select = "[wayid="+id+"]"
                        $(select).remove();
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
