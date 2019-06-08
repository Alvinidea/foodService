<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/5/17
  Time: 10:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>商铺管理</title>
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
            <div class="layui-input-inline">
                <select name="type" id="status" lay-verify="status">
                    <option value="-1">跑腿状态</option>
                    <option value="1">已接单</option>
                    <option value="2">已完成</option>
                </select>
            </div>
            <input type="text" id="deliver" name="deliver" lay-verify="deliver"
                   placeholder="运送者ID" autocomplete="off" class="layui-input">
            <input type="text" id="storeid" name="storeid" lay-verify="storeid"
                   placeholder="商铺ID" autocomplete="off" class="layui-input">
            <input type="text" id="userid" name="userid" lay-verify="userid"
                   placeholder="买家ID" autocomplete="off" class="layui-input">
            <input type="text" id="saddress" name="saddress" lay-verify="saddress"
                   placeholder="商铺地址" autocomplete="off" class="layui-input">
            <input type="text" id="paddress" name="paddress" lay-verify="paddress"
                   placeholder="买家地址" autocomplete="off" class="layui-input">
            <div class="layui-btn"  lay-submit="" lay-filter="search" id="search">
                <i class="layui-icon">&#xe615;</i>
            </div>
            <button class="layui-btn" type="reset" lay-submit="" lay-filter="search" >RESET</button>
        </form>
    </div>
    <xblock>
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
        <script type="text/html" id="toolbarDemo">
            <div class="layui-btn-container">
                <button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
                <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
                <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
            </div>
        </script>
    </xblock>

    <table id="demo" lay-filter="test" class="layui-hide"></table>
</div>

<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-primary layui-btn-radius layui-btn-xs"
       lay-event="deliver"><i class="layui-icon">&#xe60a;</i>deliver</a>
    <a class="layui-btn layui-btn-primary layui-btn-radius layui-btn-xs"
       lay-event="detail"><i class="layui-icon">&#xe60a;</i>查看</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs layui-btn-radius"
       lay-event="del"><i class="layui-icon">&#xe640;</i>删除</a>

