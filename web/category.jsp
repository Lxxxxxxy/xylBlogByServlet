<%@ page import="domain.Category" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
	List<Category> cate = (List<Category>) request.getAttribute("category");
	int c=0;
	for(int i = 0 ;i<cate.size();++i){
		c+=cate.get(i).getCount();
	}
%>
<!DOCTYPE>
<html>
<head>
<meta charset="utf-8">
<title>${setting[0].blog_name }</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
<link rel="stylesheet" type="text/css" href="./css/index.css">
<style type="text/css">
#animated_div{
	display:inline-block;
	text-align:center;
	background-color:white;
	float:right;
	word-break:break-all;
	word-wrap:break-word;
	margin-bottom:3%;
}
b:link{
	text-decoration:none;
}
</style>
<script language="JavaScript" src="./js/submit.js"></script>
</head>
<body>
<div class="title">
<a href="${setting[0].index1 }">${setting[0].mainblog_name }</a>
<span>${setting[0].blog_name }</span>
<div class="left">
		<c:forEach items="${blog }" var="b">
	<div id="animated_div" style="border:1px solid silver;">
		<br>
		<c:if test="${b.mm=='on' }">
			<img src='./images/lock.png' style='width:20px;' title='已锁定'>
		</c:if>
		<a style="font-size:24px;" href="./content?id=${b.id }">${b.title }</a><br>
		<img src='./images/clock.png' style='width:20px;' title='发表时间'>
		<span style="font-size:18px;">${b.time } &nbsp;
		<img src='./images/male.png' style='width:20px;' title='作者'>${setting[0].admin }</span>
	<hr>
		<div style='width:70%;margin:0 auto;font-size:20px;'>
		<c:if test="${b.mm=='on'}">
			该博客已加密！</div>
		</c:if>
		<c:if test="${b.mm!='on' }">
			${b.body }...</div>
		</c:if>
		<br><a style='color:black;' href="./content?id=${b.id }">[Read More]</a>
		</div>
		</c:forEach>
</div>
<div class="right">
<div class="top" style="1px solid red;">
<form action="./search" method="get" onsubmit="return hc()">
	<input id="search" type="search" placeholder="Search..." name="search">
</form>
</div>
<br><br><br>
<div class="fenlei">
	分类（<%=c%>）
<br><br>
<hr>
	<ul>
		<c:forEach items="${category }" var="f">
			<li><a href="./category?id=${f.id }">${f.category }(${f.count })</a></li>
		</c:forEach>
	</ul>
</div>
<br><br><br>
<div class="fenlei">
最新评论
<br><br>
<hr>
<ul class="ul">
<c:forEach items="${pl }" var="p"> 
	<li><a href="./content?id=${p.id }">${p.pl }</a></li>
</c:forEach>
</ul>
</div>
<br><br><br>
</div>
<a href="#" class="b"><div id="button" onmousemove="t()" onmouseout="o()">TOP</div></a>
<footer>
Copyright &copy; 2018 x.y.l.开源博客系统&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href='http://www.miibeian.gov.cn/'>${setting[0].beian }</a>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="http://wpa.qq.com/msgrd?v=3&amp;uin=${setting[0].qq }&amp;site=qq&amp;menu=yes">联系我们</a>
</footer>
<script type="text/javascript" color="0,0,0" zindex="-1" opacity="2" count="99" src="./js/border.js"></script>
</body>
</html>