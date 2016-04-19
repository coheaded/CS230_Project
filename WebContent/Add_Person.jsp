<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Person</title>
</head>
<body>
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
			<td style = "vertical-align: top">PassWord<br></td>
			<td><input name = "Password"></td>
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