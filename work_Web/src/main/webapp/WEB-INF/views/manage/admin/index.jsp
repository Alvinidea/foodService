<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>KITADMIN 后台管理模板</title>

  <link rel="stylesheet" href="../../../../lib/layui/css/layui.css">
  <script type="application/javascript" src="../../../../lib/layui/layui.js" ></script>

</head>

<body class="layui-layout-body kit-theme-default">
<div >
  <ul class="layui-nav">
    <li class="layui-nav-item">
      <a href="">控制台<span class="layui-badge">9</span></a>
    </li>
    <li class="layui-nav-item">
      <a href="">个人中心<span class="layui-badge-dot"></span></a>
    </li>
    <li class="layui-nav-item">
      <a href=""><img src="//t.cn/RCzsdCq" class="layui-nav-img">我</a>
      <dl class="layui-nav-child">
        <dd><a href="javascript:;">修改信息</a></dd>
        <dd><a href="javascript:;">安全管理</a></dd>
        <dd><a href="javascript:;">退了</a></dd>
      </dl>
    </li>
  </ul>
</div>
<script>
  //注意：导航 依赖 element 模块，否则无法进行功能性操作
  layui.use('element', function(){
    var element = layui.element;

    //…
  });
</script>
</body>

</html>