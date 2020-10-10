package com.example.annotations;

import com.example.springdemo.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author weat0212@gmail.com
 * @project Spring-Demo
 * @package com.example.annotations
 * @date 2020/10/8 下午 02:23
 */

@Component // default name will be the lower case "tennisCoach" if not specify
@Scope("singleton") // define the object being singleton or prototype
//@Component("thatSillyCoach")
public class TennisCoach implements Coach{

    // ***********************
    // *** Field Injection ***
    // ***********************
    @Autowired
    @Qualifier("randomService")   // indicate one of the same implementing bean & ### First letter is lowercase of the class name ###
    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach(){
        System.out.println(">> TennisCoach: inside default constructor");
    }

    // define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
    }

    // define my destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
    }

    // *****************************
    // *** Constructor Injection ***
    // *****************************
//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    // ************************
    // *** Setter Injection ***
    // ************************
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService){
//        System.out.println(">> TennisCoach: inside setFortuneService() method");
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice ur backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortunes();
    }
}
