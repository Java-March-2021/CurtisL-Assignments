<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey Index</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<form method="post" action="/result">
		<div>
			<label for="full name">Name:</label> <input type="text" name="name"
				required>
		</div>
		<div>
			<label for="Dojo location">Dojo Location:</label> <select
				name="Location" required="required">
				<option value="Arlington">Arlington</option>
				<option value="Bellevue">Bellevue</option>
				<option value="Boise">Boise</option>
				<option value="Chicago">Chicago</option>
				<option value="Dallas">Dallas</option>
				<option value="Los Angeles">Los Angeles</option>
				<option value="Oakland">Oakland</option>
				<option value="Orange County">Orange County</option>
				<option value="Silicon Valley">Silicon Valley</option>
				<option value="Tulsa">Tulsa</option>
			</select>
		</div>
		<div>
			<label for="Coding lang">Favorite Language:</label> <select
				name="Language" required>
				<option value="Python">Python</option>
				<option value="JavaScript">JavaScript</option>
				<option value="C sharp">C sharp</option>
				<option value="Java">Java</option>
				<option value="C++">C++</option>
				<option value=".Net">.Net</option>
				<option value="Swift">Swift</option>
				<option value="Ruby">Ruby</option>
				<option value="Html">Html</option>
				<option value="CSS">CSS</option>
			</select>
		</div>
		<div class="lowsection">
			<p>Comment (optional):</p>
			</div>
			<div>
			<textarea name="Comment"></textarea>
			</div>
		 <input type="submit" name="submit" class="butten">
	</form>

</body>
</html>