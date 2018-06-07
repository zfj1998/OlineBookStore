<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>书籍列表</title>
<link rel="stylesheet" href="css/style.css" charset="utf-8">
<link rel="Shortcut Icon" href="img/horse.ico">
<!--引入外部样式表-->
<link rel="stylesheet" href="css/resetcss.css"/>
<link rel="stylesheet" href="css/main.css"/>
<link rel="stylesheet" href="css/list.css"/>

</head>

<body>
<div id="header">

    <ul id="leftlist" class="list">
        <li><a href="login.html" class="link">请登录</a></li>
        <li><a href="register.html" class="link">免费注册</a></li>
    </ul>

    <ul id="rightlist" class="list">
        <li class="haschild">
            <a href="#" class="link" title="myorders">我的订单
            </a>
            <ul class="showdetail">
                <li><a href="#" class="item">全部订单</a></li>
                <li><a href="#" class="item">待付款订单</a></li>
                <li><a href="#" class="item">待收货订单</a></li>
                <li><a href="#" class="item">待评价订单</a></li>
            </ul>
        </li>
        <li><a href="#" class="link">购物车</a></li>
        <li class="haschild"><a href="#" class="link">收藏夹
        </a>
            <ul class="showdetail">
                <li><a href="#" class="item">收藏的商品</a></li>
                <li><a href="#" class="item">收藏的店铺</a></li>
            </ul>
        </li>
        <li><a href="#" class="link">商品分类</a></li>
        
    </ul>
</div>


<div id="content">
<div id="shop">
        <!--店铺名称-->
        <a href="#">
            <div id="shopname">自营图书</div>
        </a>
        <!--搜索框-->
        <div id="search" class="query">
            <input type="text" id="select" placeholder="请输入搜索文字..."/>
            <button type="button" id="btnquery">搜索</button>
        </div>
    </div>

    <div id="shopmenus">
        <ul id="smenus">
            <li class="hasmenu">
                <a href="#" class="smenu">图书分类</a>
                <ul class="catalogs">
                    <li><a href="#" class="class">文学</a></li>
                    <li><a href="#" class="class">教育</a></li>
                    <li><a href="#" class="class">人文</a></li>
                    <li><a href="#" class="class">理科</a></li>
                    <li><a href="#" class="class">计算机</a></li>
                    <li><a href="#" class="class">童书</a></li>
                </ul>
            </li>
            <li><a href="#" class="smenu">首页</a></li>
            <li><a href="#" class="smenu">计算机馆</a></li>
            <li><a href="#" class="smenu">预售</a></li>
            <li><a href="#" class="smenu">活动</a></li>
            <li><a href="#" class="smenu">数字内容</a></li>
        </ul>
    </div>

<!--左侧导航菜单-->
    <div id="catalog">
        <h2 id="goods">书籍分类</h2>

        <div class="catalog">
            <h3>特色分类</h3>
            <ul>
                <li><a href="#" class="linkbrand">畅销榜</a></li>
                <li><a href="#" class="linkbrand">热搜榜</a></li>
            </ul>
            <h3>文学综合类</h3>
            <ul>
                <li><a href="#" class="linkbrand">小说</a></li>
                <li><a href="#" class="linkbrand hotgood">文学</a></li>
                <li><a href="#" class="linkbrand">传记</a></li>
                <li><a href="#" class="linkbrand">青春</a></li>
                <li><a href="#" class="linkbrand">悬疑</a></li>
                <li><a href="#" class="linkbrand">科幻</a></li>
                <li><a href="#" class="linkbrand">散文</a></li>
                <li><a href="#" class="linkbrand">纪实</a></li>
            </ul>
            <h3>教育类</h3>
            <ul>
                <li><a href="#" class="linkbrand">中小教辅</a></li>
                <li><a href="#" class="linkbrand">外语学习</a></li>
                <li><a href="#" class="linkbrand">考试复习</a></li>
                <li><a href="#" class="linkbrand">教材</a></li>
                <li><a href="#" class="linkbrand">字典</a></li>
                <li><a href="#" class="linkbrand">作文</a></li>
                <li><a href="#" class="linkbrand hotgood">高考</a></li>
            </ul>
            <h3>计算机类</h3>
            <ul>
                <li><a href="#" class="linkbrand">编程语言</a></li>
                <li><a href="#" class="linkbrand">办公软件</a></li>
                <li><a href="#" class="linkbrand">计算机安全</a></li>
                <li><a href="#" class="linkbrand hotgood">人工智能</a></li>
                <li><a href="#" class="linkbrand">操作系统</a></li>
                <li><a href="#" class="linkbrand">数据库</a></li>
            </ul>
            <h3>原版书</h3>
            <ul>
                <li><a href="#" class="linkbrand">英文原版</a></li>
                <li><a href="#" class="linkbrand">港台原版</a></li>
                <li><a href="#" class="linkbrand">日文原版</a></li>
            </ul>
        </div>
    </div>

