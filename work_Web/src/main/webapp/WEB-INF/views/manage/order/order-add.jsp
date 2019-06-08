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
        <form class="layui-form">
          <div class="layui-form-item">
              <label for="orderid" class="layui-form-label">
                  <span class="x-red">*</span>订单号
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="orderid" name="orderid" required="" lay-verify="required" placeholder="订单号后台自动生成"
                  autocomplete="off" class="layui-input" readonly="readonly">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="orderseller" class="layui-form-label">
                  <span class="x-red">*</span>卖家
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="orderseller" name="orderseller" required="" lay-verify="phone"
                         placeholder="卖家ID" autocomplete="off" class="layui-input">
              </div>
          </div>
          <div class="layui-form-item">
              <label for="orderpayer" class="layui-form-label">
                  <span class="x-red">*</span>买家
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="orderpayer" name="orderpayer" required="" lay-verify="required"
                         placeholder="买家ID" autocomplete="off" class="layui-input">
              </div>
          </div>
            <div class="layui-form-item">
                <label for="orderdiscount" class="layui-form-label">
                    <span class="x-red">*</span>商品号
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="orderdiscount" name="orderdiscount" required="" lay-verify="required"
                           placeholder="商品ID"  autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label for="orderallprice" class="layui-form-label">
                    <span class="x-red">*</span>总价
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="orderallprice" name="orderallprice" required="" lay-verify="required"
                           placeholder="总价自动生成" autocomplete="off" class="layui-input" readonly="readonly">
                </div>
            </div>
            <div class="layui-form-item">
                <label for="ordersaddress" class="layui-form-label">
                    <span class="x-red">*</span>卖家地址
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="ordersaddress" name="ordersaddress" required="" lay-verify="phone"
                           placeholder="卖家发货地址" autocomplete="off" class="layui-input">
                </div>
            </div>
            <div class="layui-form-item">
                <label for="orderpaddress" class="layui-form-label">
                    <span class="x-red">*</span>买家地址
                </label>
                <div class="layui-input-inline">
                    <input type="text" id="orderpaddress" name="orderpaddress" required="" lay-verify="required"
                           placeholder="买家地址" autocomplete="off" class="layui-input">
                </div>
            </div>
          <div class="layui-form-item">
              <label for="orderstatus" class="layui-form-label">
                  <span class="x-red">*</span>订单状态
              </label>
              <div class="layui-input-inline">
                  <select id="orderstatus" name="orderstatus" class="valid">
                      <option value="">订单状态</option>
                      <option value="1">待付款</option>
                      <option value="2">待确认</option>
                      <option value="3">待发货</option>
                      <option value="4">待收货</option>
                      <option value="5">待评价</option>
                      <option value="6">已完成</option>
                      <option value="7">买家申请取消</option>
                      <option value="8">卖家申请取消</option>
                      <option value="9">已取消</option>
                  </select>
              </div>
          </div>
          <div class="layui-form-item">
              <label for="orderpaymethod" class="layui-form-label">
                  <span class="x-red">*</span>支付方式
              </label>
              <div class="layui-input-inline">
                  <select name="orderpaymethod" id="orderpaymethod">
                    <option value="">支付方式</option>
                    <option value="alipay">支付宝</option>
                    <option value="wechat">微信</option>
                    <option value="paywithcash">货到付款</option>
                  </select>
              </div>
          </div>
          <div class="layui-form-item">
              <label for="add" class="layui-form-label">
              </label>
              <button  class="layui-btn" id="add" name="add" lay-filter="add" lay-submit="">
                  增加
              </button>
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
            nikename: function(value){
              if(value.length < 5){
                return '昵称至少得5个字符啊';
              }
            }
            ,pass: [/(.+){6,12}$/, '密码必须6到12位']
            ,repass: function(value){
                if($('#L_pass').val()!=$('#L_repass').val()){
                    return '两次密码不一致';
                }
            }
          });

          //监听提交
          form.on('submit(add)', function(data){
            console.log(data);
            //发异步，把数据提交给php
            layer.alert("增加成功", {icon: 6},function () {
                // 获得frame索引
                var index = parent.layer.getFrameIndex(window.name);
                //关闭当前frame
                parent.layer.close(index);
            });
            return false;
          });
        });
    </script>

  </body>

</html>