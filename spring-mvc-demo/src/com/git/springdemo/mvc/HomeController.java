package com.git.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/showForm")
	public String showPage() {
		return "main-menu";
	}
	
	@RequestMapping("/processForm")
	public String proccessPage() {
		return "proccess-main";
	}
	
	@RequestMapping("/processFormV2")
	public String proccessPageV2(HttpServletRequest request, Model model) { 
		
		// read the request parameter from the HTML form
		String name = request.getParameter("studentName");
		
		// convert the data to all caps
		name = name.toUpperCase();
		
		// create message 
		String res = "Hello : " + name;
		
		// add message to the model
		model.addAttribute("message",res);
		
		return "proccess-main-v2";
	}
	
	@RequestMapping("/processFormV3")
	public String proccessPageV3(@RequestParam("studentName") String studentName, Model model) { 
		
		// read the request parameter from the HTML form
		//String name = request.getParameter("studentName");
		
		// convert the data to all caps
		//name = name.toUpperCase();
		
		// create message 
		String res = "Hello : " + studentName;
		
		// add message to the model
		model.addAttribute("message",res);
		
		return "proccess-main-v2";
	}

}
