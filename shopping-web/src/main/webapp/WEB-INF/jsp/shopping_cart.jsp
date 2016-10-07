<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/7
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title></title>
  <style type="text/css">
.min{
  width: 35px;
}
.add{
  width: 35px;
}
  </style>
  <link type="text/css" rel="stylesheet" href="../css/style.css" />
</head>
<body>
<div id="header" class="wrap">
  <div id="logo">合众艾特网上书城</div>
  <div id="navbar">
    <div class="userMenu">
      <ul>
        <li><a href="../findbook">User首页</a></li>
        <li><a href="orderlist.html">我的订单</a></li>
        <li class="current"><a href="shopping.html">购物车</a></li>
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
    <form method="post" name="shoping" action="cart/shopcart">
      <table id="tab">
        <tr class="title">
          <th class="view">图片预览</th>
          <th>书名</th>
          <th class="nums">数量</th>
          <th class="price">单价</th>
          <th class="price">小计</th>
          <th class="price">删除</th>
        </tr>
        <c:forEach items="${cart}" var="g" varStatus="vs">
        <tr>
          <td class="thumb"><img src="${g.value.bookImage}" /></td>
          <td>${g.value.bookName}</td>
          <td>
            <input class="min" name="" type="button" value="－" />
            <input class="input-text" type="text" name="nums" value="${g.value.count}" id="input-text${vs.count}"/>
            <input class="add" name="" type="button" value="＋" />
          </td>
          <td>
            ￥<input type="text" value="${g.value.bookPrice}" id="price${vs.count}">
          </td>
          <td>
            ￥<input type="text" value="${g.value.count*g.value.bookPrice}" id="total">
            <%--￥<span id="total">${g.value.count*g.value.bookPrice}</span>--%>
          </td>
          <td><input type="button" value="删除" class="but"/></td>
        </tr>
        </c:forEach>

      </table>
      <div class="button">
        <h4>总价：￥<span id="totalPrice"></span>元</h4>
        <input class="input-chart" type="submit" name="submit" value=""/>
      </div>
    </form>
  </div>
</div>
<div id="footer" class="wrap">
  合众艾特网上书城 &copy; 版权所有

</div>
<script type="text/javascript" src="../../js/jquery-1.7.min.js"></script>
<script type="text/javascript">
  $(function(){
    $(".input-text").change(function(){
      var totalPrice=0;
      for(var i=1;i<10;i++){
        var total = $("#price"+i).val()*$("#input-text"+i).val();
        if(!isNaN(total)){
          totalPrice+= $("#price"+i).val()*$("#input-text"+i).val();
        }
        $("#total"+i).html(total);
      }
      $("#totalPrice").html(totalPrice);
    })


  $(".but").click(function(){
    if (window.confirm("您确定要删除吗？")) {
      $(this).parent().parent().remove();
      alert("删除成功")
    }
  })
})
</script>
</body>
</html>

