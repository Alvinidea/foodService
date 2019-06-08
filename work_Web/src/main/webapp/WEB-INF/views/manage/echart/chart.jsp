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
                    <div id="main3" style="width: 600px;height:400px;">
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="/js/echart/dist/echarts.min.js"></script>
<script type="text/javascript">

    layui.use(['carousel','layer','element'], function() {

        var myChart2 = echarts.init(document.getElementById('main3'));
        // 指定图表的配置项和数据

        var order = [340, 232, 201, 154, 190, 330, 410];
        var orderFromStore =[320, 150, 150, 150, 150, 150, 150];
        var orderFromCarteen =[20, 150, 10, 50, 250, 550, 40];
        var orderWay =[20, 332, 301, 334, 390, 330, 320]
        var option2 = {
            title: {
                text: '订单信息'
            },
            tooltip : {
                trigger: 'axis',
                axisPointer: {
                    type: 'cross',
                    label: {
                        backgroundColor: '#6a7985'
                    }
                }
            },
            legend: {
                data:['订单','食堂订单','商铺订单','跑腿订单']
            },
            toolbox: {
                feature: {
                    saveAsImage: {}
                }
            },
            grid: {
                left: '3%',
                right: '4%',
                bottom: '3%',
                containLabel: true
            },
            xAxis : [
                {
                    type : 'category',
                    boundaryGap : false,
                    data : ['七天前','六天前','五天前','四天前','三天前','前天','昨天']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'跑腿订单',
                    type:'line',
                    stack: '总量',
                    areaStyle: {},
                    data:orderWay
                },
                {
                    name:'食堂订单',
                    type:'line',
                    stack: '总量',
                    areaStyle: {normal: {}},
                    data:orderFromCarteen
                },
                {
                    name:'商铺订单',
                    type:'line',
                    stack: '总量',
                    areaStyle: {normal: {}},
                    data:orderFromStore
                },
                {
                    name:'订单',
                    type:'line',
                    stack: '总量',
                    label: {
                        normal: {
                            show: true,
                            position: 'top'
                        }
                    },
                    areaStyle: {normal: {}},
                    data:order
                }
            ]
        };
        //myChart2.setOption(option2);


        //getColumn
        $.ajax({
            url:"/admin/echart/getColumn"
            ,type:"Post"
            ,success:function (data) {
                var columns = data;
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
                        data: ["用户","商铺","菜品","订单","帖子","跑腿"]
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

                var myChart2 = echarts.init(document.getElementById('main3'));
                var option2 = {
                    title : {
                        text: '系统信息占比',
                        x:'center'
                    },
                    tooltip : {
                        trigger: 'item',
                        formatter: "{a} <br/>{b} : {c} ({d}%)"
                    },
                    legend: {
                        orient: 'vertical',
                        left: 'left',
                        data: ["用户","商铺","菜品","订单","帖子","跑腿"]
                    },
                    series : [
                        {
                            name: '数据信息',
                            type: 'pie',
                            radius : '55%',
                            center: ['50%', '60%'],
                            data:[
                                {value:columns[0], name:'用户'},
                                {value:columns[1], name:'商铺'},
                                {value:columns[2], name:'菜品'},
                                {value:columns[3], name:'订单'},
                                {value:columns[4], name:'帖子'},
                                {value:columns[5], name:'跑腿'}
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

        //getColumn
        $.ajax({
            url:"/admin/echart//getOrderStoreAndCarteen"
            ,type:"Post"
            ,success:function (data) {
                var info = data;
                var myChart = echarts.init(document.getElementById('main3'));
                var option = {
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
                        data: ['商铺订单','食堂订单']
                    },
                    series : [
                        {
                            name: '访问来源',
                            type: 'pie',
                            radius : '55%',
                            center: ['50%', '60%'],
                            data:[
                                {value:columns[0], name:'用户'},
                                {value:columns[1], name:'商铺'},
                                {value:columns[2], name:'菜品'},
                                {value:columns[3], name:'订单'},
                                {value:columns[4], name:'帖子'},
                                {value:columns[5], name:'跑腿'}
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
                myChart.setOption(option);
            }
        });
    });

</script>
<script>

    var weatherIcons = {
        'Sunny': './data/asset/img/weather/sunny_128.png',
        'Cloudy': './data/asset/img/weather/cloudy_128.png',
        'Showers': './data/asset/img/weather/showers_128.png'
    };

    option = {
        title: {
            text: '天气情况统计',
            subtext: '虚构数据',
            left: 'center'
        },
        tooltip : {
            trigger: 'item',
            formatter: "{a} <br/>{b} : {c} ({d}%)"
        },
        legend: {
            // orient: 'vertical',
            // top: 'middle',
            bottom: 10,
            left: 'center',
            data: ['西凉', '益州','兖州','荆州','幽州']
        },
        series : [
            {
                type: 'pie',
                radius : '65%',
                center: ['50%', '50%'],
                selectedMode: 'single',
                data:[
                    {
                        value:1548,
                        name: '幽州',
                        label: {
                            normal: {
                                formatter: [
                                    '{title|{b}}{abg|}',
                                    '  {weatherHead|天气}{valueHead|天数}{rateHead|占比}',
                                    '{hr|}',
                                    '  {Sunny|}{value|202}{rate|55.3%}',
                                    '  {Cloudy|}{value|142}{rate|38.9%}',
                                    '  {Showers|}{value|21}{rate|5.8%}'
                                ].join('\n'),
                                backgroundColor: '#eee',
                                borderColor: '#777',
                                borderWidth: 1,
                                borderRadius: 4,
                                rich: {
                                    title: {
                                        color: '#eee',
                                        align: 'center'
                                    },
                                    abg: {
                                        backgroundColor: '#333',
                                        width: '100%',
                                        align: 'right',
                                        height: 25,
                                        borderRadius: [4, 4, 0, 0]
                                    },
                                    Sunny: {
                                        height: 30,
                                        align: 'left',
                                        backgroundColor: {
                                            image: weatherIcons.Sunny
                                        }
                                    },
                                    Cloudy: {
                                        height: 30,
                                        align: 'left',
                                        backgroundColor: {
                                            image: weatherIcons.Cloudy
                                        }
                                    },
                                    Showers: {
                                        height: 30,
                                        align: 'left',
                                        backgroundColor: {
                                            image: weatherIcons.Showers
                                        }
                                    },
                                    weatherHead: {
                                        color: '#333',
                                        height: 24,
                                        align: 'left'
                                    },
                                    hr: {
                                        borderColor: '#777',
                                        width: '100%',
                                        borderWidth: 0.5,
                                        height: 0
                                    },
                                    value: {
                                        width: 20,
                                        padding: [0, 20, 0, 30],
                                        align: 'left'
                                    },
                                    valueHead: {
                                        color: '#333',
                                        width: 20,
                                        padding: [0, 20, 0, 30],
                                        align: 'center'
                                    },
                                    rate: {
                                        width: 40,
                                        align: 'right',
                                        padding: [0, 10, 0, 0]
                                    },
                                    rateHead: {
                                        color: '#333',
                                        width: 40,
                                        align: 'center',
                                        padding: [0, 10, 0, 0]
                                    }
                                }
                            }
                        }
                    },
                    {value:535, name: '荆州'},
                    {value:510, name: '兖州'},
                    {value:634, name: '益州'},
                    {value:735, name: '西凉'}
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

</script>

</body>
</html>
