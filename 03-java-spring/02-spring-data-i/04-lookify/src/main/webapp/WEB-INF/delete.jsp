<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Song</title>
</head>
<body>
	<div class="dash">
		<div class="toplevel">

			<a href="/dashboard" class="end">Dashboard</a>
		</div>
		<div>
		<h2>Press Submit button if you want to delete song</h2>
			<form:form action="/delete/${song.id}" method="post" modelAttribute="song">
				<p>
					Title:
					<c:out value="${song.title}" />
				</p>


				<p>
					Artist:
					<c:out value="${song.artist}" />
				</p>



				<p>
					Rating(1-10):
					<c:out value="${song.rating}" />
				</p>

				<input type="submit" value="Submit" />
			</form:form>
		</div>
	</div>

</body>
</html>