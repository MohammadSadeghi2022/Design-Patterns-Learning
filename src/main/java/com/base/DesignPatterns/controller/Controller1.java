package com.base.DesignPatterns.controller;

import com.base.DesignPatterns.factory.impl.Bicycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller1 {

    @Autowired
    private Bicycle repository;

    @GetMapping("/count")
    public String findCount() {
        System.out.println(repository);
        return repository.specification();

    }


}
