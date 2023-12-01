package com.example.firstspringproject;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class HelloController {
    List<Book> books = new ArrayList<>();

    @GetMapping(value = "/hello")
    public String hello() {
        return "Привет, как дела? Как жизнь?";
    }

    @GetMapping(value = "/add")
    public void add() {
        Random random = new Random();
        int id = random.nextInt(0, 100);
        Book book = new Book(id, "Чистый код");
        books.add(book);
    }

}
