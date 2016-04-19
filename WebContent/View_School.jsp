<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.*, uis.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View School</title>
</head>
<body>
<% AdminUI au = (AdminUI) session.getAttribute("Home");%>
<table style="text-align: left; width: 100%;" border="1" cellpadding="2"
cellspacing="2">
<tbody>
<tr>

<%String[] school = au.displaySchool(request.getParameter("School"));%>
<td style="vertical-align: top;"><br><%out.print("School");%>
</td>	
<td style="vertical-align: top;"><br><%out.print(school[0]);%>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><br><%out.print("State");%>
</td>	
<td style="vertical-align: top;"><br><%out.print(school[1]);%>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><br><%out.print("State");%>
</td>	
<td style="vertical-align: top;"><br><%out.print(school[1]);%>
</td>
</tr>
<td style="vertical-align: top;">
<form method="post" action="Change_Activated.jsp" name="Change Activated">
    <input name="Change Activated" value="Change Activated" type="submit"><br>
    <input name="Username" value="<%out.print(users[i][2]);%>" type="hidden">
</form>
<br>
</td>
</tr>
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