package org.abhi.bi;

import org.abhi.beans.Address;
import org.abhi.beans.Customer;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.core.PollableChannel;
import org.springframework.integration.support.MessageBuilder;

public class ObjectsProducer {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("beans-config.xml");
		MessageChannel messageChannel = ctx.getBean("inputChannel", MessageChannel.class);
		messageChannel.send(MessageBuilder.withPayload(new Customer("Abhijeet", "Pandit", new Address("Vishrantwadi", "DP road", "Pune", "India"))).build());
		messageChannel.send(MessageBuilder.withPayload(new Customer("John", "Constantine",  new Address("Park street", "DP road", "Wakad", "India"))).build());
		messageChannel.send(MessageBuilder.withPayload(new Customer("Tony", "Stark",  new Address("Model colony", "Ambedkar chawk", "Aundh", "India"))).build());
	
		//PollableChannel outputChannel = ctx.getBean("outputChannel", PollableChannel.class);
		
		PollableChannel newOutputChannel = ctx.getBean("newOutputChannel", PollableChannel.class);
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("--->" + newOutputChannel.receive().getPayload());
		}
		
		
		
		
	}
	
}
