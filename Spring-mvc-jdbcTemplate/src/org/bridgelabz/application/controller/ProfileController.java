package org.bridgelabz.application.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@RequestMapping("/profile")
    public String logout(HttpSession session,ModelAndView modelAndView ) {
    
		 modelAndView = new ModelAndView("profile");
		 modelAndView.addObject("message", "welcome to profile");
       return "profile";
    }
	@RequestMapping("/logout")
    public String viewProfile(HttpSession session ) {
		String name="LoginPage";
		return name;
    }
	@RequestMapping("/welcome")
    public String viewWelcome(HttpSession session,ModelAndView modelAndView ) {
	//	 modelAndView = new ModelAndView("welcome");
		// modelAndView.addObject("username", username);	
       return "welcome";
    }
   
}
