<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/2
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>帖子页面</title>
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
        <form class="layui-form layui-col-md12 x-so">
            <input name="user" id="user" class="layui-input" placeholder="发帖者" name="end" id="end">
            <div class="layui-input-inline">
                <select name="contrller" id="posttype">
                    <option value="" selected>帖子类型</option>
                    <option value="分享">分享</option>
                    <option value="教学">教学</option>
                    <option value="食材">食材</option>
                    <option value="学习">学习</option>
                    <option value="话题">话题</option>
                </select>
            </div>
            <div class="layui-input-inline">
                <select name="contrller" id="poststatus">
                    <option value="-1" selected>帖子状态</option>
                    <option value="1">开放</option>
                    <option value="0">禁用</option>
                </select>
            </div>
            <input type="text" name="key" id="key" placeholder="请输入标题关键字" autocomplete="off" class="layui-input">
            <div class="layui-btn"  lay-submit="" lay-filter="search" id="search"><i class="layui-icon">&#xe615;</i></div>
            <button class="layui-btn" type="reset" lay-submit="" lay-filter="search" >RESET</button>
        </form>
    </div>
    <xblock>
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
    </xblock>
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
    <a class="layui-btn layui-btn-xs" lay-event="detail">详情</a>
    <a class="layui-btn layui-btn-primary layui-btn-sm layui-btn-radius layui-btn-xs" lay-event="isuse">
        <i class="layui-icon">&#xe608;</i> 启/禁
    </a>
    <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
</script>
<div style="background-color: #189F92;color: white;border-radius: 1px"></div>

<script src="/js/DateUtil.js"></script>
<script>
    layui.use(['table','form'], function() {
        var table = layui.table;
        var form = layui.form;
        //第一个实例
        table.render({
            elem: '#demo'
            ,id:'testDemo'
            , height: 525
            , url: '/admin/forum/getPostList' //数据接口
            , page: true //开启分页
            , limit: 10
            , where:{
                postuser:"",posttype:"",posttitle:"",
                poststatus:-1,postscan:-1,postthumb:-1
            }
            , toolbar: '#toolbarDemo'
            , cols: [[ //表头
                {type: 'checkbox', fixed: 'left'}//左边多选框
                , {field: 'postid', title: 'ID', width: 60, sort: true, fixed: 'left'}
                , {field: 'postuser', title: '用户ID', width: 100,hide:true}
                , {field: 'userphotod', title: '头像', width: 60
                    ,  templet:function (d) {
                        return "<img src=\'"+d.userphotod+"\'style='width: 30px;height: 30px' />";
                    }
                }
                , {field: 'username', title: '用户名', width: 80, sort: true,hide:true}
                , {field: 'posttitle', title: '标题', width: 220}
                , {field: 'postcontext', title: '内容', width: 260
                    ,  templet:function (d) {
                        return "<p> "+ d.postcontext +" </p>";
                    }}
                , {field: 'posttype', title: '类型', width: 80,sort: true
                    ,  templet:function (d) {
                        var color = '#2D93CA',bgcolor="white";
                        switch (d.posttype) {
                            case '分享':color = "df5000";break;
                            case '食材':color = "#189F92";break;
                            case '话题':color = "#849483";break;
                        }
                        var str ="<span style=\"background-color:"+
                            bgcolor
                            +";color:"+
                            color
                            + ";border-radius: 2px\">" +
                            d.posttype
                            + "</span>";
                        return str;
                    }}
                , {field: 'postpic', title: '帖子图片', width: 200
                    ,  templet:function (d) {
                        return picSplit(d.postpic);
                    }}
                , {field: 'poststatus', title: '帖子状态', width: 80
                    ,  templet:function (d) {
                    var status = "开放",color = "green"
                        if(d.poststatus ==1) {
                            status = "开放";color = "green";
                        }else{
                            status = "禁用";color = "red";
                        }
                        return "<span style='color:" +
                            color +
                            "'>" +
                            status +
                            "</span>";
                    }}
                , {field: 'posttime', title: '发布时间', width: 160, sort: true
                    ,templet:function (d) {
                        return getTime(d.posttime);
                    }}
                , {field: 'postscan', title: '浏览', width: 80, sort: true}
                , {field: 'postthumb', title: '点赞', width: 80, sort: true}
                , {field: 'userlevel', title: '用户等级', width: 80,hide:true}
                , {field: 'userstatus', title: '用户等级', width: 80,hide:true}
                , {fixed: 'right', width: 220, align: 'right',toolbar: '#barDemo'}//右边操作框
            ]]
            ,done:function () {
                hoverOpenImg();
                hoverOpenContext();
               // hoverOpenContexttest();
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
                localStorage.setItem("admin_postid",data.postid);
                //layer.alert(data.orderid);
                x_admin_show("帖子详情",'/admin/forum/review_list',1100 ,600);
            }else if (obj.event === 'isuse') {
                console.log(obj);
                var flag=0;
                if (data.poststatus === 0 || data.poststatus === '0') {
                    obj.update({poststatus: 1});
                    layer.msg(data.postid + '已启用!',{icon: 6,time:1000});
                    flag=1;
                }
                else {
                    obj.update({poststatus: '0'});
                    layer.msg(data.postid+ '已停用!',{icon: 5,time:1000});
                    flag=0;
                }

            }
        });

        $("#search").on('click',function(){
            var type = $('#posttype option:selected').val();
            var status = $('#poststatus option:selected').val();
            var intstatus = parseInt(status);
            var key = $('#key').val();
            var user = $('#user').val();
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
                        postuser:user,posttype:type,posttitle:key,
                        poststatus:intstatus,postscan:-1,postthumb:-1
                    }
                    ,page: {
                        curr: 1 //重新从第 1 页开始
                    }
                });
            },1000);

        });
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
            kd2 = 450;       //图片放大倍数
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

    function hoverOpenContexttest() {
        var img_show = null; // tips提示
        $('td[data-field*="post"] div').hover(function () {
            var kd = $(this).width();
            kd1 = 180;          //图片放大倍数
            kd2 = 180;       //图片放大倍数
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
