<%--
  Created by IntelliJ IDEA.
  User: 王不留行
  Date: 2021/12/22
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>销量管理</title>
    <%-- 静态包含 base标签、css样式、jQuery文件 --%>
    <%@ include file="/pages/common/head.jsp"%>

</head>

<body>

<div id="header">
    <img class="logo_img" alt="" src="static/img/logo.gif" >
    <span class="wel_word" style="color: brown">销量管理系统</span>
    <%-- 静态包含 manager管理模块的菜单  --%>
    <%@include file="/pages/common/manager_menu.jsp"%>
</div>

<div id="main">
    <table>
        <tr>
            <td>书名</td>
            <td>价格</td>
            <td>销量</td>
            <td>库存</td>
        </tr>
        <c:forEach var="book" items="${requestScope.books}">
            <tr>
                <td>${book.name}</td>
                <td>${book.price}</td>
                <td>${book.sales}</td>
                <td>${book.stock}</td>
            </tr>
        </c:forEach>
    </table>
</div>

<%--静态包含页脚内容--%>
<%@include file="/pages/common/footer.jsp"%>

</body>
</html>