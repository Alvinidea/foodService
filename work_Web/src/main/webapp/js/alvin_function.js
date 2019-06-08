
//论坛的帖子模板
function createPostSign(userurl,photoloc,posttype,
                        posturl,posttitle,foodpics,
                        username,level,postTime,
                        scanNum,reviewNum) {
    var postdata = "<li style=\"height: 200px\"> "
        +"<a href=" +
        userurl  //----------------------个人信息url
        +" class=\"fly-avatar\">"
        +"<img src=" +
        photoloc//----------------------头像地址
        +" alt=\"flylayer\">"
        +"</a><h2><a class=\"layui-badge\">" +
        posttype//----------------------帖子类型
        +"</a><a href="+
        posturl //----------------------帖子url
        + ">"+
        posttitle//----------------------帖子标题
        +"</a></h2><br/><div>"
        +"<img src=" +
        foodpics //----------------------图片显示地址
        +"></div><div class=\'fly-list-info\'><a href=\""
        + userurl  //----------------------个人信息地址
        +"\" link=\"\">"
        +"<cite>"+
        username // ----------------------用户名称
        +"</cite><i class=\"layui-badge fly-badge-vip\">等级" +
        level//----------------------等级
        +"</i></a><span>"+
        postTime//----------------------post时间
        +"</span><span class=\"fly-list-kiss layui-hide-xs\" title=\"浏览\">"
        +"<i class=\"iconfont icon-kiss\" ></i>浏览 " +
        scanNum//----------------------浏览量
        +"</span>"
        +"<span class=\"fly-list-nums\"> <i class=\"iconfont icon-pinglun1\" title=\"回答\"></i> 回复" +
        reviewNum//----------------------回复量
        + "</span>"
        +"</div> <div class=\"fly-list-badge\"> </div> </li>"
    return postdata;
}

function createReviewSign(reviewid,userid,userpicd,username,
                          userlevel,reviewtime,reviewcontext,
                          respNum) {
    var str ="<li style=\"height: 100px\" id="+
        reviewid
        +"><a href="+
            "look_user_info?userid="+userid    //个人信息页面
        +" ><img src="+
        userpicd //头像
        +"class=\"layui-nav-img\"><cite>"+
        username                    //用户名称
        +"</cite><i class=\"layui-badge\">等级"+
        userlevel                   //用户等级
        +"</i><cite>"+
        reviewtime                  //评论时间
        +"</cite></a><div>"+
        reviewcontext               //评论内容
        +"</div><div><span class=\"alvin_span_list\"> "
        +"<i class=\"alvin_iconfont alvin_icon-pinglun1\" title=\"回答\"></i>回复"+
        respNum                     //回复数目
        +"</span></div><hr></li>";
        return str;
}

function createGoodsSign(goodsid,pic,goodsname,goodsprice
    ,goodsdiscount,goodsstars,goodscmtnum) {
    var str ="<div class=\"alvin-goods-module\"> <div class=\"alvin-goods-main\"> "
        + " <div class=\"alvin-goods-pic\"> <a href=\""
        + "store_goods"+goodsid//位置
        +"> <img src="
        + "/pic/alvin.jpg"//图片位置
        +"/></a></div><div class=\"alvin-goods-nameprice\"><div class=\"alvin-goods-name\">"
        +"<a href=\"store_goods\">"
        +goodsname
        +"</a></div><div class=\"alvin-goods-averPrice\">价格：<span>"
        +goodsprice
        +"</span></div><div class=\"alvin-goods-discount\">"
        +" 折扣：<span>"
        +goodsdiscount
        +"</span>折</div> </div> </div><div class=\"alvin-goods-lsc\">"
        +"<div class=\"alvin-goods-star\"><i class=\"layui-icon\">&#xe658;</i>"
        +goodsstars
        +"</div><div class=\"alvin-goods-cmt\"><i class=\"layui-icon\">&#xe60a;</i>"
        +goodscmtnum
        +"</div><div class=\"alvin-goods-buycar \"><span class=\"layui-btn layui-btn-radius layui-btn-sm\""
        +"onclick=\"addGoods("
        +goodsid
        +")\"> <i class=\"layui-icon layui-icon-cart\"></i>加入购物车"
        +"</span> </div> </div> </div>";
    return str;
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


function getUrlParam(name) {
    var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
    var r = window.location.search.substr(1).match(reg);  //匹配目标参数
    if (r != null) return unescape(r[2]); return null; //返回参数值
}
//时间转换
function getTime(time) {
    //628362060000初始时间
    var timestamp = (new Date()).getTime();
    var interval = timestamp -  time;
    interval = interval/1000;
    if(interval < 60)
    {
        return interval+"秒前"
    }else if(interval / 60 < 60)
    {
        return parseInt(interval/60)+"分钟前"
    }else if(interval / 60/60 < 24)
    {
        return parseInt(interval/60/ 60)+"小时前"
    } else if(interval / 60/60/24 < 24)
    {
        return parseInt(interval/60/ 60/24)+"天前"
    } else if(interval / 60/60/24/7 < 4)
    {
        return parseInt(interval/60/ 60/24/7)+"周前"
    } else if(interval / 60/60/24/30 < 12)
    {
        return parseInt(interval/60/ 60/24/30)+"月前"
    } else
    {
        return parseInt(interval/60/ 60/24/360)+"年前"
    }
}

function getDate(str){
    var oDate = new Date(str),
        oYear = oDate.getFullYear(),
        oMonth = oDate.getMonth()+1,
        oDay = oDate.getDate(),
        oHour = oDate.getHours(),
        oMin = oDate.getMinutes(),
        oSen = oDate.getSeconds(),
        oTime = oYear +'-'+ getzf(oMonth) +'-'+ getzf(oDay) +' '+ getzf(oHour) +':'+ getzf(oMin) +':'+getzf(oSen);//最后拼接时间
    return oTime;
};
//补0操作
function getzf(num){
    if(parseInt(num) < 10){
        num = '0'+num;
    }
    return num;
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