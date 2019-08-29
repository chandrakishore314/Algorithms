/*
 * package org.bridgelabz.application.controller;
 * 
 * import java.io.IOException;
 * 
 * import javax.servlet.ServletException; import javax.servlet.http.HttpServlet;
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse;
 * 
 * import org.bridgelabz.application.dao.DataBaseConnections; import
 * org.springframework.context.ApplicationContext; import
 * org.springframework.context.support.ClassPathXmlApplicationContext; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.servlet.ModelAndView;
 * 
 * 
 * @Controller public class LoginController extends HttpServlet { private static
 * final long serialVersionUID = 1L;
 * 
 * @RequestMapping("/loginController") protected ModelAndView
 * login(HttpServletRequest request, HttpServletResponse response,ModelAndView
 * modelAndView) throws ServletException, IOException { int count=0;
 * ApplicationContext context=new
 * ClassPathXmlApplicationContext("/WEB-INF/mvc-dispatcher-servlet.xml");
 * DataBaseConnections dao=(DataBaseConnections)context.getBean("edao"); int
 * status=dao.checkEmployee(); System.out.println(status);
 * 
 * String username=request.getParameter("userName"); String
 * password=request.getParameter("password");
 * 
 * 
 * if(count>0) { modelAndView = new ModelAndView("welcome");
 * 
 * modelAndView.addObject("username", username); } else { modelAndView = new
 * ModelAndView("LoginPage"); modelAndView.addObject("message",
 * "Incorrect Credentials  please enter correct credentials"); } return
 * modelAndView; }
 * 
 * @RequestMapping("/loginPageview") public String register() { String
 * name="LoginPage"; System.out.println("entered into log in page"); return
 * name;
 * 
 * }
 * 
 * 
 * }
 */