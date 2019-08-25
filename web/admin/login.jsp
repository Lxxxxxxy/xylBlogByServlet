<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
<title>登录</title>
<link rel="stylesheet" type="text/css" href="../css/admin.css">
<style type="text/css">
.denglu{
	position:absolute;
	left:35%;
	top:30%;
	text-align:center;
	margin:0 auto;
}
tr{
	margin-top:20%;
}
td{
	white-space: nowrap;
}
table{
	border-collapse:collapse;
	width:500px;
	height:200px;
}
input:focus{outline:none;}
</style>
<script type="text/javascript">
var rand=Math.round(Math.random()*899999+100000);
function click1(){
	var input = document.getElementById("user");
	input.style="width:70%;border-top-style: none; border-right-style: none; border-left-style: none; background-color:#F5F5F5; border-bottom-style:solid;border-color:#"+rand+";";
	input.style.transition="width 0.5s";
}
function click2(){
	var input = document.getElementById("password");
	input.style="width:70%;border-top-style: none; border-right-style: none; border-left-style: none; background-color:#F5F5F5; border-bottom-style:solid;border-color:#"+rand+";";
	input.style.transition="width 0.5s";
}
</script>
</head>
<body>
<form action="./login" method="post">
<div class="denglu">
<table style="text-align:center;">
<tr>
<td><input onfocus="click1()" id="user" type="text" name="user" style="width:21%;border-top-style: none; border-right-style: none; border-left-style: none; border-bottom-style:none;background-color:#F5F5F5;" placeholder="输入你的用户名..."></td>
</tr>
<tr>
<td><input onfocus="click2()" id="password" type="password" name="password" style="width:21%;border-top-style: none; border-right-style: none; border-left-style: none; border-bottom-style:none;background-color:#F5F5F5;" placeholder="输入你的密码..."></td>
</tr>
<tr>
<td colspan="2" style="margin-top:2%;"><input type="submit" value="登录" style="border-radius:10px;border:1px solid silver;width:30%;height:50%;">
</tr>
</table>
</div>
</form>
</body>
</html>