package org.example.jdbc.controller;

import org.example.jdbc.entity.Person;
import org.example.jdbc.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class Controller {
    private final PersonRepository repository;

    public Controller(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    public List<Person> fetchByCity(@RequestParam String city) {
        return repository.findPersonByCityOfLiving(city);
    }

    @GetMapping("/persons/by-age")
    public List<Person> fetchByAge(@RequestParam int age) {
        return repository.findByPersonalData_AgeIsLessThanOrderByPersonalData_Age(age);
    }

    @GetMapping("/persons/by-name-and-surname")
    public Optional<List<Person>> fetchByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return repository.findPersonByNameAndSurname(name, surname);
    }
}
