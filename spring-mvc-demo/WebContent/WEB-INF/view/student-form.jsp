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
		<br/><br/>
		
		<label>Last name :</label>
		<form:input path="lastname"/>
		<br/><br/>
		
		<label>Country :</label>
		<form:select path="country">
			<form:options items="${ student.countryOptions }"/>
		</form:select>
		<br/><br/>
		
		<label>Favorite language :</label>
			Java <form:radiobutton path="favoriteLanguage" value="JAVA"/>
			C# <form:radiobutton path="favoriteLanguage" value="C#"/>
			PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
			Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
		<br/><br/>
		
		<label>Operating systems :</label>
			Linux <form:checkbox path="operatingSystems" value="Linux"/>
			Windows <form:checkbox path="operatingSystems" value="Windows"/>
			Mac OS X <form:checkbox path="operatingSystems" value="Mac OSX"/>
		<br/><br/>
		
		<input type="submit">
		
	</form:form>

</body>
</html>