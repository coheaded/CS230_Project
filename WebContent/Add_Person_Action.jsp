<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="uis.*"%>
    
<% 
	LoginUI log = (LoginUI) session.getAttribute("LoginUI");
	AdminUI aui = new AdminUI(log.getLoggedInUser().getuName());
	int check = aui.addPerson(request.getParameter("FirstName"), request.getParameter("LastName"), request.getParameter("UserName"), request.getParameter("Password"), request.getParameter("Type").charAt(0));
	if(check < 0)
		session.setAttribute("Message", "The User was not added, please check that the type is either U or A, and try a different Username.");
	else
		session.setAttribute("Message", "The User has been successfully added.");
	response.sendRedirect("Add_Person.jsp");
%>