<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="uis.*"%>
<%@include file="VerifyLogin.jsp"%>
<% 
	AdminUI aui = (AdminUI) session.getAttribute("Home");
	int counter = 0;
	for (int i = 1; i < 6; i++){
		if(!request.getParameter("Emphasis"+i).equals("")){
		counter++;}
	}
	String[] array = new String[counter];
	for (int i =1; i <6; i++){
		if(!request.getParameter("Emphasis"+i).equals("")){
			array[i-1] = request.getParameter("Emphasis"+i);
		}
	}
	aui.addUniversity(request.getParameter("SchoolName"), request.getParameter("State"), request.getParameter("Location"), 
			request.getParameter("Control"), Integer.parseInt(request.getParameter("StudentPop")), Double.parseDouble(request.getParameter("PercentFemale")), Double.parseDouble(request.getParameter("SATVerbal")),
			Double.parseDouble(request.getParameter("SATMath")), Double.parseDouble(request.getParameter("Expenses")), Double.parseDouble(request.getParameter("PercentFinAid")), Integer.parseInt(request.getParameter("NumApplicants")),
			Double.parseDouble(request.getParameter("PercentAdmitted")), Double.parseDouble(request.getParameter("PercentEnrolled")), Integer.parseInt(request.getParameter("AcademicScale")),
			Integer.parseInt(request.getParameter("SocialScale")), Integer.parseInt(request.getParameter("QualityOfLife")), array);
	response.sendRedirect("Add_University.jsp");
%>