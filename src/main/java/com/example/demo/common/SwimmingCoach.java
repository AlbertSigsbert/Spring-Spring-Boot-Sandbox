package com.example.demo.common;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Swim 10 sets of 100 meters each";
    }
}
