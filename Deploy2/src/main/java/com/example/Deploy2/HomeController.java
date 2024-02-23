package com.example.Deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HomeController {

    @GetMapping("/sum")
    public String randomSum() {
        Random random = new Random();
        Integer a = random.nextInt(100);
        Integer b = random.nextInt(100);

        return "Sum of " + a + " and " + b + " = " + (a + b);
    }
}
