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
		<c:out value="${category.name}" />
	</h1>
	<div class="split">
		<div>
			<h2>Products:</h2>
			<ul>
				<c:forEach items="${category.products}" var="p">
					<li><a href="/Product/${p.id}"><c:out value="${p.name}" /></a></li>
				</c:forEach>
			</ul>
		</div>
		<div>
			<form:form action="/Category/${product.id}" method= "post" modelAttribute="product">
				<form:label path="id">Product:</form:label>
				<form:errors path="id" />
				<form:select path="id">
					<c:forEach items="${pats}" var="n">
						<form:option value="${n.id}">${n.name}</form:option>
					</c:forEach>
				</form:select><input type="submit" value="Add" />
			</form:form>
		</div>
	</div>
</body>
</html>