</script>
<script type="application/javascript" src="/js/checkInput.js"></script>
<script>
    layui.use(['table','form'], function() {
        var table = layui.table;
        var form = layui.form;
        //第一个实例
        table.render({
            elem: '#demo'
            , id:'testDemo'
            , height: 530
            , url: '/admin/way/getWayList' //数据接口
            , page: true //开启分页
            , limit: 10
            ,where:{
                deliver:"",
                userid:"", storeid:"",
                paddress:"", saddress:"",
                status:-1
            }
            , toolbar: '#toolbarDemo'
            , cols: [[ //表头
                {type: 'checkbox', fixed: 'left'},//左边多选框
                {field: 'id', title: 'ID', width: 40}
                , {field: 'deliver', title: '运送者', width: 90, sort: true}
                , {field: 'price', title: '价格', width: 60}
                , {field: 'status', title: '跑腿状态', width: 80
                    , templet:function (d) {
                    if(d.status == 1)
                        return "<span style=\"color: #eb7350\">跑腿中</span>";
                    else
                        return "<span style=\"color: #CC0000\">已完成</span>"
                }}
                , {field: 'ordersaddress', title: '发货地址', width: 160}
                , {field: 'orderpaddress', title: '收货地址', width: 160}
                , {field: 'username', title: '买家', width: 120}
                , {field: 'storename', title: '商家', width: 120}
                , {field: 'overtime', title: '结束时间', width: 80
                , templet:function (d) {
                        return getTime(d.overtime);
                    }}
                , {field: 'begintime', title: '开始时间', width: 120
                    , templet:function (d) {
                        return getTime(d.begintime);
                    }}
                , {field: 'other', title: '备注', width: 200}
                , {field: 'orderid', title: '订单ID', width: 180,hide:true}
                , {field: 'userphone', title: 'Pay Phone', width: 60,hide:true}
                , {field: 'storephone', title: 'Sell Phone', width: 60,sort: true,hide:true}
                , {field: 'storetype', title: '商铺类型', width: 60,hide:true}
                , {field: 'orderother', title: '订单备注', width: 60,hide:true}
                , {field: 'payercmt', title: '买家评论', width: 60,hide:true}
                , {field: 'sellercmt', title: '商家评论', width: 60,hide:true}
                , {field: 'star', title: '星级', width: 60, sort: true,hide:true}
                , {fixed: 'right', width: 260, align: 'right', toolbar: '#barDemo'}//右边操作框
            ]]
            ,done:function () {
                hoverOpenImg();
                //鼠标悬停放大显示内容
                //hoverOpenContext();
            }
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

            }
            else if (obj.event === 'deliver') {
                showDeliver(data.deliver);
            }
            else if (obj.event === 'del') {
                layer.confirm('真的删除么', function (index) {
                    dbdel(data.userid, 'userid');
                    layer.close(index);
                    obj.del();
                });
            }
        });

        $("#search").on('click',function(){
            var itype = $('#status option:selected').val();
            var status = parseInt(itype);
            var deliver=$('#deliver').val();
            var userid = $('#nameid').val();
            var storeid=$('#storeid').val();
            var paddress=$('#paddress').val();
            var saddress=$('#saddress').val();

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
                        deliver:deliver,
                        userid:userid, storeid:storeid,
                        paddress:paddress,
                        saddress:saddress,
                        status:status
                    }
                    ,page: {
                        curr: 1 //重新从第 1 页开始
                    }
                });
            },1000);

        });
        //监听搜索框
        /* form.on('submit(search)', function (obj) {
            if($("#type").value == 0 || $("#type").value == '0') {
                layer.msg('请选择查询方式!', {icon: 5, time: 1000});
                return;
            }
            layer.msg('请选择查询方式!', {icon: 5, time: 1000});

        });
        */
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
    //鼠标悬停放大显示内容

    function showDeliver(userid) {
        $.ajax({
            url:"/admin/way/getVUser"
            ,type:"POST"
            ,data:{userid:userid}
            ,success:function (data) {
                info = "<div class=\"layui-card\">" +
                    "  <div class=\"layui-card-header\">小哥ID：userid</div>" +
                    "  <div class=\"layui-card-body\">"+
                    "<div>  头像：<img src='" +
                    data.userphotod +
                    "' style=\"width: 80px;height: 90px;border-radius: 8px;\"><br>" +
                    "    ID：" +
                    data.userid +
                    "<br>" +
                    "    名字：" +
                    data.username +
                    "<br>" +
                    "    状态： " +
                    data.userstatus +
                    "<br>" +
                    "    联系方式：" +
                    data.userphone +
                    "<br>" +
                    "    地址：" +
                    data.useraddress +
                    "<br>" +
                    "    年龄：" +
                    data.useraged +
                    "<br>" +
                    "    性别：" +
                    data.usersexd +
                    " </div>" +
                    "  </div>" +
                    "</div>     ";
                //页面层-自定义

                layer.open({
                    type: 1,
                    title: false,
                    closeBtn: 0,
                    area: ['300px', '350px'],
                    shadeClose: true,
                    skin: 'yourclass',
                    content: info
                });
            }
        });
    }
    function hoverOpenContext() {
        var img_show = null; // tips提示
        var info ;
        $('td[data-field*="deliver"] div').hover(function () {
            var userid = $(this).text();
            $.ajax({
                url:"/admin/way/getVUser"
                ,type:"POST"
                ,data:{userid:userid}
                ,success:function (data) {
                    info = " <div>  头像：<img src='" +
                        data.userphotod +
                        "' style=\"width: 80px;height: 90px;border-radius: 8px;\"><br>\n" +
                        "    ID：<div>" +
                        data.userid +
                        "</div><br>" +
                        "    名字：<div>" +
                        data.username +
                        "</div><br>" +
                        "    状态： <div>" +
                        data.userstatus +
                        "</div><br>" +
                        "    联系方式:<div>" +
                        data.userphone +
                        "</div><br>" +
                        "    地址:<div>" +
                        data.useraddress +
                        "</div><br>" +
                        "    年龄：<div>" +
                        data.useraged +
                        "</div><br>" +
                        "    性别：<div>" +
                        data.usersexd +
                        "</div> </div>  ";
                    }
            });
            setTimeout(function () {
                var kd2 = 300;       //图片放大倍数
                img_show = layer.tips(info , this, {
                    tips: [2, 'rgba(41,41,41,.5)']
                    , area: [kd2 + 'px']
                });
            },100);
            setTimeout(function () {
                layer.close(img_show);
            },3000);

        }, function () {
            layer.close(img_show);
        });
        //$('td img').attr('style', 'max-width:70px;display:block!important');
    }
</script>
</body>
</html>

