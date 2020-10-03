package com.example.springdemo;

public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortunes() {
         return "Today is ur lucky day!";
    }
}
