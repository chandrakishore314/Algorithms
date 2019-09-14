package org.bridgelabz.application.controller;

import org.bridgelabz.application.model.Login;
import org.bridgelabz.application.model.Student;
import org.bridgelabz.application.service.UserServiceImpl;
import org.bridgelabz.application.utility.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ApplicationController {
@Autowired
UserServiceImpl userService;
	@RequestMapping("/registrationpage")
	public String registration() {
		System.out.println("entered into registration view");
		String name = "registrationpage";
		return name;
	}
	@RequestMapping("/loginpage")
	public String login() {
		System.out.println("entered into login view");
		String name = "loginpage";
		return name;
	}
	@PostMapping(value = "/logincontroller")
	public ModelAndView userLogin(@ModelAttribute Login login) {
		System.out.println("entered into authentication controller");
		String epass = Utility.encryptPasswors(login.getPassword());
		ModelAndView modelAndView = null;
		System.out.println("before dao " + login.getUserName());
		int count=0;
	count=userService.doLogin(login);
		if (count>0) {
					modelAndView = new ModelAndView("welcome");
					String user = "welcome to page" + login.getUserName();
					modelAndView.addObject("message", user);
			}
		 else {
			 modelAndView= new ModelAndView("loginpage");
		}
		return modelAndView;
	}
	@RequestMapping("/registrationDAO")
	public ModelAndView doregistration(@ModelAttribute Student student) {
		System.out.println("before dao " + student.getUserName());
		int temp = userService.doregistration(student);
		if (temp > 0) {
			return new ModelAndView("loginpage");
		} else {
			return new ModelAndView("registrationpage");
		}
	}
}
