<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>土匪会员注册页面</title>

	<%-- 静态包含 base标签、css样式、jQuery文件 --%>
	<%@ include file="/pages/common/head.jsp"%>

	<style type="text/css">
	h1 {
		text-align: center;
	}
	
	h1 a {
		color:red;
	}
</style>
</head>
<body>
		<div id="header">
				<img class="logo_img" alt="" src="static/img/logo.gif" >
				<span class="wel_word"></span>
		</div>
		
		<div id="main">
		
			<h1>注册成功! </h1>
			<h1><a href="pages/user/login.jsp">登录</a></h1>
			<h1><a href="index.jsp">返回主页</a></h1>

	
		</div>


		<%--静态包含页脚内容--%>
		<%@include file="/pages/common/footer.jsp"%>


</body>
</html>