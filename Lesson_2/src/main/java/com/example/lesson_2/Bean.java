package com.example.lesson_2;

import lombok.Setter;

@Setter
public class Bean {
    private String name;
    public Bean() {
        System.out.println("~~~~ XML Bean Created ~~~~");
    }
}
