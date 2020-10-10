package com.example.annotations;

import com.example.springdemo.FortuneService;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author weat0212@gmail.com
 * @project Spring-Demo
 * @package com.example.annotations
 * @date 2020/10/10 下午 12:58
 */

@Component
public class RandomService implements FortuneService {

    private String[] data = {
            "Beware of the wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    // create a random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortunes() {
        // pick a random string from the array
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];

        return theFortune;
    }
}
