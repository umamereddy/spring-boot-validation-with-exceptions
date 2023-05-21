package com.javatechie.springbootvalidationwithexceptions.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {

    
	private int userId;
	private String  city;
	
	@NotNull(message = "user name should not be null")
	private String name;
	
	@Email(message = "entred invaild email id ")
	private String email;
	
	@Min(18)
    @Max(60)
	private int age;
	
	@NotNull
	@Pattern(regexp = "^\\d{10}$", message = "Invalid Mobile number entered")
	private String mobile;
	
	private String gender;
	
	@NotBlank(message = "natonality should not blank")
	private String nationality;
}
