package com.java.classes;
import javax.servlet.http.*;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Default.*;

import javax.servlet.*;
import java.io.*;
import java.sql.SQLException;
public class Handler extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		String path="Default/SpringModule.xml";
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(path);
	    response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String test=request.getParameter("service_no");
	HttpSession session=request.getSession();
	System.out.println(test);
	switch(test)
	{
	case "1":          //Services for the Login Page
	{
		Validator validate=(Validator) context.getBean("validator"); 
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		session.setAttribute("username", username);
	    session.setAttribute("service_no",test);
	try {
			if(validate.validate(username,password))
			{
				RequestDispatcher rs=request.getRequestDispatcher("WelcomePage.jsp");
				rs.forward(request,response);
				//out.println("Welcome"+" "+username+" "+"you have logged in successfully");
			}
			else
			{
				RequestDispatcher rs=request.getRequestDispatcher("Register.jsp");
				rs.forward(request,response);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
break;
	}
	case "2":
	{
		IRegister r=(IRegister) context.getBean("iregister");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		try
		{
			//System.out.println(r.register(username,password));
			if(r.register(username,password))
			{
				RequestDispatcher rs=request.getRequestDispatcher("SuccessfullyRegistered.jsp");
				rs.forward(request, response);
			}
			else
			{
				RequestDispatcher rs=request.getRequestDispatcher("RegistrationFailed.jsp");
				rs.forward(request, response);
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		break;
	}
	case "3":
	{
	IResetPassword rp=(IResetPassword)context.getBean("iresetpassword");
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	if(rp.iResetPassword(username, password))
	{
		RequestDispatcher rs=request.getRequestDispatcher("LoginPage.jsp");
		rs.forward(request,response);
	}
	else
	{
		RequestDispatcher rs=request.getRequestDispatcher("Register.jsp");
		rs.forward(request, response);
	}
	break;
	}
	}
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		doGet(request,response);
		}
}
