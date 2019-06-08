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
                <option value="3">无效</option>
                <option value="4">待跑腿</option>
                <option value="5">跑腿中</option>
                <option value="6">自运送</option>
                <option value="7">确认收货</option>
                <option value="8">用户评价</option>
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
    <a class="layui-btn layui-btn-primary layui-btn-radius layui-btn-xs" lay-event="takeOrderWithWay">
        <i class="layui-icon layui-icon-add-1"></i>接单(叫跑腿)
    </a>
    <a class="layui-btn layui-btn-primary layui-btn-radius layui-btn-xs" lay-event="takeOrderWithSelf">
        <i class="layui-icon layui-icon-add-1"></i>自运送
    </a>
</script>


<script>
    layui.use(['table','form','layer'], function() {
        var table = layui.table;
        var form = layui.form;
        var layer = layui.layer;
        //第一个实例
        table.render({
            elem: '#demo'
            , height: 650
            , url: '/order/search_orderNear' //数据接口
            , page: true //开启分页
            , limit: 10
            , toolbar: '#toolbarDemo'
            , cols: [[ //表头
                {type: 'checkbox', fixed: 'left'}//左边多选框
                , {field: 'orderid', title: 'ID', width: 160, sort: true, fixed: 'left',hide:true}
                , {field: 'orderstatus', title: '状态', width: 80, sort: true
                    ,  templet:function (d) {
                        switch (d.orderstatus) {
                            case 1:  return '待付款';
                            case 2:  return '待商家确认';
                            case 3:  return '待跑腿';
                            case 4:  return '跑腿中';
                            case 5:  return '自运送';
                            case 6:  return '运送完成';
                            case 7:  return '确认收货';
                            case 8:  return '用户评价';
                            case 9:  return '已完成';
                            case 10:  return '顾客取消';
                            case 11:  return '商家取消';
                        }
                    }
                }
                , {field: 'orderdetailnum', title: '商品类型数', width: 80,sort: true}
                , {field: 'orderdiscount', title: '折扣', width: 80,sort: true}
                , {field: 'orderallprice', title: '总价', width: 80, sort: true}
                , {field: 'orderpayer', title: '买家', width: 100}
                , {field: 'orderpaymethod', title: '支付方式', width: 100, sort: true}
                , {field: 'orderbegintime', title: '开始时间', width: 160, sort: true
                    ,  templet:function (d) {
                            return d.orderbegintime/1000/3600;
                        }
                    }
                , {field: 'orderpaddress', title: '买家地址', width: 80,hide:true}
                , {field: 'ordersaddress', title: '卖家地址', width: 80 ,hide:true}
                , {field: 'orderoverTime', title: '结束时间', width: 80, sort: true  ,hide:true}
                , {field: 'orderseller', title: '卖家', width: 100,hide:true}
                , {field: 'orderother', title: '备注信息', width: 80,hide:true}
                , {fixed: 'right', width: 280, align: 'right',toolbar: '#barDemo'}//右边操作框
            ]]
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
                x_admin_show("订单详情",'/store/store_info_orderItem_Detail',850 ,500);
            }else if(obj.event === 'takeOrderWithSelf' )
            {//自运送为5
                takeOrder(data,5);
            }
            else if(obj.event === 'takeOrderWithWay' )
            {//待跑腿为 3
                takeOrder(data,3);
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
                    {icon:16,time:800,shade:0});
                setTimeout(function () {
                    table.reload('demo', {
                        url: '/order/search_orderSituation'
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

    function takeOrder(order,status)
    {
        $.ajax({
            url:'/order/order_Detail'
            ,type:'POST'
            ,data:{
                page:1
                ,limit:10
                ,orderid : order.orderid
            }
            ,success:function (table) {
                var data = table.data;
                var str1 = "<div ><div class=\"layui-card\"><div class=\"layui-card-header\">菜名 * 份数 </div><div class=\"layui-card-body\">";
                var str2 = "";
                for( var s=0;s<data.length;s++)
                {
                    str2 += s.goodsname + " * " + s.ordergnumd +"<hr>";
                }
                var str3 = " </div><div class=\"layui-card-body\">";
                var str4 = " 收货地址  ： "+order.orderpaddress;
                var str5 = "</div></div></div>";
                var context = str1+str2+str3+str4+str5;
                showDetail(context,order.orderid,status) ;
            }
        })
    }
    function showDetail(context,orderid,status)  {
        console.log("id:"+orderid+"\nstatus:"+status);
        layer.open({
            type: 1
            ,title: ['确认接单', 'font-size:18px;']
            ,shadeClose:true
            ,closeBtn: false
            ,area: ['600px', '360px']
            ,shade: 0.8
            ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
            ,resize: false
            ,btn: ['接单']
            ,yes: function(index, layero){
                $.ajax({
                    type:"POST"
                    ,url:"/order/acquire_Order"
                    ,data:{orderid:orderid,status:status}
                    ,success:function (ret) {
                        if(ret=="success")
                            layer.alert("接单成功");
                        else
                            layer.alert("失败！");
                    }
                    ,error:function () {
                        layer.alert("error");
                    }
                })
            }
            ,btnAlign: 'c'
            ,moveType: 1 //拖拽模式，0或者1
            ,content: context
            ,success: function(layero){
                var btn = layero.find('.layui-layer-btn');
                console.log("chenggongle")
            }
        });
    }

</script>

</body>
</html>
