package com.example.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author weat0212@gmail.com
 * @project Spring-Demo
 * @package com.example.annotations
 * @date 2020/10/15 下午 01:31
 */
public class PracticeJavaConfigDemoApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PracticeSportConfig.class);

        Coach coach = context.getBean("boxingCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());

        context.close();
    }
}
