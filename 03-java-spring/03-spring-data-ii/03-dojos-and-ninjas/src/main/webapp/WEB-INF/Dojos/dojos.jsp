<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<table>
	<tr>
	<td>Name</td>
	<td>Number of Ninjas</td>
	<td>Ninja List</td></tr>
	<c:forEach items="${dojos}" var="d">
	<tr>
		<td>
		<a href="dojo/${d.id}"><c:out value="${d.name }"/></a></td>
		<td>
		<c:out value="${count.get(d.name)}"/></td>
		<td><a href="dojo/${d.id}">Cohort</a></td>
		</tr>
	</c:forEach>
	
	</table>
</body>
</html>