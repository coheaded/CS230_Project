<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="uis.*"%>
<%@include file="VerifyLogin.jsp"%>    
<% 
	AdminUI aui = (AdminUI) session.getAttribute("Home");
	if(request.getParameter("FirstName")=="" || request.getParameter("LastName")=="" || request.getParameter("UserName") ==""||request.getParameter("Password")==""||request.getParameter("Type")==""){
		session.setAttribute("AddError", "One or more fields are blank, all fields must be filled out");
	}
	else{
	aui.addPerson(request.getParameter("FirstName"), request.getParameter("LastName"), request.getParameter("UserName"), request.getParameter("Password"), request.getParameter("Type").charAt(0));
	}
	response.sendRedirect("Add_Person.jsp");
%>