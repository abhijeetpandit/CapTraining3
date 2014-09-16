package org.abhi.bi;

import javax.xml.transform.dom.DOMResult;

import org.abhi.beans.Customer;
import org.springframework.integration.Message;

public class ObjectReeiver {
	public void print(Message<Customer> message) {
		System.out.println(message.getPayload());
	}
}
