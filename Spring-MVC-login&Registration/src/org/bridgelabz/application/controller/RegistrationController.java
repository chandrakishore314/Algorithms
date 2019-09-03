package org.bridgelabz.application.controller;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.bridgelabz.application.dao.DataBaseConnections;
import org.bridgelabz.application.model.Student;
import org.bridgelabz.application.utility.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class RegistrationController {
	int count = 0;
	@Autowired
	DataBaseConnections edao;
// To save new user registration details in the DataBase
	@RequestMapping("/registrationDAO")
	public ModelAndView doregistration(@ModelAttribute Student student) {
		System.out.println("before dao " + student.getUserName());
		int temp = edao.saveEmployee(student);
		if (temp > 0) {
			return new ModelAndView("LoginPage");
		} else {
			return new ModelAndView("registration");
		}
	}
	// To view into the registration page
	@RequestMapping("/registrationPageView")
	public String registration() {
		System.out.println("entered into registration view");
		String name = "registration";
		return name;
	}
	// To view into the login page
	@RequestMapping("/loginPageview")
	public String register() {
		String name = "LoginPage";
		System.out.println("entered into log in page");
		return name;
	}
	// To authenticate the user login details
	@RequestMapping(value = "/loginController")
	public ModelAndView userRegistration(@ModelAttribute Student student) {
		String epass = Utility.encryptPasswors(student.getPassword());
		ModelAndView modelAndView = null;
		System.out.println("before dao " + student.getUserName());
		List<Student> demo = edao.loginUser(student);
		if (demo != null) {
			for (Student student1 : demo) {
				System.out.println(student1.getUserName());
				if (student.getUserName().equals(student1.getUserName()) && epass.equals(student1.getPassword())) {
					modelAndView = new ModelAndView("welcome");
					String user = "welcome to page" + student.getPassword();
					modelAndView.addObject("message", user);
				}
			}
		} else {
			return new ModelAndView("LoginPage");
		}
		return modelAndView;
	}
	@RequestMapping("/forgotpassword")
	public String forgotpassword() {
		return "enteremail";
	}
	String resetpass = null;
	String resetemail = null;
	String mailsentpassword=null;
	@RequestMapping("/resetController")
	public String enterEmail(HttpServletRequest req) {
		resetemail= req.getParameter("email");
		mailsentpassword = Utility.sendMsg(resetemail);
		return "resetpassword";
	}
	@RequestMapping("/updatePassword")
	public ModelAndView updatePassword(HttpServletRequest req,ModelAndView modelAndView) {
		resetpass=req.getParameter("emailsentpassword");
		modelAndView=new ModelAndView("LoginPage");
		System.out.println("resetpass"+resetpass    +"mailsentpassword    "+mailsentpassword);
		if(resetpass.equalsIgnoreCase(mailsentpassword)) {
		String encryptpass = Utility.encryptPasswors(req.getParameter("password"));
		edao.saveEmployee(resetemail,encryptpass);
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
