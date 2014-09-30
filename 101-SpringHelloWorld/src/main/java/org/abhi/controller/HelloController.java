package org.abhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String displayHelloForm() {
		System.out.println("HelloController.displayHelloForm()");
		return "HelloWorld";
	}
}