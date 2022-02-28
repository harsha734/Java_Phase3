<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
	xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
<head>
<title>Greetings!</title>
</head>
<body style="text-align:center">
	<h1 style="color:green">Welcome to Spring Security Authentication</h1>

	<h2>
		 <a th:href="@{/dashboard}"> Click here</a>
	</h2>
</body>
</html>