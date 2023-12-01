package com.example.firstspringproject;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    List<Book> books = new ArrayList<>();

    @PostMapping(value = "/book/add")
    public void addNewBook(@RequestBody Book book) {
        books.add(book);
    }

    @GetMapping(value = "/book/show")
    public List<Book> show() {
        return books;
    }

    @GetMapping(value = "/book/{id}")
    public Book getBook(@PathVariable(value = "id") Integer id) {
        return books.get(id);
    }

    @DeleteMapping(value = "/book/{id}")
    public void deleteBook(@PathVariable(value = "id") Integer id) {
        int number = id;
        books.remove(number);
    }

    @PutMapping(value = "/book/{id}")
    public void updateBook(@PathVariable(value = "id") Integer id, @RequestBody Book book) {
        books.set(id, book);
    }
}
