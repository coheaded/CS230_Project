<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "uis.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Logout</title>
</head>
<body>
<%
	LoginUI ui = (LoginUI) session.getAttribute("LoginUI");
	ui.logout();
	session.setAttribute("LoginUI",null);
	if(session.getAttribute("LoginUI")==null){
%>
<big><big><big><b>YOU HAVE SUCCESSFULLY LOGGED OUT</b></big></big></big>
<form method = "post" action = "Login.jsp" name = "Login">
<input value = "Return to Login" type="submit">
</form>
<%} %>
</body>
</html>