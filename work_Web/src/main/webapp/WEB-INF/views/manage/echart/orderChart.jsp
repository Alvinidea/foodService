<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/5/19
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/5/18
  Time: 19:54
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

    layui.use(['carousel','layer','element'], function() {


        //getColumn
        $.ajax({
            url:"/admin/echart/getOrderStoreAndCarteen"
            ,type:"Post"
            ,success:function (data) {
                //var columns = data;
                var columns = [120,82,38,90];
                var myChart1 = echarts.init(document.getElementById('main1'));
                var option1 = {
                    title: {
                        text: '系统信息柱状图'
                    },
                    tooltip: {},
                    legend: {
                        data:['数目']
                    },
                    xAxis: {
                        data: ['订单','商铺订单','食堂订单','跑腿订单']
                    },
                    yAxis: {},
                    series: [{
                        name: '数目',
                        type: 'bar',
                        data: columns
                    }]
                };
                // 使用刚指定的配置项和数据显示图表。
                myChart1.setOption(option1);
                var myChart2 = echarts.init(document.getElementById('main2'));
                var option2 = {
                    title : {
                        text: '订单归属信息',
                        x:'center'
                    },
                    tooltip : {
                        trigger: 'item',
                        formatter: "{a} <br/>{b} : {c} ({d}%)"
                    },
                    legend: {
                        orient: 'vertical',
                        left: 'left',
                        data: ['订单','商铺订单','食堂订单','跑腿']
                    },
                    series : [
                        {
                            name: '访问来源',
                            type: 'pie',
                            radius : '55%',
                            center: ['50%', '60%'],
                            data:[
                                {value:columns[0], name:'订单'},
                                {value:columns[1], name:'食堂订单'},
                                {value:columns[2], name:'商铺订单'},
                                {value:columns[3], name:'跑腿'}
                            ],
                            itemStyle: {
                                emphasis: {
                                    shadowBlur: 10,
                                    shadowOffsetX: 0,
                                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                                }
                            }
                        }
                    ]
                };
                myChart2.setOption(option2);
            }
        });
    });

</script>

</body>
</html>
