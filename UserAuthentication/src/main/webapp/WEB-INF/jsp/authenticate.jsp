<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authentication Page</title>
</head>
<h1 style="color:green">Login Page</h1>
<body style="text-align:center">
<h3 style="color:MediumSeaGreen">Enter details to authenticate</h3>

<form:form action="Auth" method="post" commandName="login">
	<label for="username"> Username:</label>
	<input name="username" id="username" type="text" placeholder="Username" required/><br><br>
	<label for="password">Password:</label>
	<input name="password" id="password" type="password" placeholder="Password" required/><br><br>
	<input type="submit" name="Submit"/><br>
</form:form>
</body>
</html>