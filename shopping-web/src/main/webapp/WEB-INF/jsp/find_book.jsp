<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
</head>
<body>
<div id="header" class="wrap">
	<div id="logo">合众艾特网上书城</div>
	<div id="navbar">
		<div class="userMenu">
			<ul>
				<li class="current"><a href="find_book.jsp">User首页</a></li>
				<li><a href="../../orderlist.html">我的订单</a></li>
				<li><a href="../../shopping.html">购物车</a></li>
				<li><a href="#">注销</a></li>
			</ul>
		</div>
		<form method="get" name="search" action="">
			搜索：<input class="input-text" type="text" name="keywords" /><input class="input-btn" type="submit" name="submit" value="" />
		</form>
	</div>
</div>
<div id="content" class="wrap">
	<div class="list bookList">
			<table class="table table-striped table-bordered">
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
						<td align="center"><input type="checkbox" value="${b.bookId}" name="checkbox" class="checkbox"></td>
						<td>${b.bookName}</td>
						<td>${b.bookPrice}</td>
						<td>${b.bookNumber}</td>
						<td class="thumb"><img src="${b.bookImage}"></td>
					</tr>
				</c:forEach>

			</table>
			<div class="page-spliter">
				<nav style="text-align: center">
					<ul class="pagination">
						<li><a href="findbook?page=${countpage-1}">&laquo;</a></li>
						<c:forEach var="p" begin="0" end="${list.totalPages-1}">
							<li><a href="findbook?page=${p}">${p+1}</a></li>
						</c:forEach>
						<li><a href="findbook?page=${countpage+1}">&raquo;</a></li>
					</ul>
				</nav>
			</div>
			<div class="button"><input class="input-btn" type="submit" name="submit" value="" /></div>
	</div>
</div>
<div id="footer" class="wrap">
	合众艾特网上书城 &copy; 版权所有

</div>
</body>
</html>
