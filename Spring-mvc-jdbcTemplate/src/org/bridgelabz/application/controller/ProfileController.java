package org.bridgelabz.application.controller;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//To view the Profile of the Student
	@RequestMapping("/profile")
    public String viewProfile(HttpSession session,ModelAndView modelAndView ) {
		 modelAndView = new ModelAndView("profile");
		 modelAndView.addObject("message", "welcome to profile");
       return "profile";
    }
	//To logout the Profile of the Student
	@RequestMapping("/logout")
    public String doLogOut(HttpSession session ) {
		String name="LoginPage";
		return name;
    }
	//To view the welcome Page
	@RequestMapping("/welcome")
    public String viewWelcome(HttpSession session,ModelAndView modelAndView ) {
       return "welcome";
    }
}
