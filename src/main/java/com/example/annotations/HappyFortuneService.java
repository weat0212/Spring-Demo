package com.example.annotations;

import com.example.springdemo.FortuneService;
import org.springframework.stereotype.Component;

/**
 * @author weat0212@gmail.com
 * @project Spring-Demo
 * @package com.example.annotations
 * @date 2020/10/9 下午 04:34
 */

@Component
public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortunes() {
        return "This is the fortune from annotation package";
    }
}
