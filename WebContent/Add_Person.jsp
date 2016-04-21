<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="VerifyLogin.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Person</title>
</head>
<body>
<table style = "text-align: center; width: 200; height: 400"
 		cellpadding="2" cellspacing="2">
<tr>
<td>
<form method ="post" action = "Manage_People.jsp" name = "Manage People">
<input value ="Manage People" name = "Manage People" type = "submit">
</form>
</td>
<td>
<form method ="post" action = "Add_University.jsp" name = "Add University">
<input value = "Add_University" name = "Add University" type = "submit">
</form>
</td>
<td>
<form method ="post" action="View_Universities.jsp" name = "View Universities">
<input value = "View Universities" name ="View Universities" type = "submit">
</form>
</td>
</tr>
</table>
<%
	if(session.getAttribute("Message")!=null)
		out.println(session.getAttribute("Message"));
	else
		out.println();
	session.setAttribute("Message", null);
	%>
<form method ="post" action="Add_Person_Action.jsp" name ="Add Person Action">
<Table style="text-align: left; width: 300px; height: 500px;"
		border="1" cellpadding="2" cellspacing="2">
		<tr>
			<td style = "vertical-align: top">First Name<br></td>
			<td><input value = "" name = "FirstName" ></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">Last Name<br></td>
			<td><input value = "" name ="LastName"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">UserName<br></td>
			<td><input value = "" name = "UserName"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">Password<br></td>
			<td><input value = "" name = "Password" type = "password"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">Type<br></td>
			<td><input value = "" name = "Type"></td>
		</tr>
		<tr style = "vertical-align: top">
			<td><input value ="Add" name ="Add" type = "submit"></td>
			<td><input value = "reset" name = "reset" type = "reset"></td>
		</tr>
</Table>
</form>
<form method = "post" action = "Manage_People.jsp" name = "Manage People">
<input name = "Manage People" value ="Manage People" type ="submit">
</form>
</body>
</html>