<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Home</title>
</head>
<body>
<table style = "text-align: center; width: 200; height: 400"
		border="1" cellpadding="2" cellspacing="2">
<tr>
<td>
<form method ="post" action = "View_People.jsp" name = "View People">
<input value ="View People" name = "View People" type = "submit">
</form>
<form method="post" action="Add_Person.jsp" name = "Add Person">
<input value="Add Person" name = "Add Person" type = "submit">
</form>
<form method ="post" action = "Add_University.jsp" name = "Add University">
<input value = "Add_University" name = "Add University" type = "submit">
</form>
<form method ="post" action="View_Universities.jsp" name = "View Universities">
<input value = "View Universities" name ="View Universities" type = "submit">
</form>
</td>
</tr>
</table>
</body>
</html>