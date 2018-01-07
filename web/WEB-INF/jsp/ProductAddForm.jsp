<%--
  Created by IntelliJ IDEA.
  User: fsuser
  Date: 2018-01-05
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Product</title>
    <link rel="stylesheet" href="../css/bootstrap.css">
    <script src="js/jquery-1.9.1.js"></script>
    <script src="js/bootstrap.js"></script>
</head>
<body>
<form:form  commandName="product" action="save_product" method="post" enctype="multipart/form-data">
    <div class="form-group">
        <p>
            <label for="id">Product Id:</label>
            <form:input type="text" path="id" id="id" placeholder="please input id" class="form-control"/>
        </p>

        <p>
            <label for="productcategory">Product Category</label>
            <form:select id="productcategory"
                         path="category.id" items="${categories}" itemLabel="categoryname" itemValue="id"/>
        </p>
        <p>
            <label for="name">Product Name:</label>
            <form:input type="text" path="productname" id="name" placeholder="please input name" class="form-control"/>
        </p>
        <p>
            <label for="description">Product Description:</label>
            <form:input type="text" path="description" id="description"
                        placeholder="please input description" class="form-control"/>
        </p>
        <p>
            <label for="price">Product Price:</label>
            <form:input type="text" path="price" id="price"
                        placeholder="please input price" class="form-control"/>
        </p>
        <p>
            Product Images:<br/>
            <input type="file" name="images[0]">
            <input type="file" name="images[1]">
        </p>
        <input type="reset" value="reset" tabindex="4">
        <input type="submit" value="submit" tabindex="5">
    </div>
</form:form>
</body>
</html>
