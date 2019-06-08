<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/25
  Time: 21:12
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
        <form  class="layui-form layui-col-md12 x-so">
            <div class="layui-inline">
                <input type="text" id="goodsid" name="goodsid" lay-verify="goodsid"
                                    placeholder="菜品ID" autocomplete="off" class="layui-input">
                <input type="text" id="goodsname" name="goodsname" lay-verify="goodsname"
                       placeholder="菜品名称" autocomplete="off" class="layui-input">
                <div class="layui-btn"  lay-submit="" lay-filter="search" id="search">
                    <i class="layui-icon">&#xe615;</i>
                </div>
                <button class="layui-btn" type="reset" lay-submit="" lay-filter="search" >RESET</button>
            </div>
        </form>
    </div>
    <xblock>
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
        <button class="layui-btn" onclick="x_admin_show('添加用户','../../admin/mem/member_add',600,350)">
            <i class="layui-icon"></i>添加</button>
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
    <a class="layui-btn layui-btn-primary layui-btn-radius layui-btn-xs" lay-event="detail"><i class="layui-icon">&#xe60a;</i>查看</a>
    <a class="layui-btn layui-btn-normal layui-btn-xs layui-btn-radius" lay-event="edit"><i class="layui-icon">&#xe642;</i>编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs layui-btn-radius" lay-event="del"><i class="layui-icon">&#xe640;</i>删除</a>
    <a class="layui-btn layui-btn-sm layui-btn-radius layui-btn-xs layui-btn-radius" lay-event="isuse">
        <i class="layui-icon">&#xe608;</i> 启用
    </a>
</script>

<script>
    layui.use(['table','form'], function() {
        var table = layui.table;
        var form = layui.form;
        //第一个实例
        var storeid = localStorage.getItem("admin_storeid");
        localStorage.removeItem("admin_storeid")
        if(storeid == null ||storeid == "" || storeid==undefined)
        {
            storeid="";
        }
        table.render({
            elem: '#demo'
            ,id:"testDemo"
            , height: 560
            , url: '/admin/store/getGoodsList' //数据接口
            , page: true //开启分页
            , limit: 10
            , where:{
                storeid:storeid,
                goodsid:"",
                goodsname:""
            }
            , toolbar: '#toolbarDemo'
            , cols: [[ //表头
                {type: 'checkbox', fixed: 'left'},//左边多选框
                {field: 'goodsid', title: 'ID', width: 80, sort: true, fixed: 'left'}

                , {field: 'goodspic', title: '图片', width: 60
                    ,  templet:function (d) {
                        return "<img src=\'"+d.goodspic+"\'style='width: 30px;height: 30px' />";
                    }}
                , {field: 'goodsname', title: '商品名', width: 150}
                , {field: 'goodsprice', title: '单价', width: 80, sort: true}
                , {field: 'goodsdiscount', title: '折扣', width: 100, sort: true}
                , {field: 'goodscmtnum', title: '评论数', width: 100, sort: true}
                , {field: 'goodsstars', title: '星级', width: 80, sort: true}
                , {field: 'goodsother', title: '备注', width: 120, sort: true}
                , {field: 'storename', title: '店名', width: 120, sort: true}
                , {field: 'storetype', title: '商店类型', width: 120}
                , {field: 'goodsseller', title: '卖家ID', width: 160, sort: true,hide:true}
                , {field: 'storeaddress', title: '地址', width: 120,hide:true}
                , {fixed: 'right', width: 320, align: 'right', toolbar: '#barDemo'}//右边操作框
            ]]
            ,done:function () {
                hoverOpenImg();
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
                x_admin_show('编辑', '../../admin/store/store_add', 600, 350);
            } else if (obj.event === 'del') {
                layer.confirm('真的删除行么', function (index) {
                    dbdel(data.userid, 'userid');
                    layer.close(index);
                    obj.del();
                });
            } else if (obj.event === 'edit') {//编辑信息
                localStorage.setItem("userid",data.userid);
                x_admin_show('编辑信息', '../../admin/store/store_password', 500, 620);
            } else if (obj.event === 'isuse') {
                if (data.userstatus === 0 || data.userstatus === '0') {
                    obj.update({userstatus: '1'});
                    $(obj).attr('title','启用')
                    $(obj).find('i').html('&#xe601;');
                    $(obj).parents("tr").find(".td-status").find('span').removeClass('layui-btn-disabled').html('已启用');
                    layer.msg(data.userid + '已启用!',{icon: 6,time:1000});
                }
                else {
                    obj.update({userstatus: '0'});
                    //发异步把用户状态进行更改
                    $(obj).attr('title','停用')
                    $(obj).find('i').html('&#xe62f;');
                    $(obj).parents("tr").find(".td-status").find('span').addClass('layui-btn-disabled').html('已停用');
                    layer.msg(data.userid+ '已停用!',{icon: 5,time:1000});
                }
            }
        });

        $("#search").on('click',function(){
            var goodsname= $('#goodsname').val();
            var goodsid= $('#goodsid').val();
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
                        storeid:storeid,
                        goodsid:goodsid,
                        goodsname:goodsname
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
</script>
</body>
</html>

