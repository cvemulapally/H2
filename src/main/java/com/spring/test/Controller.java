package com.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/test/{id}")
    public ResponseEntity<Person> getPersons(@PathVariable String id){
        Person person = null;
        Optional<Person> optionalPerson = personRepository.findById(id);
        if(optionalPerson.isPresent()){
            person = optionalPerson.get();
        }
        return new ResponseEntity<>(person, HttpStatus.OK);
    }
}
