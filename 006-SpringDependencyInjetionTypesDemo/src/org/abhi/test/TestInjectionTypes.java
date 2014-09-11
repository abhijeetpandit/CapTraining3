package org.abhi.test;

import org.abhi.beans.DemoBean;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;


public class TestInjectionTypes {
	
	@Test
	public void testByNameInjecion() {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("beans.xml");
		
		System.out.println("--------------------------------------------");
		System.out.println("BY NAME:");
		DemoBean demoBean = ctx.getBean("demoBeanAutowiredByName", DemoBean.class);
		System.out.println(demoBean);
		System.out.println("--------------------------------------------");
	}
	
	@Test
	public void testByTypeInjecion() {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("beans.xml");
		
		System.out.println("--------------------------------------------");
		System.out.println("BY TYPE:");
		DemoBean demoBean = ctx.getBean("demoBeanAutowiredByType", DemoBean.class);
		System.out.println(demoBean);
		System.out.println("--------------------------------------------");
	}
	
	@Test
	public void testByConstructorInjecion() {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("beans.xml");
		
		System.out.println("--------------------------------------------");
		System.out.println("BY CONSTRUCTOR:");
		DemoBean demoBean = ctx.getBean("demoBeanAutowiredByConstructor", DemoBean.class);
		System.out.println(demoBean);
		System.out.println("--------------------------------------------");
	}
	
}
