<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/13
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <link >
</head>
<body>
<div class="layui-nav" style="height: 50px;background-color: #E9E7E7;padding-top: 5px">
      <span class="layui-breadcrumb" >
        <a href="">首页</a>
        <a>
          <cite>订单信息</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"
       href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:25px;border-radius: 3px">ဂ</i></a>
</div>
<div style="margin: 20px 20px 10px 20px ;height: 50px;width: 100%">
    <form class="layui-form layui-col-md12 x-so">
        <div class="layui-input-inline">
            <select name="contrller" id="orderMethod">
                <option value="">支付方式</option>
                <option value="支付宝">支付宝</option>
                <option value="微信" >微信</option>
                <option value="货到付款">货到付款</option>
            </select>
        </div>
        <div class="layui-input-inline">
            <select name="contrller" id="orderStatus">
                <option value="0">订单状态</option>
                <option value="1">待付款</option>
                <option value="2">待商家确认</option>
                <option value="3">待收货(跑腿)</option>
                <option value="5">待收货(自运)</option>
                <option value="7">待评价</option>
                <option value="9">已完成</option>
                <option value="10">顾客取消</option>
                <option value="11">商家取消</option>
            </select>
        </div>
        <div class="layui-btn" id="search"   >
            <i class="layui-icon">&#xe615;</i>查找
        </div>
    </form>
</div><hr>

<div class="x-body">
    <script type="text/html" id="toolbarDemo">
        <div class="layui-btn-container">
            <button class="layui-btn layui-btn-sm" lay-event="getCheckData"> 获取选中行数据</button>
            <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
            <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
        </div>
    </script>

    <table id="demo" lay-filter="test" class="layui-hide"></table>

</div>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-primary layui-btn-radius layui-btn-xs" lay-event="detail">
        <i class="layui-icon">&#xe60a;</i>详情
    </a>
    <a class="layui-btn layui-btn-primary layui-btn-radius layui-btn-xs" style="background-color: #8FCDA0" lay-event="pay">
        <i class="layui-icon">&#xe60a;</i>付款
    </a>
    <a class="layui-btn layui-btn-primary layui-btn-radius layui-btn-xs" style="background-color: #fcc88a"  lay-event="sure">
        <i class="layui-icon">&#xe60a;</i>确认收货
    </a>
    <a class="layui-btn layui-btn-primary layui-btn-radius layui-btn-xs" style="background-color: #eb7350"  lay-event="cmt">
        <i class="layui-icon">&#xe60a;</i>评论
    </a>
    <a class="layui-btn layui-btn-danger layui-btn-radius layui-btn-xs" lay-event="cancel">
        <i class="layui-icon">&#xe60a;</i>取消
    </a>
