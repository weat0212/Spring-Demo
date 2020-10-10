package com.example.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author weat0212@gmail.com
 * @project Spring-Demo
 * @package com.example.annotations
 * @date 2020/10/10 下午 02:19
 */
public class AnnotationBeanScopeDemoApp {
    public static void main(String[] args) {

        // Load Spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");

        // retrieve bean from Spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        // check if they are the same
        boolean result = (coach == alphaCoach);

        // print out the results
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location for coach: " + coach);
        System.out.println("\nMemory location for alphaCoach: " + alphaCoach);

        // close the context
        context.close();
    }
}
