<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.*, uis.*"%>
<%@include file="VerifyLogin.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View School</title>
</head>
<body>
<% 
	AdminUI au = (AdminUI) session.getAttribute("Home");
%>
<table style ="text-align: center; width: 200; height: 400" cellpadding = "2" cellspacing="2">
<tr>
<td>
<form method ="post" action="AdminHome.jsp" name = "AdminHome">
<input value="AdminHome" type="submit">
</form>
</td>
<td>
<form method = "post" action ="View_Universities.jsp" name="View_Universities">
<input value ="View Universities" type = "submit">
</form>
</td>
<td>
<form method = "post" action = "Logout.jsp" name = "logout">
<input value = "Logout" type = "submit">
</form>
<td>
</tr>
</table> 
<table style="text-align: left; width: 100%;" border="1" cellpadding="2"
cellspacing="2">
<tbody>
<tr style="text-align: center">
<td>
School Summary
</td>
<td>
<form method ="post" action ="Edit_University.jsp" name = "Edit University">
<input value = "Edit School" type = "submit">
</form> 
</td>
</tr>
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
<td style="vertical-align: top;"><br><%out.print("Location");%>
</td>	
<td style="vertical-align: top;"><br><%out.print(school[2]);%>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><br><%out.print("Control");%>
</td>	
<td style="vertical-align: top;"><br><%out.print(school[3]);%>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><br><%out.print("Number Of Students");%>
</td>	
<td style="vertical-align: top;"><br><%out.print(school[4]);%>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><br><%out.print("Percent Female");%>
</td>	
<td style="vertical-align: top;"><br><%out.print(school[5]);%>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><br><%out.print("SAT Verbal");%>
</td>	
<td style="vertical-align: top;"><br><%out.print(school[6]);%>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><br><%out.print("SAT Math");%>
</td>	
<td style="vertical-align: top;"><br><%out.print(school[7]);%>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><br><%out.print("Expenses");%>
</td>	
<td style="vertical-align: top;"><br><%out.print(school[8]);%>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><br><%out.print("Percent Financial Aid");%>
</td>	
<td style="vertical-align: top;"><br><%out.print(school[9]);%>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><br><%out.print("Number Of Applicants");%>
</td>	
<td style="vertical-align: top;"><br><%out.print(school[10]);%>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><br><%out.print("Percent Admitted");%>
</td>	
<td style="vertical-align: top;"><br><%out.print(school[11]);%>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><br><%out.print("Percent Enrolled");%>
</td>	
<td style="vertical-align: top;"><br><%out.print(school[12]);%>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><br><%out.print("Academic Scale");%>
</td>	
<td style="vertical-align: top;"><br><%out.print(school[13]);%>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><br><%out.print("Social Scale");%>
</td>	
<td style="vertical-align: top;"><br><%out.print(school[14]);%>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><br><%out.print("Quality of Life");%>
</td>	
<td style="vertical-align: top;"><br><%out.print(school[15]);%>
</td>
</tr>
<%int i = 16;
while(school[i]!= null){%>
<tr>
<td style="vertical-align: top;"><br><%out.print("Emphasis");%>
</td>	
<td style="vertical-align: top;"><br><%out.print(school[i]);%>
</td>
</tr>
<%i++;}%>
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