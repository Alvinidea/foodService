<%--
  Created by IntelliJ IDEA.
  User: ALVIN
  Date: 2019/4/12
  Time: 9:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<!-- saved from url=(0028)https://www.meishichina.com/ -->
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="pragma" content="no-cache">
        <meta property="qc:admins" content="10660160706551301301616375">
        <title>成工美食_原创校园生活美食平台，师生全都是吃货！</title>
        <meta name="keywords" content="校园,美食">
        <meta name="description" content="校园,美食">
        <meta name="msapplication-tooltip" content="成工美食">
        <meta name="renderer" content="webkit">
        <link rel="alternate" media="only screen and (max-width: 640px)" href="https://m.meishichina.com/">
        <link rel="shortcut icon" href="https://static.meishichina.com/v6/img/lib/f.ico">
        <link rel="apple-touch-icon" href="https://static.meishichina.com/v6/img/lib/wapico.png">
        <link rel="stylesheet" type="text/css" href="/test/all.css">
        <link rel="stylesheet" type="text/css" href="/test/wwwindex2.css">

        <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
        <script type="application/javascript" src="/lib/layui/layui.js"></script>
        <link rel="stylesheet" href="/lib/layui/css/layui.css"/>
    </head>
    <body style="">
        <div class="top-bar" id="J_top_bar">
        <ul class="bar-left left">
            <li><a title="成工美食" href="/food/index" target="_blank"
                   style="background:url(/pic/logo.jpg) no-repeat scroll left center;
                                background:url(/pic/logo.jpg) no-repeat scroll left center/108px auto;
                                width:108px">
                <i>成工美食</i>首页</a></li>
            <li> <a title="社区" href="/forum/forum_main" target="_blank">论坛</a></li>
            <li> <a title="话题" href="/store/store_main" target="_blank">商城</a></li>
            <li> <a title="话题" href="/way/wayIndex" target="_blank">跑腿</a></li>
            <li class="alvin-login">
                <a title="活动" href="/user/user_info" target="_blank">个人中心</a>
            </li>
            <li class="top_bar_more"><i></i>
                <div>
                    <a title="烘焙" href="https://hongbei.meishichina.com/" target="_blank">烘焙</a>
                    <a title="妈妈派" href="https://mamapai.meishichina.com/" target="_blank">妈妈派</a>
                </div>
            </li>
        </ul>
        <div class="right" id="J_top_bar_user">
            <ul class="clear bar-info right bar-noLogin alvin-logout" id="J_barUser">
                <li class="bar-link bar-item bar-reg">
                    <a href="/user/register" target="_blank">注册</a>
                </li>
                <li class="bar-link bar-item bar-login">
                    <a href="/pre/login" target="_blank">登录</a>
                </li>
            </ul>
            <ul class="clear bar-info right bar-noLogin alvin-login" id="J_barUser2">
                <li class="bar-link bar-item bar-login">
                    <a href="/pre/logout" target="_self">退出</a>
                </li>
                <li class="bar-link bar-item bar-login">
                    <a href="/user/user_info" target="_blank">个人中心</a>
                </li>
            </ul>
        </div>
    </div>
        <div class="w logo_wrap2">
            <div class="logo_inner left">
                <a href="/food/index" title="成工美食">成工美食</a>
            </div>
            <div class="logo_search right">
                <div class="searchBox J_search">
                    <a href="javascript:;" title="搜索" class="search_Btn J_searchBTN right" id="index_search">
                        搜索
                    </a>
                    <input type="text" id="index_search_context" class="search_Text J_searchTxt right">
                </div>
            </div>
            <div class="logo_nav">
                <a title="首页" href="/food/index" class="on" target="_blank">首页</a>
                <a title="社区" href="/forum/forum_main" target="_blank">社区</a>
                <a title="食材" href="/food/index" target="_blank">食材</a>
                <a title="商城" href="/store/store_main" target="_blank">商城</a>
                <a title="跑腿" href="/way/wayIndex" target="_blank">跑腿</a>
            </div>
        </div>
        <div class="wrap">
            <div class="w clear">
                <div class="w1">

                    <div id="home_index_slider">
                        <div class="layui-carousel" id="index_carousel">
                            <div carousel-item>
                                <div><img src="https://i3.meishichina.com/attachment/magic/2019/03/26/2019032615535661071358197577.jpg"
                                          srcset="https://i3.meishichina.com/attachment/magic/2019/03/26/2019032615535661075958197577.jpg 2x"></div>
                                <div><img src="https://i3.meishichina.com/attachment/magic/2019/04/09/2019040915547941182668197577.jpg"
                                          srcset="https://i3.meishichina.com/attachment/magic/2019/04/09/2019040915547941184248197577.jpg 2x"></div>
                                <div><img src="https://i3.meishichina.com/attachment/magic/2019/03/19/2019031915529664717418197577.jpg"
                                          srcset="https://i3.meishichina.com/attachment/magic/2019/03/19/2019031915529664712138197577.jpg 2x"></div>
                                <div><img src="https://i3.meishichina.com/attachment/magic/2019/03/13/2019031315524432737218197577.jpg"
                                          srcset="https://i3.meishichina.com/attachment/magic/2019/03/13/2019031315524432734608197577.jpg 2x"></div>
                            </div>
                        </div>
                    </div>
                    <div class="w1_1">
                        <ul>
                            <li class="i1">
                                <a class="la" href="/store/store_main"
                                   target="_blank">
                                    <i></i>美食商场<b></b>
                                </a>
                            </li>
                            <li class="i2">
                                <a class="la" href="/forum/forum_main" target="_blank">
                                    <i></i>食材大全<b></b>
                                </a>
                            </li>
                            <li class="i3">
                                <a class="la" href="/way/wayIndex" target="_blank">
                                    <i></i>跑腿服务<b></b>
                                </a>
                            </li>
                            <li class="i4">
                                <a class="la" href="/forum/forum_main" target="_blank">
                                    <i></i>美食社区<b></b>
                                </a>
                            </li>
                            <li class="i5">
                                <a class="la" href="#" target="_blank">
                                    <i></i>待开发<b></b>
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="w3 clear">
                    <div class="w3_1 w3live">
                        <div class="ui_title">
                            <div class="ui_title_wrap">
                                <h2 class="on"><a href="javascript:void(0);">商城</a></h2>
                                <a title="商城首页" href="/store/store_main"
                                   class="right" target="_blank">商城首页</a>
                            </div>
                        </div>
                        <div class="live on">
                            <a title="春季易花粉过敏，5种食物抗过敏"
                               class="w3a" target="_blank">
                                <img src="/pic/2019040215541722921938197577.jpg"
                                     width="310" height="124" class="imgLoad" style="display: block;">
                            </a>
                            <ul class="tuijian" id="Store_TopSix">
                                <li><a title="春天万物生，吃什么野菜好呢？"
                                       href="https://www.meishichina.com/Health/CommonSense/201904/221993.html"
                                       target="_blank">春天万物生，吃什么野菜好呢？</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="w3_2 w3live">
                        <div class="ui_title">
                            <div class="ui_title_wrap">
                                <h2 class="on"><a href="javascript:void(0);">社区</a></h2>
                                <a title="社区" href="/forum/forum_main"
                                   class="right" target="_blank">社区</a>
                            </div>
                        </div>
                        <div class="live on">
                            <a title="时令养生，适合春天吃的家常菜"
                               class="w3a" target="_blank">
                                <img src="/pic/2019041015548623458188197577.jpg" width="310" height="124" class="imgLoad" style="display: block;">
                            </a>
                            <ul class="tuijian" id="Post_TopSix">
                                <li>
                                    <a title="蔓越莓蜜豆软欧早餐包" href="https://home.meishichina.com/pai-882230.html" target="_blank">
                                    蔓越莓蜜豆软欧早餐包
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="w3_3">
                        <div class="ui_title">
                            <div class="ui_title_wrap">
                                <h2 class="on">为您推荐</h2>
                                <a class="alvin-login" href="https://member.meishichina.com/center/my_fav_recipe/"
                                   title="我的收藏" class="right" target="_blank">我的收藏</a>
                            </div>
                        </div>
                        <div class="live on">
                            <a title="强推补血益气粥，让你吃出好气色"
                               class="w3a" target="_blank">
                                <img src="/pic/2019031115522745076838197577.jpg" width="310" height="124" class="imgLoad" style="display: block;"></a>
                            <ul class="tuijian">
                                <li>
                                    <a title="年末食5物，增强宝宝抵抗力"
                                       href="https://www.meishichina.com/mofang/baobaodikangli/"
                                       target="_blank">年末食5物，增强宝宝抵抗力
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="w5">
                    <div class="ui_title">
                        <div class="ui_title_wrap clear">
                            <h3 class="on"><a href="javascript:void(0);">食堂美餐</a></h3>
                            <a href="/store/store_main" class="right" target="_blank">商铺首页</a>
                            <a href="/store/store_main" title="周围商铺" class="right" target="_blank">周围商铺</a>
                            <a href="/store/store_main" title="学校食堂" class="right" target="_blank">学校食堂</a>
                        </div>
                    </div>
                    <div class="big4_list clear mt10">
                        <ul class="on" id="Carteen_HotFoods">
                            <!--
                            <li>
                                <a title="Kitty曲奇小饼干" href="https://home.meishichina.com/recipe-452985.html" target="_blank">
                                    <i>
                                        <img alt="Kitty曲奇小饼干" class="imgLoad" src="/pic/blank.gif" data-src="https://i3.meishichina.com/attachment/recipe/2019/04/11/20190411155499467721610138013.jpg?x-oss-process=style/c320">
                                    </i>
                                    <p>Kitty曲奇小饼干</p>
                                </a>
                                <a title="心-静" href="https://home.meishichina.com/space-10927019.html" target="_blank" class="u">心-静</a>
                            </li>
                            <li>
                                <a title="自制磨牙棒" href="https://home.meishichina.com/recipe-452979.html" target="_blank">
                                    <i>
                                        <img alt="自制磨牙棒" class="imgLoad" src="/pic/blank.gif" data-src="https://i3.meishichina.com/attachment/recipe/2019/04/11/20190411155499278322310138013.jpg?x-oss-process=style/c320">
                                    </i>
                                    <p>自制磨牙棒</p>
                                </a>
                                <a title="安宝的虎妈" href="https://home.meishichina.com/space-9128234.html" target="_blank" class="u">安宝的虎妈</a>
                            </li>
                            <li>
                                <a title="啤酒焖鸡块" href="https://home.meishichina.com/recipe-452973.html" target="_blank">
                                    <span class="copyright">独家</span>
                                    <i>
                                        <img alt="啤酒焖鸡块" class="imgLoad" src="/pic/blank.gif" data-src="https://i3.meishichina.com/attachment/recipe/2019/04/11/20190411155499150212410138013.jpg?x-oss-process=style/c320">
                                    </i>
                                    <p>啤酒焖鸡块</p>
                                </a>
                                <a title="逝去的爱情" href="https://home.meishichina.com/space-10454906.html" target="_blank" class="u">逝去的爱情</a>
                            </li>
                            <li>
                                <a title="咖喱油麦菜" href="https://home.meishichina.com/recipe-452967.html" target="_blank">
                                    <i>
                                        <img alt="咖喱油麦菜" class="imgLoad" src="/pic/blank.gif" data-src="https://i3.meishichina.com/attachment/recipe/2019/04/11/20190411155498784510910138013.jpg?x-oss-process=style/c320">
                                    </i>
                                    <p>咖喱油麦菜</p>
                                </a>
                                <a title="尔东叶" href="https://home.meishichina.com/space-6100832.html" target="_blank" class="u">尔东叶</a>
                            </li>
                            -->
                        </ul>
                    </div>
                </div>
                <div class="w4">
                    <div class="ui_title">
                        <div class="ui_title_wrap">
                            <h2 class="on">
                                <a title="时令食材" href="/forum/forum_main" target="_blank">时令食材</a>
                            </h2>
                            <a title="食材首页" href="/forum/forum_main" target="_blank" class="right">食材首页</a>
                            <a title="肉类" href="/forum/forum_main" target="_blank" class="right">肉类</a>
                            <a title="蔬菜" href="/forum/forum_main" target="_blank" class="right">蔬菜</a>
                        </div>
                    </div>
                    <div class="tui_c">
                        <ul id="Ingredients_ofFood">
                            <!--
                            <li>
                                <a title="韭菜" href="https://www.meishichina.com/YuanLiao/JiuCai/" target="_blank">
                                    <img class="imgLoad" src="/pic/blank.gif">韭菜</a>
                                <span>春盘第一鲜</span>
                            </li>
                            <li>
                                <a title="豆芽" href="https://www.meishichina.com/YuanLiao/DouYa/" target="_blank">
                                <img class="imgLoad" src="/pic/blank.gif" >豆芽
                                </a>
                                <span>根植内心，温暖发芽</span>
                            </li>
                            <li>
                                <a title="茼蒿" href="https://www.meishichina.com/YuanLiao/TongHao/" target="_blank">
                                <img class="imgLoad" src="/pic/blank.gif" >茼蒿</a>
                                <span>宫廷佳肴皇帝菜</span>
                            </li>
                            <li><a title="草莓" href="https://www.meishichina.com/YuanLiao/CaoMei/" target="_blank">
                                <img class="imgLoad" src="/pic/blank.gif" data-src="https://i3.meishichina.com/static/shicai/caomei.jpg">草莓</a><span>莫负“莓”好时光</span></li>
                            <li><a title="菠菜" href="https://www.meishichina.com/YuanLiao/BoCai/" target="_blank"><img class="imgLoad" src="/pic/blank.gif" data-src="https://i3.meishichina.com/static/shicai/bocai.jpg">菠菜</a><span>赐你奇妙力量</span></li>
                            <li><a title="山药" href="https://www.meishichina.com/YuanLiao/ShanYao/" target="_blank"><img class="imgLoad" src="/pic/blank.gif" data-src="https://i3.meishichina.com/static/shicai/shanyao.jpg">山药</a><span>补虚上品“小人参”</span></li>
                            <li><a title="香椿" href="https://www.meishichina.com/YuanLiao/XiangChun/" target="_blank"><img class="imgLoad" src="/pic/blank.gif" data-src="https://static.meishichina.com/v6/img/2016/xiangchun.jpg">香椿</a><span>如何炫富？了解一下</span></li>
                        -->
                        </ul>
                    </div>
                </div>
                <div class="w6">
                    <div class="ui_title">
                        <div class="ui_title_wrap clear">
                            <h3 class="on"><a href="javascript:void(0);">热门话题</a></h3>
                        </div>
                    </div>
                    <div class="pin_list clear live on">
                        <ul id="Post_TopicHot">
                            <!--
                            <li>
                                <div class="u">
                                    <a href="https://home.meishichina.com/space-10714798.html" target="_blank">
                                        <img width="40" height="40" class="imgLoad" src="/pic/blank.gif"></a>
                                    <div>
                                        <a href="https://home.meishichina.com/space-10714798.html" class="t" target="_blank">清晨的一缕sunshine</a>
                                        <span>33分钟前</span>
                                    </div>
                                </div>
                                <div class="c clear">
                                    <div class="pp"><a href="https://home.meishichina.com/pai-991968.html" target="_blank"><strong>早餐时刻</strong><br>#早餐#各位早上好！</a></div>
                                    <a class="clear" href="https://home.meishichina.com/pai-991968.html" target="_blank">
                                        <img class="imgLoad" src="/pic/blank.gif" >
                                        <img class="imgLoad" src="/pic/blank.gif" >
                                    </a>
                                    <span>6个喜欢，5条评论</span>
                                </div>
                            </li>
                            <li class="clear">
                                <div class="u">
                                    <a href="https://home.meishichina.com/space-10602029.html" target="_blank"><img width="40" height="40" class="imgLoad" src="/pic/blank.gif" data-src="https://i5.meishichina.com/data/avatar/010/60/20/29_avatar_big.jpg?x-oss-process=style/c180&amp;v=20190412"></a>
                                    <div>
                                        <a href="https://home.meishichina.com/space-10602029.html" class="t" target="_blank">琪_feXjZ8E2</a>
                                        <span>52分钟前</span>
                                    </div>
                                </div>
                                <div class="c clear">
                                    <div class="pp"><a href="https://home.meishichina.com/pai-991957.html" target="_blank">#早餐#清凉的早晨😀😀
                                        木瓜炖牛奶
                                        蕃薯</a></div>
                                    <a class="clear" href="https://home.meishichina.com/pai-991957.html" target="_blank">
                                        <img class="imgLoad" src="/pic/blank.gif" data-src="https://i3.meishichina.com/attachment/pai/2019/04/12/20190412155502737270080110602029.jpg?x-oss-process=style/c180">
                                    </a>
                                    <span>9个喜欢，7条评论</span>
                                </div>
                            </li>
                            -->
                        </ul>
                    </div>
                    <div class="big4_list big4_list2 live clear mt10">
                        <ul>
                            <li>
                                <a title="五杯鸡腿" href="https://home.meishichina.com/space-20449-do-blog-id-1017666.html" target="_blank">
                                    <i>
                                        <img alt="五杯鸡腿" class="imgLoad" src="/pic/20190407155464595685510138013.jpg" style="display: block;">
                                    </i>
                                    <p>五杯鸡腿</p>
                                </a>
                                <a title="rosejyy2000" href="https://home.meishichina.com/space-20449.html" target="_blank" class="u">rosejyy2000</a>
                            </li>
                            <li>
                                <a title="咸猪手炒黄瓜" href="https://home.meishichina.com/space-20449-do-blog-id-1017625.html" target="_blank">
                                    <i>
                                        <img alt="咸猪手炒黄瓜" class="imgLoad" src="/pic/2019040215541680751839724956.jpg" style="display: block;">
                                    </i>
                                    <p>咸猪手炒黄瓜</p>
                                </a>
                                <a title="rosejyy2000" href="https://home.meishichina.com/space-20449.html" target="_blank" class="u">rosejyy2000</a>
                            </li>
                            <li>
                                <a title="【食·色蛋糕】—— 葱香沙拉无粉菠萝蜜核戚风蛋糕" href="https://home.meishichina.com/space-34360-do-blog-id-1017573.html" target="_blank">
                                    <i>
                                        <img alt="【食·色蛋糕】—— 葱香沙拉无粉菠萝蜜核戚风蛋糕" class="imgLoad" src="/pic/20190331155399758291110169539.jpg" style="display: block;">
                                    </i>
                                    <p>菠萝蜜核戚风蛋糕</p>
                                </a>
                                <a title="食·色" href="https://home.meishichina.com/space-34360.html" target="_blank" class="u">食·色</a>
                            </li>
                            <li>
                                <a title="柠檬玛德琳" href="https://home.meishichina.com/space-6864393-do-blog-id-1017584.html" target="_blank">
                                    <i>
                                        <img alt="柠檬玛德琳" class="imgLoad" src="/pic/20190330155395060674110104208.gif" style="display: block;">
                                    </i>
                                    <p>柠檬玛德琳</p>
                                </a>
                                <a title="明月舞青衣" href="https://home.meishichina.com/space-6864393.html" target="_blank" class="u">明月舞青衣</a>
                            </li>
                            <li>
                                <a title="红茶蜜豆磅蛋糕" href="https://home.meishichina.com/space-6864393-do-blog-id-1017583.html" target="_blank">
                                    <i>
                                        <img alt="红茶蜜豆磅蛋糕" class="imgLoad" src="/pic/20190330155394889841910104208.gif" style="display: block;">
                                    </i>
                                    <p>红茶蜜豆磅蛋糕</p>
                                </a>
                                <a title="明月舞青衣" href="https://home.meishichina.com/space-6864393.html" target="_blank" class="u">明月舞青衣</a>
                            </li>
                            <li>
                                <a title="抹茶戚风流心蛋糕" href="https://home.meishichina.com/space-6864393-do-blog-id-1017582.html" target="_blank">
                                    <i>
                                        <img alt="抹茶戚风流心蛋糕" class="imgLoad" src="/pic/20190330155394893913310104208.gif" style="display: block;">
                                    </i>
                                    <p>茶戚风流心蛋糕</p>
                                </a>
                                <a title="明月舞青衣" href="https://home.meishichina.com/space-6864393.html" target="_blank" class="u">明月舞青衣</a>
                            </li>
                            <li>
                                <a title="豆蓉花饼干" href="https://home.meishichina.com/space-6864393-do-blog-id-1017581.html" target="_blank">
                                    <i>
                                        <img alt="豆蓉花饼干" class="imgLoad" src="/pic/20190330155394898474910104208.gif" style="display: block;">
                                    </i>
                                    <p>豆蓉花饼干</p>
                                </a>
                                <a title="明月舞青衣" href="https://home.meishichina.com/space-6864393.html" target="_blank" class="u">明月舞青衣</a>
                            </li>
                            <li>
                                <a title="黑芝麻南瓜饼" href="https://home.meishichina.com/space-1856946-do-blog-id-1017579.html" target="_blank">
                                    <i>
                                        <img alt="黑芝麻南瓜饼" class="imgLoad" src="/pic/20190331155403410426910169539.jpg" style="display: block;">
                                    </i>
                                    <p>黑芝麻南瓜饼</p>
                                </a>
                                <a title="JZLWWWWWW" href="https://home.meishichina.com/space-1856946.html" target="_blank" class="u">JZLWWWWWW</a>
                            </li>
                            <li>
                                <a title="【食·色饮品】—— 黑小麦薏米杏仁豆浆" href="https://home.meishichina.com/space-34360-do-blog-id-1017546.html" target="_blank">
                                    <i>
                                        <img alt="【食·色饮品】—— 黑小麦薏米杏仁豆浆" class="imgLoad" src="/pic/20190330155390891517310104208.jpg" style="display: block;">
                                    </i>
                                    <p>黑小麦薏米杏仁豆浆</p>
                                </a>
                                <a title="食·色" href="https://home.meishichina.com/space-34360.html" target="_blank" class="u">食·色</a>
                            </li>
                            <li>
                                <a title="蚝油柚香带鱼" href="https://home.meishichina.com/space-7992337-do-blog-id-1016632.html" target="_blank">
                                    <i>
                                        <img alt="蚝油柚香带鱼" class="imgLoad" src="/pic/2019032915538262457059724956.jpg" style="display: block;">
                                    </i>
                                    <p>蚝油柚香带鱼</p>
                                </a>
                                <a title="Qiuyue0815" href="https://home.meishichina.com/space-7992337.html" target="_blank" class="u">Qiuyue0815</a>
                            </li>
                            <li>
                                <a title="【食·色饼干】—— 茉莉花茶柠檬饼干" href="https://home.meishichina.com/space-34360-do-blog-id-1017538.html" target="_blank">
                                    <i>
                                        <img alt="【食·色饼干】—— 茉莉花茶柠檬饼干" class="imgLoad" src="/pic/2019032915538262216959724956.jpg" style="display: block;">
                                    </i>
                                    <p>茉莉花茶柠檬饼干</p>
                                </a>
                                <a title="食·色" href="https://home.meishichina.com/space-34360.html" target="_blank" class="u">食·色</a>
                            </li>
                            <li>
                                <a title="【食·色汤羹】—— 西洋参当归芡实天麻枸杞排骨汤" href="https://home.meishichina.com/space-34360-do-blog-id-1017531.html" target="_blank">
                                    <i>
                                        <img alt="【食·色汤羹】—— 西洋参当归芡实天麻枸杞排骨汤" class="imgLoad" src="/pic/2019032815537370217579724956.jpg" style="display: block;">
                                    </i>
                                    <p>西洋参当归芡实天麻枸杞排骨汤</p>
                                </a>
                                <a title="食·色" href="https://home.meishichina.com/space-34360.html" target="_blank" class="u">食·色</a>
                            </li>
                            <li>
                                <a title="【食·色菜品】—— 辣味肠鸡蛋棒" href="https://home.meishichina.com/space-34360-do-blog-id-1017518.html" target="_blank">
                                    <i>
                                        <img alt="【食·色菜品】—— 辣味肠鸡蛋棒" class="imgLoad" src="/pic/2019032715536536131979724956.jpg" style="display: block;">
                                    </i>
                                    <p>辣味肠鸡蛋棒</p>
                                </a>
                                <a title="食·色" href="https://home.meishichina.com/space-34360.html" target="_blank" class="u">食·色</a>
                            </li>
                            <li>
                                <a title="【食·色面点】—— 葱香方便面鸡蛋棒" href="https://home.meishichina.com/space-34360-do-blog-id-1017499.html" target="_blank">
                                    <i>
                                        <img alt="【食·色面点】—— 葱香方便面鸡蛋棒" class="imgLoad" src="/pic/2019032615535630714579724956.jpg" style="display: block;">
                                    </i>
                                    <p>葱香方便面鸡蛋棒</p>
                                </a>
                                <a title="食·色" href="https://home.meishichina.com/space-34360.html" target="_blank" class="u">食·色</a>
                            </li>
                            <li>
                                <a title="【食·色面点】—— 无粉菠萝蜜核松饼" href="https://home.meishichina.com/space-34360-do-blog-id-1017482.html" target="_blank">
                                    <i>
                                        <img alt="【食·色面点】—— 无粉菠萝蜜核松饼" class="imgLoad" src="/pic/2019032515534776106879724956.jpg" style="display: block;">
                                    </i>
                                    <p>无粉菠萝蜜核松饼</p>
                                </a>
                                <a title="食·色" href="https://home.meishichina.com/space-34360.html" target="_blank" class="u">食·色</a>
                            </li>
                            <li>
                                <a title="【食·色汤羹】—— 芡实薏米沙参玉竹老鸭汤" href="https://home.meishichina.com/space-34360-do-blog-id-1017441.html" target="_blank">
                                    <i>
                                        <img alt="【食·色汤羹】—— 芡实薏米沙参玉竹老鸭汤" class="imgLoad" src="/pic/2019032415533921954209702111.jpg" style="display: block;">
                                    </i>
                                    <p>芡实薏米沙参玉竹老鸭汤</p>
                                </a>
                                <a title="食·色" href="https://home.meishichina.com/space-34360.html" target="_blank" class="u">食·色</a>
                            </li>
                            <li>
                                <a title="【食·色蛋糕】—— 无粉菠萝蜜核戚风蛋糕" href="https://home.meishichina.com/space-34360-do-blog-id-1017409.html" target="_blank">
                                    <i>
                                        <img alt="【食·色蛋糕】—— 无粉菠萝蜜核戚风蛋糕" class="imgLoad" src="/pic/20190323155330682277310138013.jpg" style="display: block;">
                                    </i>
                                    <p>无粉菠萝蜜核戚风蛋糕</p>
                                </a>
                                <a title="食·色" href="https://home.meishichina.com/space-34360.html" target="_blank" class="u">食·色</a>
                            </li>
                            <li>
                                <a title="香芧柠盐鸡翅根" href="https://home.meishichina.com/space-20449-do-blog-id-1017439.html" target="_blank">
                                    <i>
                                        <img alt="香芧柠盐鸡翅根" class="imgLoad" src="/pic/20190323155330680088110138013.jpg" style="display: block;">
                                    </i>
                                    <p>香芧柠盐鸡翅根</p>
                                </a>
                                <a title="rosejyy2000" href="https://home.meishichina.com/space-20449.html" target="_blank" class="u">rosejyy2000</a>
                            </li>
                            <li>
                                <a title="【食·色米饭】—— 腊肉土豆焖饭" href="https://home.meishichina.com/space-34360-do-blog-id-1017353.html" target="_blank">
                                    <i>
                                        <img alt="【食·色米饭】—— 腊肉土豆焖饭" class="imgLoad" src="/pic/2019032215532188471529724956.jpg" style="display: block;">
                                    </i>
                                    <p>腊肉土豆焖饭</p>
                                </a>
                                <a title="食·色" href="https://home.meishichina.com/space-34360.html" target="_blank" class="u">食·色</a>
                            </li>
                            <li>
                                <a title="【食·色米饭】—— 香橙腊肠蒸饭" href="https://home.meishichina.com/space-34360-do-blog-id-1017347.html" target="_blank">
                                    <i>
                                        <img alt="【食·色米饭】—— 香橙腊肠蒸饭" class="imgLoad" src="/pic/2019032115531326088749702111.jpg" style="display: block;">
                                    </i>
                                    <p>香橙腊肠蒸饭</p>
                                </a>
                                <a title="食·色" href="https://home.meishichina.com/space-34360.html" target="_blank" class="u">食·色</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div id="J_footer_box" class="footer-info">
            <div class="w">
            <p>
                版权所有 © 2019-2999 <a target="_blank" href="/food/index" title="成工美食">成工美食</a>
            </p>
        </div>
        </div>
    <script>
        layui.use(['carousel','layer','element'], function(){
            var carousel = layui.carousel;
            var layer = layui.layer;
            var element = layui.element;
            //建造实例 轮转
            carousel.render({
                elem: '#index_carousel'
                ,width: '100%' //设置容器宽度
                ,height:'100%'
                ,arrow: 'hover' //悬停显示箭头
                ,autoplay:true
                ,interval:2000
                ,anim: 'fade' //切换动画方式
            });

            $("#index_search").on('click',function () {
                layer.alert($('#index_search_context').val());
            });
            //五个最火的商铺
            getStore_five(element);
            //五个最火的帖子
            getPost_five(element);
            //食堂的
            getCarteen_five(element);
            //食堂的食材  //从帖子中的食材中获取
            getIngredientsofFood_five(element);

            getHotPost_six(element);
            //登录状态显示
            /*      .alvin-logout
            *       .alvin-login
            *      $(".alvin-logout").show();//显示div
            *      $(".alvin-login").hide();//隐藏div
            * */
            isLogin();
        });
        //五个最火的商铺
        function createStore(title,storeid) {
            var str = "<li><a title=" +
                title
                +" href="
                +"\'/store/store_goods?storeid="
                + storeid
                +"\'target=\"_blank\">"
                + title
                +"</a></li>";
            return str;
        }
        function getStore_five(element) {
            $.ajax({
                type:'POST'
                ,url:'/food/topSix_store'
                ,data:{page:1,limit:6}
                ,success:function (data) {
                    var len = data.length;
                    for(var t=0;t< len;t++) {
                        var str = createStore(data[t].storename, data[t].storeid);
                        $('#Store_TopSix').append(str);
                        element.init();
                    }
                }
                ,error:function () {

                }
            })
        }
        //五个最火的帖子
        function createPost(title,postid) {
            var str = "<li><a title=" +
                title
                +" href="
                +"\'/forum/posts_detail?postid="
                + postid
                +"\'target=\"_blank\">"
                + title
                +"</a></li>";
            return str;
        }
        function getPost_five(element) {
            $.ajax({
                type:'POST'
                ,url:'/food/topSix_post'
                ,data:{page:1,limit:6}
                ,success:function (data) {
                    var len = data.length;
                    for(var t=0;t< len;t++) {
                        var str = createPost(data[t].posttitle, data[t].postid);
                        $('#Post_TopSix').append(str);
                        element.init();
                    }
                }
                ,error:function () {

                }
            })
        }
        //生成食堂的四个菜
        function createCarteen(title,url_storeid,pic,username) {
            var list = picSplit(pic);
            var str = "<li><a title=\""
                + title
                + "\"href=\"/store/store_goods?storeid="
                + url_storeid
                +"\" target=\"_blank\">"
                + "<i>"
                +//图片操作
                " <img alt=\"" + title + "\" class=\"imgLoad\" src=\"" + list[0] + "\">"
                +
                "</i><p>"
                + title
                +"</p> </a><a title=\""
                + username
                +"\"href=\"/store/store_goods?storeid="
                + url_storeid
                +"\" target=\"_blank\" class=\"u\">"
                + username
                +"</a></li>";
            return str;
        }
        function getCarteen_five(element) {
            $.ajax({
                type:'POST'
                ,url:'/food/topNum_food'
                ,data:{page:1,limit:4}
                ,success:function (data) {
                    var len = data.length;
                    for(var t=0;t< len;t++) {
                        var list = data[t].split(',');
                        var str = createCarteen(list[0],list[1],list[2],list[3]);
                        $('#Carteen_HotFoods').append(str);
                        element.init();
                    }
                }
                ,error:function () {
                }
            })
        }
        //食材的展示
        function createIngredients(title,postid,picloc) {
            var list =picSplit(picloc);
            var str = "<li> <a title=\""
                + title
                +"\" href=\'/forum/posts_detail?postid="
                + postid
                +"\' target=\"_blank\"><img class=\"imgLoad\" src=\'"
                + list[0]
                +"\'>" +
                title +
                "</a><span>"
                //+ title
                + "</span></li>";
            return str;
        }
        function getIngredientsofFood_five(element) {
            $.ajax({
                type:'POST'
                ,url:'/food/topNum_post'
                ,data:{page:1,limit:14}
                ,success:function (data) {
                    var len = data.length;
                    for(var t=0;t< len;t++) {
                        var str = createIngredients(data[t].posttitle
                            ,data[t].postid
                            , data[t].postpic);
                        $('#Ingredients_ofFood').append(str);
                        element.init();
                    }
                }
                ,error:function () {

                }
            })
        }

        //最火的帖子
        // prime是从0开始   偶数时候：左边   质数时候：右边
        function createLowerPost(prime,user_id,user_pic,
                                 username,post_id,posttime,posttitle,
                                 postcontext,scanNum,respNum,imgs) {
            var str1 = "<li ";
            var str2;
            if( prime%2 ==1) //判断放在左边还是右边
                str2 =  " class=\"clear\">";
            else
                str2 =  ">";
            var str3 = "<div class=\"u\"> <a href=/forum/look_user_info?userid="
                + user_id //个人url的id   "https://home.meishichina.com/space-10714798.html"
                + " target=\"_blank\"><img width=\"40\" height=\"40\" class=\"imgLoad\"src=\'"
                + user_pic          // 图片位置"/pic/blank.gif"
                + "\'></a><div> <a href=/forum/look_user_info?userid="
                + user_id            //"https://home.meishichina.com/space-10714798.html"
                + " class=\"t\" target=\"_blank\">"
                + username          //username
                +"</a><span>"
                + posttime          //发送时间  33
                +"分钟前</span> </div> </div>"
                + "<div class=\"c clear\"> <a href=/forum/posts_detail?postid="
                + post_id //"https://home.meishichina.com/pai-991968.html" //帖子url的id
                + " target=\"_blank\">" +
                "#"+posttitle+"#"
                + postcontext       //context
                + "</a></div> <a class=\"clear\" href= /forum/posts_detail?postid="
                + post_id   //"https://home.meishichina.com/pai-991968.html"   //url
                + " target=\"_blank\">";
            var strImg = "";//<img class="imgLoad" src="/pic/blank.gif" >
            var list = picSplit(imgs);
            for(var num=0;num< list.length;num++)//imgs.length
            {
                strImg+="<img class=\"imgLoad alvin-topic-pic\" src=\'"
                    +list[num]//imgs[num]
                    +"\' >"
            }
            var str4 = "</a><span>"
                + scanNum
                +"个浏览，"
                + respNum
                +"条回复 </span> </div> </li>"
            return str = str1+str2+str3+strImg+str4;
        }
        function getHotPost_six(element) {
            $.ajax({
                type:'POST'
                ,url:'/food/topSix_topic'
                ,data:{page:1,limit:6}
                ,success:function (data) {
                    for(var i=0;i< 6;i++) {
                        var str = createLowerPost(
                            i
                            , data[i].postuser
                            ,data[i].userPhotoD//----------------------头像地址
                            ,data[i].username// ----------------------用户名称
                            ,data[i].postid
                            ,i+1
                            ,data[i].posttitle
                            ,data[i].postcontext
                            ,data[i].postscan+""
                            ,data[i].postthumb+""
                            ,data[i].postpic);
                        $('#Post_TopicHot').append(str);
                        element.init();
                    }
                }
                ,error:function () {
                    layer.alert("底层话题获取error！");
                }
            })
        }

        //图片分离 只取出第一个
        function picSplit(pic) {
            if(pic.indexOf(',') != -1) {
                var list = pic.split(',');
                return list;
            }
            else {
                var list=[];
                list.push(pic)
                return list;
            }
        }

        function isLogin() {
            $.ajax({
                type:'GET'
                ,url:'/pre/isLogin'
                ,success:function (data) {
                        if (data == "login") {
                            $(".alvin-login").show();//显示div
                            $(".alvin-logout").hide();//隐藏div
                        }
                        if (data == "logout") {
                            $(".alvin-logout").show();//显示div
                            $(".alvin-login").hide();//隐藏div
                        }
                }
                ,error:function () {

                }
            })
        }
    </script>
    <style>
        .alvin-topic-pic{
            width: 90px;
            height: 90px;
            margin: 5px; padding: 2px;
            border-radius: 6px;
        }
        .alvin-topic-pic:hover{
            width: 95px;
            height: 95px;
            margin: 5px; padding: 2px;
            border-radius: 6px;
        }
    </style>
    </body>

</html>
