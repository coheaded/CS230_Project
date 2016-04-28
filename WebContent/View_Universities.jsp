<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.*, uis.*"%>
<%@include file="VerifyLogin.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View Universities</title>
</head>
<body>
<table style = "text-align: center; width: 200; height: 400"
 		cellpadding="2" cellspacing="2">
<tr>
<td>
<form method ="post" action = "AdminHome.jsp" name = "AdminHome">
<input value = "Home" type ="submit">
</form>
</td>
<td>
<form method ="post" action = "Manage_People.jsp" name = "Manage People">
<input value ="Manage People" name = "Manage People" type = "submit">
</form>
</td>
<td>
<form method="post" action="Add_Person.jsp" name = "Add Person">
<input value="Add Person" name = "Add Person" type = "submit">
</form>
</td>
<td>
<form method ="post" action = "Add_University.jsp" name = "Add University">
<input value = "Add_University" name = "Add University" type = "submit">
</form>
</td>
<td>
<form method = "post" action = "Logout.jsp" name = "logout">
<input value = "Logout" type = "submit">
</form>
<td>
</tr>
</table>
<% AdminUI au = (AdminUI) session.getAttribute("Home");%>
<table style="text-align: left; width: 100%;" border="1" cellpadding="2"
cellspacing="2">
<tbody>
<tr>
<td style="vertical-align: top;"><br>
</td>
<td style="vertical-align: top; text-align: center;">School Name<br>
</td>
<td style="vertical-align: top; text-align: center;">State<br>
</td>
<td style="vertical-align: top;"><br>
</td>
</tr>
<tr>
<%String[][] schools = au.viewSchools();
for(int i = 0; i<schools.length; i++){
if(!schools[i][0].equals("")){%>
<td style="vertical-align: top;">
<form method="post" action="Edit_University.jsp" name="Edit">
    <input name="Edit" value="Edit" type="submit"><br>
    <input name="School" value="<%out.print(schools[i][0]);%>" type="hidden"><br>
</form>
<br>
</td>
	
<td style="vertical-align: top;"><br><%out.print(schools[i][0]);%>
</td>
<td style="vertical-align: top;"><br><%out.print(schools[i][1]);%>
</td>
<td style="vertical-align: top;">
<form method="post" action="View_School.jsp" name="View School">
    <input name="View School" value="View School" type="submit"><br>
    <input name="School" value="<%out.print(schools[i][0]);%>" type="hidden">
</form>
<br>
</td>
</tr>
<%}}%>
</tbody>
</table>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
</body>
</html>