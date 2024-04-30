package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run 10 laps around the pitch";
    }
}
