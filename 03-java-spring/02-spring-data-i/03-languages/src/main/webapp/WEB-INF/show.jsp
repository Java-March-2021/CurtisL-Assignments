<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<p class="top"><a href="/languages" class="top">Dashboard</a></p>
	
	<div>
		<c:out value="${lang.name}" />
		<br>
		<c:out value="${lang.creator}" />
		<br>
		<c:out value="${lang.currentVersion}" />
		<br>
		 <a href="/delete/${lang.id}">delete</a><br> <a
			href="/languages/${lang.id}/edit">edit</a>
	</div>
</body>
</html>