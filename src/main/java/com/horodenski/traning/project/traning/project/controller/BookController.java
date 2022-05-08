package com.horodenski.traning.project.traning.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping
    public String getBook(){
        return "Book";
    }

    @GetMapping
    public String getSecondBook(){
        return "Second_Book";
    }


}
