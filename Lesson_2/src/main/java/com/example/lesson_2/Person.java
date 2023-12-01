package com.example.lesson_2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Person {
    public Person() {
        System.out.println("Person Bean Created");
    }
}
