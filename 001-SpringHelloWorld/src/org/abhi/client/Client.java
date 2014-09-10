package org.abhi.client;

import org.abhi.beans.Message;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		/*Message message = new Message();
		System.out.println(message.getMessage());*/
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("beans-config.xml");
		Message message = ctx.getBean("messageBeanSetterInjection", Message.class);
		Message message2 = ctx.getBean("messageBeanConstructorInjection", Message.class);
		/*System.out.println("----------------------------------------------");
		System.out.println(ctx.getBean(Message.class));
		System.out.println(ctx.getBean(Message.class));
		System.out.println(ctx.getBean(Message.class));
		System.out.println(ctx.getBean(Message.class));
		System.out.println("----------------------------------------------");*/
		System.out.println(message.getMessage());
		System.out.println(message2.getMessage());
		System.out.println(message == message2);
	}
}	
