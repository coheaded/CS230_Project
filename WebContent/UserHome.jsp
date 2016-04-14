<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Home</title>
</head>
<body>
<table style = "text-align: center; width: 200; height: 400"
		border="1" cellpadding="2" cellspacing="2">
<tr>
<td>
<form method = "post" action = "View_Saved_Schools.jsp" name = "View Saved Schools">
<input value = "View Saved Schools" name = "View Saved Schools" type = "submit">
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
<!-- Complete UserHome with either Hyperlinks or buttons to: -->
<!-- View_Saved_Schools.jsp -->
<!-- Edit_Profile.jsp -->
<!-- Search.jsp -->

</table>
</body>
</html>