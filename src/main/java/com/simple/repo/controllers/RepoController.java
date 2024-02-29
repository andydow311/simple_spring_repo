package com.simple.repo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RepoController {
    @GetMapping("sayHello")
    public String sayHello(){
        return "Hiya World";
    }
}
