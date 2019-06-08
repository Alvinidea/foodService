<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/13
  Time: 16:15
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
<div class="x-body">
    <form class="layui-form" id="goodsInfo">
        <div class="layui-form-item">
            <label for="goodsname" class="layui-form-label">
                商品名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="goodsname" name="goodsname"  lay-verify="goodsname" placeholder="菜名" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" >
            <label for="goodspic" class="layui-form-label">
                商品图片
            </label>
            <div class="layui-input-inline">
                <input type="text" id="goodspic" name="goodspic" placeholder="图片" class="layui-input" style="display: none">
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
        </div>
        <div class="layui-form-item">
            <label for="goodsprice" class="layui-form-label">
                商品价格
            </label>
            <div class="layui-input-inline">
                <input type="text" id="goodsprice" name="goodsprice"  lay-verify="goodsprice"  placeholder="价格" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="goodsdiscount" class="layui-form-label">
                折扣
            </label>
            <div class="layui-input-inline">
                <input type="text" id="goodsdiscount" name="goodsdiscount" lay-verify="goodsdiscount" placeholder="折扣" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="goodsother" class="layui-form-label">
                备注
            </label>
            <div class="layui-input-inline">
                <input type="text" id="goodsother" name="goodsother" lay-verify="goodsother" placeholder="备注" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <input value="添加" lay-submit lay-filter="add" style="width:100%;" type="submit"
                   class="layui-btn layui-btn-radius layui-btn-normal">
        </div>
    </form>

</div>

<script src="/js/validate.js"></script>
<script>
    layui.use(['form','layer','upload'], function(){
        $ = layui.jquery;
        var form = layui.form
            ,layer = layui.layer;
        var upload = layui.upload;

        var picStr = "";
        //自定义验证规则
        form.verify({
            userid: function(value){
                if(value.length < 5){
                    return 'id至少得5个字符啊';
                }
            }
            ,goodsprice:function (value) {
                if( validatePrice(value) ==  false )
                {
                    return '价格在0-100之间！';
                }
            }
            ,goodsdiscount:function (value) {
                if( validateDiscount(value) == false )
                {
                    return '折扣在1-10之间！';
                }
            }
        });
        //监听提交
        var uploadInst = upload.render({
            elem: '#uploadpic'
            ,url: '/pic/upload_postPhotos'
            ,multiple: true
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
                $("#goodspic").val(picStr);
            }
        });

        form.on('submit(add)', function(data){
            var picloc = $("#goodspic").val();
            if( isLZero(picloc) == false)
            {
                //发异步，把数据提交给后台
                $.ajax({
                    type: "POST",
                    url: "/store/addItem_op",
                    data: $("#goodsInfo").serialize(),
                    success: function (data) {
                        if (data == "success") {
                            layer.alert("增加成功", {icon: 6},function () {
                                //关闭当前frame
                                x_admin_close();
                                // 可以对父窗口进行刷新
                                x_admin_father_reload();
                            });
                        } else {
                            layer.msg('增加失败');
                        }
                    },
                    error:function () {
                        layer.msg('error');
                    }
                })
            }
            else{
                layer.msg("请选择图片！",{icon:15})
            }
            return false;
        });


        getGoods ();
    });
//这是测试
    function getGoods () {
        //$("#goodspic").val( "/pic/alvin.jpg");
        $("#goodsname").val("狗不理包子");
        $("#goodsprice").val("10");
        $("#goodsdiscount").val("10");
        $("#goodsother").val("这是备注信息");
    }
</script>
</body>

</html>
