package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloProgram {

	@RequestMapping("/welcome")
	public @ResponseBody String getMessage()
	{
		//returns the message
		return "Hello Spring boot using REST Service";
	}
}
