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
          <cite>商铺信息</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"
       href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:25px;border-radius: 3px">ဂ</i></a>
</div>

<div class="layui-container">
    <fieldset class="layui-elem-field">
        <legend>商铺数据统计</legend>
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
                                            <h3>菜品数</h3>
                                            <p>
                                                <cite id="foodNum">12</cite></p>
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
                                            <h3>待确认订单</h3>
                                            <p>
                                                <cite  id="waitSure">67</cite></p>
                                        </a>
                                    </li>
                                    <li class="layui-col-xs2">
                                        <a href="javascript:;" class="x-admin-backlog-body">
                                            <h3 >待发货数</h3>
                                            <p>
                                                <cite id="waitSend">67</cite></p>
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
        <legend>商铺信息</legend>
        <div class="layui-field-box">
            <form id="StoreInfo">
                <table class="layui-table">
                <tbody>
                <tr>
                    <th>商铺图片</th>
                    <td>
                        <div class="layui-upload">
                            <div class="layui-upload-list">
                                <img id="storepicture" src="" style="width: 92px;height: 92px" class="layui-upload-img" id="uploaddemo">
                                <p id="demoText"></p>
                                <a  id="uploadpic" class="layui-btn layui-btn-radius layui-btn-primary layui-btn-sm"> 更改商铺图片 </a>
                            </div>
                        </div>
                    </td>
                </tr>
                <tr>
                    <th>商铺ID</th>
                    <td >
                        <div class="layui-input-block">
                            <input  type="text" id="storeid" name="storeid" lay-verify="storeid" autocomplete="off"
                                    class="layui-input">
                        </div>
                    </td>
                </tr>
                <tr>
                    <th>商铺名称</th>
                    <td >
                        <div class="layui-input-block">
                            <input  type="text" id="storename" name="storename" lay-verify="title" autocomplete="off"
                                    class="layui-input">
                        </div>
                    </td>
                </tr>
                <tr>
                    <th>商铺地址</th>
                    <td >
                        <div class="layui-input-block">
                            <input  type="text" id="storeaddress" name="storeaddress" lay-verify="title" autocomplete="off"
                                    class="layui-input">
                        </div>
                    </td>
                </tr>
                <tr>
                    <th>商铺联系方式</th>
                    <td >
                        <div class="layui-input-block">
                            <input  type="text" id="storephone" name="storephone" lay-verify="title" autocomplete="off"
                                    class="layui-input">
                        </div>
                    </td>
                </tr>
                <tr style="display: none">
                    <th>商铺等级</th>
                    <td >
                        <div class="layui-input-block">
                            <input  type="text" id="storelevel" name="storelevel" lay-verify="title" autocomplete="off"
                                    class="layui-input">
                        </div>
                    </td>
                </tr>
                <tr>
                    <th>商铺开始营业时间</th>
                    <td>
                        <div class="layui-input-block">
                            <input  type="text" id="storeapplytime" name="storeapplytime" lay-verify="title" autocomplete="off"
                                    class="layui-input">
                        </div>
                    </td>
                </tr>
                <!--
                <tr>
                    <th>商铺是否正在营业</th>
                    <td >
                        <div class="layui-input-block">
                            <input  type="text" id="storeiswork" name="storeiswork" lay-verify="title" autocomplete="off"
                                    class="layui-input">
                        </div>
                    </td>
                </tr>-->
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
<script src="/js/DateUtil.js"></script>
<script>
    layui.use(['element','layer','upload'],function () {
        var element = layui.elements;
        var upload = layui.upload;
        getStatistic();
        getStoreInfo();

        $("#reset").on('click',function () {
            reset();
        })

        $("#modify").on('click',function () {
            modify();
        })
        //普通图片上传
        var uploadInst = upload.render({
            elem: '#uploadpic'
            ,url: '/pic/upload_storePic'
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
            ,url:"/store/get_Store_S_detail"
            ,success:function (list) {
                $('#postNum').text(list[0]);
                $('#foodNum').text(list[1]);
                $('#finished').text(list[2]);
                $('#waitSure').text(list[3]);
                $('#waitSend').text(list[4]);
            }
        })
    }

    function getStoreInfo() {
        $.ajax({
            type:"Post"
            ,url:"/store/getStore_info"
            ,success:function (data) {
                var iswork = "是";
                $('#storeid').val(data.storeid);
                $('#storename').val(data.storename);
                $('#storeaddress').val(data.storeaddress);

                $('#uploaddemo').val(data.storepicture);
                $('#storephone').val(data.storephone);
                $('#storelevel').val(data.storelevel);
                $('#storeapplytime').val(getTime(data.storeapplytime));
                $('#storepicture').attr('src',data.storepicture);
                if( data.storeiswork == 0)
                    iswork == "否"
                $('#storeiswork').val(iswork);
                $('#storeid').attr('readonly','readonly');
                $('#storename').attr('readonly','readonly');
                $('#storeaddress').attr('readonly','readonly');
                //$('#uploaddemo').attr('readonly','readonly');
                $('#storephone').attr('readonly','readonly');
                $('#storelevel').attr('readonly','readonly');
                $('#storeapplytime').attr('readonly','readonly');
                $('#storeiswork').attr('readonly','readonly');
            }
        })
    }

    function reset() {
        $('#storeid').attr("readonly",false);
        $('#storename').attr("readonly",false);
        $('#storeaddress').attr("readonly",false);
        //$('#storepic').attr("readonly",false);
        $('#storephone').attr("readonly",false);
        $('#storelevel').attr("readonly",false);
        //$('#storeiswork').attr("readonly",false);
    }

    function modify() {
        var msg = validate();
        if(msg != '')
        {
            layer.msg(msg,{icon:15,time:800});
            return;
        }

        //var iswork = 0;
        //if($('#storeiswork').val() == '是')
            //iswork = 1;
        $.ajax({
            type:"Post"
            ,url:"/store/modify_storeInfo"
            ,data:{
                storeid:$('#storeid').val()
                ,storename:$('#storename').val()
                ,storeaddress: $('#storeaddress').val()
                ,storephone: $('#storephone').val()
                ,storelevel:$('#storelevel').val()
                ,storeiswork :1
            }
            ,success:function (data) {
                if(data == 'success') {
                    layer.alert("修改成功！");
                    getStoreInfo();
                }
            }
        })
    }

    function validate() {
        var msg = "";
        var address = $("#storeaddress").val();
        var name = $("#storename").val();
        var phone = $("#storephone").val();
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
        return msg;
    }


</script>
</body>
</html>
