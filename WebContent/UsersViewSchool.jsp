<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import= "java.util.*, uis.*, people.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View School (User)</title>
</head>

<% UserUI uui = (UserUI) session.getAttribute("Home");%>


<h4>View Specific School</h4>
<br>
<form method="post" name="saveSchool" action="SaveSchool_Action.jsp">
    <input name="School" value=<%=request.getParameter("School") %> type="hidden"><br>
    <input name="Save School" value="Save School" type="submit"><br>
</form>
<br>
<%String name = request.getParameter("School1");
String[] school = uui.displaySchool(name);
%>
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
    <input name="School" value=<%=un.getName() %> type="hidden"><br>
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
    <input name="School" value=<%=un.getName() %> type="hidden"><br>
    <input name="View School" value="View School" type="submit"><br>
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