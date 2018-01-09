<%--
  Created by IntelliJ IDEA.
  User: JAMES
  Date: 2018/1/8
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/bootstrap.css">
    <script src="js/jquery-1.9.1.js"></script>
    <script src="js/bootstrap.js"></script>
    <title>DropDown Menu</title>
</head>
<body>
<%--
.dropdown 指定下拉菜单
.dropdown-menu 创建下拉菜单
--%>
<div class="dropdown" id="user_menu">
    <button class="btn dropdown-toogle" id="dropdown1" data-toggle="dropdown" >${users.menuSetName}</button>
    <ul class="dropdown-menu" role="menu" aria-labelledby="dropdown1">
        <c:forEach items="${users.menuItems}" var="menuItem">
            <li role="presentation">
                <a role="menuitem" href="${menuItem.action}">${menuItem.menuname}</a>
            </li>
        </c:forEach>
        <li role="menuitem" class="divider"></li>
        <li role="presentation"><a role="menuitem" href="#"></a></li>
    </ul>
</div>
<%--
.dropup 用于创建一个向上拉的下拉菜单
--%>
<div class="dropup" id="province_menu">
    <button class="btn dropdown-toogle" id="dropdown2" data-toggle="dropdown">${provinces.menuSetName}</button>
    <ul class="dropdown-menu" aria-labelledby="dropdown2" role="menu">
        <c:forEach items="${provinces.menuItems}" var="menuItem">
            <li role="presentation">
                <a role="menuitem" href="${menuItem.action}">${menuItem.menuname}</a>
            </li>
        </c:forEach>
        <li role="menuitem" class="divider"></li>
        <li role="presentation">About us</li>
    </ul>
</div>
</body>
</html>
