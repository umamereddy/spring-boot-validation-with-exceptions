package com.javatechie.springbootvalidationwithexceptions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.springbootvalidationwithexceptions.dto.UserRequest;
import com.javatechie.springbootvalidationwithexceptions.entity.User;
import com.javatechie.springbootvalidationwithexceptions.exceptions.UserNotFoundException;
import com.javatechie.springbootvalidationwithexceptions.respository.UserRespository;

@Service
public class UserService {

	@Autowired
	private UserRespository respository;

	public User saveUser(UserRequest userRequest) {
		User user = User.build(0, userRequest.getName(),
				userRequest.getEmail(), userRequest.getAge(), userRequest.getMobile(), userRequest.getGender(), userRequest.getNationality());
	 
		return respository.save(user);
		
	}
	
	public List<User> getAllUSers() {
		return respository.findAll();
		
		
	}
	
	public User getUser(int id ) throws UserNotFoundException {
		
		User user = respository.findByUserId(id);
		if(user != null)
			return user;
		else 
			throw new UserNotFoundException("User not found with id :" + id);
		
	}

}
