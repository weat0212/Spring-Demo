package com.example.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author weat0212@gmail.com
 * @project Spring-Demo
 * @package com.example.annotations
 * @date 2020/10/8 下午 02:26
 */
public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {
        // read spring config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
//        Coach coach = context.getBean("thatSillyCoach", Coach.class); // specify the name
        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);  // use default name

        // call a method on the bean
        System.out.println(coach.getDailyWorkout());

        // call method to get the daily fortune
        System.out.println(coach.getDailyFortune());

        // call our new swim coach methods ... has the props values injected
        System.out.println("email: " + coach.getEmail());
        System.out.println("team: " + coach.getTeam());

        // close the context
        context.close();
    }
}
