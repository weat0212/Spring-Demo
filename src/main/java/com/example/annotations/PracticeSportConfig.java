package com.example.annotations;

import com.example.springdemo.FortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author weat0212@gmail.com
 * @project Spring-Demo
 * @package com.example.annotations
 * @date 2020/10/15 下午 01:33
 */

@Configuration
public class PracticeSportConfig {
    @Bean
    public FortuneService examingFortune(){
        return new ExamingFortune();
    }

    @Bean
    public Coach boxingCoach(){
        BoxingCoach myBoxingCoach = new BoxingCoach(examingFortune());

        return myBoxingCoach;
    }
}
