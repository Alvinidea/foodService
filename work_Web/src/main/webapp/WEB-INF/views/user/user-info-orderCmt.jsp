<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/5/12
  Time: 15:52
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
<hr>
<div class="layui-container">
    订单号：<span id="orderid"></span>
</div>
<hr>
<div class="layui-container">
    <div style="padding: 20px; background-color: #F2F2F2;">
        <div id="OrderDList" class="layui-row layui-col-space15">
          <!--  <div class="layui-col-md6" id="x1">
                <div class="layui-card">
                    <div class="layui-card-header">
                        商品名称：goodsname|单号：orderidd |价格：orderpriced
                    </div>
                    <div class="layui-card-body">
                        <div class="layui-form-item layui-form-text">
                            <label class="layui-form-label">评价内容</label>
                            <div class="layui-input-block">
                                <textarea placeholder="请输入评论" class="layui-textarea"
                                          style="border-radius: 8px" id="orderidd"></textarea>
                            </div>
                        </div>
                        <div id="test1"></div>
                    </div>
                </div>
            </div>-->

        </div>
        <br><hr>
        <div>
            <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
            <legend>打星星</legend>
                <div id='test0' ></div>
                <div id='test1' ></div>
                <div id='test2' ></div>
                <div id='test3'></div>
                <div id='test4' ></div>
                <div id='test5' ></div>
                <div id='test6' ></div>
                <div id='test7' ></div>
                <div id='test8' ></div>
                <div id='test9' ></div>
            </fieldset>

        </div>
        <div class="layui-btn layui-btn-primary layui-btn-radius"
             style="width: 100%;align-self: center"
             id="CmtOrder">评  价</div>
    </div>
</div>


