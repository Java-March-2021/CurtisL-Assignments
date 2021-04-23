<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<h1>
		<c:out value="${product.name}" />
	</h1>
	<div class="split">
		<div>
			<h2>Categories:</h2>
			<ul>
				<c:forEach items="${product.categories}" var="c">
					<li><a href="/Categories/${c.id}"><c:out value="${c.name}" /></a></li>
				</c:forEach>
			</ul>
		</div>
		<div>
			<form:form action="/Product/${product.id}" method= "post" modelAttribute="category">
				<form:label path="id">Category:</form:label>
				<form:errors path="id" />
				<form:select path="id">
					<c:forEach items="${cats}" var="n">
						<form:option value="${n.id}">${n.name}</form:option>
					</c:forEach>
				</form:select><input type="submit" value="Add" />
			</form:form>
		</div>
	</div>

</body>
</html>