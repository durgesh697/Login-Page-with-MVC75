<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>User Account Login</h1>
		<form:form action="verifyUser.dt" method="POST" commandName="user">
			<table>
				<tr>
					<td>Username</td>
					<td><form:input path="username" /></td>
					<td><form:errors path="username" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input path="password" /></td>
					<td><form:errors path="password" /></td>
				</tr>
			</table>
			<br>
			<input type="submit" value="Account Login">

		</form:form>

	</center>
</body>
</html>