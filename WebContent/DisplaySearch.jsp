<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="uis.*, homes.*, people.*, java.util.*"%>
<%@include file="VerifyLoginU.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Results</title>
</head>
<body>
<table style = "text-align: center; width: 200; height: 400"
		cellpadding="2" cellspacing="2">
<tr>
<td>
<form method ="post" action ="UserHome.jsp">
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

<%	ArrayList<University> unis = (ArrayList<University>) session.getAttribute("matches");
	int numberOfResultsDisplayed = 20;
	%>
	
<% 	University un;
	for(int i = 0;i<numberOfResultsDisplayed;i++){
	//while(iter.hasNext() && i<numberOfResultsDisplayed){ 
		un = unis.get(i);
		i++;%>
<td style="vertical-align: top;">
<form method="post" name="saveSchool" action="SaveSchool_Action.jsp">
    <input name="School" value="<%out.print(un.getName()); %>" type="hidden"><br>
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
    <input name="School1" value="<%out.print(un.getName()); %>" type="hidden"><br>
    <input name="View School" value="View School" type="submit"><br>
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