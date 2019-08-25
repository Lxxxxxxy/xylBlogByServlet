<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
    <meta charset="utf-8">
    <title>账户管理</title>
    <link rel="stylesheet" type="text/css" href="../css/admin.css">
    <style type="text/css">
        body {
            margin-left: 15%;
        }

        input {
            margin-top: 1%;
        }

        .right {
            border-radius: 10px;
        }
    </style>
    <script type="text/javascript">
    </script>
</head>
<body>
<form action="./setting2" method="post">
    <table>
        <tr>
            <td class="right">
                用户名：
            </td>
            <td>
                <input type="text" name="user" style="border-radius:10px;border:1px solid silver;
box-shadow:0px 0px 8px silver;box-shadow:0px 0px 8px silver;box-shadow:0px 0px 8px silver;" value="${admin[0].user }">
            </td>
        </tr>
        <tr>
            <td class="right">
                新密码：
            </td>
            <td>
                <input type="password" name="newpassword"
                       style="border-radius:10px;border:1px solid silver;box-shadow:0px 0px 8px silver;box-shadow:0px 0px 8px silver;box-shadow:0px 0px 8px silver;">
            </td>
        </tr>
        <tr>
            <td class="right">
                确认密码：
            </td>
            <td>
                <input type="password" name="newpassword"
                       style="border-radius:10px;border:1px solid silver;box-shadow:0px 0px 8px silver;box-shadow:0px 0px 8px silver;box-shadow:0px 0px 8px silver;">
            </td>
        </tr>
        <tr>
            <td>
            </td>
        </tr>
        <tr>
            <td>
            </td>
            <td>
                <input type="submit" value="确认修改"
                       style="border-radius:10px;border:1px solid silver;margin-top:1%;width:60%;height:100%;">
            </td>
        </tr>
    </table>
</form>
</body>
</html>