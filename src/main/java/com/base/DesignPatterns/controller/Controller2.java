package com.base.DesignPatterns.controller;

import com.base.DesignPatterns.factory.impl.Bicycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller2 {

    @Autowired
    private Bicycle repository;

    @GetMapping("/book/{id}")
    public String findById(@PathVariable long id) {
        System.out.println(repository);
        return repository.findById(id);
    }
}
