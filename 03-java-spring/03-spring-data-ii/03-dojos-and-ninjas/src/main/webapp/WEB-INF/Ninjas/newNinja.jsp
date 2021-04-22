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
	<form:form action="/NewNinja" method="post" modelAttribute="Ninja">
		<p>
			<form:label path="dojo">Dojo: </form:label>
			<form:errors path="dojo" />
			<form:select path="dojo">
				<c:forEach items="${dojos}" var="d">
					<form:option name="person" value="${d.id}">${d.name}</form:option>
				</c:forEach>
			</form:select>
		</p>
		<p>
			<form:label path="firstName">First Name: </form:label>
			<form:errors path="firstName" />
			<form:input path="firstName" />
		</p>
		<p>
			<form:label path="lastName">Last Name: </form:label>
			<form:errors path="lastName" />
			<form:input path="lastName" />
		</p>
		<p>
			<form:label path="age">Age: </form:label>
			<form:errors path="age" />
			<form:input type="number" path="age" />
		</p>
		<input type="submit" value="Create" />
</form:form>
</body>
</html>