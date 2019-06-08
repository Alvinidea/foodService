<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html class="x-admin-sm">
<head>
    <meta charset="UTF-8">
    <title>用户管理</title>
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
            <input name="username" id="username" class="layui-input" placeholder="用户名" >
            <input name="userid" id="userid" class="layui-input" placeholder="用户ID" >
            <input name="userphone" id="userphone" class="layui-input" placeholder="电话号码" >
            <input name="useremail" id="useremail" class="layui-input" placeholder="Email" >
            <div class="layui-input-inline">
                <select name="contrller" id="userstatus">
                    <option value="-1" selected>用户状态</option>
                    <option value="1">开放</option>
                    <option value="0">禁用</option>
                </select>
            </div>
            <div class="layui-btn"  lay-submit="" lay-filter="search" id="search"><i class="layui-icon">&#xe615;</i></div>
            <button class="layui-btn" type="reset" lay-submit="" lay-filter="search" >RESET</button>
        </form>
    </div>
    <xblock>
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
        <button class="layui-btn" onclick="x_admin_show('添加用户','../../admin/mem/member_add',600,350)">
            <i class="layui-icon"></i>添加</button>
        <button class="layui-btn" id="upXlsx">
            <i class="layui-icon"></i>Excel批量添加</button>
        <script type="text/html" id="toolbarDemo">
            <div class="layui-btn-container">
                <button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
                <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
                <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
            </div>
        </script>
    </xblock>
<div>
</div>
<table id="demo" lay-filter="test" class="layui-hide"></table>
</div>
<script type="text/html" id="barDemo">
    <a class="layui-btn layui-btn-primary layui-btn-radius layui-btn-xs" lay-event="detail"><i class="layui-icon">&#xe60a;</i>查看</a>
    <a class="layui-btn layui-btn-normal layui-btn-xs layui-btn-radius" lay-event="edit"><i class="layui-icon">&#xe642;</i>编辑</a>
    <a class="layui-btn layui-btn-danger layui-btn-xs layui-btn-radius" lay-event="del"><i class="layui-icon">&#xe640;</i>删除</a>
    <a class="layui-btn layui-btn-sm layui-btn-radius layui-btn-xs layui-btn-radius" lay-event="isuse">
        <i class="layui-icon">&#xe608;</i> 启/禁
    </a>
