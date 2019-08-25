<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>添加分类</title>
    <style type="text/css">
        textarea {
            margin-top: 20px;
        }

        body {
            text-align: center;
        }

        .body_bottom {
            margin-top: 1%;
        }

        textarea {
            vertical-align: top;
        }
    </style>
    <script type="text/javascript">
    </script>
</head>
<body>
<form action="./addCategory" method="post">
    <div class="body">
        添加新分类：<input type="text" style="border-radius:10px;border:1px solid #D1EEEE;width:40%;height:3%;
box-shadow:0px 0px 8px #D1EEEE;" name="category">
    </div>
    <input type="submit" value="添加分类"
           style="border-radius:10px;border:1px solid silver;margin-top:1%;width:10%;height:3%;">
</form>
</body>
</html>