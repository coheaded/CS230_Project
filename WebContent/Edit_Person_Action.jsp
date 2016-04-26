<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="uis.*, people.*"%>
<%@include file="VerifyLogin.jsp"%>
<%
		AdminUI aui = (AdminUI) session.getAttribute("Home");
		aui.editPerson(request.getParameter("FirstName"), request.getParameter("LastName"), request.getParameter("Username"), request.getParameter("Password"), request.getParameter("Type").charAt(0), request.getParameter("Activation").charAt(0));
		response.sendRedirect("Manage_People.jsp");	
%>