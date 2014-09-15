package com.cg.demo.rendezvouschannel;

import java.io.File;

import org.springframework.integration.Message;

public class HelloServiceImpl implements HelloService {

	@Override
	public void printMessage(Message<File> message) {
		File payload = message.getPayload();
		System.out.println(payload.getName());
	}

}
