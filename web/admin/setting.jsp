<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<meta charset="utf-8">
<title>系统设置</title>
<link rel="stylesheet" type="text/css" href="../css/admin.css">
<style type="text/css">
body{
	margin-left:15%;
}
input{
	margin-top:1%;
}
.right{
	border-radius:10px;
}
</style>
<script type="text/javascript">
</script>
</head>
<body>
<form action="./setting1" method="post">
<table>
<tr>
<td class="right">
网站主标题：
</td>
<td>
<input type="text" name="mainblog_name" style="border-radius:10px;border:1px solid silver;
box-shadow:0px 0px 8px silver;box-shadow:0px 0px 8px silver;box-shadow:0px 0px 8px silver;" 
value="${setting[0].mainblog_name }">
</td>
</tr>
<tr>
<td class="right">
网站副标题：
</td>
<td>
<input type="text" name="blog_name" style="border-radius:10px;border:1px solid silver;box-shadow:0px 0px 8px silver;
box-shadow:0px 0px 8px silver;box-shadow:0px 0px 8px silver;" value="${setting[0].blog_name }">
</td>
</tr>
<tr>
<td class="right">
网站首页网址：
</td>
<td>
<input type="text" name="index" style="border-radius:10px;border:1px solid silver;
box-shadow:0px 0px 8px silver;box-shadow:0px 0px 8px silver;box-shadow:0px 0px 8px silver;" 
value="${setting[0].index1 }">
</td>
</tr>
<tr>
<td>
</td>
</tr>
<tr>
<td class="right">
网站备案号：
</td>
<td>
<input type="text" name="beian" style="border-radius:10px;border:1px solid silver;box-shadow:0px 0px 8px silver;
box-shadow:0px 0px 8px silver;box-shadow:0px 0px 8px silver;" 
value="${setting[0].beian }"><br>
</td>
</tr>
<tr>
<td class="right">
博客账户名：
</td>
<td>
<input type="text" name="admin" style="border-radius:10px;border:1px solid silver;
box-shadow:0px 0px 8px silver;box-shadow:0px 0px 8px silver;box-shadow:0px 0px 8px silver;" 
value="${setting[0].admin }"><br>
</td>
</tr>
<tr>
<td>
QQ：
</td>
<td>
<input type="text" name="qq" style="border-radius:10px;border:1px solid silver;box-shadow:0px 0px 8px silver;
box-shadow:0px 0px 8px silver;box-shadow:0px 0px 8px silver;" 
value="${setting[0].qq }">
</td>
</tr>
<tr>
<td>
</td>
<td>
<input type="submit" value="确认修改" style="border-radius:10px;border:1px solid silver;margin-top:1%;width:60%;height:100%;">
</td>
</tr>
</table>
</form>
</body>
</html>