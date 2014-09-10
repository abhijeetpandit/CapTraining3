package org.abhi.s1.test;

import java.util.List;

import org.abhi.s1.datamodel.Employee;
import org.abhi.s1.service.EmployeeService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
	
	@Test
	public void testAnnotations1() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
		EmployeeService employeeService = ctx.getBean(EmployeeService.class);
		Employee employee = employeeService.getEmployeeById("57359_FS");
		System.out.println(employee);
		List<Employee> employees = employeeService.getEmployeeByName("a");
		System.out.println(employees);
	}
}
