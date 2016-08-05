<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter your details</title>
</head>
<body>
<center>
<div id="header">
<h1><form>You are not registered yet.</form></h1>
<h1><form>But the good news is you can register yourself here.</form></h1>
<h1><form>PLEASE ENTER YOUR DETAILS</form></h1>
</div>
<form name="f1" action="Handler"/>
<tr><td>Username:</td><td><input type="text" name="username"></td></tr></br>
<tr><td>Password:</td><td><input type="text" name="password"></td></tr></br>
<td><input type="submit" value="submit"/>
<input type="hidden" name="service_no" value="2">
</center>
</body>
</html>