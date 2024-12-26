<%--
  Created by IntelliJ IDEA.
  User: kieuanh
  Date: 26/12/24
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            background: linear-gradient(135deg, #1e90ff, #ff7f50);
            color: white;
        }
        .container {
            text-align: center;
            background: rgba(0, 0, 0, 0.5);
            padding: 20px 40px;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
            margin-bottom: 20px;
        }
        h1 {
            font-size: 3rem;
            margin-bottom: 20px;
        }
        p {
            font-size: 1.2rem;
        }
        table {
            width: 80%;
            margin: 0 auto;
            border-collapse: collapse;
            background: white;
            color: black;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
        }
        th, td {
            padding: 15px;
            text-align: center;
            border: 1px solid #ddd;
        }
        th {
            background-color: #1e90ff;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        tr:hover {
            background-color: #f1f1f1;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Welcome to Our Website</h1>
    <p>We are delighted to have you here. Feel free to explore and reach out if you have any questions!</p>
</div>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
        <th>Phone</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="row" items="${list}">

        <tr>
            <td>${row.id}</td>
            <td>${row.name}</td>
            <td>${row.email}</td>
            <td>${row.phone}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
