package org.abhi.bi;

import org.abhi.beans.Address;
import org.abhi.beans.Customer;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

public class ObjectsProducer {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("beans-config.xml");
		MessageChannel messageChannel = ctx.getBean("inputChannel", MessageChannel.class);
		
		messageChannel.send(MessageBuilder.withPayload(new Customer("Abhijeet", "Pandit", new Address("Vishrantwadi", "DP road", "Pune", "India"))).build());
		messageChannel.send(MessageBuilder.withPayload(new Customer("John", "Constantine",  new Address("Park street", "DP road", "Wakad", "India"))).build());
		messageChannel.send(MessageBuilder.withPayload(new Customer("Tony", "Stark",  new Address("Model colony", "Ambedkar chawk", "Aundh", "India"))).build());
	}
}
