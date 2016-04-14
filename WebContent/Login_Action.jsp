<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="uis.*, homes.*"%>
<%
	LoginUI con = new LoginUI();
	String name = request.getParameter("Username");
	String pass = request.getParameter("Password");
	int in = con.login2(name,pass);
	if(in == 1) {
		UserUI uh= new UserUI(name);
		session.setAttribute("Home",uh);
		response.sendRedirect("UserHome.jsp");
	}
	else if(in == 2) {
		AdminUI ah = new AdminUI(name);
		session.setAttribute("Home", ah);
		response.sendRedirect("AdminHome.jsp");
	}
	else {
		if(in == -1) {
			session.setAttribute("Error", "Invalid Username entered. Please try again.");
		}
		else if(in == -2) {
			session.setAttribute("Error", "Invalid Password entered. Please try again.");
		}
		else if(in == -3) {
			session.setAttribute("Error", "Account has been Deactivated.  Please contact site Adminstrator.");
		}
		else {
			session.setAttribute("Error", "There has been an error with the Database. Please try again later.");
		}
		response.sendRedirect("Login.jsp");
	}
%>