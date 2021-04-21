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
<h1><c:out value="${dojo.name }"/></h1>
<h2>Grand Opening of Coding Dojo's <c:out value="${dojo.name }"/> location</h2>
<a href="Ninjas/newNinja">Add students</a>
<a href="Dojos/dojoList">More locations</a>
</body>
</html>