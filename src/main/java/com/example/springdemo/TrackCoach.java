package com.example.springdemo;

public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkput(){
        return "track corach here";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
