<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Song</title>
</head>
<body>
	<div class="dash">
	<div class="toplevel">
			
			<a href="/dashboard" class="end">Dashboard</a>
		</div>
	<div>
	<form:form action="/new" method="post" modelAttribute="song">
		<p>
			<form:label path="title">Title
			<form:errors path="title" />
			<form:input path="title" /></form:label>
		</p>
		<p>
			<form:label path="artist">Artist</form:label>
			<form:errors path="artist"/>
			<form:textarea path="artist" />
		</p>
		<p>
			<form:label path="rating">Rating</form:label>
			<form:errors path="rating" />
			<form:input path="rating" type="number"/>
		</p>
	
		<input type="submit" value="Submit" />
	</form:form>
	</div>
	</div>

</body>
</html>