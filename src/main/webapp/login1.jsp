<%--
  Created by IntelliJ IDEA.
  User: kieuanh
  Date: 25/12/24
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String username = request.getParameter("username");
  System.out.println(username);
  String password = request.getParameter("password");
  System.out.println(password);
  request.setAttribute("username", username);
//  request.setAttribute("user", username);
%><html>
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
      justify-content: center;
      align-items: center;
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
    }
    h1 {
      font-size: 3rem;
      margin-bottom: 20px;
    }
    p {
      font-size: 1.2rem;
    }
  </style>
</head>
<body>
<div class="container">
  <h1>Welcome <%=username%>  to Our Website</h1>
  <p>We are delighted to have you here. Feel free to explore and reach out if you have any questions!</p>
</div>
</body>
</html>
