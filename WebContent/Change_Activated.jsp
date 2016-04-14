<%@page language="java" import="uis.*,java.util.*"%>

<%
	AdminUI au = (AdminUI) session.getAttribute("Home");
	au.changeActivated(request.getParameter("Username"));
	response.sendRedirect("Manage_People.jsp");
%>