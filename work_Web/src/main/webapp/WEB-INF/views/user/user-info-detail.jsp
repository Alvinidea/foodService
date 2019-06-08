<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/14
  Time: 18:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welconme to page of manager</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="stylesheet" href="../../css/font.css">
    <link rel="stylesheet" href="../../css/xadmin.css">

    <script type="application/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="application/javascript" src="../../lib/layui/layui.js" charset="utf-8"></script>

    <script type="application/javascript" src="../../js/xadmin.js"></script>
    <script type="application/javascript" src="../../js/cookie.js"></script>
</head>
<body>
<div class="layui-nav" style="height: 50px;background-color: #E9E7E7;padding-top: 5px">
      <span class="layui-breadcrumb" >
        <a href="">首页</a>
        <a>
          <cite>个人信息</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"
       href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:25px;border-radius: 3px">ဂ</i></a>
</div>

<div class="layui-container">
    <fieldset class="layui-elem-field">
        <legend>用户数据统计</legend>
        <div class="layui-field-box">
            <div class="layui-col-md12">
                <div class="layui-card">
                    <div class="layui-card-body">
                        <div class="layui-carousel x-admin-carousel x-admin-backlog" lay-anim="" lay-indicator="inside" lay-arrow="none" style="width: 100%; height: 90px;">
                            <div carousel-item="">
                                <ul class="layui-row layui-col-space10 layui-this">
                                    <li class="layui-col-xs2">
                                        <a href="javascript:;" class="x-admin-backlog-body">
                                            <h3>帖子数</h3>
                                            <p>
                                                <cite id="postNum">66</cite></p>
                                        </a>
                                    </li>
                                    <li class="layui-col-xs2">
                                        <a href="javascript:;" class="x-admin-backlog-body">
                                            <h3>完成订单数</h3>
                                            <p>
                                                <cite id="finished">99</cite></p>
                                        </a>
                                    </li>
                                    <li class="layui-col-xs2">
                                        <a href="javascript:;" class="x-admin-backlog-body">
                                            <h3>待付款订单</h3>
                                            <p>
                                                <cite  id="waitPay">67</cite></p>
                                        </a>
                                    </li>
                                    <li class="layui-col-xs2">
                                        <a href="javascript:;" class="x-admin-backlog-body">
                                            <h3>待开发</h3>
                                            <p>
                                                <cite>6766</cite></p>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </fieldset>
    <fieldset class="layui-elem-field">
        <legend>用户信息</legend>
        <div class="layui-field-box">
            <form id="User_Info">
                <table class="layui-table">
                <tbody>
                <tr>
                    <th>用户头像</th>
                    <td>
                        <div class="layui-upload">
                            <div class="layui-upload-list">
                                <img src="" style="width: 92px;height: 92px" class="layui-upload-img" id="uploaddemo">
                                <p id="demoText"></p>
                                <a  id="uploadpic" class="layui-btn layui-btn-radius layui-btn-primary layui-btn-sm">
                                    更改用户头像 </a>
                            </div>
                        </div>
                    </td>
                </tr>
                <tr>
                    <th>用户ID</th>
                    <td style="background-color: #8FCDA0">
                        <div class="layui-input-block" >
                            <input  type="text" id="userid" name="userid" lay-verify="userid"
                                    autocomplete="off"
                                    readonly="readonly"
                                    class="layui-input">
                        </div>
                    </td>
                </tr>
                <tr>
                    <th>用户昵称</th>
                    <td >
                        <div class="layui-input-block">
                            <input  type="text" id="username" name="username" lay-verify="title"
                                    autocomplete="off"
                                    readonly="readonly"
                                    class="layui-input">
                        </div>
                    </td>
                </tr>
                <tr>
                    <th>真实姓名</th>
                    <td >
                        <div class="layui-input-block">
                            <input  type="text" id="usernamed" name="usernamed" lay-verify="title" autocomplete="off"
                                    readonly="readonly" class="layui-input">
                        </div>
                    </td>
                </tr>
                <tr>
                    <th>性别</th>
                    <td >
                        <div class="layui-input-block">
                            <input  type="text" id="usersexd" name="usersexd" lay-verify="title" autocomplete="off"
                                    readonly="readonly" class="layui-input">
                        </div>
                    </td>
                </tr>
                <tr>
                    <th>年龄</th>
                    <td >
                        <div class="layui-input-block">
                            <input  type="text" id="useraged" name="useraged" lay-verify="title" autocomplete="off"
                                    readonly="readonly"  class="layui-input">
                        </div>
                    </td>
                </tr>
                <tr>
                    <th>用户收货地址</th>
                    <td >
                        <div class="layui-input-block">
                            <input  type="text" id="useraddress" name="useraddress" lay-verify="title" autocomplete="off"
                                    readonly="readonly"  class="layui-input">
                        </div>
                    </td>
                </tr>
                <tr>
                    <th>联系方式</th>
                    <td >
                        <div class="layui-input-block">
                            <input  type="text" id="userphone" name="userphone" lay-verify="title" autocomplete="off"
                                    readonly="readonly"  class="layui-input">
                        </div>
                    </td>
                </tr>
                <tr>
                    <th>Email</th>
                    <td >
                        <div class="layui-input-block">
                            <input  type="text" id="useremail" name="useremail" lay-verify="title"
                                    autocomplete="off"
                                    readonly="readonly" class="layui-input">
                        </div>
                    </td>
                </tr>
                <tr style="display: none">
                    <th>等级</th>
                    <td >
                        <div class="layui-input-block">
                            <input  type="text" id="userlevel" name="userlevel" lay-verify="title" autocomplete="off"
                                    readonly="readonly"  class="layui-input">
                        </div>
                    </td>
                </tr>

                <tr style="display: none">
                    <th>注册时间</th>
                    <td>
                        <div class="layui-input-block">
                            <input  type="text" id="userapplytime" name="userapplytime" lay-verify="title" autocomplete="off"
                                    readonly="readonly" class="layui-input">
                        </div>
                    </td>
                </tr>
                <tr style="display: none">
                    <th>个人爱好</th>
                    <td>
                        <div class="layui-input-block">
                            <input  type="text" id="userhibitd" name="userhibitd" lay-verify="title" autocomplete="off"
                                    readonly="readonly"  class="layui-input">
                        </div>
                    </td>
                </tr>
                <tr>
                    <th>个人简介</th>
                    <td>
                        <div class="layui-input-block">
                            <input  type="textarea" id="userinfo" name="userinfo" lay-verify="title" autocomplete="off"
                                    readonly="readonly" class="layui-input">
                        </div>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <div class="layui-input-block">
                            <a class="layui-btn layui-btn-primary layui-btn-radius"
                               style="width: 48%" id="reset" >修改</a>
                            <a class="layui-btn layui-btn-primary layui-btn-radius"
                              style="width: 48%" id="modify">确认修改</a>
                        </div>
                    </td>
                </tr>
                </tbody>
            </table>
            </form>
        </div>
    </fieldset>
