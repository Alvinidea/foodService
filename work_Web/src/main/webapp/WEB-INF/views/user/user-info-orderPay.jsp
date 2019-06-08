<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/27
  Time: 23:38
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
<body>
<style>
    table
    {
        align-items: center;
        background-color:#DADADA;
        box-shadow:0 1px 2px 0 rgba(0,0,0,.05);
    }
    tr{
        margin: 10px;
        padding: 5px;
    }
    .alvin_tr_det{
        height: 70px;
        width: 98%;
    }
    td{
        border: 1px solid;
        border-color: #c2c2c2;
        padding: 5px;
        margin: 10px;
        font-family: "Times New Roman" ;
    }
    .alvin_wp_pic{
        width: 60px;
        height: 20px;
        position: relative;
    }
    .alvin_wp_pic img{
        width: 90%;
        height:90%;
        margin: 2px;
        border-radius: 6px;
        top: 3px;left: 3px;
        position: absolute;
    }
    .alvin_wp_name{}
    .alvin_wp_price{}
    .alvin_wp_num{}
    .alvin_wp_allprice{}


    .alvin_td_address{}
    .alvin_td_allprice{}
    .alvin_td_submit{}

</style>

<div class="layui-card">
    <div class="layui-card-header">等待支付</div>
    <div class="layui-card-body" id="WaitPayList">
        <div class="layui-card">
            <div class="layui-card-header">订单号:  | 商铺:</div>
            <div class="layui-card-body" >
                <table style="width: 98% ">
                    <tbody >
                        <tr class="alvin_tr_det">
                            <td class="alvin_wp_pic">
                                <img src="/pic/logo.jpg">
                            </td>
                            <td class="alvin_wp_name">商品名称</td>
                            <td class="alvin_wp_price">price</td>
                            <td class="alvin_wp_num">数量</td>
                            <td class="alvin_wp_allprice">价格</td>
                        </tr>
                        <tr class="alvin_tr_det">
                            <td class="alvin_wp_pic">
                                <img src="/pic/logo.jpg">
                            </td>
                            <td class="alvin_wp_name">商品名称</td>
                            <td class="alvin_wp_price">price</td>
                            <td class="alvin_wp_num">数量</td>
                            <td class="alvin_wp_allprice">价格</td>
                        </tr>
                    </tbody>
                    <tfoot>
                    <tr>
                        <td class="alvin_td_address" colspan="2">地址: </td>
                        <td class="alvin_td_allprice" colspan="2">$180</td>
                        <td class="alvin_td_submit" colspan="1">
                            <div 	class="layui-btn layui-btn-primary" onclick='Cancel("orderid")' style="width: 50%"> Pay Now</div>
                            <div 	class="layui-btn layui-btn-primary" onclick='PayNow("orderid")' style="width: 50%"> Pay Now</div>
                        </td>
                    </tr>
                    </tfoot>
                </table>
            </div>
        </div>
    </div>
</div>

<script>
   // GoodsList
   layui.use(['table','form','layer','element'], function() {
       var table = layui.table;
       var form = layui.form;
       var layer = layui.layer;
       var element = layui.element;

       getPayInfo();

       function createTable(orderid,storename,address,allprice,data) {
           var head = creteHead(orderid,storename);
           var body = "";
           var foot = creteFoot(orderid,address,allprice);
           for(var i =0;i<data.length;i++)
           {
               body+= creteBody(data[i].goodsname,data[i].orderpriced,data[i].ordergnumd,data[i].orderallpriced)
           }
           return head+body+foot;
       }
       function creteHead(orderid,storename) {
           var head="<div class=\"layui-card\"><div class=\"layui-card-header\">订单号:"
               + orderid+""
               +"| 商铺:"
               + storename
               + "</div><div class=\"layui-card-body\" ><table style=\"width: 98% \"><tbody >";
           return head;
       }
       function creteBody(goodsname,goodsprice,goodsnum,allprice) {
           var body="<tr class=\"alvin_tr_det\">\n" +
               "            <td class=\"alvin_wp_pic\"><img src="
               + "\"/pic/logo.jpg\""
               + " ></td><td class=\"alvin_wp_name\">"
               + goodsname
               + " </td><td class=\"alvin_wp_price\">"
               + goodsprice
               + "</td><td class=\"alvin_wp_num\">"
               + goodsnum
               + "</td><td class=\"alvin_wp_allprice\">"
               + allprice
               + " </td></tr>";
           return body;
       }
       function creteFoot(orderid,address,allprice) {
           var foot = "</tbody><tfoot><tr><td class=\"alvin_td_address\" colspan=\"2\">地址：" +
               address +
               "</td><td class=\"alvin_td_allprice\" colspan=\"2\">总价：" +
               allprice +
               "</td><td class=\"alvin_td_submit\" colspan=\"1\">"
               +" <div \tclass=\"layui-btn layui-btn-primary\" onclick='Cancel(\""
               + orderid
               + "\")' style=\"width: 90%\"> Cancel</div>"
               + "<div \tclass=\"layui-btn layui-btn-primary\" onclick='PayNow(\""
               + orderid
               + "\")' style=\"width: 90%\"> Pay Now</div>"+
               "</td></tr></tfoot></table> </div></div>";
           return foot;
       }
       function getPayInfo() {
           $.ajax({
               url:"/user/userOrderPay"
               ,type:"POST"
               ,data:{type:1}
               ,success:function (data) {
                   var len = data.length;
                   if(len == 0)
                       return;
                   for(var t=0;t<len;t++)
                   {
                       var store = data[t].store;
                       var order = data[t].order;
                       var list = data[t].list;
                       var html = createTable(order.orderid,store.storename,order.orderpaddress,order.orderallprice,list);
                       $("#WaitPayList").append(html);
                       element.init();
                   }
               }
           })
       }
   });
   function PayNow(orderid) {
       console.log("Paynow"+orderid);
       layer.confirm('确定要支付吗？', {
           btn: ['确定','取消'] //按钮
       }, function(){
           var loading= layer.msg('转入支付页面中', {
               icon: 16
               ,shade: 0.01
           });
           setTimeout(function () {
               layer.close(loading);
               localStorage.setItem("orderid",orderid);
               location.href ="/user/user_info_orderPayMethod";
               //AjaxPay(orderid);
           },1000);
       }, function(){

       });
   }
   function Cancel(orderid) {
       console.log("Cancel"+orderid);
       layer.confirm('确定要取消吗？', {
           btn: ['确定取消','不取消订单'] //按钮
       }, function(){
           var loading= layer.msg('取消中', {
               icon: 16
               ,shade: 0.01
           });
           setTimeout(function () {
               layer.close(loading);
               AjaxCancel(orderid);
           },1000);
       }, function(){

       });
   }

   function AjaxPay(orderid) {
       $.ajax({
           url:"/user/userOrderSurePay"
           ,type:"POST"
           ,data:{orderid:orderid}
           ,success:function (data) {

       }
       })
   }
   function AjaxCancel(orderid) {
       $.ajax({
           url:"/user/userOrderCancel"
           ,type:"POST"
           ,data:{orderid:orderid}
           ,success:function (data) {
               layer.alert("取消成功")
           }
       })
   }
</script>
</body>
</html>
