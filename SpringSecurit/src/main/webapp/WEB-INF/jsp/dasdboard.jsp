<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="https://www.thymeleaf.org"
      xmlns:sec="https://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
        <title>Welcome!</title>
    </head>
    <body style="text-align:center">
        <h1  th:inline="text" style="color:lightblack">Hello [[${#httpServletRequest.remoteUser}]]!</h1>
        <p style="color:Green">This is harsha's dashboard</p>
        <form th:action="@{/logout}" method="post">
            <input type="submit" value="LogOut"/>
        </form>
    </body>
</html>