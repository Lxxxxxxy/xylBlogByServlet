<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>博客管理</title>
    <link rel="stylesheet" type="text/css" href="../css/admin.css">
    <style type="text/css">
        body {
            margin-left: 15%;
        }

        table {
            padding: 30px;
            text-align: center;
            border-collapse: collapse;
            border: 1px solid silver;
        }
    </style>

</head>
<body>
<table cellpadding="20">
    <th>序号</th>
    <th>标题</th>
    <th>发表时间</th>
    <th>操作</th>
    <c:forEach items="${blog }" var="b" varStatus="i">
    <tr>
        <td>${i.count }</td>
        <td>${b.title }</td>
        <td>${b.time }</td>
        <td><a onclick="return del()" href="./delete?id=${b.id }">删除</a>
            <a href="./editBlog?id=${b.id }">修改</a></td>
        </c:forEach>
</table>
<script type="text/javascript">
    function del() {
        var bool = confirm("是否删除此博客？");
        if (bool)
            return true;
        else {
            alert("删除失败！");
            return false;
        }
    }
</script>
</body>
</html>