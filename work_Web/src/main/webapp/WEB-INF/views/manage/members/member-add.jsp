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
        <form class="layui-form" id="userInfo">
            <div class="layui-form-item">
                <label for="userid" class="layui-form-label">
                    <span class="x-red">*</span><i class="layui-icon">&#xe66f;</i>ID
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="userid" name="userid" required="" lay-verify="userid"
                           autocomplete="off" class="layui-input" placeholder="请输入ID（学号/工号）">
                </div>
                <div class="layui-form-mid layui-word-aux">
                    <span class="x-red">*</span>将会成为您唯一的登入名
                </div>
            </div>
            <div class="layui-form-item">
                <label for="username" class="layui-form-label">
                    <span class="x-red">*</span><i class="layui-icon">&#xe66f;</i>ID
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="username" name="username" required="" lay-verify="username"
                           autocomplete="off" class="layui-input" placeholder="请输入姓名">
                </div>
                <div class="layui-form-mid layui-word-aux">
                    <span class="x-red">*</span>您的名字
                </div>
            </div>
       <!--   <div class="layui-form-item">
              <label for="userpwd" class="layui-form-label">
                  <span class="x-red">*</span><i class="layui-icon">&#xe673;</i>密码
              </label>
              <div class="layui-input-inline">
                  <input type="password" id="userpwd" name="userpwd" required="" lay-verify="pass"
                  autocomplete="off" class="layui-input" placeholder="请输入密码">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  6到16个字符
              </div>
          </div>
          <div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
                  <span class="x-red">*</span><i class="layui-icon">&#xe673;</i>确认密码
              </label>
              <div class="layui-input-inline">
                  <input type="password" id="L_repass" name="repass" required="" lay-verify="repass"
                  autocomplete="off" class="layui-input" placeholder="确认密码">
              </div>
          </div>

          -->
          <div class="layui-form-item">
              <label for="userid" class="layui-form-label">
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
          form.verify({
              userid: function(value){
              if(value.length < 5){
                return 'id至少得5个字符啊';
              }
            }
          });
          //监听提交
          form.on('submit(add)', function(data){
            //发异步，把数据提交给后台
              $.ajax({
                  type: "POST",
                  url: "/admin/mem/addUser",
                  data: $("#userInfo").serialize(),
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