package org.abhi.bi;

import org.abhi.beans.Customer;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.core.PollableChannel;
import org.springframework.integration.support.MessageBuilder;

public class ObjectsProducer {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("beans-config.xml");
		MessageChannel messageChannel = ctx.getBean("inputChannel", MessageChannel.class);
		messageChannel.send(MessageBuilder.withPayload(new Customer("Abhijeet", "Pandit", "Pune")).build());
		messageChannel.send(MessageBuilder.withPayload(new Customer("John", "Constantine", "NA")).build());
		messageChannel.send(MessageBuilder.withPayload(new Customer("Tony", "Stark", "NY")).build());
	
		PollableChannel outputChannel = ctx.getBean("outputChannel", PollableChannel.class);
		
		while(true) {
			System.out.println(outputChannel.receive().getPayload());
		}
	}
	
}
