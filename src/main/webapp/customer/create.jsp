<%--
  Created by IntelliJ IDEA.
  User: kieuanh
  Date: 26/12/24
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
      min-height: 100vh;
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
    .form-container {
      background: white;
      color: black;
      padding: 20px 40px;
      border-radius: 10px;
      box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
      max-width: 500px;
      width: 100%;
      margin: 20px auto;
    }
    .form-container h2 {
      margin-bottom: 20px;
    }
    .form-group {
      margin-bottom: 15px;
    }
    .form-group label {
      display: block;
      font-weight: bold;
      margin-bottom: 5px;
    }
    .form-group input {
      width: 100%;
      padding: 10px;
      border: 1px solid #ddd;
      border-radius: 5px;
    }
    .form-group button {
      width: 100%;
      padding: 10px;
      background-color: #1e90ff;
      color: white;
      border: none;
      border-radius: 5px;
      font-size: 1rem;
      cursor: pointer;
    }
    .form-group button:hover {
      background-color: #ff7f50;
    }
  </style>
</head>
<body>
<div class="container">
  <h1>Welcome to Our Website</h1>
  <p>We are delighted to have you here. Feel free to explore and reach out if you have any questions!</p>
</div>
<div class="form-container">
  <h2>Create New Entry</h2>
  <form method="POST">
    <div class="form-group">
      <label for="name">Name:</label>
      <input type="text" id="name" name="name" required>
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" id="email" name="email" required>
    </div>
    <div class="form-group">
      <label for="phone">Phone:</label>
      <input type="tel" id="phone" name="phone" required>
    </div>
    <div class="form-group">
      <button type="submit">Submit</button>
    </div>
  </form>
</div>
</body>
</html>
