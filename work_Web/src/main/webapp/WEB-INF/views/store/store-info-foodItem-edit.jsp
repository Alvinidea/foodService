<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/13
  Time: 12:56
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
        <div class="layui-form-item" style="display: none">
            <label for="goodsid" class="layui-form-label">
                ID
            </label>
            <div class="layui-input-inline">
                <input type="text" id="goodsid" name="goodsid" readonly="readonly"
                       value="test" placeholder="ID" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="goodsname" class="layui-form-label">
                商品名称
            </label>
            <div class="layui-input-inline">
                <input type="text" id="goodsname" name="goodsname" placeholder="姓名" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="goodspic" class="layui-form-label">
                商品图片
            </label>
            <div class="layui-input-inline">
                <img id='preGoodsPic' style="width: 90px;height: 90px">
                <input type="text" id="goodspic" name="goodspic"  placeholder="email" class="layui-input" style="display: none">
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
                <input type="text" id="goodsprice" name="goodsprice" placeholder="phone" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="goodsdiscount" class="layui-form-label">
                折扣
            </label>
            <div class="layui-input-inline">
                <input type="text" id="goodsdiscount" name="goodsdiscount"  placeholder="address" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="display: none">
            <label for="goodscmtnum" class="layui-form-label">
                评论数目
            </label>
            <div class="layui-input-inline">
                <input type="text" id="goodscmtnum" name="goodscmtnum"  placeholder="status" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" style="display: none">
            <label for="goodsseller" class="layui-form-label">
                卖家
            </label>
            <div class="layui-input-inline">
                <input type="text" id="goodsseller" name="goodsseller"  placeholder="seller" class="layui-input" readonly="readonly">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="goodsstars" class="layui-form-label">
                星级
            </label>
            <div class="layui-input-inline">
                <input type="text" id="goodsstars" name="goodsstars"  placeholder="level" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="goodsother" class="layui-form-label">
                备注
            </label>
            <div class="layui-input-inline">
                <input type="text" id="goodsother" name="goodsother" placeholder="备注" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <input value="修改" lay-submit lay-filter="modify" style="width:100%;" type="submit"
                   class="layui-btn layui-btn-radius layui-btn-normal">
        </div>
    </form>
</div>
<script>
    layui.use(['form','layer','upload'], function(){
        $ = layui.jquery;
        var form = layui.form
            ,layer = layui.layer;
        var upload = layui.upload;

        var picStr = "";
        //获取上一个页面id信息
        var goodsinfo = localStorage.getItem("goodsinfo");
        //清理缓存
        localStorage.removeItem('goodsinfo');
        //从后台获取数据
        getGoods (goodsinfo ) ;

        var uploadInst = upload.render({
            elem: '#uploadpic'
            ,url: '/pic/upload_postPhotos'
            ,multiple: true
            ,number:6
            ,before: function(obj){
                //预读本地文件示例，不支持ie8
                obj.preview(function(index, file, result){
                    //$('#uploaddemo').append('<img src="'+ result +'" alt="'+ file.name +'" class="layui-upload-img" style="width: 90px;height: 90px;border-radius: 6px">')
                    //$('#uploaddemo').attr('src', result); //图片链接（base64）
                    $("#preGoodsPic").attr('src', result);
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
        //先获取数据 通过id
        //监听提交
        form.on('submit(modify)', function(data){
            $.ajax({
                type: "POST",
                url: "/store/addItem_op",
                data: $("#goodsInfo").serialize(),
                success: function (data) {
                    if (data == "success") {
                        layer.alert("修改成功", {icon: 6},function () {
                            //关闭当前frame
                            x_admin_close();
                            // 可以对父窗口进行刷新
                            x_admin_father_reload();
                        });
                    } else {
                        layer.msg('修改失败');
                    }

                },
                error:function () {
                    layer.msg('error');
                }
            })
            return false;
        });
    });
    //获取user信息 并且设置各个输入框的信息
    function getGoods (data) {
        var dat = data.split(',');
        $("#goodsid").val(dat[0]);
        $("#goodspic").val( dat[1]);
        $("#preGoodsPic").attr( 'src',dat[1]);
        $("#goodsname").val(dat[2]);
        $("#goodsprice").val(dat[3]);
        $("#goodsdiscount").val(dat[4]);
        $("#goodscmtnum").val(dat[5]);
        $("#goodsseller").val(dat[6]);
        $("#goodsstars").val(dat[7]);
        $("#goodsother").val(dat[8]);
    }
</script>
</body>
</html>
