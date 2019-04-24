<%--
  Created by IntelliJ IDEA.
  User: lecongdung
  Date: 24/04/2019
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple dictionary</title>
</head>
<body>
<h1>Simple dictionary</h1>
<form action="/tudien" method="post">
    <table>
        <tr>
            <td>English:</td>
            <td><input type="text" name="en"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="search"></td>
        </tr>
    </table>
</form>
</body>
</html>
