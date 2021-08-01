
<%--
  Created by IntelliJ IDEA.
  User: 16207
  Date: 2021-08-01
  Time: 18:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--下面两行手动添加--%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>学⽣生信息</h1>
<table>
    <tr>
        <th>学⽣生编号</th>
        <th>学⽣生姓名</th>
        <th>学⽣生年年龄</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td><a href="/hello/findById/${student.id}">修改</a>
                <a href="/hello/deleteById/${student.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="/save.jsp">添加学⽣生</a>
</body>
</html>