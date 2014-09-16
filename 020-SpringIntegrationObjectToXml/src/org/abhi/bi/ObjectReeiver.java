package org.abhi.bi;

import javax.xml.transform.dom.DOMResult;

import org.springframework.integration.Message;

public class ObjectReeiver {
	public void print(Message message) {
		System.out.println(message.getPayload());
	}
}
