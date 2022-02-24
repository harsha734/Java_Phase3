<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<style>
table {
float: left;
}

table, th, td {
border: 1px solid red;
}
</style>
<head></head>
<body >
	<h2 style="color:blue">Users Page</h2>
	<table style="text-align:center" >
	<tr><th>ID</th><th>Name</th><th>Email</th><th>Password</th></tr>
		<c:forEach items="${users}" var="user" varStatus="count">
			<tr id="${count.index}">
			<td>${user.id}</td>
			<td>${user.name}</td>
			<td>${user.email}</td>
			<td>${user.password}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html> 