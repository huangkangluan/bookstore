<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/8
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title></title>
  <link type="../../text/css" rel="stylesheet" href="../../css/style.css" />
  <!-- 新 Bootstrap 核心 CSS 文件 -->
  <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">

  <!-- 可选的Bootstrap主题文件（一般不用引入） -->
  <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">

  <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
  <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

  <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
  <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
  <link type="text/css" rel="stylesheet" href="css/style.css" />
</head>
<body>
<div id="header" class="wrap">
  <div id="logo">合众艾特网上书城</div>
  <div id="navbar">
    <div class="userMenu">
      <ul>
        <li><a href="findbook">User首页</a></li>
        <li class="current"><a href="orderlist.html">我的订单</a></li>
        <li><a href="../cart/toshopcart">购物车</a></li>
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
<c:forEach items="${list.content}" var="d">
      <tr>
        <td>${d.myOrderId}</td>
        <td class="thumb">
          <%--<c:forEach items="${d.bookImage}" var="img">--%>
          <img src="${d.bookImage}" />
          <%--</c:forEach>--%>
        </td>
        <td>${d.userName}</td>
        <td>￥${d.orderNumber*d.orderPrice}</td>
        <td>${d.createTime}</td>
        <td>${d.myOrderStatus}</td>
      </tr>
</c:forEach>
    </table>
    <div class="page-spliter">
      <nav style="text-align: center">
        <ul class="pagination">
          <li><a href="findDingdanxx?page=${countpage-1}">&laquo;</a></li>
          <c:forEach var="p" begin="0" end="${list.totalPages-1}">
            <li><a href="findDingdanxx?page=${p}">${p+1}</a></li>
          </c:forEach>
          <li><a href="findDingdanxx?page=${countpage+1}">&raquo;</a></li>
        </ul>
      </nav>
    </div>
    <div class="button"><input class="input-gray" type="submit" name="submit" value="查看一个月前的订单" /><input class="input-gray" type="submit" name="submit" value="查看一个月前的订单" /></div>
  </div>
</div>
<div id="footer" class="wrap">
  合众艾特网上书城 &copy; 版权所有

</div>
</body>
</html>

