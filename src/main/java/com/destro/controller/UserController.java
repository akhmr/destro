package com.destro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.destro.request.UserSignUpRequest;
import com.destro.services.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
   public String signUp(@RequestBody UserSignUpRequest userSignUpRequest) {
		
	   
	   return null;
		
	}
	
	

}
