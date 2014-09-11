package org.abhi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String sayHello(ModelMap map) {
		System.out.println("Say hello invoked");
		map.addAttribute("message", "Message from controller");
		return "/Hello";
	}
}
