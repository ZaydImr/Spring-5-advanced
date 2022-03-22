<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student details</title>
</head>
<body>
	<strong>Fullname : </strong>
	<label>${ student.getFirstname() } ${student.getLastname().toUpperCase() }</label>
	<br/><br/>
	
	<strong>Country : </strong>
	<label>${ student.getCountry() }</label>
	<br/><br/>
	
	<strong>Favorite language : </strong>
	<label>${ student.getFavoriteLanguage() }</label>
	<br/><br/>
	
	<strong>Operating Systems : </strong>
	<c:forEach items="${student.operatingSystems }" var="system">
		<label>${system } | </label>
	</c:forEach>
	<br/><br/>
	
</body>
</html>