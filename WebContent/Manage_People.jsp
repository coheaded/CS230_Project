<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.*, uis.*"%>
<%@include file="VerifyLogin.jsp"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Manage People</title>
</head>
<body>
<table style = "text-align: center; width: 200; height: 400"
 		cellpadding="2" cellspacing="2">
<tr>
<td>
<form method ="post" action ="AdminHome.jsp" name ="Admin Home">
<input value ="Home" type = "submit">
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
<form method ="post" action="View_Universities.jsp" name = "View Universities">
<input value = "View Universities" name ="View Universities" type = "submit">
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
<td style="vertical-align: top; text-align: center;">First Name<br>
</td>
<td style="vertical-align: top; text-align: center;">Last Name<br>
</td>
<td style="vertical-align: top; text-align: center;">Username<br>
</td>
<td style="vertical-align: top; text-align: center;">Password<br>
</td>
<td style="vertical-align: top; text-align: center;">Type<br>
</td>
<td style="vertical-align: top; text-align: center;">Status<br>
</td>
<td style="vertical-align: top;"><br>
</td>
</tr>

<tr>

<%String[][] users = au.viewPeople();
for(int i = 0; i<users.length; i++){%>
<td style="vertical-align: top;">
<form method="post" action="Edit_Person.jsp" name="Edit">
    <input name="Edit" value="Edit" type="submit"><br>
    <input name="Username" value="<%out.print(users[i][2]);%>" type="hidden"><br>
</form>
<br>
</td>
	
<td style="vertical-align: top;"><br><%out.print(users[i][0]);%>
</td>
<td style="vertical-align: top;"><br><%out.print(users[i][1]);%>
</td>
<td style="vertical-align: top;"><br><%out.print(users[i][2]);%>
</td>
<td style="vertical-align: top;"><br><%out.print(users[i][3]);%>
</td>
<td style="vertical-align: top;"><br><%out.print(users[i][4]);%>
</td>
<td style="vertical-align: top;"><br><%out.print(users[i][5]);%>
</td>
<td style="vertical-align: top;">
<form method="post" action="Change_Activated.jsp" name="Change Activated">
    <input name="Change Activated" value="Change Activated" type="submit"><br>
    <input name="Username" value="<%out.print(users[i][2]);%>" type="hidden">
</form>
<br>
</td>
</tr>
<%}%>
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
