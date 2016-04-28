<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="VerifyLoginU.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Home</title>
</head>
<body>
<table style = "text-align: center; width: 200; height: 400"
		cellpadding="2" cellspacing="2">
<tr>
<td>
<form method = "post" action = "Manage_Saved_Schools.jsp" name = "Manage Saved Schools">
<input value = "Manage Saved Schools" name = "Manage Saved Schools" type = "submit">
</form>
</td>
<td>
<form method = "post" action = "Edit_Profile.jsp" name = "Edit Profile">
<input value = "Edit Profile" name = "Edit Profile" type = "submit">
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
</body>
</html>