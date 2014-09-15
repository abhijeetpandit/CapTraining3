package com.cg.demo.rendezvouschannel;

import java.util.Comparator;

import org.springframework.integration.Message;

public class TicketComparator implements Comparator<Message<Ticket>>{

	@Override
	public int compare(Message<Ticket> o1, Message<Ticket> o2) {
		System.out.println(o1.getPayload().getPriority().ordinal());
		System.out.println(o2.getPayload().getPriority().ordinal());
		return new Integer(o2.getPayload().getPriority().ordinal()).compareTo(o1.getPayload().getPriority().ordinal());
	}
}
