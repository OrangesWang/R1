<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>我的订单</title>

	<%-- 静态包含 base标签、css样式、jQuery文件 --%>
	<%@ include file="/pages/common/head.jsp"%>


	<style type="text/css">
	h1 {
		text-align: center;
		margin-top: 200px;
	}
</style>
</head>
<body>
	
	<div id="header">
			<img class="logo_img" alt="" src="static/img/logo.gif" >
			<span class="wel_word">我的订单</span>

		<%--静态包含，登录 成功之后的菜单 --%>
		<%@ include file="/pages/common/login_success_menu.jsp"%>
	</div>
	
	<div id="main">
            <table>
                <tr>
                    <th>订单号</th>
                    <th>日期</th>
                    <th>金额</th>
                    <th>状态</th>
                </tr>
                <%
                    boolean nothing = true;
                %>
                <c:forEach var="order" items="${requestScope.orders}">
                    <c:if test="${sessionScope.user.id == order.userId}">
                        <%
                            nothing = false;
                        %>
                        <tr>
                            <td>${order.orderId}</td>
                            <td>${order.createTime}</td>
                            <td>${order.price}</td>
                            <c:if test="${order.status == 0}">
                                <td>未发货</td>
                            </c:if>
                            <c:if test="${order.status == 1}">
                                <td>已发货</td>
                            </c:if>
                            <c:if test="${order.status == 2}">
                                <td>已签收</td>
                            </c:if>
                        </tr>
                    </c:if>
                </c:forEach>
                <%
                    if(nothing) {
                %>
                <tr>
                    <td colspan="5"><a href="index.jsp">空空如也</a> </td>
                </tr>
                <%
                    }
                %>
            </table>



	</div>

	<%--静态包含页脚内容--%>
	<%@include file="/pages/common/footer.jsp"%>

</body>
</html>