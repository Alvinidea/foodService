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
                <tr>
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
                <tr>
                    <th>商铺是否正在营业</th>
                    <td >
                        <div class="layui-input-block">
                            <input  type="text" id="storeiswork" name="storeiswork" lay-verify="title" autocomplete="off"
                                    class="layui-input">
                        </div>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <div class="layui-input-block">
                            <a class="layui-btn layui-btn-primary layui-btn-radius"
                               style="width: 80%" id="modify">确认修改</a>
                        </div>
                    </td>
                </tr>
                </tbody>
            </table>
        </form>
    </div>
    <script>
      layui.use(['form','layer','upload'], function(){
          $ = layui.jquery;
        var form = layui.form
        ,layer = layui.layer;
          var upload = layui.upload;
         var storeid = localStorage.getItem("admin_storeid");
         localStorage.removeItem("admin_storeid")

        getStoreInfo(storeid);

         $("#modify").on('click',function () {
             modify();
         })
          //普通图片上传
          var uploadInst = upload.render({
              elem: '#uploadpic'
              ,url: '/pic/upload_storePic_BySuper'
              ,data:{storeid:storeid}
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

      function getStoreInfo(storeid) {
          $.ajax({
              type:"Post"
              ,url:"/admin/store/getStore_info"
              ,data:{storeid:storeid}
              ,success:function (data) {
                  var iswork = "是";
                  $('#storeid').val(data.storeid);
                  $('#storename').val(data.storename);
                  $('#storeaddress').val(data.storeaddress);

                  $('#uploaddemo').val(data.storepicture);
                  $('#storephone').val(data.storephone);
                  $('#storelevel').val(data.storelevel);
                  $('#storeapplytime').val(data.storeapplytime);
                  $('#storepicture').attr('src',data.storepicture);
                  if( data.storeiswork == 0)
                      iswork == "否"
                  $('#storeiswork').val(iswork);
                  /*
                  $('#storeid').attr('readonly','readonly');
                  $('#storename').attr('readonly','readonly');
                  $('#storeaddress').attr('readonly','readonly');
                  //$('#uploaddemo').attr('readonly','readonly');
                  $('#storephone').attr('readonly','readonly');
                  $('#storelevel').attr('readonly','readonly');
                  $('#storeapplytime').attr('readonly','readonly');
                  $('#storeiswork').attr('readonly','readonly');
                  */
              }
          })
      }

      function modify() {
          var iswork = 0;
          if($('#storeiswork').val() == '是')
              iswork = 1;
          $.ajax({
              type:"Post"
              ,url:"/admin/store/modifyStoreInfo"
              ,data:{
                  storeid:$('#storeid').val()
                  ,storename:$('#storename').val()
                  ,storeaddress: $('#storeaddress').val()
                  ,storephone: $('#storephone').val()
                  ,storelevel:$('#storelevel').val()
                  ,storeiswork :iswork
              }
              ,success:function (data) {
                  if(data == 'success') {
                      layer.alert("修改成功！");
                      getStoreInfo();
                  }
              }
          })
      }
  </script>
  </body>

</html>