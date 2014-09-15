package org.abhi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.abhi.s1.datamodel.Employee;
import org.abhi.s1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/displayEmp", method=RequestMethod.GET)
	public String displayEmployee(@RequestParam(value="employeeId")String kinId,
			@RequestParam(value="employeeName") String employeeName, ModelMap map) {
		
		List<Employee> employees = new ArrayList<>();
		
		if(kinId == null || kinId.equals("")) {
			employees = employeeService.getEmployeeByName(employeeName);
		} else {
			Employee employee = employeeService.getEmployeeById(kinId);
			employees.add(employee);
		}
		map.addAttribute("employees", employees);
		return "/Employee";
	}
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public String searchEmployeePage() {
		System.out.println("EmployeeController.searchEmployeePage()");
		return "/WEB-INF/html/EmpTest.html";
	}
	
	@RequestMapping(value="/searchByHtml", method=RequestMethod.GET)
	public String searchbyHtmlEmployeePage() {
		System.out.println("EmployeeController.searchEmployeePage()");
		return "/NewFile";
	}
	
	@RequestMapping(value="/deleteEmp", method=RequestMethod.GET)
	public String deleteEmp(@RequestParam(value="kinIds") String[] kinIds) {
		System.out.println(kinIds);
		employeeService.deleteEmployees(kinIds);
		return "/SearchEmployees";
	}
}