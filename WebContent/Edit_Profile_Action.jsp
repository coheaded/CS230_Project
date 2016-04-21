<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="uis.*"%>
<%
	UserUI uui = (UserUI) session.getAttribute("Home");
	uui.editProfile(request.getParameter("FirstName"),
			request.getParameter("LastName"), 
			request.getParameter("Username"), 
			request.getParameter("Password"), 
			request.getParameter("Type").charAt(0),
			request.getParameter("Activation").charAt(0));
	//session.setAttribute("CurrentUser",uui.getUser());
	response.sendRedirect("UserHome.jsp");
%>