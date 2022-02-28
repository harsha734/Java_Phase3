<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org"
      xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
        <title>Login</title>
    </head>
    <body style="text-align:center">
        <h1  style="color:DodgerBlue">Login Page</h1>
        
        <form th:action="@{/login}" method="post">
            <div><label> UserName: <input type="text" name="username"/> </label></div><br>
            <div><label> Password: <input type="password" name="password"/> </label></div><br>
            <div><input type="submit" value="Log In"/></div>
        </form>
        <div th:if="${param.error}" style="color:red" >
            <h3>Invalid User name or password.</h3>
        </div><br>
        <div th:if="${param.logout}" style="color:green">
            <h3>You have been logged out.</h3>
        </div><br>
        <a href="/">Return to Home Page</a>
    </body>
</html>