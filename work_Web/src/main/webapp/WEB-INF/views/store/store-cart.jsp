<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/9
  Time: 12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>post </title>
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
<div class="container">
    <div class="layui-card">
        <div class="layui-card-header">地址信息设置</div>
        <div class="layui-card-body">
            <form class="layui-form" action="">
                <div class="layui-form-item">
                    <div class="layui-input-inline">
                        <input id="isDefaultAddress" onclick="address_op()" type="button"
                               class="layui-btn layui-btn-radius layui-btn-primary"
                               value="使用默认地址（市/县/区 -- 具体位置）">
                    </div>
                    <div id="newAddress" class="layui-input-inline">
                        <div class="layui-input-inline" style="width: 150%">
                            <input type="text" name="address" id="address" autocomplete="off" placeholder="请输入地址" class="layui-input layui-btn-radius">
                        </div>
                    </div>
                </div>

            </form>
        </div>
    </div>
    <script type="text/html" id="toolbarDemo">
        <div class="layui-btn-container">
        </div>
    </script>
    <script type="text/html" id="barDemo">
        <a lay-event="reduce"><i class="layui-icon layui-icon-down"></i></a>
        <a lay-event="add"><i class="layui-icon layui-icon-up"></i></a>
        <a  lay-event="del">
            <i class="layui-icon layui-icon-close-fill"></i>
        </a>
    </script>

    <div class="container">
        <table id="demo" lay-filter="test" class="layui-hide"></table>
        <div style="margin-left: 50px">
            共计： ￥ <span id="SUM_Price" style="color: red;font-size: large"></span> 元
        </div>
        <div class="layui-card">
            <div class="layui-card-body">
                <div class="layui-form-item">
                    <div class="layui-input-inline" style="width: 80%">
                        <input type="text" name="orderOther" id="orderOther"
                               autocomplete="off" placeholder="请输入备注" class="layui-input layui-btn-radius">
                    </div>
                </div>
            </div>
        </div>
        <div>
            <button id="createOrder" class="layui-btn layui-btn-normal layui-btn-radius"
                    style="width: 100%">添加订单</button>
        </div>
    </div>
