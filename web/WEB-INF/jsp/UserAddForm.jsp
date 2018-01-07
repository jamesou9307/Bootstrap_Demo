<%--
  Created by IntelliJ IDEA.
  User: JAMES
  Date: 2018/1/7
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add User</title>
    <link rel="stylesheet" href="css/bootstrap.css">
    <script src="js/jquery-1.9.1.js"></script>
    <script src="js/bootstrap.js"></script>
</head>
<body>
<form:form class="form-inline" role="form" commandName="user" action="save_user" method="post">
    <div class="form-group">
        <form:input path="name" id="name" placeholder="please input name here"/>
        <form:input path="age" id="age" placeholder="please input age here"/>
        <form:input path="position" id="position" placeholder="please input position here"/>
        <button type="submit" class="btn-default">submit</button>
    </div>
</form:form>
</body>
</html>
