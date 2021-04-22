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
	<table>
		<tr>
			<td>Dojo</td>
			<td>First Name</td>
			<td>Last Name</td>
			<td>Age</td>
		</tr>
		<tr>
			<td><c:out value="${dojo.name }" /></td>
			<td><c:out value="${ninja.firstName }" /></td>
			<td><c:out value="${ninja.lastName }" /></td>
			<td><c:out value="${ninja.age }"/></td>
		</tr>
	</table>
	
	
	<a href="/dojoList">More locations</a>
</body>
</html>