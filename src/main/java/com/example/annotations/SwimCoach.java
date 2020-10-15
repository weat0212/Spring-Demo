package com.example.annotations;

import com.example.springdemo.FortuneService;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author weat0212@gmail.com
 * @project Spring-Demo
 * @package com.example.annotations
 * @date 2020/10/15 下午 12:24
 */
public class SwimCoach implements Coach{

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortunes();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
