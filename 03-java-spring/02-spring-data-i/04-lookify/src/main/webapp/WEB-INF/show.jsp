<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><c:out value="${song.title}" /></title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class="dash">
		<div class="toplevel">
			<a href="/dashboard" >Dashboard</a>
			<p>
				Title:
				<c:out value="${song.title}" />
			</p>

		</div>
		<div>
			<p>
				Artist:
				<c:out value="${song.artist}" />
			</p>

		</div>
		<div>
			<p>
				Rating(1-10):
				<c:out value="${song.rating}" />
			</p>

		</div>
		<a href="/delete/${song.id}" >delete</a>
	</div>
</body>
</html>