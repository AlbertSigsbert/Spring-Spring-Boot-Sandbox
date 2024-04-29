package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunnyRestController {

    @Value("${team.name}")
    private String teamName;

    @Value("${team.coach}")
    private String coachName;


    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String getWorkout(){
        return "Do 50 pushups";
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo(){ return "Team Name: "+teamName+", CoachName: "+coachName; }
}
