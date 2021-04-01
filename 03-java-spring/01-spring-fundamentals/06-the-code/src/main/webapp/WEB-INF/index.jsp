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
<div>
	<h3 class="error">
		<c:out value="${error}" />
	</h3>
	<p>What is this code?</p>
	<form method="Post" action="/code">
		<input type="password" name="code"></input>
		<button>Try Code</button>
	</form>
	</div>

</body>
</html>