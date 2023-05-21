package com.javatechie.springbootvalidationwithexceptions.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javatechie.springbootvalidationwithexceptions.entity.User;


public interface UserRespository extends JpaRepository<User, Integer> {

	User findByUserId(int id);

}
