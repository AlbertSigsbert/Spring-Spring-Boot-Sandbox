package com.example.demo.rest;

import com.example.demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    //private field for the dependency
    private Coach myCoach;

    //Constructor Injection
    @Autowired
    public TestController(@Qualifier("wickets") Coach theCoach) {
        System.out.println("In Constructor: "+getClass().getSimpleName());
        myCoach = theCoach;
    }

    //Setter Injection
    //    @Autowired
    //    public void setCoach(Coach theCoach){
    //        myCoach = theCoach;
    //    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
