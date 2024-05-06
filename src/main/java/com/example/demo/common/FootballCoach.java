package com.example.demo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class FootballCoach implements Coach {

    public FootballCoach(){
        System.out.println("In constructor: "+getClass().getSimpleName());
    }

    //define init method
     @PostConstruct
     public void  doMyStartupStuff(){
         System.out.println("In doMyStartupStaff(): " +getClass().getSimpleName());
     }
    //define destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In doMyCleanupStaff(): " +getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run 10 laps around the pitch";
    }



}
