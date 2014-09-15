
package com.cg.demo.rendezvouschannel;


import org.springframework.integration.MessageChannel;

//@Component
public class TicketReceiver implements Runnable {

    private final static int RECEIVE_TIMEOUT = 1000;

    private MessageChannel channel;

    //@Value("#{ticketChannel}")
    public void setChannel(MessageChannel channel) {
        this.channel = channel;
    }

    void handleTicket(Ticket ticket) {
        System.out.println("Received ticket - " + ticket.toString());
    }

    /*@Override
    public void run() {
        Message<?> ticketMessage;

        while (true) {
            ticketMessage = channel.
            if (ticketMessage != null) {
                handleTicket((Ticket) ticketMessage.getPayload());
            } else {
                try {
                    *//** Handle some other tasks **//*

                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }*/
    
    public void run() {
    	
    }
    
    public void receiveMessage(Ticket message) {
    	System.out.println(message);
    }
}
