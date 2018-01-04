<%--
  Created by IntelliJ IDEA.
  User: JAMES
  Date: 2018/1/4
  Time: 23:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Province Details</title>
    <link rel="stylesheet" href="css/bootstrap.css">
    <script src="js/jquery-1.9.1.js"></script>
    <script src="js/bootstrap.js"></script>
</head>
<body>
<c:forEach items="${provinces}" var="province">
    <p>Province Name:<c:out value="${province.provincename}"/></p>
    <p>Cities In The Province:</p>
    <ul>
    <c:forEach items="${province.cities}" var="city">
        <li>${city.cityname}</li>
    </c:forEach>
    </ul>
</c:forEach>
</body>
</html>
