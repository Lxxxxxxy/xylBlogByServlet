<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <title>修改博客</title>
    <link rel="stylesheet" type="text/css" href="../css/admin.css">
    <style type="text/css">
        textarea {
            margin-top: 20px;
        }

        body {
            text-align: center;
        }

        .body_bottom {
            margin-top: 1%;
            text-align: center;
        }
    </style>
    <script language="JavaScript" src="../js/admin.js"></script>
</head>
<body>
<form action="./insert" method="post" onsubmit="editor.post();">
    <div class="body">
        <input id="text1" type="text" style="border-radius:10px;width:40%;height:3%;border:1px solid silver;"
               name="title" value="${blog[0].title }" placeholder="输入你的标题...">
    </div>
    <textarea id="Qing_input" name="body">${blog[0].body }</textarea>
    <div class="body">
        分类<select name="category">
        <c:forEach items="${category }" var="c">
            <c:if test="${c.category==blog[0].category }">
                <option selected="selected">${c.category }</option>
            </c:if>
            <c:if test="${c.category!=blog[0].category }">
                <option>${c.category }</option>
            </c:if>
        </c:forEach>
    </select>
        <a href="./addCategory.jsp">创建新分类</a><br><br>
        <c:if test="${blog[0].mm=='on' }">
            是否需要密码访问<input id="mm" checked="checked" onclick="mm1()" type="checkbox" name="mm"><br>
            <span id="yzmm" style="display:block;">输入密码：<input type="password" name="yzmm"
                                                               value="${blog[0].yzmm }"></span>
        </c:if>
        <c:if test="${blog[0].mm!='on' }">
            是否需要密码访问<input id="mm" onclick="mm1()" type="checkbox" name="mm"><br>
            <span id="yzmm" style="display:none	;">输入密码：<input type="password" name="yzmm"></span>
        </c:if>
        <input type="hidden" value="${blog[0].id }" name="id">
        <input type="hidden" value="${blog[0].time }" name="time">
    </div>
    <div>
        <input type="submit" value="修改"
               style="border-radius:10px;border:1px solid silver;margin-top:1%;width:6%;height:3%;">
    </div>
    </div>
</form>
<link rel="stylesheet" href="../css/qing-style.css"/>
<script type="text/javascript" src="../js/qing-editor-all.js"></script>
</body>
</html>