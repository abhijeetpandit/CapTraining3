 
package com.cg.demo.rendezvouschannel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Throwable {
        String contextName = "rendezvous-channel.xml";

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(contextName);
        applicationContext.start();

        ProblemReporter problemReporter = applicationContext.getBean(ProblemReporter.class);
        TicketReceiver ticketReceiver = applicationContext.getBean(TicketReceiver.class);
        TicketGenerator ticketGenerator = applicationContext.getBean(TicketGenerator.class);

        // start *before* message publication because it'll block on put
        Thread consumerThread = new Thread(ticketReceiver);
        consumerThread.start();

        List<Ticket> tickets = ticketGenerator.createTickets();
        for (Ticket ticket : tickets) {
            problemReporter.openTicket(ticket);
        }
    }
}
