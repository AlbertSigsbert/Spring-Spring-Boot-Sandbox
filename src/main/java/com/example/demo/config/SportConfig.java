package com.example.demo.config;

import com.example.demo.common.CricketCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("wickets")
    public CricketCoach cricketCoach(){
        return  new CricketCoach();
    }
}
