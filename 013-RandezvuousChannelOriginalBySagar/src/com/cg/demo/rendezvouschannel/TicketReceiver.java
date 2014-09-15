
package com.cg.demo.rendezvouschannel;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.integration.Message;
import org.springframework.integration.channel.RendezvousChannel;
import org.springframework.stereotype.Component;

@Component
public class TicketReceiver implements Runnable {

    private final static int RECEIVE_TIMEOUT = 1000;

    private RendezvousChannel channel;

    @Value("#{ticketChannel}")
    public void setChannel(RendezvousChannel channel) {
        this.channel = channel;
    }

    void handleTicket(Ticket ticket) {
        System.out.println("Received ticket - " + ticket.toString());
    }

    @Override
    public void run() {
        Message<?> ticketMessage;

        while (true) {
            ticketMessage = channel.receive(RECEIVE_TIMEOUT);
            if (ticketMessage != null) {
                handleTicket((Ticket) ticketMessage.getPayload());
            } else {
                try {
                    /** Handle some other tasks **/

                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
