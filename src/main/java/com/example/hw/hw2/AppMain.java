package com.example.hw.hw2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AppMain {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AppMain.class, args);

        Scoreboard scoreboard = context.getBean(Scoreboard.class);

        System.out.println(scoreboard.newTicket());
        System.out.println(scoreboard.newTicket());
        System.out.println(scoreboard.newTicket());
    }

}
