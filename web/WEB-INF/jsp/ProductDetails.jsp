<%--
  Created by IntelliJ IDEA.
  User: fsuser
  Date: 2018-01-05
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Details</title>
    <link rel="stylesheet" href="css/bootstrap.css">
    <script src="js/jquery-1.9.1.js"></script>
    <script src="js/bootstrap.js"></script>

</head>
<body>
<h2>Product Details</h2>
<p class="text-primary">product id:<c:out value="${product.id}"/></p>
<p class="text-info">product name:<c:out value="${product.productname}"/></p>
<p class="text-info">product category:<c:out value="${product.category.categoryname}"/></p>
<p class="text-info">product description:<c:out value="${product.description}"/></p>
<p class="text-info">product price:<c:out value="${product.price}"/></p>
<p class="text-info">
    product images:<br/>
    <c:forEach items="${product.images}" var="image">
        ${image.originalFilename} <img src="image/${image.originalFilename}"/>
    </c:forEach>
</p>
</body>
</html>
