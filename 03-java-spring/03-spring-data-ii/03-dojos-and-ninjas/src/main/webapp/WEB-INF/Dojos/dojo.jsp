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
	<h1>
		<c:out value="${dojo.name}" />
		Location Ninjas
	</h1>
	<table>
		<tr>
			<td>First Name</td>
			<td>Last Name</td>
			<td>Age</td>
		</tr>
		<c:forEach items="${ninjas}" var="n">
			<tr>
				<td><c:out value="${n.firstName}" /></td>
				<td><c:out value="${n.lastName}" /></td>
				<td><c:out value="${n.age}" /></td>
			</tr>
		</c:forEach>
	</table>
	<a href="/newNinja">Add Ninja</a>
	<a href="/dojoList">More locations</a>
</body>
</html>