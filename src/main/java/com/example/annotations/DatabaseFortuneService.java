package com.example.annotations;

import com.example.springdemo.FortuneService;
import org.springframework.stereotype.Component;

/**
 * @author weat0212@gmail.com
 * @project Spring-Demo
 * @package com.example.annotations
 * @date 2020/10/10 下午 01:00
 */

@Component
public class DatabaseFortuneService implements FortuneService {

    @Override
    public String getFortunes() {
        return null;
    }
}
