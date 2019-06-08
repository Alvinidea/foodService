<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/14
  Time: 9:05
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
</script>


<script>
    layui.use(['table','form','layer'], function() {
        var table = layui.table;
        var form = layui.form;
        var layer = layui.layer;
        //获取上一页的传来的订单id
        var orderid = localStorage.getItem('orderid');
        localStorage.removeItem('orderid');
        //第一个实例
        table.render({
            elem: '#demo'
            , height: 300
            , url: '/order/order_Detail' //数据接口
            //, page: true //开启分页
            , limit: 10
            , where:{orderid:orderid}
            //, toolbar: '#toolbarDemo'
            , cols: [[ //表头
                {field: 'goodspic', title: '图片', width: 80 ,templet: function (d) {
                        return "<img src=\'"+d.goodspic+"\'style='width: 30px;height: 30px' />";
                    }
                }
                , {field: 'goodsname', title: '商品名称', width: 180, sort: true}
                , {field: 'ordergnumd', title: '数目', width: 80, sort: true}
                , {field: 'orderdother', title: '备注', width: 160, sort: true}
                , {field: 'orderpriced', title: '单价', width: 80,sort: true}
                , {field: 'orderdiscountd', title: '折扣', width: 100}
                , {field: 'orderid', title: '订单ID', width: 80,sort: true,hide:true}
                , {field: 'orderidd', title: 'ID', width: 160, sort: true,hide:true}
                , {field: 'goodsid', title: '商品ID', width: 80, sort: true,hide:true}
                , {field: 'orderallpriced', title: '总价', width: 100, sort: true}
                //, {fixed: 'right', width: 90, align: 'right',toolbar: '#barDemo'}//右边操作框
            ]]
            , done: function (res, curr, count) {
                //鼠标悬停放大图片
                hoverOpenImg();
            }
        });
        //监听工具条

    });

    function showDetail(data) {
        layer.open({
            type: 1
            ,title: false //不显示标题栏
            ,closeBtn: false
            ,area: '300px;'
            ,shade: 0.8
            ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
            ,resize: false
            ,btn: ['OK']
            ,btnAlign: 'c'
            ,moveType: 1 //拖拽模式，0或者1
            ,content: '    <div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">\n' +
                '        <div>头像：<br>'+ data.goodspic+'</div>' +
                '        <div>ID  ：<br>'+ data.goodsid + '</div>' +
                '        <div>商品名：<br>'+ data.goodsname+ '</div>' +
                '        <div>价格：<br>'+ data.goodsprice+ '</div>' +
                '        <div>折扣：<br> '+data.goodsdiscount+ '</div>' +
                '        <div>评论数：<br>'+ data.goodscmtnum+ '</div>' +
                '        <div>卖家：<br>'+ data.goodsseller+ '</div>' +
                '        <div>星级：<br> '+data.goodsstars+ '</div>' +
                '        <div>备注信息：<br>'+ data.goodsother+ '</div>' +
                '    </div>'
            ,success: function(layero){
                var btn = layero.find('.layui-layer-btn');
            }
        });
    }

    //鼠标悬停放大图片
    function hoverOpenImg() {
        var img_show = null; // tips提示
        $('td img').hover(function () {
            var kd = $(this).width();
            kd1 = kd * 3;          //图片放大倍数
            kd2 = kd * 3 + 30;       //图片放大倍数
            var img = "<img class='img_msg' src='" + $(this).attr('src') + "' style='width:" + kd1 + "px;' />";
            img_show = layer.tips(img, this, {
                tips: [2, 'rgba(41,41,41,.5)']
                , area: [kd2 + 'px']
            });
        }, function () {
            layer.close(img_show);
        });
        //$('td img').attr('style', 'max-width:70px;display:block!important');
    }

</script>

</body>
</html>
