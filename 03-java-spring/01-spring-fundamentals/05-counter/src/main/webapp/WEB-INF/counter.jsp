<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>counter page</h2>
	<p>You have visited the page <c:out value="${day}"/> times</p>
	<a href="index.jsp">Test another visit</a>
	<form method=Post action="/counter"></form>
</body>
</html>