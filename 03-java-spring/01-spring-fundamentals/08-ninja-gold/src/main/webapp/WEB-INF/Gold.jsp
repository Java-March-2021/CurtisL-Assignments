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
	<div class="wrapper">
		<div class="share">
			<h3>Your Gold:</h3>
			<h2 class="number">
				<c:out value="${gold}" />
			</h2>
		</div>
		<div class="space">
			<form method="Post" action="/findGold">
				<p>Farm</p>
				<p>(earn 10-20 gold)</p>
				<input type="submit" name="building" value="Farm" class="gold">
			</form>
			<form method="Post" action="/findGold">
				<p>Cave</p>
				<p>(earn 5-10 gold)</p>
				<input type="submit" name="building" value="Cave" class="gold">
			</form>
			<form method="Post" action="/findGold">
				<p>House</p>
				<p>(earn 2-5 gold)</p>
				<input type="submit" name="building" value="House" class="gold">
			</form>
			<form method="Post" action="/findGold">
				<p>Casino</p>
				<p class="casino">(earns/takes 0-50 gold)</p>
				<input type="submit" name="building" value="Casino" class="gold">
			</form>
		</div>
		<div>
			<h3>Activities:</h3>
			<div class="activities">
				<c:forEach items="${activity}" var="result">
					<p class='${result.contains("loss")? "red" : "green"}'>${result}</p>
				</c:forEach>
			</div>
		</div>
	</div>
</body>
</html>