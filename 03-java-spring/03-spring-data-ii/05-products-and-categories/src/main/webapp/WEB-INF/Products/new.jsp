<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="newProduct" method="post" modelAttribute="product">
<p>
			<form:label path="name">Name: </form:label>
			<form:errors path="name" />
			<form:input path="name" />
		</p>
		<p>
			<form:label path="description">Description: </form:label>
			<form:errors path="description"/>
			<form:input path="description"/>
		</p>
		<p>
			<form:label path="price">Price: </form:label>
			<form:errors path="price" />
			<form:input type="number" min="1" step="any" path="price" />
		</p>
					
		<input type="submit" value="Create" />
</form:form>
</body>
</html>