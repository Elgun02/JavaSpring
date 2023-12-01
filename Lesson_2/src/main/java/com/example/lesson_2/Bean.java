package com.example.lesson_2;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Bean {
    private String name;
    public Bean() {
        System.out.println("~~~~ XML Bean Created ~~~~");
    }
}
