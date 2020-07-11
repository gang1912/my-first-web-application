package com.poc.bmo.fixedincome.calypso.webservices.pocfixedincomewebservices.demo2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerUserDetails {
	
	@Autowired
	public UserDetailsDao UserDaoObject = new UserDetailsDao();
	
	@GetMapping("/user-details")
	public List<UserDetails> GetAllUsrDetails() {
		return UserDaoObject.GetAllUserDetails();
	}
	
	@GetMapping("/user-details/{userId}")
	public UserDetails GetUsrDetails(@PathVariable String userId) {
		return UserDaoObject.GetuserDetails(userId);
	}
	
	@PostMapping("/user-details")
	public UserDetails PutUsrDetails(@RequestBody  UserDetails user) {
		UserDaoObject.SaveUser(user);
		return user;
	}
	
	@DeleteMapping("/user-details/{userid}")
	public UserDetails PutUsrDetails(@PathVariable userid) {
		UserDaoObject.SaveUser(user);
		return user;
	}

}
