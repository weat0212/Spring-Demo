package com.example.annotations;

import com.example.springdemo.FortuneService;

/**
 * @author weat0212@gmail.com
 * @project Spring-Demo
 * @package com.example.annotations
 * @date 2020/10/15 下午 12:29
 */
public class SadFortuneService implements FortuneService {
    @Override
    public String getFortunes() {
        return "Today is a sad day";
    }
}
