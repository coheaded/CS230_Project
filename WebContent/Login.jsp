<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {
	background-color: rgb(180,20,0);
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Form</title>
</head>
<body>
<br> Please Enter Your Login Credentials: <br>
<br>
<%
	if(session.getAttribute("Error")!=null)
		out.print(session.getAttribute("Error"));
	else if(session.getAttribute("Log In") != null)
		out.print(session.getAttribute("Log In"));
	else
		out.print("");
	session.setAttribute("Error", null);
	session.setAttribute("Log In", null);
%>

<form method="post" action ="Login_Action.jsp" name = "Login">
	<table style="text-align: left; width: 266px; height: 228px;"
		border="1" cellpadding="2" cellspacing="2">
	<tbody>
	<tr>
		<td style="vertical-align: top;">Username<br>
		</td>
		<td style="vertical-align: top;"><input name="Username"> </td>
	</tr>
	<tr>
		<td style="vertical-align: top;">Password<br>
		</td>
		<td style="vertical-align: top;"><input name="Password" type = "password"> </td>
	</tr>

	<td style="vertical-align: top;"><input value="Log in"
		name="Log in" type="submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	<td style="vertical-align: top;"><input value="Reset"
	name="Reset" type="reset"></td>
	</tr>
	</tbody>
	</table>
	<br>
</form>

</body>
</html>