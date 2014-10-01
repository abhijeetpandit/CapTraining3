package org.abhi.controller;

import org.abhi.beans.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
	
	@RequestMapping(value="/createEmp", method=RequestMethod.GET)
	public String createEmployee() {
		return "CreateEmployee";
	}
	
	
	
	/*@RequestMapping(value="/saveEmployee", method=RequestMethod.GET)
	public String saveEmployee(@RequestParam(value="employeeId") Integer employeeId, 
			@RequestParam(value="firstName") String firstName,
			@RequestParam(value="lastName") String lastName,
			@RequestParam(value="department") String department,
			@RequestParam(value="address") String address, ModelMap map) {
		System.out.println("Emp=");
		return "SaveEmployeesss";
	}*/
	
	@RequestMapping(value="/saveEmployee", method=RequestMethod.GET)
	public String saveEmployee(@ModelAttribute Employee employee, ModelMap map) {
		
		map.addAttribute("message", "Save successful");
		return "CreateEmployee";
	}
	
	@RequestMapping(value="/staticHello", method=RequestMethod.GET)
	public String sayStaticHello() {
		return "redirect:/html/Hello2.html";
	}
}
