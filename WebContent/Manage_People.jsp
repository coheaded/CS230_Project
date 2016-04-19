<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.*, uis.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Manage People</title>
</head>
<body>
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
