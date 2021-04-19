<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h1>Delete Language</h1>
	<form:form action="/destroy/${lang.id}" method="post" modelAttribute="lang">
		<p>Are you sure you want to delete <c:out value="${lang.name}"/>
		<c:out value="${lang.currentVersion}"/> from 
		<c:out value="${lang.creator }"/>
		</p>
		<a href="/languages"><input type="button" value="Home"/></a>
		<input type="submit" value="delete" />
	</form:form>
</body>
</html>