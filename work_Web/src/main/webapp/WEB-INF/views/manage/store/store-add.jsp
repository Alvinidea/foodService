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
        <form class="layui-form" id="storeInfo">
            <div class="layui-form-item">
                <label for="storeid" class="layui-form-label">
                    <span class="x-red">*</span><i class="layui-icon">&#xe66f;</i>ID
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="storeid" name="storeid" required="" lay-verify="storeid"
                           autocomplete="off" class="layui-input" placeholder="请输入ID（学号/工号）">
                </div>
                <div class="layui-form-mid layui-word-aux">
                    <span class="x-red">*</span>将会成为您唯一的登入名
                </div>
            </div>
            <div class="layui-form-item">
                <label for="storename" class="layui-form-label">
                    <span class="x-red">*</span><i class="layui-icon">&#xe66f;</i>商铺名称
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="storename" name="storename" required="" lay-verify="storename"
                           autocomplete="off" class="layui-input" placeholder="请输入姓名">
                </div>
                <div class="layui-form-mid layui-word-aux">
                    <span class="x-red">*</span>商铺的名字
                </div>
            </div>
            <div class="layui-form-item">
                <label for="storeaddress" class="layui-form-label">
                    <span class="x-red">*</span><i class="layui-icon">&#xe66f;</i>商铺地址
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="storeaddress" name="storeaddress" required="" lay-verify="storeaddress"
                           autocomplete="off" class="layui-input" placeholder="请输入地址">
                </div>
                <div class="layui-form-mid layui-word-aux">
                    <span class="x-red">*</span>地址
                </div>
            </div>
            <div class="layui-form-item">
                <label for="storelevel" class="layui-form-label">
                    <span class="x-red">*</span><i class="layui-icon">&#xe66f;</i>商铺等级
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="storelevel" name="storelevel" required="" lay-verify="storelevel"
                           autocomplete="off" class="layui-input" placeholder="请输入等级">
                </div>
                <div class="layui-form-mid layui-word-aux">
                    <span class="x-red">*</span>level
                </div>
            </div>
            <div class="layui-form-item">
                <label for="storetype" class="layui-form-label">
                    <span class="x-red">*</span><i class="layui-icon">&#xe66f;</i>商铺类型
                </label>
                <div class="layui-input-inline">
                    <select id="storetype" name="type">
                        <option value="-1">商铺类型</option>
                        <option value="11">食堂</option>
                        <option value="12">小店</option>
                    </select>
                </div>
                <div class="layui-form-mid layui-word-aux">
                    <span class="x-red">*</span>类型
                </div>
            </div>

          <div class="layui-form-item">
              <label for="storeid" class="layui-form-label">
              </label>
              <input value="添加" lay-submit lay-filter="add" style="width:100%;" type="submit"
                     class="layui-btn layui-btn-radius layui-btn-normal">
          </div>
      </form>
    </div>
    <script>
        layui.use(['form','layer'], function(){
            $ = layui.jquery;
          var form = layui.form
          ,layer = layui.layer;
        
          //自定义验证规则
            /*
        form.verify({
            storeid: function(value){
                if(new RegExp("^[a-zA-Z][a-zA-Z0-9_]{4,15}$").test(value)){
                    return 'ID不能有特殊字符';
                }
            }
            ,storename: function(value){
                if(!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(value)){
                    return '名称不能有特殊字符';
                }
            }
            ,storeaddress: function (value) {
                if(!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(value)){
                    return '地址不能有特殊字符';
                }
            }
            ,storelevel:[/^\d{1}$/,'只可为数字']
            ,storetype: [/^[1-9]\d*$/,'请选择']
        });
        */
          //监听提交
          form.on('submit(add)', function(data){
            //发异步，把数据提交给后台
              $.ajax({
                  type: "POST",
                  url: "/admin/store/addStore",
                  data: $("#storeInfo").serialize(),
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
            return false;
          });
        });
    </script>
  </body>

</html>