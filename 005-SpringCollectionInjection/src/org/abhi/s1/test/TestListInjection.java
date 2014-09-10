package org.abhi.s1.test;

import org.abhi.s1.datamodel.Employee;
import org.abhi.s1.service.EmployeeService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestListInjection {
	@Test
	public void testMapInjection() {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("beans-config.xml");
		ctx.refresh();
		
		EmployeeService employeeService = ctx.getBean(EmployeeService.class);
		for(Employee employee : employeeService.getAllEmployees()) {
			System.out.println(employee);
		}
	}
}
