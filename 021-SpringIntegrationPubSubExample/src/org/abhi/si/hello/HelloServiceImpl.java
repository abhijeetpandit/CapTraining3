package org.abhi.si.hello;

public class HelloServiceImpl implements HelloServie {
	
	@Override
	public void sayHello(String message) {
		System.out.println("1 " + message);
	}
}