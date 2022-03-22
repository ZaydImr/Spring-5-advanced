<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer form</title>
<style type="text/css">
	.error{
		color:red;
	}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
		
		Firstname : 
		<form:input path="firstname" placeholder="Enter your firstname .."/><br/><br/>
		
		Lastname (*) : 
		<form:input path="lastname" placeholder="Enter your lastname .."/>
		<form:errors path="lastname" cssClass="error" /><br/><br/>
		
		Free passes : 
		<form:input path="freePasses" placeholder="Enter a free passes .."/>
		<form:errors path="freePasses" cssClass="error" /><br/><br/>
		
		<input type="submit"> 
	</form:form>
</body>
</html>