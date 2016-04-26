<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import ="uis.*"%>
<%
	UserUI uui = (UserUI) session.getAttribute("Home");
	uui.removeSchool(request.getParameter("SchoolName"));
	//session.setAttribute("CurrentUser",uui.getUser());
	response.sendRedirect("Manage_Saved_Schools.jsp");
%>