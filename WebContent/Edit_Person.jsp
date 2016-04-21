<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "uis.*, people.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Profile</title>
</head>
<body>
<%
	AdminUI ui = (AdminUI) session.getAttribute("Home"); 
	Person person = ui.getUser(request.getParameter("Username"));
	String username = person.getuName();
	out.print(username);
%>
<table style="text-align: left; width: 400px;"
		border="1" cellpadding="2" cellspacing="2">
<tr>
<td>First Name</td>
<td><input name = "FirstName" value = "<%out.print(person.getfName());%>"></td>
</tr>
<tr>
<td>Last Name</td>
<td><input name = "LastName" value = "<%out.print(person.getlName());%>"></td>
</tr>
<tr>
<td>User name</td>
<td><input name = "Username" value = "<%out.print(request.getParameter("Username")); %>" ></td>
</tr>
<tr>
<td>Password</td>
<td><input name = "Password" value = "<%out.print(person.getpWord());%>"></td>
</tr>
<tr>
<td>Type</td>
<td><input name = "Type" value = "<%out.print(person.getType()); %>" ></td>
</tr>
<tr>
<td>Activation</td>
<td><input name = "Activation" value = "<%out.print(person.getActivated()); %>"></td>
</tr>
<tr>
<form method = "post" action = "Edit_Person_Action.jsp" name = "Edit Person">
<td><input value = "Submit Edit" type ="submit"></td>
</form>
<form method ="post" action = "Manage_People.jsp" name ="Manage People">
<td><input  value = "Reset" type="submit"></td>
</form>
</tr>
</table>
</body>
</html>