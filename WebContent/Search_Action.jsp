<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="uis.*, homes.*, people.*, java.util.*"%>
<%@include file="VerifyLoginU.jsp"%>
<%	UserUI ui = (UserUI) session.getAttribute("Home"); 
	ArrayList<University> unis = ui.search(request.getParameter("name"), request.getParameter("state"),
			request.getParameter("location"), request.getParameter("control"),
			Integer.parseInt(request.getParameter("popL")), Integer.parseInt(request.getParameter("popH")), 
			Double.parseDouble(request.getParameter("femL")), Double.parseDouble(request.getParameter("femH")), 
			Double.parseDouble(request.getParameter("vsatL")), Double.parseDouble(request.getParameter("vsatH")),
			Double.parseDouble(request.getParameter("msatL")), Double.parseDouble(request.getParameter("msatH")),
			Double.parseDouble(request.getParameter("expL")), Double.parseDouble(request.getParameter("expH")),
			Double.parseDouble(request.getParameter("finL")), Double.parseDouble(request.getParameter("finL")),
			Integer.parseInt(request.getParameter("appL")), Integer.parseInt(request.getParameter("appH")),
			Integer.parseInt(request.getParameter("admL")), Integer.parseInt(request.getParameter("admH")),
			Integer.parseInt(request.getParameter("enrL")), Integer.parseInt(request.getParameter("enrL")),
			Integer.parseInt(request.getParameter("acdL")), Integer.parseInt(request.getParameter("acdH")),
			Integer.parseInt(request.getParameter("socL")), Integer.parseInt(request.getParameter("socH")),
			Integer.parseInt(request.getParameter("quaL")), Integer.parseInt(request.getParameter("quaH")));
	session.setAttribute("matches", unis);
	response.sendRedirect("DisplaySearch.jsp");
%>