<table style="border-collapse:separate; border-spacing:30px 40px;">
  
  <tr>
  <td>
          <div class="pro clearfix">
            <a class="fl" href="#">
              <dl class="clearfix">
                <dt class="fl"><img src="img/temp/cart02.jpg"></dt>
                <dd class="fl">
                  <p>Head First Python</p>
                  <p>作者:</p>
                  <p>Paul Barry 著</p>
                  <p class="price">价格：￥79.00</p>
                </dd>
              </dl>
            </a>
          </div>
  </td>


<td>        
  <div class="pro clearfix">
            <a class="fl" href="#">
              <dl class="clearfix">
                <dt class="fl"><img src="img/temp/cart03.jpg"></dt>
                <dd class="fl">
                  <p>Head First Java</p>
                  <p>作者:</p>
                  <p>[美] 塞若，[美] 贝茨 著</p>
                  <p class="price">价格：￥54.30</p>
                </dd>
              </dl>
            </a>
          </div>

        </td>


<td>
  
          <div class="pro clearfix">
            <a class="fl" href="#">
              <dl class="clearfix">
                <dt class="fl"><img src="img/temp/cart03.jpg"></dt>
                <dd class="fl">
                  <p>Head First Servlets and JSP</p>
                  <p>作者:</p>
                  <p>美] 巴萨姆，[美] 西拉，[美] 贝茨 著</p>
                  <p class="price">价格：￥88.50</p>
                </dd>
              </dl>
            </a>
          </div>

</td>

</tr>
    

 <tr>
  <td>
          <div class="pro clearfix">
            <a class="fl" href="#">
              <dl class="clearfix">
                <dt class="fl"><img src="img/temp/cart02.jpg"></dt>
                <dd class="fl">
                  <p>Head First Python</p>
                  <p>作者:</p>
                  <p>Paul Barry 著</p>
                  <p class="price">价格：￥79.00</p>
                </dd>
              </dl>
            </a>
          </div>
  </td>


<td>        
  <div class="pro clearfix">
            <a class="fl" href="#">
              <dl class="clearfix">
                <dt class="fl"><img src="img/temp/cart03.jpg"></dt>
                <dd class="fl">
                  <p>Head First Java</p>
                  <p>作者:</p>
                  <p>[美] 塞若，[美] 贝茨 著</p>
                  <p class="price">价格：￥54.30</p>
                </dd>
              </dl>
            </a>
          </div>

        </td>


<td>
  
          <div class="pro clearfix">
            <a class="fl" href="#">
              <dl class="clearfix">
                <dt class="fl"><img src="img/temp/cart03.jpg"></dt>
                <dd class="fl">
                  <p>Head First Servlets and JSP</p>
                  <p>作者:</p>
                  <p>美] 巴萨姆，[美] 西拉，[美] 贝茨 著</p>
                  <p class="price">价格：￥88.50</p>
                </dd>
              </dl>
            </a>
          </div>

</td>

</tr>
    
     <tr>
  <td>
          <div class="pro clearfix">
            <a class="fl" href="#">
              <dl class="clearfix">
                <dt class="fl"><img src="img/temp/cart02.jpg"></dt>
                <dd class="fl">
                  <p>Head First Python</p>
                  <p>作者:</p>
                  <p>Paul Barry 著</p>
                  <p class="price">价格：￥79.00</p>
                </dd>
              </dl>
            </a>
          </div>
  </td>


<td>        
  <div class="pro clearfix">
            <a class="fl" href="#">
              <dl class="clearfix">
                <dt class="fl"><img src="img/temp/cart03.jpg"></dt>
                <dd class="fl">
                  <p>Head First Java</p>
                  <p>作者:</p>
                  <p>[美] 塞若，[美] 贝茨 著</p>
                  <p class="price">价格：￥54.30</p>
                </dd>
              </dl>
            </a>
          </div>

        </td>


<td>
  
          <div class="pro clearfix">
            <a class="fl" href="#">
              <dl class="clearfix">
                <dt class="fl"><img src="img/temp/cart03.jpg"></dt>
                <dd class="fl">
                  <p>Head First Servlets and JSP</p>
                  <p>作者:</p>
                  <p>美] 巴萨姆，[美] 西拉，[美] 贝茨 著</p>
                  <p class="price">价格：￥88.50</p>
                </dd>
              </dl>
            </a>
          </div>

</td>

</tr>
    





</table>>
 


</div>



<div id="footer">
      All Rights Reserved @ 版权所有
    </div>  

</body>


</html>
