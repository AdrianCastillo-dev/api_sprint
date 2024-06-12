package com.example.api.Person;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  PersonRepository extends JpaRepository <Person, Long> {
    List<Person> findByName(String name);
}
