package com.example.annotations;

import com.example.springdemo.FortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author weat0212@gmail.com
 * @project Spring-Demo
 * @package com.example.annotations
 * @date 2020/10/15 上午 11:41
 */

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.example.annotations")
public class SportConfig {

    // define bean for our sad fortune service
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    // define bean for our swim coach AND inject dependency
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }
}
