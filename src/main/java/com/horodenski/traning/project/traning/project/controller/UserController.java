package com.horodenski.traning.project.traning.project.controller;

import com.horodenski.traning.project.traning.project.model.User;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final List<User> users = Arrays.asList(
            new User(1l,"name","surname","username"),
            new User(2l,"name","surname","username"),
            new User(3l,"name","surname","username")
    );

    @GetMapping("/all")
    public List<User> getUsers(){
        return users;
    }


}