</div>
<script src="/js/validate.js"></script>
<script>
    layui.use(['element','layer','upload'],function () {
        var element = layui.elements;
        var upload = layui.upload;
        getStatistic();
        getUserInfo();
        getUserInfoD();

        $("#reset").on('click',function () {
            reset();
        })

        $("#modify").on('click',function () {
            modify();
        })
        //普通图片上传
        var uploadInst = upload.render({
            elem: '#uploadpic'
            ,url: '/pic/upload_userPhoto'
            ,before: function(obj){
                //预读本地文件示例，不支持ie8
                obj.preview(function(index, file, result){
                    $('#uploaddemo').attr('src', result); //图片链接（base64）
                });
            }
            ,done: function(res){
                //如果上传失败
                if(res === 0 ||res ==='0'){
                    return layer.msg('上传成功');
                }else
                {
                    return layer.msg('上传失败');
                }
                //上传成功
            }
            ,error: function(){
                //演示失败状态，并实现重传
                var demoText = $('#demoText');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function(){
                    uploadInst.upload();
                });
            }
        });
    });

    //获取统计数据
    function getStatistic() {
        $.ajax({
            type:"Post"
            ,url:"/user/get_User_S_detail"
            ,success:function (list) {
                $('#postNum').text(list[0]);
                $('#finished').text(list[1]);
                $('#waitPay').text(list[2]);
            }
        })
    }

    function getUserInfo() {
        $.ajax({
            type:"Post"
            ,url:"/user/getUser_info"
            ,success:function (data) {
                if(data != null) {
                    $('#userid').val(data.userid);
                    $('#username').val(data.username);
                    $('#useraddress').val(data.useraddress);
                    $('#userphone').val(data.userphone);
                    $('#userlevel').val(data.userlevel);
                    $('#userapplytime').val(getTime(data.userapplytime));
                    $('#useremail').val(data.useremail);
                }
            }
        })
    }

    function getUserInfoD() {
        $.ajax({
            type:"Post"
            ,url:"/user/getUserDetailInfo"
            ,success:function (data) {
                var sex = '女';
                $('#usernamed').val(data.usernamed);
                if( data.usersexd == 1 )
                    sex = '男';
                $('#usersexd').val(sex);
                $('#useraged').val(data.useraged);
                $('#userinfo').val(data.userinfo);
                $('#userhibitd').val(data.userhibitd);
                $('#uploaddemo').attr('src',data.userphotod);
            }
        })
    }

    function reset() {
        //$('#userid').attr("readonly",false);
        $('#username').attr("readonly",false);
        $('#useraddress').attr("readonly",false);
        //$('#userpic').attr("readonly",false);
        $('#userphone').attr("readonly",false);
        //$('#userlevel').attr("readonly",false);
        $('#useremail').attr("readonly",false);

        $('#userhibitd').attr("readonly",false);
        $('#usernamed').attr("readonly",false);
        $('#usersexd').attr("readonly",false);
        $('#useraged').attr("readonly",false);
        $('#userinfo').attr("readonly",false);
    }

    function modify() {
        var msg = validate();
        if(msg != '')
        {
            layer.msg(msg,{icon:15,time:800});
            return;
        }

        var sex = $('#usersexd').val();
        var fsex = 1;
        if(sex == '女')
            fsex= 0;
        console.log($('#userhibitd').val());
        $.ajax({
            type:"Post"
            ,url:"/user/modify_userInfo"
            ,data:{
                userid:$('#userid').val()
                ,username:$('#username').val()
                ,useraddress: $('#useraddress').val()
                ,userphone: $('#userphone').val()
                ,userlevel:$('#userlevel').val()
                ,useremail:$('#useremail').val()
            }
            ,success:function (data) {
                if(data == 'success') {
                    layer.alert("修改成功！");
                    getUserInfo();
                }
            }
        })
        $.ajax({
            type:"Post"
            ,url:"/user/modify_userDInfo"
            ,data:{
                usernamed:$('#usernamed').val()
                ,useraged:$('#useraged').val()
                ,usersexd: fsex
                ,userinfo: $('#userinfo').val()
                ,userhibitd:$('#userhibitd').val()
            }
            ,success:function (data) {
                if(data == 'success') {
                    layer.alert("修改成功！");
                    getUserInfoD();
                }
            }
        })
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

    function validate() {
        var sex = 0;
        var msg = "";
        var name=$('#username').val();
        var address= $('#useraddress').val();
        var phone= $('#userphone').val();
        var email=$('#useremail').val();
        var usernamed=$('#usernamed').val();
        var useraged= $('#useraged').val();
        var usersexd= $('#usersexd').val();
        if(name == "" || name.length < 2 )
        {
            msg = "名称不可空，也不要太短！";
            return msg;
        }
        else if(address == "" || address.length < 4 )
        {
            msg = "地址不可空，地址也不要太短！";
            return msg;
        }
        else if( !validateMobile(phone))
        {
            msg = "联系方式是不是有问题哦！";
            return msg;
        }
        else if( !validateEmail(email))
        {
            msg = "Email是不是有问题哦！";
            return msg;
        }
        else if( usernamed == "" || name.length < 2 )
        {
            msg = "昵称不可空，也不要太短！";
            return msg;
        }
        else if( !isValidDecimal( useraged ))
        {
            msg = "这个年龄，你是妖怪吧！";
            return msg;
        }
        else if( usersexd != '男' && usersexd !='女')
        {
            msg = "性别给个准信吧！";
            return msg;
        }
        return msg;
    }
</script>
</body>
</html>
