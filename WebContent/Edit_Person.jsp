<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "uis.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Profile</title>
</head>
<body>
<table style="text-align: left; width: 400px;"
		border="1" cellpadding="2" cellspacing="2">
<tr>
<td>First Name
</td>
<%AdminUI ui = (AdminUI) session.getAttribute("Home"); %>
<td><input name = "First Name" value = <%=ui.getUser().getFName()%>></td>
</tr>
<tr>
<td>Last Name</td>
<td><input name = "Last Name" value = <%=ui.getUser().getlName() %>></td>
</tr>
<tr>
<td>Username</td>
<td><input name = "Username" value = <%=ui.getUser().getUsername() %> readonly></td>
</tr>
<tr>
<td>Password</td>
<td><input name = "Password" value = <%=ui.getUser().getpWord() %>></td>
</tr>
<tr>
<td>Type</td>
<td><input name = "Type" value = <%=ui.getUser().getType() %> readonly></td>
</tr>
</table>
</body>
</html>