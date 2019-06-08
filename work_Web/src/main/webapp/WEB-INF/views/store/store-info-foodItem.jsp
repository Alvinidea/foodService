<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/13
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta property="qc:admins" content="10660160706551301301616375">
    <title>校园商铺-成工美食_原创校园生活美食平台，师生全都是吃货！</title>
    <meta name="keywords" content="校园,美食">
    <meta name="description" content="校园,美食">
    <meta name="msapplication-tooltip" content="成工美食">
    <meta name="renderer" content="webkit">
    <link rel="alternate" media="only screen and (max-width: 640px)" href="https://m.meishichina.com/">
    <link rel="shortcut icon" href="https://static.meishichina.com/v6/img/lib/f.ico">
    <link rel="apple-touch-icon" href="https://static.meishichina.com/v6/img/lib/wapico.png">

    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="application/javascript" src="/lib/layui/layui.js"></script>
    <link rel="stylesheet" href="/lib/layui/css/layui.css"/>
    <link >
</head>
<body>
<div class="layui-nav" style="height: 50px;background-color: #E9E7E7;padding-top: 5px">
      <span class="layui-breadcrumb" >
        <a href="">首页</a>
        <a>
          <cite>菜品信息</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"
       href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:25px;border-radius: 3px">ဂ</i></a>
</div>
<hr>
<div class="x-body">
    <div class="layui-row">
        <form  class="layui-form layui-col-md12 x-so">
            <div class="layui-inline">
                <div class="layui-input-inline">
                <input type="text" id="goodsid" name="goodsid" lay-verify="goodsid"
                       placeholder="菜品ID" autocomplete="off" class="layui-input">
                </div>
                <div class="layui-input-inline">
                <input type="text" id="goodsname" name="goodsname" lay-verify="goodsname"
                       placeholder="菜品名称" autocomplete="off" class="layui-input">
                </div>
                <div class="layui-btn"  lay-submit="" lay-filter="search" id="search">
                    <i class="layui-icon">&#xe615;</i>
                </div>
                <button class="layui-btn" type="reset" lay-submit="" lay-filter="search" >RESET</button>
            </div>
        </form>
    </div>
    <hr>

    <script type="text/html" id="toolbarDemo">
            <div class="layui-btn-container">
                <button class="layui-btn layui-btn-sm" lay-event="getCheckData"> 获取选中行数据</button>
                <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
                <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
                <button id="addfood" class="layui-btn layui-btn-sm" lay-event="addfood">
                    <i class="layui-icon"></i>添加
                </button>
            </div>
        </script>

    <table id="demo" lay-filter="test" class="layui-hide"></table>


</div>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-primary layui-btn-radius layui-btn-xs" lay-event="detail"><i class="layui-icon">&#xe60a;</i>查看</a>
    <a class="layui-btn layui-btn-normal layui-btn-xs layui-btn-radius" lay-event="edit"><i class="layui-icon">&#xe642;</i>编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs layui-btn-radius" lay-event="del"><i class="layui-icon">&#xe640;</i>删除</a>
</script>


