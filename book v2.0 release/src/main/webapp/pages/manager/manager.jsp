<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>后台管理</title>
	<%-- 静态包含 base标签、css样式、jQuery文件 --%>
	<%@ include file="/pages/common/head.jsp"%>
	<style type="text/css">
	h1 {
		text-align: center;
		margin-top: 5px;
	}
	h1 a {
		color:red;
	}
</style>
</head>
<body>
	
	<div id="header">
			<img class="logo_img" alt="" src="static/img/logo.gif" >
			<span class="wel_word" style="color: hotpink">后台管理系统</span>
	</div>
	
	<div id="main">
		<h1>欢迎管理员"${sessionScope.user.username}"进入后台管理系统</h1>
		<h1><a href="manager/bookServlet?action=page" style="background-color: darkgrey" >图书管理</a></h1>
		<h1><a href="manager/bookServlet?action=getSales" style="background-color: darkgrey">销量管理</a></h1>
		<h1><a href="orderServlet?action=getOrders" style="background-color: darkgrey">订单管理</a></h1>
		<h1><a href="userServlet?action=logout" style="background-color: darkgrey">注销</a>&nbsp;&nbsp;</h1>
	</div>

	<%--静态包含页脚内容--%>
	<%@include file="/pages/common/footer.jsp"%>

</body>
</html>