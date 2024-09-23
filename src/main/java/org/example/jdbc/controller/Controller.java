package org.example.jdbc.controller;

import org.example.jdbc.repository.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    private final Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }


    @GetMapping("/products/fetch-product")
    public String fetch(@RequestParam String name) {
        return repository.getProductName(name);
    }

}
