<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="uis.*"%>
    
<% 
	AdminUI aui = (AdminUI) session.getAttribute("Home");
	aui.addPerson(request.getParameter("FirstName"), request.getParameter("LastName"), request.getParameter("UserName"), request.getParameter("Password"), request.getParameter("Type").charAt(0));
	response.sendRedirect("Add_Person.jsp");
%>