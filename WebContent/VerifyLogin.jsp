<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "uis.*"%>
    
<%
	LoginUI ui2 = (LoginUI) session.getAttribute("LoginUI");
	if(ui2 == null || ui2.isLoggedIn() == false){
		session.setAttribute("Log in", "Nice try bud, but you need to log in to access that! >:)");
		response.sendRedirect("Login.jsp");
		return;
	}
%>