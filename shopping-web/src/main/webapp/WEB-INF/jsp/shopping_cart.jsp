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
        <li><a href="${pageContext.request.contextPath}/home/findbook">User首页</a></li>
        <li><a href="findDingdanxx">我的订单</a></li>
        <li class="current"><a href="toshopcart">购物车</a></li>
        <li><a href="zhuxiao">注销</a></li>
      </ul>
    </div>
    <form method="get" name="search" action="">
      搜索：<input class="input-text" type="text" name="keywords" /><input class="input-btn" type="submit" name="submit" value="" />
    </form>
  </div>
</div>
<div id="content" class="wrap">
  <div class="list bookList">
    <form method="post" name="shoping" action="addOrder">
      <table id="tab">
        <tr class="title">
          <th class="view">图片预览</th>
          <th>书名</th>
          <th class="nums">数量</th>
          <th class="price">单价</th>
          <th class="price">小计</th>
          <th class="price">删除</th>
        </tr>
        <c:set var="sum" value="0"></c:set>
        <c:forEach items="${cart}" var="g">
        <tr>
          <td class="thumb">
            <img src="${g.value.bookImage}" /></td>
          <td>${g.value.bookName}</td>
          <td>
            <input class="min" name="" type="button" value="－" />
            <input class="input-text" bookId="${g.value.bookId}" count="${g.value.count}" price="${g.value.bookPrice}" type="text" name="nums" value="${g.value.count}" style="width: 30px"/>
            <input class="add" name="" type="button" value="＋" />
          </td>
          <td>
            ￥<span>${g.value.bookPrice}</span>
          </td>
          <td>
            ￥<span id="total">${g.value.count*g.value.bookPrice}</span>
          </td>
          <td>
            <a href="javascript:void(0)" class="del" bookId="${g.value.bookId}">删除</a>
            <%--<button type="button" class="btn" title="${g.value.bookId}">删除</button>--%>
          </td>
          <c:set var="sum" value="${sum+g.value.count*g.value.bookPrice}"></c:set>
        </tr>
        </c:forEach>

      </table>
      <div class="button">
        <h4>总价：￥<span id="totalPrice">${sum}</span>元</h4>
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
    $(".input-text").blur(function(){
      //修改页面上的小计价格,并且使用toFixed(2)表示保留两位小数
      var price=parseFloat($(this).attr("price"));
      var count=$(this).val();
      var total =price*count;
      $(this).parent().next().next().children("span").html(total.toFixed(2));
      //修改服务器后台存在session中的数量
      $.post("updatecount",{"bookId":$(this).attr("bookId"),"count":$(this).val()},function(sum){
        $("#totalPrice").html(sum.toFixed(2));
      })

    })

    $(".del").click(function(){
      $(this).parents("tr").remove();
      $.post("deleteShopCart",{"bookId":$(this).attr("bookId")},function(sum){
        $("#totalPrice").html(sum.toFixed(2));
      })
    })

  })




//  $(function(){
//    update();
//    $(".input-text").change(function(){
//      update();
//    })
////      var bookid=$("#bookVoid").length;
//      function update(){
//        var totalPrice=0;
//        for(var i=0;i<10;i++){
//          var total =parseFloat( $("#price"+i).text())*$("#input-text"+i).val();
//
//          if(!isNaN(total)){
//            totalPrice+= parseFloat( $("#price"+i).text())*$("#input-text"+i).val();
//          }
//          $("#total"+i).html(total.toFixed(2));
//        }
//        $("#totalPrice").html(totalPrice.toFixed(2));
//      }
//  })


</script>
</body>
</html>

