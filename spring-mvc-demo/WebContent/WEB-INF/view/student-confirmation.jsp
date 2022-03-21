<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student details</title>
</head>
<body>
	<strong>Fullname : </strong>
	<label>${ student.getFirstname() } ${student.getLastname().toUpperCase() }</label>
</body>
</html>