<script>
    layui.use(['table','form','layer'], function() {
        var table = layui.table;
        var form = layui.form;
        var layer = layui.layer;
        //第一个实例
        table.render({
            elem: '#demo'
            ,id:"testDemo"
            , height: 535
            , url: '/store/foodItem' //数据接口
            , page: true //开启分页
            , limit: 10
            , where:{
                goodsid:"",
                goodsname:""
            }
            , toolbar: '#toolbarDemo'
            , cols: [[ //表头
                {type: 'checkbox', fixed: 'left'}//左边多选框
                , {field: 'goodspic', title: '图片', width: 80 ,templet: function (d) {
                    return "<img src=\'"+d.goodspic+"\'style='width: 30px;height: 30px' />";
                    }
                }
                , {field: 'goodsid', title: 'ID', width: 140, sort: true,hide:true}
                , {field: 'goodsname', title: '商品名', width: 100}
                , {field: 'goodsprice', title: '价格', width:80, sort: true}
                , {field: 'goodsdiscount', title: '折扣', width: 80}
                , {field: 'goodscmtnum', title: '评论数', width: 80}
                , {field: 'goodsseller', title: '申请时间', width: 120 ,hide:true}
                , {field: 'goodsstars', title: '星级', width: 80, sort: true, style: 'background-color: #009688; color: #fff;'}
                , {field: 'goodsother', title: '备注信息', width: 360}
                , {fixed: 'right', width: 220, align: 'right', toolbar: '#barDemo'}//右边操作框
            ]]
            , done: function (res, curr, count) {
                //鼠标悬停放大图片
                hoverOpenImg();
                var data = res.data;//返回的json中data数据
                /*
                for (var item in data) {
                    //司机星级
                    rate.render({
                        elem: '#avgScore' + data[item].wbfRestaurantId + ''         //绑定元素
                        , length: 5            //星星个数
                        , value: data[item].avgScore //初始化值
                        , half: true           //支持半颗星
                        , text: false           //显示文本，默认显示 '3.5星'
                        , readonly: true      //只读
                    });
                }
                */
            }

        });
        //监听多选框
        table.on('checkbox(test)', function (obj) {
            console.log(obj)
        });
        //头工具栏事件
        table.on('toolbar(test)', function(obj){
            var checkStatus = table.checkStatus(obj.config.id);
            switch(obj.event){
                case 'getCheckData':
                    var data = checkStatus.data;
                    layer.alert(JSON.stringify(data));
                    break;
                case 'getCheckLength':
                    var data = checkStatus.data;
                    layer.msg('选中了：'+ data.length + ' 个');
                    break;
                case 'isAll':
                    layer.msg(checkStatus.isAll ? '全选': '未全选');
                    break;
                case 'addfood':
                    x_admin_show('添加商品','/store/addItem',520,400);
                    break;
            };
        });
        //监听工具条
        table.on('tool(test)', function (obj) {
            var data = obj.data;
            if (obj.event === 'detail') {
                showDetail(obj.data);
            } else if (obj.event === 'del') {
                layer.confirm('真的删除行么', function (index) {
                    dbdel(data.goodsid, 'goodsid');
                    layer.close(index);
                    obj.del();
                });
            } else if (obj.event === 'edit') {//编辑信息
                //localStorage.setItem("goodsinfo",data);
                setLocalStorage(data);//设置信息到下一个页面取出来
                x_admin_show('编辑信息', '/store/editItem', 500, 560);
            }
        });

        $("#search").on('click',function(){
            var goodsname= $('#goodsname').val();
            var goodsid= $('#goodsid').val();
            /*
            if(type == "" && key=="" && user=="" && intstatus == -1)
            {
                layer.msg("您没有选择条件呢！",{icon:15,shade:0.01,time:800});
                return ;
            }
            */
            var loading = layer.msg("查询中。。。",{icon:16,shade:0.02});
            setTimeout(function () {
                layer.close(loading);
                table.reload('testDemo', {
                    where: { //设定异步数据接口的额外参数，任意设
                        goodsid:goodsid,
                        goodsname:goodsname
                    }
                    ,page: {
                        curr: 1 //重新从第 1 页开始
                    }
                });
            },1000);

        });
    });

    function dbdel(uid) {
        $.ajax({
            type: "POST"
            ,url: "/store/delItem_op"
            ,data: {goodsid:uid}
            ,success: function (data) {
                if(data == 'success')
                    layer.alert(uid+"删除成功！！！");
                else
                    layer.alert(uid+"删除失败！！！");
            },
            error:function () {
                layer.alert(uid+"错误！！！");
            }
        })
    }

    function delAll (argument) {
        var data = tableCheck.getData();
        layer.confirm('确认要删除吗？'+data,function(index){
            //捉到所有被选中的，发异步进行删除
            layer.msg('删除成功', {icon: 1});
            $(".layui-form-checked").not('.header').parents('tr').remove();
        });
    }

    function x_admin_show(title,url,w,h){
        if (title == null || title == '') {
            title=false;
        };
        if (url == null || url == '') {
            url="404.html";
        };
        if (w == null || w == '') {
            w=($(window).width()*0.9);
        };
        if (h == null || h == '') {
            h=($(window).height() - 50);
        };
        layer.open({
            type: 2,
            area: [w+'px', h +'px'],
            fix: false, //不固定
            maxmin: true,
            shadeClose: true,
            shade:0.4,
            title: title,
            content: url,
            success: function(){
                //窗口加载成功刷新frame
                // location.replace(location.href);
            },
            cancel:function(){
                //关闭窗口之后刷新frame
                // location.replace(location.href);
            },
            end:function(){
                //窗口销毁之后刷新frame
                // location.replace(location.href);
            }
        });
    }

    function showDetail(data) {
        layer.open({
            type: 1
            ,title: false //不显示标题栏
            ,closeBtn: false
            ,area: '300px;'
            ,shade: 0.8
            ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
            ,resize: false
            ,btn: ['OK']
            ,btnAlign: 'c'
            ,moveType: 1 //拖拽模式，0或者1
            ,content: '    <div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">\n' +
                '        <div>头像：<br><img src=\''+ data.goodspic+'\' style="width: 50px;height: 50px;border-radius: 6px"></div>' +
                '        <div>ID  ：<br>'+ data.goodsid + '</div>' +
                '        <div>商品名：<br>'+ data.goodsname+ '</div>' +
                '        <div>价格：<br>'+ data.goodsprice+ '</div>' +
                '        <div>折扣：<br> '+data.goodsdiscount+ '</div>' +
                '        <div>评论数：<br>'+ data.goodscmtnum+ '</div>' +
                '        <div>卖家：<br>'+ data.goodsseller+ '</div>' +
                '        <div>星级：<br> '+data.goodsstars+ '</div>' +
                '        <div>备注信息：<br>'+ data.goodsother+ '</div>' +
                '    </div>'
            ,success: function(layero){
                var btn = layero.find('.layui-layer-btn');
            }
        });
    }
        //设置信息
    function setLocalStorage( data) {
        var str = data.goodsid+','
            +data.goodspic+','
            +data.goodsname+','
            +data.goodsprice+','
            +data.goodsdiscount+','
            +data.goodscmtnum+','
            +data.goodsseller+','
            +data.goodsstars+','
            +data.goodsother;
        localStorage.setItem("goodsinfo",str);
    }

    //鼠标悬停放大图片
    function hoverOpenImg() {
        var img_show = null; // tips提示
        $('td img').hover(function () {
            var kd = $(this).width();
            kd1 = kd * 3;          //图片放大倍数
            kd2 = kd * 3 + 30;       //图片放大倍数
            var img = "<img class='img_msg' src='" + $(this).attr('src') + "' style='width:" + kd1 + "px;' />";
            img_show = layer.tips(img, this, {
                tips: [2, 'rgba(41,41,41,.5)']
                , area: [kd2 + 'px']
            });
        }, function () {
            layer.close(img_show);
        });
        //$('td img').attr('style', 'max-width:70px;display:block!important');
    }
</script>

</body>
</html>
