<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String BasePath = request.getServletContext().getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MyJs</title>
</head>
<body>
	<h2 align="center" title="这是h标签">
		<font color="blue">MyJs</font>
	</h2>
	<p id="p1" title="p标签">这是p1</p>
	<script type="text/javascript"
		src="<%=BasePath%>/jquery/jquery-2.1.1.js"></script>
	<script type="text/javascript" src="myjs.js"></script>
</body>
</html>