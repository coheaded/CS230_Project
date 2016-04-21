<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="uis.*, homes.*, people.*, java.util.*"%>
<%  UserUI uui = (UserUI) session.getAttribute("Home");
	uui.saveSchool(request.getParameter("School"));
	response.sendRedirect("DisplaySearch.jsp");
	%>
    
    