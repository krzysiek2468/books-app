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

    @GetMapping
    public String featureBranch(){
        return "Feature branch";
    }

    @GetMapping
    public String featureBranch2(){
        return "Feature branch 2";
    }

    @GetMapping
    public String newBranch2(){
        return "New branch 2";
    }


    @GetMapping
    public String mian2(){
        return "main";
    }
}
