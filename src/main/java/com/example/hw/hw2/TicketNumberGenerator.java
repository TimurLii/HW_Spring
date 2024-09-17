package com.example.hw.hw2;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TicketNumberGenerator {
    public TicketNumberGenerator() {
        System.out.println("Created TicketNumberGenerator class");
    }

    public String  createNewNumber(){
        return "Ticket" + UUID.randomUUID().toString();
    }
}
