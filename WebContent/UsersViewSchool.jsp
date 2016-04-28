<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import= "java.util.*, uis.*, people.*"%>
<%@include file="VerifyLoginU.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View School (User)</title>
</head>
<body>
<table style = "text-align: center; width: 200; height: 400"
		cellpadding="2" cellspacing="2">
<tr>
<td>
<form method="post" action="UserHome.jsp">
<input value ="Home" type ="submit">
</form>
</td>
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

<% UserUI uui = (UserUI) session.getAttribute("Home");%>
<%String name = request.getParameter("School1");
String[] school = uui.displaySchool(name);
%>

<big><big><b>View Specific School</b></big></big>
<form method="post" name="saveSchool" action="SaveSchool_Action.jsp">
    <input name="School" value="<%out.print(request.getParameter("School1")); %>" type="hidden"><br>
    <input name="Save School" value="Save School" type="submit"><br>
</form>
<br>

<table style="text-align: left; width: 100%;" border="1" cellpadding="2"
cellspacing="2">
<tbody>
<tr>
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
<h5>Related Schools</h5>
<br>
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
	
<%
University univer = new University(school[0], 
		school[1], 
		school[2], 
		school[3], 
		Integer.parseInt(school[4]), 
		Double.parseDouble(school[5]),
		Double.parseDouble(school[6]), 
		Double.parseDouble(school[7]), 
		Double.parseDouble(school[8]), 
		Double.parseDouble(school[9]),
		Integer.parseInt(school[10]), 
		Double.parseDouble(school[11]), 
		Double.parseDouble(school[12]), 
		Integer.parseInt(school[13]), 
		Integer.parseInt(school[14]), 
		Integer.parseInt(school[15]));

	ArrayList<University>unis=uui.relatedSchools(univer);
	Iterator<University> iter = unis.iterator();
	int numberOfResultsDisplayed = 5;
	i =0;
	%>
	
<% 	University un;
	while(iter.hasNext() && i<numberOfResultsDisplayed){ 
		un = iter.next();
		i++;%>
<td style="vertical-align: top;">
<form method="post" name="saveSchool" action="SaveSchool_Action.jsp">
    <input name="School" value="<%=un.getName() %>" type="hidden"><br>
    <input name="Save School" value="Save School" type="submit"><br>
</form>
<br>
</td>
	
<td style="vertical-align: top;"><br><%=un.getName()%>
</td>
<td style="vertical-align: top;"><br><%=un.getState()%>
</td>
<td style="vertical-align: top;">
<form method="post" action="UsersViewSchool.jsp" name="UsersViewSchool">
    <input name="View School" value="View School" type="submit"><br>
    <input name="School1" value="<%out.print(un.getName());%>" type="hidden">
</form>
<br>
</td>
</tr>
<%}%>
</tbody>
</table>


<form method="post" action="DisplaySearch.jsp" name="Back">
    <input name="Back" value="Back" type="submit"><br>
</form>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
</body>
</html>