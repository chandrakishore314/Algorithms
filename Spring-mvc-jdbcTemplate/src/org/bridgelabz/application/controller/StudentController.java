package org.bridgelabz.application.controller;
import javax.servlet.http.HttpServletRequest;

import org.bridgelabz.application.model.Login;
import org.bridgelabz.application.model.Student;
import org.bridgelabz.application.service.UserServiceImpl;
import org.bridgelabz.application.utility.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class StudentController {
	
	@Autowired
	UserServiceImpl userServiceImpl;
	int count = 0;
// To save new user registration details in the DataBase
	@RequestMapping("/registrationDAO")
	public ModelAndView doregistration(@ModelAttribute Student student) {
		System.out.println("before dao " + student.getUserName());
		int temp = userServiceImpl.doRegistration(student);
		if (temp > 0) {
			return new ModelAndView("LoginPage");
		} else {
			return new ModelAndView("registration");
		}
	}
	// To view into the registration page
	@RequestMapping("/registrationPageView")
	public String registrationpage() {
		System.out.println("entered into registration view");
		String name = "registration";
		return name;
	}
	// To view into the login page
	@RequestMapping("/loginPageview")
	public String viewLoginPage() {
		String name = "LoginPage";
		System.out.println("entered into log in page");
		return name;
	}
	// To authenticate the user login details
	@RequestMapping(value = "/loginController")
	public ModelAndView userRegistration(@ModelAttribute Login login) {
		String epass = Utility.encryptPasswors(login.getPassword());
		login.setPassword(epass);
		ModelAndView modelAndView = null;
		System.out.println("before dao " + login.getUserName());
		int count=0;
	count=userServiceImpl.doLogin(login);
		if (count>0) {
			
				
					modelAndView = new ModelAndView("welcome");
					String user = "welcome to page" + login.getUserName();
					modelAndView.addObject("message", user);
			}
		 else {
			 modelAndView= new ModelAndView("LoginPage");
			 modelAndView.addObject("message","enter the correct password");
		}
		return modelAndView;
	}
	//To enter into  the enteremail page
	@RequestMapping("/forgotpassword")
	public String forgotpassword() {
		return "enteremail";
	}
	String resetpass = null;
	String resetemail = null;
	String mailsentpassword=null;
	@RequestMapping("/resetController")
	public String resetPassword(HttpServletRequest req) {
		resetemail= req.getParameter("email");
		mailsentpassword = Utility.sendMsg(resetemail);
		return "resetpassword";
	}
	//To update the password
	@RequestMapping("/updatePassword")
	public ModelAndView updatePassword(HttpServletRequest req,ModelAndView modelAndView) {
		resetpass=req.getParameter("emailsentpassword");
		modelAndView=new ModelAndView("LoginPage");
		System.out.println("resetpass"+resetpass    +"mailsentpassword    "+mailsentpassword);
		if(resetpass.equalsIgnoreCase(mailsentpassword)) {
		String encryptpass = Utility.encryptPasswors(req.getParameter("password"));
		userServiceImpl.doUpdate(resetemail,encryptpass);
		System.out.println("password is sucdessful");
		modelAndView.addObject("message", "password changed sucessfully");
		}
		else {
		System.out.println("password is not changed sucdessfully");
		modelAndView.addObject("message", "password not changed sucessfully");
		}
		return modelAndView;
	}
}
