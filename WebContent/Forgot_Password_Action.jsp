<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "uis.*, people.*"%>
<%
	LoginUI con = new LoginUI();
	Person person = con.getUser(request.getParameter("username"));
	int i = -1;
	if(person == null){
		person = con.getAdmin(request.getParameter("username"));
	}
	if(request.getParameter("Password").equals(request.getParameter("PasswordCheck"))){
		i = con.editUserPassword(person,request.getParameter("Password"));
	}
	if(i>0)
	{
		session.setAttribute("eMessage", "You may now login using your new password");
		response.sendRedirect("Login.jsp");
	}
	else{
		session.setAttribute("eMessage", "An error has occured please try again later");
		response.sendRedirect("Login.jsp");
	}
	
%>