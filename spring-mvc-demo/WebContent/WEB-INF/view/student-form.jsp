<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
	
		<label>First name :</label>
		<form:input path="firstname"/>
		<br/>
		
		<label>Last name :</label>
		<form:input path="lastname"/>
		<br/>
		
		<label>Country :</label>
		<form:select path="country">
			<form:option value="Morocco" label="Morocco" />
			<form:option value="France" label="France" />
			<form:option value="Germany" label="Germany" />
			<form:option value="Italia" label="Italia" />
		</form:select>
		<br/>
		
		<input type="submit">
		
	</form:form>

</body>
</html>