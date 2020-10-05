package com.example.springdemo;

/**
 * @author weat0212@gmail.com
 * @project Spring-Demo
 * @package com.example.springdemo
 * @date 2020/10/5 下午 01:00
 */
public class CricketCoach implements Coach{
    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public CricketCoach(){
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress){
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team){
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService){
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling";
    }

    @Override
    public String getDailyFortune() {
        return "This is Cricket: " + fortuneService.getFortunes();
    }
}

