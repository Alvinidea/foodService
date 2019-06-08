<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="x-admin-sm">
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
    <div class="x-body">
        <blockquote class="layui-elem-quote">欢迎管理员：
            <span class="x-red">test</span>！当前时间:2018-04-25 20:50:53  <a onclick="parent.x_admin_add_to_tab('打开layui','https://www.layui.com',true)" style="color: red" href="javascript:;">在tab打开</a>
        </blockquote>
        <fieldset class="layui-elem-field">
            <legend>数据统计</legend>
            <div class="layui-field-box">
                <div class="layui-col-md12">
                    <div class="layui-card">
                        <div class="layui-card-body">
                            <div class="layui-carousel x-admin-carousel x-admin-backlog" lay-anim="" lay-indicator="inside" lay-arrow="none" style="width: 100%; height: 90px;">
                                <div carousel-item="">
                                    <ul class="layui-row layui-col-space10 layui-this">
                                        <li class="layui-col-xs2">
                                            <a href="javascript:;" class="x-admin-backlog-body">
                                                <h3>文章数</h3>
                                                <p>
                                                    <cite>66</cite></p>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs2">
                                            <a href="javascript:;" class="x-admin-backlog-body">
                                                <h3>会员数</h3>
                                                <p>
                                                    <cite>12</cite></p>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs2">
                                            <a href="javascript:;" class="x-admin-backlog-body">
                                                <h3>回复数</h3>
                                                <p>
                                                    <cite>99</cite></p>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs2">
                                            <a href="javascript:;" class="x-admin-backlog-body">
                                                <h3>商品数</h3>
                                                <p>
                                                    <cite>67</cite></p>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs2">
                                            <a href="javascript:;" class="x-admin-backlog-body">
                                                <h3>文章数</h3>
                                                <p>
                                                    <cite>67</cite></p>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs2">
                                            <a href="javascript:;" class="x-admin-backlog-body">
                                                <h3>文章数</h3>
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
            <legend>系统通知</legend>
            <div class="layui-field-box">
                <table class="layui-table" lay-skin="line">
                    <tbody>
                        <tr>
                            <td >
                                <a class="x-a" href="/" target="_blank">美食系统 1.0上线了</a>
                            </td>
                        </tr>
                        <tr>
                            <td >
                                <a class="x-a" href="/" target="_blank">开发者联系QQ: 276157760</a>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </fieldset>
        <fieldset class="layui-elem-field">
            <legend>系统信息</legend>
            <div class="layui-field-box">
                <table class="layui-table">
                    <tbody>
                        <tr>
                            <th>系统版本</th>
                            <td>1.1.1</td></tr>
                        <tr>
                            <th>服务器地址</th>
                            <td>localhost:8888</td></tr>
                        <tr>
                            <th>操作系统</th>
                            <td>windows</td></tr>
                        <tr>
                            <th>运行环境</th>
                            <td>Apache/2.4.23 </td></tr>
                        <tr>
                            <th>Spring</th>
                            <td>5.6.27</td></tr>
                        <tr>
                            <th>SpringMVC</th>
                            <td>5.5.5</td></tr>
                        <tr>
                            <th>MYSQL版本</th>
                            <td>5.5.53</td></tr>
                        <tr>
                            <th>Mybatis</th>
                            <td>5.0.18</td></tr>
                        <tr>
                            <th>上传附件限制</th>
                            <td>2M</td></tr>
                        <tr>
                            <th>执行时间限制</th>
                            <td>30s</td></tr>
                        <tr>
                            <th>剩余空间</th>
                            <td>86015.2M</td></tr>
                    </tbody>
                </table>
            </div>
        </fieldset>
        <fieldset class="layui-elem-field">
            <legend>开发</legend>
            <div class="layui-field-box">
                <table class="layui-table">
                    <tbody>
                        <tr>
                            <th>版权所有</th>
                            <td>myFoodService
                                <a href="http://www.baidu.com/" class='x-a' target="_blank">访问baidu</a></td>
                        </tr>
                        <tr>
                            <th>开发者</th>
                            <td>何超凡</td></tr>
                    </tbody>
                </table>
            </div>
        </fieldset>
        <blockquote class="layui-elem-quote layui-quote-nm">本系统由layui,jquery,x-admin,java,mybatis提供技术支持。</blockquote>
    </div>
    </body>
</html>