package com.cg.demo.rendezvouschannel;

import java.io.File;

import org.springframework.integration.Message;

public interface HelloService {
	public void printMessage(Message<File> message);
} 
