<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Forgot Password</title>
</head>
<body>
<form method="post" action ="Forgot_Password_Action.jsp" name = "Forgot Password">
	<table style="text-align: left; width: 266px; height: 228px;"
		border="1" cellpadding="2" cellspacing="2">
	<tbody>
	<tr>
		<td style="vertical-align: top;">Please enter a new Password<br>
		<input name ="username" value = "<%out.print(request.getParameter("username4FP"));%>" type ="hidden">
		</td>
		<td style="vertical-align: top;"><input name="Password" type = "password"> </td>
	</tr>
	<tr>
		<td style="vertical-align: top;">Please Reenter a new Password<br>
		</td>
		<td style="vertical-align: top;"><input name="PasswordCheck" type = "password"> </td>
	</tr>

	<td style="vertical-align: top;"><input value="submit password reset"
		name="Password Reset" type="submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	<td style="vertical-align: top;"><input value="Reset"
	name="Reset" type="reset"></td>
	</tr>
	</tbody>
	</table>
</body>
</html>