<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/6
  Time: 17:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>图书信息</title>
  <!-- 新 Bootstrap 核心 CSS 文件 -->
  <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">

  <!-- 可选的Bootstrap主题文件（一般不用引入） -->
  <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">

  <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
  <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

  <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
  <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>

</head>
<body>
<ul class="nav nav-tabs" role="tablist">
  <li role="presentation" class="active"><a href="#">图书信息</a></li>
  <li role="presentation"><a href="#">我的订单</a></li>
  <li role="presentation"><a href="#">购物车</a></li>
</ul>
<table class="table table-striped">
  <!-- On rows -->
    <tr>
        <td>选择</td>
        <td>书名</td>
        <td>价格</td>
        <td>库存数量</td>
        <td>图书封面</td>
    </tr>
<c:forEach items="${list.content}" var="b">
    <tr>
        <td><input type="checkbox" value="${b.bookId}" name="checkbox" class="checkbox"></td>
        <td>${b.bookName}</td>
        <td>${b.bookPrice}</td>
        <td>${b.bookNumber}</td>
        <td>${b.bookNumber}</td>
    </tr>
</c:forEach>

</table>
<nav style="text-align: center">
  <ul class="pagination">
    <li><a href="findbook?page=${countpage-1}">&laquo;</a></li>
    <c:forEach var="p" begin="0" end="${list.totalPages-1}">
      <li><a href="findbook?page=${p}">${p+1}</a></li>
    </c:forEach>
    <li><a href="findbook?page=${countpage+1}">&raquo;</a></li>
  </ul>
</nav>
</body>
</html>
