<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div>

    <span>欢迎“<span class="um_span">${sessionScope.user.username}</span>”来到土匪书城</span>
    <a href="pages/cart/cart.jsp">购物车</a>
    <a href="orderServlet?action=getClientOrders">我的订单</a>
    <a href="index.jsp">返回主页</a>
    <a href="userServlet?action=logout">注销</a>&nbsp;&nbsp;
</div>