</div>
<span style="color: #df5000"></span>
<script>
    layui.use(['element','table'],function () {
        //从商品页面传来的
        var allgoodsid = localStorage.getItem("cartData");

        var table = layui.table;
        var element = layui.elements;

        var sum_price = 0;
        table.render({
            elem: '#demo'
            , height: 260
            , url: '/store/cart_data' //数据接口
            , where:{goodsid:allgoodsid}
            //, page: true //开启分页
            , limit: 10
            ,title:"购物车"
            , cols: [[ //表头
                {field: 'cartid', title: 'ID', width: 80, sort: true, fixed: 'left',hide:true}
                , {field: 'cartgoodsid', title: '商品ID', width: 80,hide:true}
                , {field: 'goodsname', title: '商品名称', width: 183}
                , {
                    field: 'goodspic', title: '图片', width: 80
                    , templet: function (d) {
                        return "<img src=\'" + d.goodspic + "\'style='width: 30px;height: 30px' />";
                    }
                }
                , {field: 'goodsnum', title: '数量', width: 70, sort: true
                    , templet: function (d) {
                         return "<span style=\"color: #df5000\">" +
                             d.goodsnum
                             +"</span>";
                    }}
                , {field: 'cartpayer', title: '购买者', width: 200, sort: true,hide:true}
                , {field: 'cartseller', title: '卖家', width: 100,hide:true}
                , {field: 'cartprice', title: '单价', width: 100
                    , templet: function (d) {
                        sum_price = sum_price + d.cartprice*d.goodsnum;
                        return d.cartprice ;
                    }}
                , {field: 'carttotalprice', title: '总价', width: 120}
                , {fixed: 'right', width: 90, align: 'right', toolbar: '#barDemo'}//右边操作框
            ]]
            ,done:function () {
                hoverOpenImg();
                $("#SUM_Price").text(sum_price);
            }
        });
        //监听工具条
        table.on('tool(test)', function (obj) {
            var data = obj.data;
            //计算所有价格
            var tempprice = data.goodsnum*parseInt(data.cartprice);

            var allprice = 0,num = 0;
            if (obj.event === 'add') {
                num  = data.goodsnum + 1;
                allprice =  num * parseInt(data.cartprice);
                sum_price = sum_price+parseInt(data.cartprice);
            }
            else if (obj.event === 'reduce') {
                if( data.goodsnum == 1 || data.goodsnum == '1') {
                    layer.confirm('这个不错的哦！真的不吃这个么？', function (index) {
                        sum_price = sum_price - parseInt(data.cartprice);
                        //从cookie中删除
                        //layer.alert(localStorage.getItem("cartData"));
                        delFromCart(data.cartgoodsid);
                        //layer.alert(localStorage.getItem("cartData"));
                        //从表格中删除
                        layer.close(index);

                        obj.del();
                    });
                }
                else
                {
                    num  = data.goodsnum - 1;
                    allprice =  num * parseInt(data.cartprice);

                    sum_price = sum_price-parseInt(data.cartprice);
                }
                //layer.alert("reduce"+data.goodsnum);
            }
            else if (obj.event === 'del') {
                layer.confirm('真的删除行么', function (index) {
                    sum_price = sum_price-parseInt(data.cartprice)*data.goodsnum;
                    //从cookie中删除
                    delFromCart(data.cartgoodsid);
                    //从表格中删除
                    layer.close(index);
                    obj.del();
                });
            }
            //刷新数据
            obj.update({
                goodsnum:num
                ,carttotalprice: allprice
            })
            $("#SUM_Price").text(sum_price);
        });
        //cookie中删除
        function delFromCart(goodsid) {
            //allgoodsid是从localStorge中取出来的 localStorge中存放的是用逗号分隔的串
            var list = localStorage.getItem("cartData").split(',');
            console.log(localStorage.getItem("cartData"));
            var len = list.length;
            for(var t=0;t<len ;t++)
            {
                if(list[t] == goodsid)
                    list.splice(t,1);
            }
            //allgoodsid = list.join(',');
            localStorage.setItem("cartData",list);
            console.log(localStorage.getItem("cartData"));
        }
        //地址操作
        $('#isDefaultAddress').on('change',function () {
            address_op();
        });
        //判断是否默认地址
        address_op();
        
        $("#createOrder").on('click',function () {
            var address;
            if ($('#isDefaultAddress').val() == '使用默认地址')
                address = "";
            else
                address = $('#newAddress').val();
            //console.log(table.cache.demo);
            var orderOther = $('#orderOther').val();
            var info = paramOp(table.cache.demo);
            $.ajax({
                type:"post"
                ,url:"/order/create_order"
                ,data:{
                    cart:info
                    ,address:address
                    ,orderOther:orderOther
                }
                ,success:function (data) {
                    var loading= layer.msg('下单成功 ! 正在进入付款页面', {
                        icon: 16
                        ,shade: 0.01
                    });
                    setTimeout(function () {
                        layer.close(loading);
                        localStorage.setItem("orderid",data);
                        location.href ="/user/user_info_orderPayMethod";
                        //localStorage.setItem("IntoUserWaitPayFromCart","true");
                        //location.href = "/user/user_info_orderPay";
                    },3000);
                }
                ,error:function () {
                    layer.alert("error！");
                }
            })
        });


    });
    function paramOp(data) {
        var str = "";
        var i;
        //前后端 需要对应
        for(i=0;i< data.length-1;  i=i+1)
        {
            str = str+ data[i].cartgoodsid+',';
            str = str+ data[i].goodsname+',';
            str = str+ data[i].cartpayer+',';
            str = str+ data[i].cartseller+',';
            str = str+ data[i].goodsnum+',';
        }
        str = str + data[i].cartgoodsid+',';
        str = str+ data[i].goodsname+',';
        str = str+ data[i].cartpayer+',';
        str = str+ data[i].cartseller+',';
        str = str+ data[i].goodsnum;
        return str;
    }
    function address_op(init) {
        if ($('#isDefaultAddress').val() == '使用默认地址') {
            if ($('#newAddress').is(':hidden') == true) {
                alert("隐藏了");
            } else {
                $('#newAddress').hide();
            }
            $('#isDefaultAddress').val("重设地址");
        } else {
            $('#newAddress').show();
            $('#isDefaultAddress').val("使用默认地址");
        }
    }
    function hoverOpenImg() {
        var img_show = null; // tips提示
        $('td img').hover(function () {
            var kd = $(this).width();
            kd1 = kd * 5;          //图片放大倍数
            kd2 = kd * 5 + 30;       //图片放大倍数
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
