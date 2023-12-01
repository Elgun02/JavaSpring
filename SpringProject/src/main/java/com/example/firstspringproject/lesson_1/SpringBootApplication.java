package com.example.firstspringproject.lesson_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class SpringBootApplication {
    private int count;
    private final List<Integer> countList = new ArrayList<>();

    @GetMapping(value = "/message")
    private String message() {
        String[] messages = {"мы вам не рады", "добро пожаловать"};
        Random random = new Random();
        int randomIndex = random.nextInt(messages.length);

        return messages[randomIndex];
    }

    @GetMapping(value = "/count")
    public void addCount() {
        count++;
    }

    @GetMapping(value = "/info")
    public int getCount() {
        return count;
    }

    @GetMapping(value = "/save-and-reset")
    public void saveAndResetCount() {
        countList.add(count);
        count = 0;
    }

    @GetMapping(value = "/list")
    public List<Integer> getCountList() {
        return countList;
    }
}
