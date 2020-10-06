package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author weat0212@gmail.com
 * @project Spring-Demo
 * @package com.example.springdemo
 * @date 2020/10/6 下午 02:41
 */

//*********************************
//THIS IS THE VERSION OF LIFE CYCLE
//*********************************

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {

        // load the spring conf. file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        //close the context
        context.close();
    }
}
