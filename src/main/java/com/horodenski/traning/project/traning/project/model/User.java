package com.horodenski.traning.project.traning.project.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class User {

    private Long id;
    private String name;
    private String surname;
    private String username;

}
