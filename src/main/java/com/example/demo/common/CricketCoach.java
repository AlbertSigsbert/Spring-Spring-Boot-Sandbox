package com.example.demo.common;

public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In constructor: "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Play 30 crickets laps";
    }
}
