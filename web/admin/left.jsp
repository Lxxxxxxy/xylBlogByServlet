<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
<title>left</title>
<link rel="stylesheet" type="text/css" href="../css/admin.css">
<style type="text/css">
*{
	margin:0;
	padding:0;
}
a{
	background-color:silver;
	width:100%;
	height:5%;
	display:block;
	line-height:250%;
	border-bottom:1px solid black;
	text-align:center;
}
a:link{
	color:black;
	text-decoration:none;
}
a:visited{
	color:black;
	text-decoration:none;
}
</style>
<script type="text/javascript" src="../js/admin.js">
</script>
</head>
<body onload="time1()">
<span style="text-align:center;display:block;">
<span style="font-size:20px;">${setting[0].admin }</span>
<span id="time1"></span>
<form action="./quit" method="post" style="text-align:center;margin-top:5%;margin-bottom:5%;">
<input type="image" src="../images/exit.png" title="注销" style="width:60px;height:20px;">
</form>
<a href="./add" target="new" onmouseover="bg1()" id="bg1" onmouseout="bg11()">博客发布</a>
<a href="./edit" target="new" onmouseover="bg2()" id="bg2" onmouseout="bg22()">博客管理</a>
<a href="./admin" target="new" onmouseover="bg3()" id="bg3" onmouseout="bg33()">账户管理</a>
<a href="./setting" target="new" onmouseover="bg4()" id="bg4" onmouseout="bg44()">系统设置</a>
</body>
</html>