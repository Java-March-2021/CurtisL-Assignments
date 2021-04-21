<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Credentials</title>
</head>
<body>
	<h1>Individual's Credentials</h1>
	<p>Name: <c:out value="${person.firstName }"/>  <c:out value="${person.lastName }"/></p>
	<p>License#: <c:out value="${person.license.number }"/></p>
	<p>State issued: <c:out value="${person.license.state }"/></p>
	<p>Expiration: <c:out value="${person.license.expiration_date }"/></p>
</body>
</html>