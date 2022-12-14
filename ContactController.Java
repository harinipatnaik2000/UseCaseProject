package com.hackerrank.stereotypes.controller;

import com.hackerrank.stereotypes.model.Person;
import com.hackerrank.stereotypes.service.ContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller("/")
public class ContactController {
    @Autowired
	ContactService contactService;
	
	@GetMapping("/contact/retrieve/{id}")
    public ResponseEntity<Person> retrieve(@PathVariable Integer id){
        Person person = contactService.retrieve(id);
        return new ResponseEntity(person, HttpStatus.OK);
    }
	
    @PostMapping("/contact/save")
    public ResponseEntity<Person> save(@RequestBody Person person){
        Person saved = contactService.save(person);
        return new ResponseEntity(saved, HttpStatus.CREATED);
    }
	
    @PutMapping("/contact/update/{id}")
    public ResponseEntity<Person> update(@RequestBody Person person, @PathVariable ("id") int id){
	    Person updated= contactService.save(person, id);
	    return new ResponseEntity(updated, HttpStatus.CREATED);
	    
	    
}
