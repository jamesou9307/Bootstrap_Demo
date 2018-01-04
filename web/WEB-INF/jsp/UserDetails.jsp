<%--
  Created by IntelliJ IDEA.
  User: fsuser
  Date: 2018-01-04
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Details</title>
    <link rel="stylesheet" href="css/bootstrap.css">
    <script src="js/jquery-1.9.1.js"></script>
    <script src="js/bootstrap.js"></script>
    <script>
        function getJson() {
            var userJson;
            $.ajax({
                url:"get_json",
                type:"POST",
                dataType:"json",
                async:false,
                cache:false,
                success:function (data) {

                    userJson=data;
                },
                error:function (data) {
                    console.log(0);
                }
                

            })
    return userJson;
        }
        function loadJson() {

            var userJson=getJson();
            for(i in userJson){
                $("#main").append("<p>"+userJson[i].name+"</p>")
            }

        }
    </script>
</head>
<body>
<div id="main" class="container">
    <h2>All Users</h2>
    <table class="table table-bordered table-hover table-striped">
        <thead>
        <th>员工ID</th>
        <th>员工姓名</th>
        <th>员工年龄</th>
        <th>员工职位</th>
        </thead>
        <tbody>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.age}</td>
                <td>${user.position}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <button onclick="loadJson()">getJson</button>
</div>

</body>
</html>
