<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Account</title>
</head>
<body>
<%
	if(session.getAttribute("eMessage") != null){
		out.print(session.getAttribute("eMessage"));
	}
	else
		out.print("");
	session.setAttribute("eMessage", null);
%>
<form method="post" action ="Create_Account.jsp" name = "Create Account">
	<table style="text-align: left; width: 266px; height: 228px;"
		border="1" cellpadding="2" cellspacing="2">
	<tbody>
	<tr>
		<td style="vertical-align: top;">Please Enter your First Name:<br>
		</td>
		<td style="vertical-align: top;"><input name="FirstName"> </td>
	</tr>
	<tr>
		<td style="vertical-align: top;">Please Enter your Last Name:<br>
		</td>
		<td style="vertical-align: top;"><input name="LastName"> </td>
	</tr>
	<tr>
		<td style="vertical-align: top;">Please Enter a Username:<br>
		</td>
		<td style="vertical-align: top;"><input name="Username"> </td>
	</tr>
	<tr>
		<td style="vertical-align: top;">Please Enter a Password:<br>
		</td>
		<td style="vertical-align: top;"><input name="Password" type = "password"> </td>
	</tr>
	<tr>
		<td style="vertical-align: top;">Please Reenter your password:<br></td>
		<td style = "vertical-align: top;"><input name ="PasswordCheck" type ="password"></td>
	</tr>

	<td style="vertical-align: top;"><input value="Create Account"
		name="Create Account" type="submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
	<td style="vertical-align: top;"><input value="Reset"
	name="Reset" type="reset"></td>
	</tr>
	</tbody>
	</table>
	<br>
</form>
</body>
</html>