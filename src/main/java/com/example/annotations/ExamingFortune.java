package com.example.annotations;

import com.example.springdemo.FortuneService;

/**
 * @author weat0212@gmail.com
 * @project Spring-Demo
 * @package com.example.annotations
 * @date 2020/10/15 下午 01:22
 */
public class ExamingFortune implements FortuneService {

    @Override
    public String getFortunes() {
        return "This is a test";
    }
}
