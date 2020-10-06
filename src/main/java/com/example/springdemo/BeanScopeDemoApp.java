package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author weat0212@gmail.com
 * @project Spring-Demo
 * @package com.example.springdemo
 * @date 2020/10/6 下午 02:41
 */

//****************************************
//THIS IS THE VERSION OF TESTING SINGLETON
//****************************************

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // load the spring conf. file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if they are the same bean
        boolean result = (theCoach == alphaCoach);
        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory Location for theCoach: " + theCoach);
        System.out.println("\nMemory Location for alphaCoach: " + alphaCoach + "\n");

        //close the context
        context.close();
    }
}
