package org.abhi.s1.test;

import org.abhi.s1.service.EmployeeService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestListInjection {
	@Test
	public void testMapInjection() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans-config.xml");
		EmployeeService employeeService = ctx.getBean(EmployeeService.class);
		System.out.println(employeeService.getAllEmployees());
	}
}
