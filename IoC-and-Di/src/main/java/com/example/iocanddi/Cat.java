package com.example.iocanddi;

import org.springframework.stereotype.Component;

@Component // создает бин (Bean)
public class Cat {
    private String name;

    public Cat() {
        System.out.println("Кошечку создали");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
