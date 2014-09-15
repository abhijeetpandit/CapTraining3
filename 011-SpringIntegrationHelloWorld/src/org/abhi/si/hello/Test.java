package org.abhi.si.hello;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;

public class Test {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("beans-config.xml");
		ctx.refresh();
		MessageChannel messageChannel = ctx.getBean("helloChannel", MessageChannel.class);
		Message<String> message = MessageBuilder.withPayload(" string integraion").build();
		messageChannel.send(message);
	}
}
