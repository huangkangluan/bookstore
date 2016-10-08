<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/8
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title></title>
  <link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>
<div id="header" class="wrap">
  <div id="logo">合众艾特网上书城</div>
  <div id="navbar">
    <div class="userMenu">
      <ul>
        <li><a href="index.html">User首页</a></li>
        <li class="current"><a href="orderlist.html">我的订单</a></li>
        <li><a href="shopping.html">购物车</a></li>
        <li><a href="#">注销</a></li>
      </ul>
    </div>
    <form method="get" name="search" action="">
      搜索：<input class="input-text" type="text" name="keywords" /><input class="input-btn" type="submit" name="submit" value="" />
    </form>
  </div>
</div>
<div id="content" class="wrap">
  <div class="list orderList">
    <table>
      <tr class="title">
        <th class="orderId">订单编号</th>
        <th>订单商品</th>
        <th class="userName">收货人</th>
        <th class="price">订单金额</th>
        <th class="createTime">下单时间</th>
        <th class="status">订单状态</th>
      </tr>
      <tr>
        <td>10010</td>
        <td class="thumb"><img src="images/book/book_01.gif" /></td>
        <td>王五</td>
        <td>￥18.00</td>
        <td>2012-12-21 12:00:00</td>
        <td>已完成</td>
      </tr>
      <tr>
        <td>10010</td>
        <td class="thumb"><img src="images/book/book_02.gif" /></td>
        <td>马六</td>
        <td>￥18.00</td>
        <td>2012-12-21 12:00:00</td>
        <td>已完成</td>
      </tr>
    </table>
    <div class="page-spliter">
      <a href="#">&lt;</a>
      <a href="#">首页</a>
      <span class="current">1</span>
      <a href="#">2</a>
      <a href="#">3</a>
      <a href="#">4</a>
      <span>...</span>
      <a href="#">尾页</a>
      <a href="#">&gt;</a>
    </div>
    <div class="button"><input class="input-gray" type="submit" name="submit" value="查看一个月前的订单" /><input class="input-gray" type="submit" name="submit" value="查看一个月前的订单" /></div>
  </div>
</div>
<div id="footer" class="wrap">
  合众艾特网上书城 &copy; 版权所有

</div>
</body>
</html>
