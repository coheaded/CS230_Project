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
<td><input name = "FirstName" value = <%=person.getfName() %>></td>
</tr>
<tr>
<td>Last Name</td>
<td><input name = "LastName" value = <%=person.getlName() %>></td>
</tr>
<tr>
<td>User name</td>
<td><input name = "Username" value = <%=person.getuName() %> readonly></td>
</tr>
<tr>
<td>Password</td>
<td><input name = "Password" value = <%=person.getpWord() %>></td>
</tr>
<tr>
<td>Type</td>
<td><input name = "Type" value = <%=person.getType() %> readonly></td>
</tr>
<tr>
<td>Activation</td>
<td><input name = "Activation" value = <%=person.getActivated() %> readonly></td>
</tr>
<tr>

<td><input value = "Edit Profile" type = "submit"></td>
</form>
<form method = "post" action = "UserHome.jsp" name = "User Home">
<td><input value = "Cancel" type = "submit"></td>
</form>
</tr>
</table>
</body>
</html>