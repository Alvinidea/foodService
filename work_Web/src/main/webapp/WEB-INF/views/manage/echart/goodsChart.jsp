<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/5/23
  Time: 18:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>ECharts</title>
    <!-- 引入 echarts.js -->
    <link rel="stylesheet" href="/lib/layui/css/layui.css">
    <script type="application/javascript" src="/lib/layui/layui.js"></script>
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>
<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div class="layui-container">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md6">
            <div class="layui-card">
                <div class="layui-card-body">
                    <div id="main1" style="width: 600px;height:400px;">
                    </div>
                </div>
            </div>
        </div>

        <div class="layui-col-md6">
            <div class="layui-card">
                <div class="layui-card-body">
                    <div id="main2" style="width: 600px;height:400px;">
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="/js/echart/dist/echarts.min.js"></script>
<script type="text/javascript">

    layui.use(['layer','element'], function() {


        //getColumn
        $.ajax({
            url:"/admin/echart/getGoodsData"
            ,type:"Post"
            ,success:function (data) {
                var list = data.split(',');
                var names = [];
                var test =  ['有蒸羊羔','蒸熊掌','蒸鹿尾儿','烧花鸭','烧雏鸡','烧子鹅','卤猪','卤鸭','酱鸡','腊肉'
                    ,'松花','小肚儿','晾肉'];
                var stars = [];
                var cmtnums = [];
                var t =0;
                for(var i=0;i<list.length;i=i+3)
                {
                    names.push(test[t]);t=t+1;
                    stars.push(list[i+1]);
                    cmtnums.push(list[i+2]);
                }

                var myChart1 = echarts.init(document.getElementById('main1'));
                var option1 = {
                    title: {
                        text: '菜品星级柱状图'
                    },
                    tooltip: {},
                    legend: {
                        data:['数目']
                    },
                    xAxis: {
                        data: names
                    },
                    yAxis: {},
                    series: [{
                        name: '星级',
                        type: 'bar',
                        data: stars
                    }]
                };
                // 使用刚指定的配置项和数据显示图表。
                myChart1.setOption(option1);

                var myChart2 = echarts.init(document.getElementById('main2'));
                var option2 = {
                    title: {
                        text: '菜品评论柱状图'
                    },
                    tooltip: {},
                    legend: {
                        data:['数目']
                    },
                    xAxis: {
                        data: names
                    },
                    yAxis: {},
                    series: [{
                        name: '数目',
                        type: 'bar',
                        data: cmtnums
                    }]
                };
                // 使用刚指定的配置项和数据显示图表。
                myChart2.setOption(option2);
            }
        });
    });

</script>

</body>
</html>

