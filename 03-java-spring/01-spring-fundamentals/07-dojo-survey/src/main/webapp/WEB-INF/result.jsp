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
	<form method="get" action="/">
	<div class="lowsection under">
		<p>Submitted Info</p>
		</div>
		<div>
			<label>Name:</label>
			<c:out value="${name}" />
		</div>
		<div>
			<label>Location:</label>
			<c:out value="${Location}" />
		</div>
		<div>
			<label>Favorite language:</label>
			<c:out value="${lang}" />!!!
		</div>
		<div class="space">
			<label>Comment:</label>
			<c:out value="${Comment}" />
		</div>
		<input type="submit" name="submit" class="butten" id="goBack">  
	</form>
	<script src="js/script.js"></script>

</body>
</html>