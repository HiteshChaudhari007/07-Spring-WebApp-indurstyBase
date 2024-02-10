<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%
int rollno = (Integer)request.getAttribute("data");
%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="result" method="post">
<label>Name :</label>
<input name="name" type="text" ><br><br>
<label>Address :</label>
<input name="address" type="text" ><br><br>
<input name="rollno" type="hidden" value="<%=rollno %>" >
<input type="submit" value="Register" >
</form>

</body>
</html>