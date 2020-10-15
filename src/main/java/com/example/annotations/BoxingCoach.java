package com.example.annotations;

import com.example.springdemo.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author weat0212@gmail.com
 * @project Spring-Demo
 * @package com.example.annotations
 * @date 2020/10/15 下午 01:21
 */

@Component
public class BoxingCoach implements Coach{

    private FortuneService fortuneService;

    public BoxingCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice boxing";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortunes();
    }
}
