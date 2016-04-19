<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="uis.*"%>
    
<% 
	LoginUI log = (LoginUI) session.getAttribute("LoginUI");
	AdminUI aui = new AdminUI(log.getLoggedInUser().getuName());
	aui.addPerson(request.getParameter("FirstName"), request.getParameter("LastName"), request.getParameter("UserName"), request.getParameter("Type"), request.getParameter("Activation").charAt(0));
%>