<script>
    layui.use(['table','carousel','layer','element','rate'], function(){
        var table = layui.table;
        var carousel = layui.carousel;
        var layer = layui.layer;
        var element = layui.element;
        var rate = layui.rate;
        var page =1,limit=10;
        var starlist = [0,0,0,0,0,0,0,0,0,0];
        var iddlist = [];

        var orderid = localStorage.getItem("orderid");
        //localStorage.removeItem("orderid");
        $("#orderid").text(orderid);
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
        isLogin();
        getOrderDToShow(element,page,limit);
        initrate();
        hideStar(limit);

        function createHtml(index,goodsname,orderidd,orderpriced) {
            var str = "        <div class=\"layui-col-md6\">" +
                "                <div class=\"layui-card\">" +
                "                <div class=\"layui-card-header\">" +
                "                商品名称：" +
                goodsname +
                "|单号：" +
                orderidd +
                "|价格：" +
                orderpriced +
                "                        </div>" +
                "                        <div class=\"layui-card-body\">" +
                "                <div class=\"layui-form-item layui-form-text\">" +
                "                <label class=\"layui-form-label\">评价内容</label>" +
                "                <div class=\"layui-input-block\">" +
                "                <textarea placeholder=\"请输入评论\" class=\"layui-textarea\"style=\"border-radius: 8px\"" +
                "id='" +
                orderidd +
                "'></textarea>" +
                "                </div>" +
                "                </div>" +
                "                </div>" +
                "                </div>" +
                "                </div>";
            return str;
        }
        //后端获取列表
        function getOrderDToShow(element,page,limit) {
            console.log(orderid);
            $.ajax({
                type:"Post"
                ,url:"/order/order_Detail"
                ,data: {
                    page:page,
                    limit:limit,
                    orderid:orderid}
                ,success:function (info) {
                    console.log(info);
                    var data = info.data;
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
                        var html = createHtml(t,data[t].goodsname,data[t].orderidd,data[t].orderpriced);
                        $("#OrderDList").append(html);
                        element.init();
                        showStar(t);
                        iddlist.push(data[t].orderidd);
                    }
                }
                ,error:function (data) {
                    console.log(data+"error!!!");
                }
            })
        }
        //初始化评分
        function initrate()
        {
            //自定义文本
            rate.render({
                elem: '#test0'
                ,text: true
                ,setText: function(value){ //自定义文本的回调
                    var arrs = {
                        '1': '极差'
                        ,'2': '差'
                        ,'3': '中等'
                        ,'4': '好'
                        ,'5': '极好'
                    };
                    this.span.text(arrs[value] || ( value + "星"));
                }
                ,choose: function(value){
                    starlist[0] = value;
                    console.log(starlist);
                }
            })
            rate.render({
                elem: '#test1'
                ,text: true
                ,setText: function(value){ //自定义文本的回调
                    var arrs = {
                        '1': '极差'
                        ,'2': '差'
                        ,'3': '中等'
                        ,'4': '好'
                        ,'5': '极好'
                    };
                    this.span.text(arrs[value] || ( value + "星"));
                }
                ,choose: function(value){
                    starlist[1] = value;
                    console.log(starlist);
                }
            })
            rate.render({
                elem: '#test2'
                ,text: true
                ,setText: function(value){ //自定义文本的回调
                    var arrs = {
                        '1': '极差'
                        ,'2': '差'
                        ,'3': '中等'
                        ,'4': '好'
                        ,'5': '极好'
                    };
                    this.span.text(arrs[value] || ( value + "星"));
                }
                ,choose: function(value){
                    starlist[2] = value;
                    console.log(starlist);
                }
            })
            rate.render({
                elem: '#test3'
                ,text: true
                ,setText: function(value){ //自定义文本的回调
                    var arrs = {
                        '1': '极差'
                        ,'2': '差'
                        ,'3': '中等'
                        ,'4': '好'
                        ,'5': '极好'
                    };
                    this.span.text(arrs[value] || ( value + "星"));
                }
                ,choose: function(value){
                    starlist[3] = value;
                    console.log(starlist);
                }
            })
            rate.render({
                elem: '#test4'
                ,text: true
                ,setText: function(value){ //自定义文本的回调
                    var arrs = {
                        '1': '极差'
                        ,'2': '差'
                        ,'3': '中等'
                        ,'4': '好'
                        ,'5': '极好'
                    };
                    this.span.text(arrs[value] || ( value + "星"));
                }
                ,choose: function(value){
                    starlist[4] = value;
                    console.log(starlist);
                }
            })

            rate.render({
                elem: '#test5'
                ,text: true
                ,setText: function(value){ //自定义文本的回调
                    var arrs = {
                        '1': '极差'
                        ,'2': '差'
                        ,'3': '中等'
                        ,'4': '好'
                        ,'5': '极好'
                    };
                    this.span.text(arrs[value] || ( value + "星"));
                }
                ,choose: function(value){
                    starlist[5] = value;
                    console.log(starlist);
                }
            })
            rate.render({
                elem: '#test6'
                ,text: true
                ,setText: function(value){ //自定义文本的回调
                    var arrs = {
                        '1': '极差'
                        ,'2': '差'
                        ,'3': '中等'
                        ,'4': '好'
                        ,'5': '极好'
                    };
                    this.span.text(arrs[value] || ( value + "星"));
                }
                ,choose: function(value){
                    starlist[6] = value;
                    console.log(starlist);
                }
            })
            rate.render({
                elem: '#test7'
                ,text: true
                ,setText: function(value){ //自定义文本的回调
                    var arrs = {
                        '1': '极差'
                        ,'2': '差'
                        ,'3': '中等'
                        ,'4': '好'
                        ,'5': '极好'
                    };
                    this.span.text(arrs[value] || ( value + "星"));
                }
                ,choose: function(value){
                    starlist[7] = value;
                    console.log(starlist);
                }
            })
            rate.render({
                elem: '#test8'
                ,text: true
                ,setText: function(value){ //自定义文本的回调
                    var arrs = {
                        '1': '极差'
                        ,'2': '差'
                        ,'3': '中等'
                        ,'4': '好'
                        ,'5': '极好'
                    };
                    this.span.text(arrs[value] || ( value + "星"));
                }
                ,choose: function(value){
                    starlist[8] = value;
                    console.log(starlist);
                }
            })
            rate.render({
                elem: '#test9'
                ,text: true
                ,setText: function(value){ //自定义文本的回调
                    var arrs = {
                        '1': '极差'
                        ,'2': '差'
                        ,'3': '中等'
                        ,'4': '好'
                        ,'5': '极好'
                    };
                    this.span.text(arrs[value] || ( value + "星"));
                }
                ,choose: function(value){
                    starlist[9] = value;
                    console.log(starlist);
                }
            })
        }

        $('#CmtOrder').on('click',function () {
            var info = $("#orderid").text();
            console.log(info);
            for(var t=0;t<iddlist.length;t++)
            {
                info+=","+iddlist[t]+","+$("#"+iddlist[t]).val()+","+starlist[t];
                console.log(iddlist[t]+"----"+$("#"+iddlist[t]).val()+"----"+starlist[t]);
            }
            console.log("评论信息："+info);
            $.ajax({
                type:"Post"
                ,url:"/user/cmtOrderDOp"
                ,data: {   cmt:info}
                ,success:function (data) {
                    console.log(data);
                    if(data == "success") {
                        var loading = layer.msg("正在评论！！！", {
                            icon: 15
                            , shade: 0.01
                        })
                        setTimeout(function () {
                            layer.close(loading);
                            layer.msg("评论完成", {
                                icon: 15
                                , shade: 0.01
                                ,time:800
                            });
                            setTimeout(function () {
                                location.href ="/user/user_info_orderItem";
                            }, 800);
                        }, 800);
                    }
                }
                ,error:function (data) {
                    console.log(data+"error!!!");
                }
            })
        })


    });

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

    function hideStar(num) {
        for(var t=0;t<num;t++)
        {
            var id = "#test"+t;
            $(id).hide();
        }
    }
    function showStar(num) {
        var id = "#test"+num;
        $(id).show();
        console.log("show");
    }
</script>
</body>
</html>


