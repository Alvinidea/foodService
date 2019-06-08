<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/2
  Time: 19:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>帖子评论</title>
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
<div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a>
          <cite>导航元素</cite></a>
      </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<div class="x-body">
    <div class="layui-row">

    </div>
    <table id="demo" lay-filter="test" class="layui-hide"></table>
</div>
<script type="text/html" id="toolbarDemo">
    <div class="layui-btn-container">
        <button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
        <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
        <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
    </div>
</script>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<script src="/js/DateUtil.js"></script>
<script>
    layui.use(['table','form'], function() {
        var table = layui.table;
        var form = layui.form;

        var postid = localStorage.getItem("admin_postid");
        localStorage.removeItem("admin_postid")
        if(postid == null ||postid == "" || postid==undefined)
        {
            postid="-1";
        }
        //第一个实例
        table.render({
            elem: '#demo'
            , height: 525
            , url: '/admin/forum/getReviewList' //数据接口
            , page: true //开启分页
            , limit: 10
            , where:{postid:postid}
            , toolbar: '#toolbarDemo'
            , cols: [[ //表头
                {type: 'checkbox', fixed: 'left'}//左边多选框
                , {field: 'posttitle', title: '帖子标题', width: 180, sort: true}
                , {field: 'userphotod', title: '用户头像', width: 80
                    ,  templet:function (d) {
                        return "<img src=\'"+d.userphotod+"\'style='width: 30px;height: 30px' />";
                    }
                }
                , {field: 'username', title: '评论者', width: 80}
                , {field: 'reviewcontext', title: '内容', width: 260
                    ,  templet:function (d) {
                        return "<p> "+ d.reviewcontext +" </p>";
                    }}
                , {field: 'reviewpic', title: '评论图片', width: 100
                    ,  templet:function (d) {
                        if(d.reviewpic == "" ||d.reviewpic==undefined ||d.reviewpic==null)
                            return "";
                        return picSplit(d.reviewpic);
                    },hide:true}
                , {field: 'reviewtime', title: '评论时间', width: 160, sort: true
                    ,templet:function (d) {
                        return getTime(d.reviewtime);
                    }}
                , {field: 'reviewthumb', title: '点赞', width: 80, sort: true}
                , {field: 'poststatus', title: '浏览', width: 80, sort: true}
                , {field: 'postpic', title: '帖子图片', width: 80
                    ,  templet:function (d) {
                        if(d.postpic == "" ||d.postpic==undefined ||d.postpic==null)
                            return "";
                        return picSplit(d.postpic);
                    },hide:true}
                , {field: 'userstatus', title: '用户状态', width: 80,hide:true}
                , {field: 'reviewid', title: 'ID', width: 60, sort: true,hide:true}
                , {field: 'reviewpost', title: '帖子ID', width: 60,hide:true}
                , {field: 'reviewer', title: '评论者ID', width: 80, sort: true,hide:true}
                , {fixed: 'right', width: 80, align: 'right',toolbar: '#barDemo'}//右边操作框
            ]]
            ,done:function () {
                hoverOpenImg();
                hoverOpenContext();
                hoverOpenOwer();
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
            };
        });
        //监听工具条
        table.on('tool(test)', function (obj) {
            var data = obj.data;
            if (obj.event === 'del') {
                layer.confirm('真的删除行么', function (index) {
                    //dbdel(data.orderid, 'orderid');
                    layer.close(index);
                    obj.del();
                });
            }
            else if(obj.event === 'detail')
            {
                localStorage.setItem("orderid",data.orderid);
                //layer.alert(data.orderid);
                x_admin_show("订单详情",'/store/store_info_orderItem_Detail',850 ,500);
            }
        });

        $("#search").on('click',function(){
            if($("#type").value == 0 || $("#type").value == '0') {
                layer.msg('请选择查询方式!', {icon: 5, time: 1000});
                return;
            }
            layer.msg('请选择查询方式!', {icon: 5, time: 1000});
        });
        //监听搜索框
        /* form.on('submit(search)', function (obj) {
            if($("#type").value == 0 || $("#type").value == '0') {
                layer.msg('请选择查询方式!', {icon: 5, time: 1000});
                return;
            }
            layer.msg('请选择查询方式!', {icon: 5, time: 1000});

        });
        */
    });

    function dbdel(uid,utype) {
        $.ajax({
            type: "POST"
            ,url: "/admin/mem/member_del_op"
            ,data: {id:uid,type:utype}
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
    //鼠标悬停放大图片
    function hoverOpenImg() {
        var img_show = null; // tips提示
        $('td img').hover(function () {
            var kd = $(this).width();
            kd1 = kd * 5;          //图片放大倍数
            kd2 = kd * 5 + 30;       //图片放大倍数
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

    //鼠标悬停放大显示内容
    function hoverOpenContext() {
        var img_show = null; // tips提示
        $('td[data-field*="context"] div p').hover(function () {
            var kd = $(this).width();
            kd1 = 300;          //图片放大倍数
            kd2 = 350;       //图片放大倍数
            var info = "<div class='img_msg'  style='width:" + kd1 + "px;'>"
                + $(this).text()
                + "</div>";
            img_show = layer.tips(info , this, {
                tips: [2, 'rgba(41,41,41,.5)']
                , area: [kd2 + 'px']
            });
        }, function () {
            layer.close(img_show);
        });
        //$('td img').attr('style', 'max-width:70px;display:block!important');
    }

    //鼠标悬停放大显示帖子发布者
    function hoverOpenOwer() {
        var img_show = null; // tips提示
        $('td[data-field*="reviewpost"] div').hover(function () {
            var reviewpost = $(this).text();
            var thisS = this;
            $.ajax({
                url:"/admin/forum/getOwerOfReview"
                ,type:"POST"
                ,data:{reviewpost:reviewpost}
                ,success:function (data) {
                    var kd = $(thisS ).width();
                    kd1 = 180;          //图片放大倍数
                    kd2 = 180;       //图片放大倍数
                    var info = "<div class='img_msg'  style='width:" + kd1 + "px;'>  帖子发布者："
                        + data.username
                        + "</div>";
                    img_show = layer.tips(info , thisS , {
                        tips: [2, 'rgba(41,41,41,.5)']
                        , area: [kd2 + 'px']
                    });
                }
                ,error:function () {
                    layer.alert("error");
                }
            });

        }, function () {
            layer.close(img_show);
        });
        //$('td img').attr('style', 'max-width:70px;display:block!important');
    }


    function picSplit(pic) {
        if(pic.indexOf(',') != -1) {
            var list = pic.split(',');
            var str ="";
            for(var i=0;i<list.length-1;i++)
            {
                str+="<img src=\'"+list[i]+"\'style='width: 30px;height: 30px' />";
            }
            return str;
        }
        else {
            return "<img src=\'"+pic+"\'style='width: 30px;height: 30px' />";
        }
    }
</script>
</body>
</html>

