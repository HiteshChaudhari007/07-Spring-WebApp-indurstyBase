<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
<style>
  body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
    background-color: #f2f2f2;
  }

  .container {
    background-color: #fff;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    padding: 40px;
    max-width: 400px;
    width: 100%;
  }

  h2 {
    text-align: center;
    margin-bottom: 30px;
    color: #333;
  }

  input[type="text"],
  input[type="password"] ,
  input[type="tel"],
  input[type="number"] {
    width: 100%;
    padding: 10px;
    margin-bottom: 20px;
    border: 1px solid #ccc;
    border-radius: 5px;
    box-sizing: border-box;
  }

  input[type="submit"] {
    width: 100%;
    background-color: #000000;
    color: #fff;
    padding: 15px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    font-size: 16px;
  }

  input[type="submit"]:hover {
    background-color: #362d2d;
  }

  @media screen and (max-width: 600px) {
    .container {
      padding: 20px;
    }
  }
</style>
</head>
<body>

<div class="container">
  <h2>Register</h2>
  <form action="success" method="post" >
    <input type="number" name="rollno" placeholder="Roll No" required>
    <input type="text" name="name" placeholder="Name" required>
    <input type="number" name="age" placeholder="Age" required>
    <input type="text" name="address" placeholder="Address" required>
    <input type="password" name="password" placeholder="Password" required>
    <input type="tel" name="mobile" placeholder="Mobile Number" required>
    <input type="submit" value="Add Student">
  </form>
</div>

</body>
</html>
