<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/15
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html  class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>用户密码修改</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="stylesheet" href="../../css/font.css"/>
    <link rel="stylesheet" href="../../css/xadmin.css"/>
    <link rel="stylesheet" href="../../lib/layui/css/layui.css"/>
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="application/javascript" src="../../lib/layui/layui.js"></script>
    <script type="application/javascript" src="../../js/xadmin.js"></script>
    <script type="application/javascript" src="../../js/cookie.js"></script>

</head>
<body class="login-bg">

<div class="login layui-anim layui-anim-up">
    <div class="message">修改密码</div>
    <div id="darkbannerwrap"></div>
    <form id ="UserPwd" method="post" class="layui-form" >
        <input name="pwd" id="pwd" placeholder="旧密码"  type="password" lay-verify="required" class="layui-input" >
        <hr class="hr15">
        <input name="newpwd" id="newpwd" lay-verify="required" placeholder="新密码"  type="password" class="layui-input">
        <hr class="hr15">
        <input value="更改" lay-submit lay-filter="modify" style="width:100%;" type="submit">
        <hr class="hr20" >
    </form>
</div>

<script>
    $(function  () {
        layui.use(['form','layer'], function(){
            var form = layui.form;
            var layer = layui.layer;
            form.on('submit(modify)', function(data){
                $.ajax({
                    type: "POST"
                    , url: "/user/user_info_pwd_op"
                    , data: {
                        pwd:$('#pwd').val()
                        ,newpwd:$('#newpwd').val()
                    }
                    , success: function (ret) {
                        switch (ret)
                        {
                            case '1':
                                layer.alert("更改成功！");
                                break;
                            case '2':
                                layer.alert("输入的旧密码错误！");
                                break;
                            case '3':
                                layer.alert("失败，新旧密码一致O！");
                                break;
                            case '0':
                                layer.alert("错误！");
                                break;
                            default:
                                layer.alert("未知错误！");
                                break;
                        }
                    },
                    error:function () {
                        layer.msg('error');
                    }
                })
                return false;
            });
        });
    })


</script>
<!-- 底部结束 -->
</body>
</html>
