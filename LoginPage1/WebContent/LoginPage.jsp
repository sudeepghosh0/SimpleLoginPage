<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body background="images/176866.jpg">
<center>
<div id="header">
<h1><font color="white">Classic Webservices</font></h1>
<h2><font color="white">Login Page</font></h2>
</div>
<form name="f1" action="Handler"/>
<tr><td><font color="white">Username:</font></td><td><input type="text" name="username"></td></tr><br>
</br><tr><td><font color="white">Password:</font></td><td><input type="password" name="password"></td></tr><br>
		</br><tr><td></td><td><input type="submit" value="Submit"/>
		<input type="hidden" name="service_no" value="1">
</form>
<form name-"f2" action="Register.jsp">
</br><tr><td><font color="white"></font></td><td><input type="submit" value="Register"></td></tr>
</form>
<form action="PasswordResetPage.jsp">
<tr><td><font color="white"></font></td><td><input type="submit" value="Forgot Password"></td></tr>
</form>
</center>
</body>
</html>