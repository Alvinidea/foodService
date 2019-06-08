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
                    ID
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="userid" name="userid" readonly="readonly"
                            value="test" placeholder="ID" class="layui-input">
                </div>
            </div>
          <div class="layui-form-item">
              <label for="username" class="layui-form-label">
                  昵称
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="username" name="username" placeholder="姓名" class="layui-input">
              </div>
          </div>
            <div class="layui-form-item">
                <label for="useremail" class="layui-form-label">
                    email
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="useremail" name="useremail"  placeholder="email" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label for="userphone" class="layui-form-label">
                    phone
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="userphone" name="'userphone" placeholder="phone" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label for="useraddress" class="layui-form-label">
                   地址
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="useraddress" name="useraddress"  placeholder="address" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label for="userstatus" class="layui-form-label">
                    状态
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="userstatus" name="userstatus"  placeholder="status" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label for="userpwd" class="layui-form-label">
                    密码
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="userpwd" name="userpwd"  placeholder="passcode" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label for="userlevel" class="layui-form-label">
                    等级
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="userlevel" name="userlevel"  placeholder="level" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label for="userpower" class="layui-form-label">
                    权限
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="userpower" name="userpower" placeholder="权限" class="layui-input">
                </div>
            </div>
          <div class="layui-form-item">
              <input value="修改" lay-submit lay-filter="modify" style="width:100%;" type="submit"
                     class="layui-btn layui-btn-radius layui-btn-normal">
          </div>
      </form>
    </div>
    <script>
            layui.use(['form','layer'], function(){
                $ = layui.jquery;
              var form = layui.form
              ,layer = layui.layer;
                //获取上一个页面id信息
              var userid = localStorage.getItem("userid");
              //清理缓存
              localStorage.removeItem('userid');
              //从后台获取数据
              getUser (userid ) ;
            //先获取数据 通过id
              //监听提交
              form.on('submit(modify)', function(data){
                  $.ajax({
                      type: "POST",
                      url: "/admin/mem/modifyUser",
                      data: $("#userInfo").serialize(),
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
            function getUser (uid) {
                $.ajax({
                    type: "POST"
                    ,url: "/admin/mem/getUser"
                    ,data:
                        { userid:uid}
                    ,success: function (data) {
                        $("#userid").val(data.userid);
                        $("#username").val( data.username);
                        $("#useremail").val( data.useremail);
                        $("#userphone").val(data.userphone);
                        $("#useraddress").val( data.useraddress);
                        $("#userstatus").val(data.userstatus);
                        $("#userpwd").val( data.userpwd);
                        $("#userlevel").val( data.userlevel);
                        $("#userpower").val(data.userpower);
                    },
                    error:function () {
                        layer.alert(uid+"错误！！！");
                    }
                })
            }
        </script>
  </body>

</html>