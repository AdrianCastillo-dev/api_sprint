package com.example.api.Person;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/person")
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public void createPersona(@RequestBody Person person){
        personService.createPersona(person);
    }

    @GetMapping("/search")
    public List<Person> findByName(@RequestParam(required = false) String name) {
        if (name == null || name.isEmpty()) {
            return personService.findAll();
        } else {
            return personService.findByName(name);
        }
    }

}
