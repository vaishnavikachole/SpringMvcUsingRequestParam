package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(@RequestParam("email_address") String emailId,
			@RequestParam("user_name") String userName,
			@RequestParam("password") String userPassword,
			Model model)
	{
		System.out.println("user email" + emailId);
		System.out.println("user name" + userName);
		System.out.println("user password" + userPassword);
		
		model.addAttribute("email",emailId);
		model.addAttribute("name",userName);
		model.addAttribute("password",userPassword);
		
		return "success";
	}
}
