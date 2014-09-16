package org.abhi.bi;

import org.abhi.beans.Customer;
import org.springframework.integration.Message;

public class ReceivedObjectsPrinter {
	public void printData(Message<Customer> message) {
		System.out.println(message.getPayload());
	}
}
