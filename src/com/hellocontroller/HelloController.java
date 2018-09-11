package com.hellocontroller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * Servlet implementation class HelloController
 */


/* this comment is to test whether we can create a new branch using github.*/

//@WebServlet("/HelloController")
@Controller
public class HelloController //extends AbstractController {
{
	/*protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		
		ModelAndView md = new ModelAndView("HelloPage");
		md.addObject("welcomeMessage","Hi Welcome to first Spring MVC");
		return md;
	}*/
	public ModelAndView helloWorld(){
		ModelAndView md = new ModelAndView("HelloPage");
		md.addObject("welcomeMessage","Hi Welcome to first Spring MVC");
		return md;
	}
	
	
}
