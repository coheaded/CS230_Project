<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "uis.*, people.*"%>
<%@include file="VerifyLogin.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Manage Your Saved Schools</title>
</head>
<body>
<%
	UserUI ui = (UserUI) session.getAttribute("Home");
%>
<table style = "text-align: center; width: 200; height: 400"
		cellpadding="2" cellspacing="2">
<tr>
<td>
<form method ="post" action ="UserHome.jsp">
<input value = "Home" type ="submit">
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
<form method = "post" action ="Logout.jsp">
<input value ="Logout" type ="submit">
</form>
</td>
</tr>
</table>
<table style="text-align: left; width: 100%;" border="1" cellpadding="2"
cellspacing="2">
<tbody>
<tr>
<td>
</td>
<td style="vertical-align: top; text-align: center;">School Name<br>
</td>
<td style="vertical-align: top;"><br>
</td>
</tr>
<tr>
<%String[] savedSchools = ui.viewSavedSchools();
for(int i = 0;i<savedSchools.length;i++){
	if(savedSchools[2*i+1]==null){
		break;
	}
%>
<td style = "vertical-align: top;">
<form method="post" action="Remove_Saved_School_Action.jsp" name="Remove_Saved_School">
    <input name="Remove" value="Remove" type="submit"><br>
    <input name="SchoolName" value="<%out.print(savedSchools[2*i+1]);%>" type="hidden"><br>
</form>
<br>
</td>
<td style="vertical-align: top;"><br><%out.print(savedSchools[2*i+1]);%>
</td>
<td style="vertical-align: top;">
<form method="post" action="SavedViewSchool.jsp" name="View School">
    <input name="View School" value="View School" type="submit"><br>
    <input name="School" value="<%out.print(savedSchools[2*i+1]);%>" type="hidden">
</form>
<br>
</td>
</tr>
<%}%>
</body>
</html>