package com.bridgelabz.loginpage.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebFilter("/loginForm")
public class SingleSession implements Filter {
    public SingleSession() {
    }
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse=(HttpServletResponse)response;
		HttpSession session=httpRequest.getSession(false);  
		System.out.println(" request entered into session  method");
		if(session==null) {
			chain.doFilter(request, response);
			System.out.println(" request entered into session  method pass ");
		}else {
			httpResponse.sendRedirect("LoginPage.html");
			System.out.println(" request entered into session  method fail ");
		}	
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
