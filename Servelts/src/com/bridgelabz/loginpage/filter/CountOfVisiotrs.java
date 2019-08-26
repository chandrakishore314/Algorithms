package com.bridgelabz.loginpage.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
@WebFilter("/loginForm")
public class CountOfVisiotrs implements Filter {
	static int count=0;  
	public void destroy() {
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		System.out.println(" request entered into post method");
		if(httpRequest.getMethod().equalsIgnoreCase("POST")){
			chain.doFilter(request, response);
	       }
		else {
			PrintWriter out = response.getWriter();
			out.println("you are not authenticable");
		}
	}
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
