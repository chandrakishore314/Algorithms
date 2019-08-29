package org.bridgelabz.application.controller;

import java.util.List;

import org.bridgelabz.application.dao.DataBaseConnections;
import org.bridgelabz.application.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
	int count =0;
	@Autowired
	DataBaseConnections edao;
	
	@RequestMapping("/registrationController")
	public ModelAndView doregistration(@ModelAttribute Student student)
	{System.out.println("before dao "+student.getUserName());
	
		int temp=edao.saveEmployee(student);
		if (temp>0)
		{
		  return new ModelAndView("LoginPage");	
		}
		else 
		{
			return new ModelAndView("registration");
		}
	}
	@RequestMapping("/registrationPageView")
	public String registration() {
		System.out.println("entered into registration view");
		String name="registration";
		return name;
		
	}
	
	@RequestMapping("/loginPageview")
	public String register() {
		String name="LoginPage";
		System.out.println("entered into log in page");
		return name;
		
	}
	
	@RequestMapping(value = "/loginController")
	public ModelAndView userRegistration(@ModelAttribute("login") Student student) 
	{
		 ModelAndView modelAndView = null;
		System.out.println("before dao "+student.getUserName());
		 List<Student> demo=edao.loginUser(student);

		if (demo!=null)
		{
			for(Student student1:demo) {
				if(student.getUserName().equals(student1.getUserName())&&student.getPassword().equals(student1.getPassword())) {
					modelAndView=new ModelAndView("welcome");
					String user="welcome to page"+student.getPassword();
					modelAndView.addObject("message", user);
				}
			}
		
		} else {
			return new ModelAndView("LoginPage");
		}
		
		return modelAndView;

	}
	
	
	
}
