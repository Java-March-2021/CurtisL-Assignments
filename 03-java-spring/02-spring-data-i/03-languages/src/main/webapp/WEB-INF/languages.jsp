<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Languages Page</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<div>
	<table>
		<tr>
			<td>Name</td>
			<td>Creator</td>
			<td>Version</td>
			<td>action</td>
		</tr>
		<c:forEach items="${langs}" var="language" varStatus="loop">
			<tr >
				<td><a href="languages/${language.id}"><c:out value="${language.name}" /></a></td>
				<td><c:out value="${language.creator}" /></td>
				<td><c:out value="${language.currentVersion}" /></td>
				<td><a href="/languages/${language.id}/delete">delete</a><a href="/languages/${language.id}/edit">edit</a></td>
			</tr>
		</c:forEach>
	</table>
	</div>
	<div>
	<form:form action="/languages" method="post" modelAttribute="lang">
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name" />
			<form:input path="name" />
		</p>
		<p>
			<form:label path="creator">Creator</form:label>
			<form:errors path="creator" />
			<form:textarea path="creator" />
		</p>
		<p>
			<form:label path="currentVersion">Version</form:label>
			<form:errors path="currentVersion" />
			<form:input path="currentVersion" />
		</p>
		<input type="submit" value="submit" />
	</form:form>
	</div>
	
</body>
</html>