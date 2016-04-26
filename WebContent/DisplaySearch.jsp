<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="uis.*, homes.*, people.*, java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Results</title>
</head>
<body>


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
	Iterator<University> iter = unis.iterator();
	int numberOfResultsDisplayed = 20;
	int i =0;
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
      <input name="univ" value=<%=un %> type="hidden">
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