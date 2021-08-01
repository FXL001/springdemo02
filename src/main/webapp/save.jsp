<%--
  Created by IntelliJ IDEA.
  User: 16207
  Date: 2021-08-01
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<form action="/hello/save" method="post">
    ID:<input type="text" name="id"/><br/>
    name:<input type="text" name="name" /><br/>
    age:<input type="text" name="age" /><br/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
