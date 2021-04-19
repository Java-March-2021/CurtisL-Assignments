<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class="dash">
		<div class="toplevel">
			<a href="new">Add new</a> <a href="topTen">Top Songs</a>
			<form action="/search" method="post">
				<input type="text" name="artist"> <input type="submit"
					value="Search Artist" />
			</form>

		</div>
		<div>
			<table>
				<tr>
					<td>Name</td>
					<td class="midtable">Rating</td>
					<td>actions</td>
				</tr>
				<c:forEach items="${songs}" var="song">
					<tr>
						<td><a href="show/${song.id}"><c:out value="${song.title}" /></a></td>
						<td class="midtable"><c:out value="${song.rating}" /></td>
						<td><a href="/delete/${song.id}">delete</a></td>
					</tr>
				</c:forEach>

			</table>
		</div>
	</div>

</body>
</html>