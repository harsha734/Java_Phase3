<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring test App</title>
</head>
<body style="text-align:center">
<form:form action="/test_form" method="post" commandName="testUser">
  <label for="user">User:</label><br>
  <input type="text" id="user" name="user" placeholder="name"><br>
  <label for="comments">Comments:</label><br>
  <input type="text" id="comments" name="comments" placeholder="comments"><br><br>
  <input type="submit" value="Submit"><br><br>
   <label for="rating">Rating:</label><br>
  
  <input type="range" name="rating" id="rating" min="0" max="10" value="5" class="slider">
</form:form> 
</body>
</html>