</script>
<script src="/js/DateUtil.js"></script>
<script>
    layui.use(['table','form','layer'], function() {
        var table = layui.table;
        var form = layui.form;
        var layer = layui.layer;
        //第一个实例
        table.render({
            elem: '#demo'
            , height: 650
            , url: '/order/user_order' //数据接口
            , page: true //开启分页
            , limit: 10
            , toolbar: '#toolbarDemo'
            , cols: [[ //表头
                {type: 'checkbox', fixed: 'left'}//左边多选框
                , {field: 'orderid', title: 'ID', width: 160, sort: true, fixed: 'left',hide:true}
                , {field: 'orderstatus', title: '状态', width: 120, sort: true
                ,  templet:function (d) {
                        var info="",color = "";
                        switch (d.orderstatus) {
                            case 1:  info= '待付款';color = '#8FCDA0';break;
                            case 2:  info= '待商家确认';break;
                            case 3:  info= '待跑腿';break;
                            case 4:  info= '跑腿中';break;
                            case 5:  info= '自运送';color = '#fcc88a';break;
                            case 6:  info= '跑腿完成';color = '#fcc88a';break ;
                            case 7:  info= '待评价';color = '#eb7350';break ;
                            case 8:  info= '用户评价';break;
                            case 9:  info= '已完成';break;
                            case 10:  info= '顾客取消';break;
                            case 11:  info= '商家取消';break;
                       }
                       var html ="<span style='border-radius: 5px;background-color:"+color+"'>"+info+"</span>";
                        return html;
                    }
                }
                , {field: 'orderdetailnum', title: '数目', width: 80,sort: true}
                , {field: 'orderbegintime', title: '开始时间', width: 160, sort: true
                    ,templet:function (d) {
                        return getTime(d.orderbegintime);
                    }
                }
                , {field: 'orderallprice', title: '总价', width: 80, sort: true}
                , {field: 'orderseller', title: '卖家', width: 100}
                , {field: 'orderpayer', title: '买家', width: 100,hide:true}
                , {field: 'orderpaymethod', title: '支付方式', width: 100, sort: true}
                , {field: 'orderdiscount', title: '折扣', width: 80,sort: true}
                , {field: 'orderpaddress', title: '买家地址', width: 80,hide:true}
                , {field: 'ordersaddress', title: '卖家地址', width: 80 ,hide:true}
                , {field: 'orderoverTime', title: '结束时间', width: 80, sort: true  ,hide:true}
                , {field: 'orderother', title: '备注信息', width: 80,hide:true}
                , {fixed: 'right', width: 380, align: 'right',toolbar: '#barDemo'}//右边操作框
            ]]
        });
        //监听多选框
        table.on('checkbox(test)', function (obj) {
            console.log(obj)
        });
        //头工具栏事件
        table.on('toolbar(test)', function(obj){
            var checkStatus = table.checkStatus(obj.config.id);
            switch(obj.event){
                case 'getCheckData':
                    var data = checkStatus.data;
                    layer.alert(JSON.stringify(data));
                    break;
                case 'getCheckLength':
                    var data = checkStatus.data;
                    layer.msg('选中了：'+ data.length + ' 个');
                    break;
                case 'isAll':
                    layer.msg(checkStatus.isAll ? '全选': '未全选');
                    break;
            };
        });
        //监听工具条
        table.on('tool(test)', function (obj) {
            var data = obj.data;
            if (obj.event === 'detail') {
                localStorage.setItem("orderid",data.orderid);
                //layer.alert(data.orderid);
                x_admin_show("订单详情",'/user/user_info_orderItem_Detail',800 ,380);
            }
            if (obj.event === 'pay') {
                if (data.orderstatus == 1 || data.orderstatus == '1') {
                    PayNow(data.orderid);
                    console.log(data.orderstatus);
                }else
                {
                    layer.msg("这不是待支付的订单哦！",{icon:15,shade: 0.01});
                }
            }
            if (obj.event === 'sure') {
                if(data.orderstatus == 6 ||data.orderstatus =='6'
                    ||data.orderstatus == 5 ||data.orderstatus =='5'){
                    console.log(data.orderstatus);
                    SureOrder(data.orderid);
                }else
                {
                    layer.msg("这不是待确认收货的订单哦！",{icon:15,shade: 0.01});
                }
            }
            if (obj.event === 'cmt'){
                if (data.orderstatus == 7 || data.orderstatus == '7') {
                    console.log(data.orderstatus);
                    OrderCmt(data.orderid);
                }else
                {
                    layer.msg("这不是可以评论的订单哦！",{icon:15,shade: 0.01});
                }
            }
            if (obj.event === 'cancel') {
                if(data.orderstatus == 2 ||data.orderstatus =='2'
                    || data.orderstatus ==1 || data.orderstatus =="1") {
                    layer.confirm('真的取消订单么?', function(index){
                        obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                        layer.close(index);
                        //向服务端发送删除指令
                        Cancel(data.orderid);
                    });
                    console.log(obj);
                    console.log(data.orderstatus);
                }else
                {
                    layer.confirm('此订单商家已经接了呢！！！真的取消吗？', {
                        btn: ['确定取消','算了吧'] //按钮
                    }, function(){
                        var loading= layer.msg('操作中，请等待', {
                            icon: 16
                            ,shade: 0.01
                        });
                        setTimeout(function () {
                            layer.close(loading);
                            layer.msg('test操作成功！！！', {
                                icon: 16
                                ,shade: 0.01
                            });
                        },1000);
                    }, function(){

                    });

                }
            }
        });

        $("#search").on('click',function(){
            var orderStatus=$("#orderStatus option:selected");  //获取选中的项
            var orderMethod= $("#orderMethod option:selected");  //获取选中的项
            var status = orderStatus.val();
            var method = orderMethod.val();
            if(status == '' && method == '') {
                layer.alert("请选择筛选方式！");
                return;
            }
            else {
                var index = layer.msg("查询中,请稍后...",
                    {icon:16,
                        time:800,
                        shade:0});
                setTimeout(function () {
                    table.reload('demo', {
                        url: '/order//search_UserorderSituation'
                        , where:
                            {
                                status: status
                                , method: method
                            } //设定异步数据接口的额外参数
                        , page: {
                            curr: 1 //重新从第 1 页开始
                        }
                        //,height: 300
                    });
                    layer.close(index);
                },800);
            }
        });

    });

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

    function PayNow(orderid) {
        console.log("Paynow:"+orderid);
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
    function SureOrder(orderid) {
        console.log("SureOrder:"+orderid);
        layer.confirm('收到货了哇！', {
            btn: ['确定','取消'] //按钮
        }, function(){
            var loading= layer.msg('wait....', {
                icon: 16
                ,shade: 0.01
            });
            setTimeout(function () {
                layer.close(loading);
                AjaxSure(orderid);
            },1000);
        }, function(){

        });
    }
    function AjaxSure(orderid){
        $.ajax({
            url:"/user/userOrderSure"
            ,type:"POST"
            ,data:{orderid:orderid}
            ,success:function (data) {
                layer.msg("收货成功");
            }
        })
    }
    function OrderCmt(orderid) {
        console.log("SureOrder:"+orderid);
        layer.confirm('要进入评价页面吗？', {
            btn: ['当然','等一会'] //按钮
        }, function(){
            var loading= layer.msg('转入中', {
                icon: 16
                ,shade: 0.01
            });
            setTimeout(function () {
                layer.close(loading);
                localStorage.setItem("orderid",orderid);
                location.href ="/user/user_info_orderCmt";
            },1000);
        }, function(){

        });
    }

</script>

</body>
</html>
