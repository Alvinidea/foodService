<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/3/29
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>欢迎页面-X-admin2.1</title>
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

<table id="demo" lay-filter="test"></table>

<script>
    layui.use('table', function(){
        var table = layui.table;

        //第一个实例
        table.render({
            elem: '#demo'
            ,height: 312
            ,url: '/admin/mem/getUserlist' //数据接口
            ,page: true //开启分页
            ,cols: [[ //表头
                {field: 'userid', title: 'ID', width:80, sort: true, fixed: 'left'}
                ,{field: 'username', title: '用户名', width:80}
                ,{field: 'useremail', title: '邮箱', width:80, sort: true}
                ,{field: 'userphone', title: '电话号码', width:80}
                ,{field: 'useraddress', title: '地址', width: 177}
                ,{field: 'userapplytime', title: '申请时间', width: 80, sort: true}
                ,{field: 'userstatus', title: '状态', width: 80, sort: true}
                ,{field: 'userpwd', title: '密码', width: 80}
                ,{field: 'userlevel', title: '用户等级', width: 135, sort: true}
                ,{field: 'userpower', title: '权限', width: 135, sort: true}
            ]]
        });

    });
</script>
</body>
</html>
