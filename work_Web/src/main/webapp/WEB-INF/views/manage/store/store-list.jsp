<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/2
  Time: 19:22
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
                <select name="type" id="type" lay-verify="type">
                    <option value="-1">商铺类型</option>
                    <option value="11">食堂</option>
                    <option value="12">小店</option>
                </select>
            </div>
            <input type="text" id="nameid" name="nameid" lay-verify="nameid"
                   placeholder="商铺名称 | ID" autocomplete="off" class="layui-input">
            <input type="text" id="address" name="address" lay-verify="address"
                   placeholder="商铺地址" autocomplete="off" class="layui-input">
            <div class="layui-btn"  lay-submit="" lay-filter="search" id="search">
                <i class="layui-icon">&#xe615;</i>
            </div>
            <button class="layui-btn" type="reset" lay-submit="" lay-filter="search" >RESET</button>
        </form>
    </div>
    <xblock>
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
        <button class="layui-btn" onclick="x_admin_show('添加商铺','/admin/store/store_add',600,420)">
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
<script type="application/javascript" src="/js/checkInput.js"></script>
<script src="/js/DateUtil.js"></script>
<script>
    layui.use(['table','form'], function() {
        var table = layui.table;
        var form = layui.form;
        //第一个实例
        table.render({
            elem: '#demo'
            , id:'testDemo'
            , height: 525
            , url: '/admin/store/getStoreList' //数据接口
            , page: true //开启分页
            , limit: 10
            ,where:{
                storeid:"", storename:"",
                address:"",type:-1,
            }
            , toolbar: '#toolbarDemo'
            , cols: [[ //表头
                {type: 'checkbox', fixed: 'left'},//左边多选框
                ,{field: 'storepicture', title: '图片', width: 60
                    ,  templet:function (d) {
                        return "<img src=\'"+d.storepicture+"\'style='width: 30px;height: 30px' />";
                    }}
                ,{field: 'storeid', title: 'ID', width: 80,hide:true}
                , {field: 'storename', title: '店名', width: 160, sort: true}
                , {field: 'storeaddress', title: '地址', width: 200}
                , {field: 'storephone', title: '电话号码', width: 100}
                , {field: 'storetype', title: '类型', width: 80
                    ,  templet:function (d) {
                            if(d.storetype == 11) {
                                return "<span style=\"color: #df5000\">食堂</span>";
                            } else if(d.storetype == 12){
                                return "<span style=\"color: #27A9E3\">小店</span>";
                            }
                    }}
                , {field: 'storeapplytime', title: 'applyTime', width: 120
                    ,  templet:function (d) {
                        return getTime(d.storeapplytime);
                    }}
                , {field: 'storecmtnum', title: '评论', width: 60, sort: true}
                , {field: 'storeaverprice', title: '消费', width: 60, sort: true}
                , {field: 'storelevel', title: 'Star', width: 60, sort: true}
                , {field: 'storeiswork', title: '营业', width: 60, sort: true                    ,  templet:function (d) {
                        if(d.storeiswork == 1) {
                            return "<span style=\"color: #df5000\">是</span>";
                        }else if(d.storeiswork == 0){
                            return "<span style=\"color: #27A9E3\">否</span>";
                        }
                    }}
                , {field: 'storeownerId', title: '所属用户', width: 60,hide:true}
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
                localStorage.setItem("admin_storeid",data.storeid);
                x_admin_show('菜品信息', '/admin/store/goods_list', 1200, 820);
            }
            else if (obj.event === 'del') {
                layer.confirm('真的删除行么', function (index) {
                    dbdel(data.userid, 'userid');
                    layer.close(index);
                    obj.del();
                });
            }
            else if (obj.event === 'edit') {//编辑信息
                localStorage.setItem("admin_storeid",data.storeid);
                x_admin_show('编辑信息', '/admin/store/store_edit', 600, 710);
            }
            else if (obj.event === 'isuse') {
                var flag=0;
                if (data.storeiswork === 0 || data.storeiswork === '0') {
                    obj.update({storeiswork: '1'});
                    layer.msg(data.storeid + '已启用!',{icon: 6,time:1000});
                    flag=1;
                }
                else {
                    obj.update({storeiswork: '0'});
                    layer.msg(data.storeid+ '已停用!',{icon: 5,time:1000});
                    flag=0;
                }
            }
        });



        $("#search").on('click',function(){
            var itype = $('#type option:selected').val();
            var type = parseInt(itype);
            var name= $('#nameid').val();
            var id= $('#nameid').val();
            var address= $('#address').val();

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
                        storeid:"", storename:name,
                        address:address,type:type,
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
