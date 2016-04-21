<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Person</title>
</head>
<body>
<table style = "text-align: center; width: 200; height: 400"
 		cellpadding="2" cellspacing="2">
<tr>
<td>
<form method ="post" action = "Manage_People.jsp" name = "Manage People">
<input value ="Manage People" name = "Manage People" type = "submit">
</form>
</td>
<td>
<form method ="post" action = "Add_Person.jsp" name = "Add Person">
<input value = "Add Person" name = "Add Person" type = "submit">
</form>
</td>
<td>
<form method ="post" action="View_Universities.jsp" name = "View Universities">
<input value = "View Universities" name ="View Universities" type = "submit">
</form>
</td>
</tr>
</table>
<%
	if(session.getAttribute("Message")!=null)
		out.println(session.getAttribute("Message"));
	else
		out.println();
	session.setAttribute("Message", null);
	%>
<form method ="post" action="Add_University_Action.jsp" name ="Add University Action">
<Table style="text-align: left; width: 300px; height: 500px;"
		border="1" cellpadding="2" cellspacing="2">
		<tr>
			<td style = "vertical-align: top">School Name<br></td>
			<td><input value = "" name = "SchoolName" ></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">State<br></td>
			<td><input value = "" name ="State"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">Location<br></td>
			<td><input value = "" name = "Location"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">Control<br></td>
			<td><input value = "" name = "Control"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">Student Population<br></td>
			<td><input value = "" name = "StudentPop"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">Percent Female<br></td>
			<td><input value = "" name = "PercentFemale"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">SAT Verbal<br></td>
			<td><input value = "" name = "SATVerbal"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">SAT Math<br></td>
			<td><input value = "" name = "SATMath"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">Expenses<br></td>
			<td><input value = "" name = "Expenses"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">Percent Financial Aid<br></td>
			<td><input value = "" name = "PercentFinAid"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">Number Of Applicants<br></td>
			<td><input value = "" name = "NumApplicants"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">Percent Admitted<br></td>
			<td><input value = "" name = "PercentAdmitted"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">Percent Enrolled<br></td>
			<td><input value = "" name = "PErcentEnrolled"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">Academic Scale<br></td>
			<td><input value = "" name = "AcademicScale"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">Social Scale<br></td>
			<td><input value = "" name = "SocialScale"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">Quality Of Life<br></td>
			<td><input value = "" name = "QualityOfLife"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">Emphasis<br></td>
			<td><input value = "" name = "Emphasis1"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">Emphasis<br></td>
			<td><input value = "" name = "Emphasis2"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">Emphasis<br></td>
			<td><input value = "" name = "Emphasis3"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">Emphasis<br></td>
			<td><input value = "" name = "Emphasis4"></td>
		</tr>
		<tr>
			<td style = "vertical-align: top">Emphasis<br></td>
			<td><input value = "" name = "Emphasis5"></td>
		</tr>
		<tr style = "vertical-align: top">
			<td><input value ="Add" name ="Add" type = "submit"></td>
			<td><input value = "reset" name = "reset" type = "reset"></td>
		</tr>
</Table>
</form>
</body>
</html>