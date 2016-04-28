<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "uis.*, people.*"%>
    
<%
	LoginUI ui2 = (LoginUI) session.getAttribute("LoginUI");
	Person person2 = ui2.getLoggedInUser();
	if(ui2 == null || ui2.isLoggedIn() == false){
		session.setAttribute("Log in", "Nice try bud, but you need to log in to access that! >:)");
		response.sendRedirect("Login.jsp");
		return;
	}
%>