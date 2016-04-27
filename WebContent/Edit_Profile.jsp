<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "uis.*, people.*"%>
<%@include file="VerifyLogin.jsp"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View/Edit Profile</title>
</head>
<body>
<table style = "text-align: center; width: 200; height: 400"
		cellpadding="2" cellspacing="2">
<tr>
<td>
<form method ="post" action ="UserHome.jsp">
<input value ="Home" type="submit">
</form>
</td>
<td>
<form method = "post" action = "Manage_Saved_Schools.jsp" name = "Manage Saved Schools">
<input value = "Manage Saved Schools" name = "Manage Saved Schools" type = "submit">
</form>
</td>
<td>
<form method = "post" action = "Search.jsp" name = "Search">
<input value = "Search" name = "Search" type = "submit">
</form>
</td>
<td>
<form  method ="post" action = "Logout.jsp">
<input value ="Logout" type ="submit">
</form>
</td>
</tr>

</table>
<%
	UserUI ui = (UserUI) session.getAttribute("Home"); 
	//Person person = (Person) session.getAttribute("CurrentUser");
	Person person = (Person) ui.getUser();
%>
<table style="text-align: left; width: 400px;"
		border="1" cellpadding="2" cellspacing="2">
<tr>
<form method = "post" action = "Edit_Profile_Action.jsp" name = "Edit Person">
<td>First Name</td>
<td><input name = "FirstName" value = "<%=person.getfName() %>"></td>
</tr>
<tr>
<td>Last Name</td>
<td><input name = "LastName" value = "<%=person.getlName() %>"></td>
</tr>
<tr>
<td>User name</td>
<td><input name = "Username" value = "<%=person.getuName() %>" readonly></td>
</tr>
<tr>
<td>Password</td>
<td><input name = "Password" value = "<%=person.getpWord() %>"></td>
</tr>
<tr>
<td>Type</td>
<td><input name = "Type" value = "<%=person.getType() %>" readonly></td>
</tr>
<tr>
<td>Activation</td>
<td><input name = "Activation" value = "<%=person.getActivated() %>" readonly></td>
</tr>
<tr>

<td><input value = "Edit Profile" type = "submit"></td>
</form>
<td><input value = "Reset" type = "reset"></td>
</tr>
</table>
</body>
</html>