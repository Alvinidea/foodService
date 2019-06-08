<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/28
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta property="qc:admins" content="10660160706551301301616375">
    <title>校园商铺-成工美食_原创校园生活美食平台，师生全都是吃货！</title>
    <meta name="keywords" content="校园,美食">
    <meta name="description" content="校园,美食">
    <meta name="msapplication-tooltip" content="成工美食">
    <meta name="renderer" content="webkit">
    <link rel="alternate" media="only screen and (max-width: 640px)" href="https://m.meishichina.com/">
    <link rel="shortcut icon" href="https://static.meishichina.com/v6/img/lib/f.ico">
    <link rel="apple-touch-icon" href="https://static.meishichina.com/v6/img/lib/wapico.png">

    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="application/javascript" src="/lib/layui/layui.js"></script>
    <link rel="stylesheet" href="/lib/layui/css/layui.css"/>
</head>
<body style="text-align:center" >
<div style="margin:0 auto;">
    <div style="height: 180px"></div>
    <div >
        <div class="layui-btn-radius layui-btn-primary layui-btn" id="wechat"> 微信</div>
        <div class="layui-btn-radius layui-btn-primary layui-btn" id="alipay"> 支付宝</div>
        <div class="layui-btn-radius layui-btn-primary layui-btn" id="campus"> 校园通</div>
        <br><br><br> <br>
        <div id="bincode" >
            <img src="/pic/bincode.jpg" style="height: 150px;width: 150px">
        </div>
        <br> <br>
        <div class="layui-btn-radius layui-btn-primary layui-btn" id="finish"> 完成支付</div>
    </div>

</div>
<script>
    layui.use(['form','layer','element'], function() {
        var form = layui.form;
        var layer = layui.layer;
        var element = layui.element;

        $("#finish").hide()//表示为display:none;
        $("#bincode").hide()//表示为display:none;
        var orderid = localStorage.getItem("orderid");
        localStorage.removeItem("orderid");
        var type= "";

        $("#wechat").on('click',function () {
            ShowBinCode();
            type="微信";
        })
        $("#alipay").on('click',function () {
            ShowBinCode();
            type="支付宝";
        })
        $("#campus").on('click',function () {
            ShowBinCode();
            type="校园通";
        })
        $("#finish").on('click',function () {
            AjaxPay(orderid,type);
        })
    });

    function ShowBinCode() {
        var loading= layer.msg('获取显示二维码中', {
            icon: 16
            ,shade: 0.01
        });
        setTimeout(function () {
            layer.close(loading);
            $("#bincode").show()//表示为display：block，
            $("#finish").show()//表示为display：block，
        },1000);
    }
    function AjaxPay(orderid,method) {
        $.ajax({
            url:"/user/userOrderSurePay"
            ,type:"POST"
            ,data:{orderid:orderid
                ,ordermethod:method}
            ,success:function (data) {

                var loading= layer.msg('支付进行中请稍后', {
                    icon: 16
                    ,shade: 0.01
                });
                setTimeout(function () {
                    layer.close(loading);
                    var loading2= layer.msg('支付完成！正在跳转！请等待！', {
                        icon: 16
                        ,shade: 0.01
                    });
                    setTimeout(function () {
                        layer.close(loading2);
                        location.href ="/user/user_info_orderItem";
                    },1200);
                },1500);
            }
        })
    }
</script>
</body>
</html>
