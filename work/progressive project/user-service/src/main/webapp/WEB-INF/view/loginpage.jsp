<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
</head>
<body style="background-color: lightblue">
	<div style="margin-left: 10%; margin-top: 3%"class"jumbotron">
		<h1 class="display-3">StackQFlow</h1>
	</div>
	<div class="container">
		<h2 class="display-5" style="margin-top: 15%">Enter your details
			for login :</h2>
		<form method="post" style="margin-top: 5%" action="login" />
		<c: if test="${failure}">
			<p style="color:red">*Login Credentials are incorrect</p>
		</c: if>
		<table>
			<tr>
				<td style="font-size: 22px" width="250px" height="100px">Enter
					email</td>
				<td width="300px"><input type="email" class="form-control"
					name="email" placeholder="Enter email" /></td>
			</tr>
			<tr>
				<td style="font-size: 22px" width="250px" height="100px">Enter
					user password</td>
				<td><input type="password" class="form-control" name="password"
					placeholder="Enter password" /></td>
			</tr>
			<tr>
				<td width="250px" height="100px"><input type="submit"
					value="Login" style="margin-left: 150%; width: 100px"
					class="btn btn-info" /></td>
				<td><input type="reset" value="Reset"
					style="margin-left: 80%; width: 100px" class="btn btn-info" /></td>
			</tr>
		</table>
		</form>
	</div>
</body>
</html>