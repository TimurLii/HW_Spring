package com.example.hw.hw2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class Scoreboard {
    private final TicketNumberGenerator ticketNumberGenerator ;

    public Scoreboard(TicketNumberGenerator ticketNumberGenerator) {
        this.ticketNumberGenerator = ticketNumberGenerator;
    }
    public Ticket newTicket(){
        return new Ticket(ticketNumberGenerator.createNewNumber(), LocalDateTime.now());
    }
}
