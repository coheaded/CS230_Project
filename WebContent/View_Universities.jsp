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
<td style="vertical-align: top; text-align: center;">School Name<br>
</td>
<td style="vertical-align: top; text-align: center;">State<br>
</td>
<td style="vertical-align: top;"><br>
</td>
</tr>

<tr>

<%String[][] schools = au.viewSchools();
for(int i = 0; i<schools.length; i++){%>
<td style="vertical-align: top;">
<form method="post" action="Edit.jsp" name="Edit">
    <input name="Edit" value="Edit" type="submit"><br>
    <input name="Username" value="<%out.print(schools[i][0]);%>" type="hidden"><br>
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