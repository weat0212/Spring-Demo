package com.example.springdemo;

public class BaseballCoach implements Coach{

    private FortuneService fortuneService;

//    constructure
    public BaseballCoach (FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "30 mins batting pratice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortunes();
    }
}
