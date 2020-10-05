package com.example.springdemo;

public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "track corach here";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
