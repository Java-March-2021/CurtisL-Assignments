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
<body class = time onload="templateAlert('<c:out value="${day}"/>')">
<h1><c:out value="${tformat}"/></h1> 

<script src="js/myscript.js"></script>
</body>
</html>