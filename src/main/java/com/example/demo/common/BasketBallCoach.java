package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class BasketBallCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Complete 10 sets of suicides";
    }
}
