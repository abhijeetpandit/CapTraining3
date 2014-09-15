
package com.cg.demo.rendezvouschannel;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.integration.channel.PriorityChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class ProblemReporter {
    private PriorityChannel channel;

    @Value("#{ticketChannel}")
    public void setChannel(PriorityChannel channel) {
        this.channel = channel;
    }

    void openTicket(Ticket ticket) {
        channel.send(MessageBuilder.withPayload(ticket).build());
        System.out.println("Ticket Sent - " + ticket.toString());
    }
}
