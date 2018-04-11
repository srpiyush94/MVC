package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringController {
	
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getHomePage()
	{
		return "index";
		
	}
	

	@RequestMapping(value="Welcome",method=RequestMethod.GET)
	public String getWelcomePage(Model model)
	{
		model.addAttribute("message", "Welcome to spring MVC");
		return "greeting";
		
	}
	
	
		 
	
	

}
