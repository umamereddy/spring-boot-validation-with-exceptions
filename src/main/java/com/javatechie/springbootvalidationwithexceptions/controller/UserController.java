package com.javatechie.springbootvalidationwithexceptions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.springbootvalidationwithexceptions.dto.UserRequest;
import com.javatechie.springbootvalidationwithexceptions.entity.User;
import com.javatechie.springbootvalidationwithexceptions.exceptions.UserNotFoundException;
import com.javatechie.springbootvalidationwithexceptions.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService service;
	
	
	@PostMapping("/signup")
	public ResponseEntity<User> saveUSer(@RequestBody @Valid UserRequest userRequest) {
		return new ResponseEntity<User>(service.saveUser(userRequest), HttpStatus.CREATED);
		
		
	}
	
	@GetMapping("/fetchAll")
	public ResponseEntity<List<User>> getUsers() {
		return ResponseEntity.ok(service.getAllUSers());
		
		
	}
	
	@GetMapping("/{Id}")
	public ResponseEntity<User> getUser(@PathVariable int Id) throws UserNotFoundException {
		return ResponseEntity.ok(service.getUser(Id));
		
	}

}
