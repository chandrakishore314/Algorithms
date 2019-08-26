package org.bridgelabz.application.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bridgelabz.application.dao.DataBaseConnections;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@RequestMapping("/loginController")
	protected ModelAndView login(HttpServletRequest request, HttpServletResponse response,ModelAndView modelAndView) throws ServletException, IOException {
		int count=0;
		DataBaseConnections dbconnection=new DataBaseConnections();
		count=dbconnection.checkValues(request,response);
	    response.setContentType("text/html");  
	    String username = request.getParameter("username");
		
		if(count>0) {
			 modelAndView = new ModelAndView("welcome");
			 modelAndView.addObject("username", username);	
		}
		else {
			 modelAndView = new ModelAndView("LoginPage");
			 modelAndView.addObject("message", "Incorrect Credentials  please enter correct credentials");
		}
		return modelAndView;
	}
	
	
	@RequestMapping("/loginpage")
	public String doLogin() {
		String name="LoginPage";
		return name;
		
	}
	

}
