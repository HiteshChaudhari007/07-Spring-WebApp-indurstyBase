<%@page import="com.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function deleteStudent(){
	alert("Delete Student Data")
	document.myForm.action="delete";
	document.myForm.submit();
}
function addStudent(){
	document.myForm.action="reg";
	document.myForm.submit();
}

function editStudent(){
	document.myForm.action="edit";
	document.myForm.submit();
}


</script>


</head>
<style type="text/css">
th,td{
padding: 15px;
}
 input[type="submit"] {
    width: 25%;
    background-color: black;
    color: #fff;
    padding: 15px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    font-size: 16px;
  }

</style>
<%
List<Student> stu =(List<Student>)request.getAttribute("data");
%>

<body>
<div align="center" >
<h1>All Students Data</h1>
<form name="myForm">

<table border="2px"  cellspacing="20px" cellspadding ="5px 5px 5px 5px " >
<thead>
<tr>
<th>Select</th>
<th>Roll No</th>
<th>Name</th>
<th>Address</th>
<th>Number</th>
<th>Age</th>
<th>Password</th>
</tr>
</thead>
<% for(Student s : stu){ %>
<tr>
<td><input type="radio" name="rollno" value="<%=s.getRollno() %>" ></td>
<td><%=s.getRollno() %></td>
<td><%=s.getName() %></td>
<td><%=s.getAddress() %></td>
<td><%=s.getMobile() %></td>
<td><%=s.getAge() %></td>
<td><%=s.getPassword() %></td>

</tr>
<%} %>


</table>
<br><br>
<input type="submit" onclick="addStudent()" value="ADD" >
<input type="submit" onclick="editStudent()" value="EDIT" >
<input type="submit" onclick="deleteStudent()" value="DELETE" >
</form>
</div>

</body>
</html>