<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html  class="x-admin-sm">
<head>
	<meta charset="UTF-8">
	<title>美食服务系统用户登录</title>
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
        <div class="message">用户登录</div>
        <div id="darkbannerwrap"></div>
        <form id ="Userlogin" method="post" class="layui-form" >
            <input name="userid" id="userid" placeholder="用户ID"  type="text" lay-verify="required" class="layui-input" >
            <hr class="hr15">
            <input name="userpwd" id="username" lay-verify="required" placeholder="密码"  type="password" class="layui-input">
            <hr class="hr15">
            <div class="layui-inline">
                <div class="layui-input-inline">
                    <input name="validateCode" id="validateCode" placeholder="验证码" type="text" class="layui-input">
                </div>
                <div class="layui-input-inline">
                    <img id="cpacha-img" src="/pre/getCode" alt="" width="100"
                         height="32" class="passcode" style="height:43px;cursor:pointer;" onclick="this.src=this.src+'?'">
                </div>
            </div>
            <br><br>
            <div value="登录" id="login" style="width:100%;" class="layui-btn  layui-btn-radius">登录</div>
            <!--
                <input value="登录" id="login" lay-submit lay-filter="login" style="width:100%;" type="submit">
                -->
            <hr class="hr20" >
            </form>
        </div>

    <script src="/js/validate.js"></script>
        <script>
            $(function  () {
                layui.use(['form','layer'], function(){
                  var form = layui.form;
                  var layer = layui.layer;
                  var flag =0;

                  //changeCpacha();
                    $("#login").on('click',function () {
                        var msg = validate();
                        if(msg != '')
                        {
                            layer.msg(msg,{icon:15,time:800});
                            console.log(msg);
                            flag = 2;
                        }
                        if(flag == 0)
                        {
                            layer.tips('验证码错误', '#validateCode', {
                                tips: [4, '#78BA32']
                            });
                        }else if(flag == 2)
                        {

                        }
                        else{
                            var loading= layer.msg('加载中', {
                                icon: 16
                                ,shade: 0.01
                            });
                            setTimeout(function () {
                                layer.close(loading);
                                $.ajax({
                                    type: "POST",
                                    url: "/pre/loginToIndex",
                                    data: $("#Userlogin").serialize(),
                                    success: function (data) {
                                        if (data == "1" || data =="\"1\"" || data==1) {
                                            layer.msg('登录成功');
                                            console.log(data);
                                            window.location.href = "../food/index";
                                        } else if(data =="-1"){
                                            layer.msg('账号错误！登录失败');
                                        }
                                        else if(data =="3"){
                                            layer.msg('密码错误！登录失败');
                                        }
                                        else if(data =="4"){
                                            layer.msg('账号错误请联系管理员');
                                        }
                                    },
                                    error:function () {
                                        layer.msg('error');
                                    }
                                })
                            },500);
                            return false;
                        }
                    });
    /*
                  form.on('submit(login)', function(data){
                      if(flag == 0)
                      {
                          layer.tips('验证码错误', '#validateCode', {
                              tips: [4, '#78BA32']
                          });
                      }
                      else{
                          var loading= layer.msg('加载中', {
                              icon: 16
                              ,shade: 0.01
                          });
                          setTimeout(function () {
                              layer.close(loading);
                              $.ajax({
                                  type: "POST",
                                  url: "/pre/loginToIndex",
                                  data: $("#Userlogin").serialize(),
                                  success: function (data) {
                                      if (data == "1" || data =="\"1\"" || data==1) {
                                          layer.msg('登录成功');
                                          console.log(data);
                                          window.location.href = "../food/index";
                                      } else if(data =="-1"){
                                          layer.msg('账号错误！登录失败');
                                      }
                                      else if(data =="3"){
                                          layer.msg('密码错误！登录失败');
                                      }
                                      else if(data =="4"){
                                          layer.msg('账号错误请联系管理员');
                                      }
                                  },
                                  error:function () {
                                      layer.msg('error');
                                  }
                              })
                          },500);
                          return false;
                      }

                  });
    */
                  $('#validateCode').on('keyup', function () {
                        var code = $('#validateCode').val();
                        console.log(code + " - "+ code.length);
                        if(code.length == 4)
                        {
                            code = code.toUpperCase();
                            $.ajax({
                                url:"/pre/validateCode"
                                ,type:"post"
                                ,data:{code:code}
                                ,success:function (data) {
                                    if(data == 1 || data == '1')
                                        flag = 1 ;
                                    else
                                        flag = 0;
                                }
                            })
                        }
                        else  if(code.length > 4)
                        {
                            layer.tips('验证码错误', '#validateCode', {
                                tips: [4, '#78BA32']
                            });
                        }

                    });

                });

                function validate() {
                    var msg = "";
                    var id = $("#userid").val();
                    var pwd = $("#userpwd").val();
                    if( !validateId(id) )
                    {
                        msg = "ID格式不对哦！";
                        return msg;
                    }
                    else if( ! validatePwd(pwd) )
                    {
                        msg = "密码为字母数字的6-15位组合哦！";
                        return msg;
                    }
                    return msg;
                }

            })


        </script>
        <!-- 底部结束 -->
</body>
</html>