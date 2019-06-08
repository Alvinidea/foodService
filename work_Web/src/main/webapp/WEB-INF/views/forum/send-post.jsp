<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/3
  Time: 20:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="x-admin-sm">

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
<div class="x-body">
    <form class="layui-form" id="postInfo">
        <div class="layui-form-item">
            <label for="posttitle" class="layui-form-label">
                <span class="x-red">*</span><i class="layui-icon">&#xe66f;</i>标题
            </label>
            <div class="layui-input-inline">
                <input type="text" id="posttitle" name="posttitle" required="" lay-verify="posttitle"
                       autocomplete="off" class="layui-input" placeholder="post标题">
            </div>
            <div class="layui-form-mid layui-word-aux">
                <span class="x-red">*</span>post标题
            </div>
        </div>
        <div class="layui-form-item">
            <label for="postcontext" class="layui-form-label">
                <span class="x-red">*</span><i class="layui-icon">&#xe66f;</i>内容
            </label>
            <div class="layui-input-block">
                <textarea placeholder="请输入内容" id="postcontext" name="postcontext" required="" lay-verify="postcontext"
                          autocomplete="off" class="layui-textarea"></textarea>
                <div class="layui-form-mid layui-word-aux">
                    <span class="x-red">*</span>内容
                </div>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="posttype" class="layui-form-label">
                <span class="x-red">*</span><i class="layui-icon">&#xe66f;</i>post类型
            </label>
            <div class="layui-input-inline">
                <select name="posttype" id="posttype"  >
                    <option value="分享" selected>分享</option>
                    <option value="教学">教学</option>
                    <option value="食材">食材</option>
                    <option value="学习">学习</option>
                    <option value="话题">话题</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="posttitle" class="layui-form-label">
            </label>
            <input value="添加" lay-submit lay-filter="add" style="width:100%;" type="submit"
                   class="layui-btn layui-btn-radius layui-btn-normal">
        </div>
    </form>
    <div class="layui-upload">
        <div class="layui-upload-list">
            <div id="uploaddemo">
                <!--
                <img id="storepicture" src="/pic/alvin.jpg" style="width: 92px;height: 92px" class="layui-upload-img" >
            -->
            </div>

            <p id="demoText"></p>
            <a  id="uploadpic" class="layui-btn layui-btn-radius layui-btn-primary layui-btn-sm"> 图片上传 </a>
        </div>
    </div>

</div>
<script>
    layui.use(['form','layer','upload'], function(){
        $ = layui.jquery;
        var form = layui.form;
        var layer = layui.layer;
        var upload = layui.upload;

        var picStr = "";
        //自定义验证规则
        form.verify({
            posttitle: function(value){
                if(value.length < 5){
                    return '标题至少得5个字符啊';
                }
            }
            ,postcontext: function(value){
                if(value.length < 5){
                    return '至少得5个字';
                }
            }
        });
        //执行实例
        var uploadInst = upload.render({
            elem: '#uploadpic'
            ,url: '/pic/upload_postPhotos'
            ,multiple: true
            ,data:{
            id: function(){
                return $('#id').val();
                }
            }
            ,number:6
            ,before: function(obj){
                //预读本地文件示例，不支持ie8
                obj.preview(function(index, file, result){
                    $('#uploaddemo').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img" style="width: 99px;height: 99px">')
                    //$('#uploaddemo').attr('src', result); //图片链接（base64）
                });
            }
            ,done: function(res, index, upload) {
                //每个图片上传结束的回调，成功的话，就把新图片的名字保存起来，作为数据提交
                //console.log(res);
                picStr+=res.piclocation+",";
                console.log(picStr);
            }
            ,error: function(){
                //演示失败状态，并实现重传
                var demoText = $('#demoText');
                demoText.html('<span style="color: #FF5722;">上传失败</span> <a class="layui-btn layui-btn-xs demo-reload">重试</a>');
                demoText.find('.demo-reload').on('click', function(){
                    uploadInst.upload();
                });
            }
            ,allDone:function () {
                picStr = picStr.substring(0,picStr.length-1);
                console.log(picStr);
            }
        });

        //监听提交
        form.on('submit(add)', function(data){
            if(picStr != "") {
                //发异步，把数据提交给后台
                $.ajax({
                    type: "POST",
                    url: "/forum/send_post_op",
                    data: {
                        posttitle: $("#posttitle").val()
                        , posttype: $("#posttype").find("option:selected").val()
                        , postcontext: $("#postcontext").val()
                        , postpic: picStr
                        , all: $("#postInfo").serialize()
                    }
                    , success: function (data) {
                        if (data == "success") {
                            layer.alert("发送成功", {icon: 6}, function () {
                                //关闭当前frame
                                x_admin_close();
                                // 可以对父窗口进行刷新
                                x_admin_father_reload();
                            });
                        } else {
                            layer.msg('增加失败');
                        }
                    },
                    error: function () {
                        layer.msg('error');
                    }
                })
            }else
            {
                layer.alert("请选择图片！！！")
                return false;
            }
            return false;
        });
    });
</script>
</body>

</html>
