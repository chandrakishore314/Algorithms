package org.bridgelabz.application.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bridgelabz.application.dao.DataBaseConnections;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
	@RequestMapping("/registrationController")
	protected ModelAndView doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int count =0;
		DataBaseConnections dbconnection = new DataBaseConnections();
		count = dbconnection.insert(request);
		System.out.println("entered into registration ");
		ModelAndView modelAndView = new ModelAndView("LoginPage");
		if (count==1) {
		    modelAndView.addObject("message", "registered sucessfully");
		} else {
			modelAndView.addObject("message", " unable to registered sucessfully");
		}
		return modelAndView;
	}	
	
	@RequestMapping("/registration")
	public String doRegistration() {
		String name="registration";
		return name;
		
	}
	
}
