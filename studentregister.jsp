<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Student Information</h1>
<form action="<%=request.getContextPath() %>/register" method="post">
<table style= "with:80%">
<tr>
<td>id</td>
<td><input type="text" name="id" /></td>
</tr>
<tr>
<td>name</td>
<td><input type="text" name="name" /></td>
</tr>
<tr>
<td>semseter</td>
<td><input type="text" name="semester" /></td>
</tr>
<tr>
<td>subject</td>
<td><input type="text" name="subject" /></td>
</tr>
<tr>
<td>marks</td>
<td><input type="text" name="marks" /></td>
</tr>


</table>
<input type="submit" name="Submit" />
</form>
</div>
</body>
</html>