</script>
<script src="/js/DateUtil.js"></script>
<script>
    layui.use(['table','form','upload'], function() {
        var table = layui.table;
        var form = layui.form;
        var upload = layui.upload;
        //第一个实例

        upload.render({ //允许上传的文件后缀
            elem: '#upXlsx'
            ,url: '/excel/importMemExcel'
            ,accept: 'file' //普通文件
            ,exts: 'xlsx' //只允许上传excel文件
            ,done: function(data){
                var len = data.length;
                var html = "<table class=\"layui-table\">" +
                    "<tr><td>学号</td><td>姓名</td><td>地址</td></tr>";
                var over ="</table>";
                for(var t=0;t< len;t++) {
                    var tr = "<tr><td>" +
                        data[t].userid +
                        "</td><td>" +
                        data[t].username +
                        "</td><td>" +
                        data[t].useraddress +
                        "</td></tr>";
                    html = html+tr;
                }
                html = html+over;
                var loading = layer.msg("处理中，请稍后！",{icon:16,time:2800})
                setTimeout(function () {
                    layer.close(loading);
                    layer.open({
                        type: 1,
                        title: "用户信息录入完毕！",
                        closeBtn: 0,
                        shadeClose: true,
                        area: ['380px', '600px'],
                        skin: 'yourclass',
                        content: html
                    });
                },2800);
            }
        });


        table.render({
            elem: '#demo'
            ,id:'testDemo'
            , height: 525
            , url: '/admin/mem/getUserlist' //数据接口
            , page: true //开启分页
            , limit: 10
            ,where:{userid:"",username:"",userphone:"",
                useremail:"",status:-1}
            , toolbar: '#toolbarDemo'
            , cols: [[ //表头
                {type: 'checkbox', fixed: 'left'},//左边多选框

                {field: 'userid', title: 'ID', width: 80, sort: true, fixed: 'left'}
                ,{field:'userphotod' ,title:'头像',width:90,templet: function (d) {
                        return "<img src=\'"+d.userphotod+"\'style='width: 30px;height: 30px' />";
                    }
                }
                , {field: 'username', title: '用户名', width: 80}
                , {field: 'useremail', title: '邮箱', width: 200, sort: true}
                , {field: 'userphone', title: '电话号码', width: 150}
                , {field: 'useraddress', title: '地址', width: 260}
                , {field: 'userapplytime', title: '申请时间', width: 160
                ,templet:function (d) {
                        return getTime(d.userapplytime);
                    }
                }
                , {
                    field: 'userstatus', title: '状态', width: 80, sort: true
                    ,templet:function (d) {
                        if(d.userstatus == 1)
                            return "<span style='background-color: #009688; color: #fff;'>启用</span>";
                        else
                            return "<span style='background-color: red; color: #fff;'>禁用</span>";
                    }
                }
                , {field: 'userpwd', title: '密码', width: 100}
                , {field: 'userlevel', title: '等级', width: 80, sort: true}
                , {field: 'userpower', title: '权限', width: 80, sort: true}
                , {fixed: 'right', width: 320, align: 'right', toolbar: '#barDemo'}//右边操作框
            ]]
            ,done:function (res, curr, count)  {
                hoverOpenImg();
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
            if (obj.event === 'detail') {
                console.log(data);
                showDetail(data);
            }
            else if (obj.event === 'del') {

                layer.confirm('真的删除行么', function (index) {
                    dbdel(data.userid, 'userid');
                    layer.close(index);
                    obj.del();
                });
            }
            else if (obj.event === 'edit') {//编辑信息
                localStorage.setItem("userid",data.userid);
                x_admin_show('编辑信息', '../../admin/mem/member_password', 500, 620);
            }
            else if (obj.event === 'isuse') {
                var flag=0;
                if (data.userstatus === 0 || data.userstatus === '0') {
                    obj.update({userstatus: '1'});
                    layer.msg(data.userid + '已启用!',{icon: 6,time:1000});
                    flag=1;
                }
                else {
                    obj.update({userstatus: '0'});
                    layer.msg(data.userid+ '已停用!',{icon: 5,time:1000});
                    flag=0;
                }
                $.ajax({
                    url:"/admin/mem/setUserStatus"
                    ,type:"POST"
                    ,data:{
                        userid: data.userid,
                        userstatus:flag}
                    ,success:function (data) {
                        if(data == "success")
                        {}

                    }
                    ,error:function () {
                        layer.alert("修改失败");
                    }
                });
            }
        });

        $("#search").on('click',function(){
            var status = $('#userstatus option:selected').val();
            var intstatus = parseInt(status);
            var username = $('#username').val();
            var userid = $('#userid').val();
            var userphone = $('#userphone').val();
            var useremail = $('#useremail').val();
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
                        userid:userid,username:username,userphone:userphone,
                        useremail:useremail,status:intstatus
                    }
                    ,page: {
                        curr: 1 //重新从第 1 页开始
                    }
                });
            },1000);

        });

    });

    function upFileExcelTest() {
        layer.open({
            type: 1,
            title: "用户信息录入完毕！",
            closeBtn: 0,
            shadeClose: true,
            area: ['400px', '600px'],
            skin: 'yourclass',
            content: "asdasd"
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


    function showDetail(data) {
        layer.open({
            type: 1
            ,title: false //不显示标题栏
            ,closeBtn: false
            ,area: '400px;'
            ,shade: 0.8
            ,id: 'LAY_layuipro' //设定一个id，防止重复弹出
            ,resize: false
            ,btn: ['OK']
            ,btnAlign: 'c'
            ,moveType: 1 //拖拽模式，0或者1
            ,content: '    <div style="padding: 50px; line-height: 22px; background-color: #393D49; color: #fff; font-weight: 300;">\n' +
                '        <div>头像：'+
                "<img src='" +
                data.userphotod +
                "' style=\"border-radius: 6px;width: 80px;height: 80px\">"
                + '</div><br>' +
                '        <div>用户ID： '+data.userid+ '</div>' +
                '        <div>用户名： '+data.username+ '</div>' +
                '        <div>昵称：'+ data.usernamed+ '</div>' +
                '        <div>性别： '+data.usersexd+ '</div>' +
                '        <div>用户地址：'+ data.useraddress+'</div>' +
                '        <div>年龄 ：'+ data.useraged + '</div>' +
                '        <div>开始时间：'+ data.userapplytime+ '</div>' +
                '        <div>邮箱：'+ data.useremail+ '</div>' +
                '        <div>电话号码： '+data.userphone+ '</div>' +
                '        <div>简介：'+ data.userinfo+ '</div>' +
                '        <div>等级：'+ data.userlevel+ '</div>' +
                '    </div>'
            ,success: function(layero){
                var btn = layero.find('.layui-layer-btn');
            }
        });
    }
</script>
</body>
</html>