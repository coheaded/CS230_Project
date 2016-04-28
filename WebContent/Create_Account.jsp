<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="uis.*"%>
<%
	LoginUI con = new LoginUI();
	String fname = request.getParameter("FirstName");
	String lname = request.getParameter("LastName");
	String uname = request.getParameter("Username");
	String pword = request.getParameter("Password");
	String pwordc = request.getParameter("PasswordCheck");
	if(pword.equals(pwordc)){
		int i = con.createNewUser(fname,lname,uname,pword);
		if(i>0){
		session.setAttribute("eMessage", "Your account has been created successfully.  You may now log in");
		response.sendRedirect("Login.jsp");
		}
		else{
			session.setAttribute("eMessage", "Your account has failed");
			response.sendRedirect("Login.jsp");
		}
	}
	else {
		session.setAttribute("eMessage", "The username is either taken, or your passwords do not match");
		response.sendRedirect("createAccount.jsp");
	}
	
%>