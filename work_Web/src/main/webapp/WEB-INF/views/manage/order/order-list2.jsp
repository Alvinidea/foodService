<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/2
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>订单页</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="stylesheet" href="../../../../css/font.css">
    <link rel="stylesheet" href="../../../../css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="../../../../lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="../../../../js/xadmin.js"></script>
    <script type="text/javascript" src="../../../../js/cookie.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a>
          <cite>导航元素</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<div class="x-body">
    <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so">
            <input class="layui-input" placeholder="开始日"  id="start">
            <input class="layui-input" placeholder="截止日"  id="end">
            <div class="layui-input-inline">
                <select name="contrller" id="method">
                    <option value="">支付方式</option>
                    <option value="支付宝">支付宝</option>
                    <option value="微信">微信</option>
                    <option value="校园通">校园通</option>
                    <option value="货到付款">货到付款</option>
                </select>
            </div>
            <div class="layui-input-inline">
                <select name="contrller" id="status">
                    <option value="-1">订单状态</option>
                    <option value="1">待付款</option>
                    <option value="2">待确认</option>
                    <option value="3">待发货</option>
                    <option value="4">待收货</option>
                    <option value="5">待评价</option>
                    <option value="6">已完成</option>
                    <option value="7">买家申请取消</option>
                    <option value="8">卖家申请取消</option>
                    <option value="9">已取消</option>
                </select>
            </div>
            <input type="text" id="payer"  placeholder="买家ID" autocomplete="off" class="layui-input">
            <input type="text" id="seller"  placeholder="卖家ID" autocomplete="off" class="layui-input">
            <input type="text" id="orderid"  placeholder="请输入订单号" autocomplete="off" class="layui-input" style="width: 280px">
            <div class="layui-btn"  lay-submit="" lay-filter="search" id="search"><i class="layui-icon">&#xe615;</i></div>
            <button class="layui-btn" type="reset" lay-submit="" lay-filter="search" >RESET</button>
        </form>
    </div>
    <xblock>
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>

    </xblock>
    <table id="demo" lay-filter="test" class="layui-hide"></table>
</div>
<script type="text/html" id="toolbarDemo">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
        <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
        <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
    </div>
</script>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-xs" lay-event="detail">详情</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script src="/js/DateUtil.js"></script>
<script>
    layui.use(['table','form'], function() {
        var table = layui.table;
        var form = layui.form;
        //第一个实例
        table.render({
            elem: '#demo'
            ,id:"testDemo"
            , height: 525
            , url: '/admin/order/getOrderList' //数据接口
            , page: true //开启分页
            , limit: 10
            ,  where: { //设定异步数据接口的额外参数，任意设
                payerid:"", payername:"",
                sellerid:"",sellername:"",
                orderid:"",method:"",status:-1
            }
            , toolbar: '#toolbarDemo'
            , cols: [[ //表头
                {type: 'checkbox', fixed: 'left'}//左边多选框
                , {field: 'orderid', title: 'ID', width: 230, sort: true, fixed: 'left'}
                , {field: 'orderseller', title: '卖家', width: 100}
                , {field: 'orderpayer', title: '买家', width: 100}
                , {field: 'orderdetailnum', title: '数目', width: 80,sort: true}
                , {field: 'orderdiscount', title: '商品折扣', width: 120,sort: true}
                , {field: 'orderallprice', title: '总价', width: 80, sort: true}
                , {field: 'orderstatus', title: '订单状态', width: 120, sort: true
                    ,  templet:function (d) {
                        switch (d.orderstatus) {
                            case 1:  return '待付款';
                            case 2:  return '待确认';
                            case 3:  return '待发货';
                            case 4:  return '待收货';
                            case 5:  return '待评价';
                            case 6:  return '已完成';
                            case 7:  return '买家申请取消';
                            case 8:  return '卖家申请取消';
                            case 9:  return '已取消';
                        }
                    }
                }
                , {field: 'orderpaymethod', title: '支付方式', width: 100, sort: true}
                , {field: 'orderbegintime', title: '开始时间', width: 160, sort: true
                ,templet:function (d) {
                        return getTime(d.orderbegintime);
                    }}
                , {field: 'ordersaddress', title: '卖家地址', width: 80,hide:true}
                , {field: 'orderpaddress', title: '买家地址', width: 80,hide:true}
                , {field: 'orderoverTime', title: '结束时间', width: 80, sort: true,hide:true
                        ,templet:function (d) {
                        console.log(d);
                            return getTime(d.orderbegintime);
                        }}
                , {field: 'orderother', title: '备注信息', width: 80,hide:true}
                , {fixed: 'right', width: 150, align: 'right',toolbar: '#barDemo'}//右边操作框
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
            if (obj.event === 'del') {
                layer.confirm('真的删除行么', function (index) {
                    //dbdel(data.orderid, 'orderid');
                    layer.close(index);
                    obj.del();
                });
            }
            else if(obj.event === 'detail')
            {
                localStorage.setItem("orderid",data.orderid);
                    //layer.alert(data.orderid);
                x_admin_show("订单详情",'/store/store_info_orderItem_Detail',800 ,500);
            }
        });

        $("#search").on('click',function(){
            var method = $('#method option:selected').val();
            var status = $('#status option:selected').val();
            var intstatus = parseInt(status);
            var start = $('#start').val();
            var end = $('#end').val();
            var payerid= $('#payer').val();
            var sellerid= $('#seller').val();
            var sellername= $('#seller').val();
            var payername= $('#payer').val();
            var orderid = $('#orderid').val();
            /*
            if(type == "" && key=="" && user=="" && intstatus == -1)
            {
                layer.msg("您没有选择条件呢！",{icon:15,shade:0.01,time:800});
                return ;
            }
            */
            var loading = layer.msg("查询中。。。",{icon:16,shade:0.02});
            setTimeout(function () {
                layer.close(loading);
                table.reload('testDemo', {
                    where: { //设定异步数据接口的额外参数，任意设
                        payerid:payerid, payername:"",
                        sellerid:sellerid,sellername:"",
                        orderid:orderid,method:method,status:intstatus
                    }
                    ,page: {
                        curr: 1 //重新从第 1 页开始
                    }
                });
            },1000);

        });
    });

    function dbdel(uid,utype) {
        $.ajax({
            type: "POST"
            ,url: "/admin/mem/member_del_op"
            ,data: {id:uid,type:utype}
            ,success: function (data) {
                if(data == 'success')
                    layer.alert(uid+"删除成功！！！");
                else
                    layer.alert(uid+"删除失败！！！");
            },
            error:function () {
                layer.alert(uid+"错误！！！");
            }
        })
    }
    function delAll (argument) {
        var data = tableCheck.getData();
        layer.confirm('确认要删除吗？'+data,function(index){
            //捉到所有被选中的，发异步进行删除
            layer.msg('删除成功', {icon: 1});
            $(".layui-form-checked").not('.header').parents('tr').remove();
        });
    }

</script>
</body>
</html>
