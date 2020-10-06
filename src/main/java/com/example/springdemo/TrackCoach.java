package com.example.springdemo;

public class TrackCoach implements Coach{
    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "track corach here";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

    // add an init method
    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }
    // add a destroy method
    public void doMyStartupStuff2(){
        System.out.println("TrackCoach: inside method doMyStartupStuff2");
    }
}
