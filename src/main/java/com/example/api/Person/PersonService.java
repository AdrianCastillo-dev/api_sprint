package com.example.api.Person;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepo;

    public void createPersona(Person person){
        personRepo.save(person);
    }

    public List<Person> findByName(String name) {
        return personRepo.findByName(name);
    }

    public List<Person> findAll() {
        return personRepo.findAll();
    }
}
