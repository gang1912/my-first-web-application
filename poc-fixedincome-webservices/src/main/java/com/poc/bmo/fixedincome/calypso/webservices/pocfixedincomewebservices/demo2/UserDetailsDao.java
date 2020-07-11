package com.poc.bmo.fixedincome.calypso.webservices.pocfixedincomewebservices.demo2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class UserDetailsDao {
	
	private static List<UserDetails> allUsers = new ArrayList<UserDetails>();
	
	static {
		allUsers.add(new UserDetails("Prasad","gkokkul","ibg"));
		allUsers.add(new UserDetails("Harsh","hmish01","ibg"));
		allUsers.add(new UserDetails("Jaikisan","jvaswan","ibg"));
	}

	public List<UserDetails> GetAllUserDetails(){	
		return 	allUsers;	
	}
	
	public UserDetails GetuserDetails(String userId) {
		for(UserDetails User : allUsers) {
			if(User.getUserId().equals(userId))
				return User;
		}
		return null;
	}
	
	public UserDetails SaveUser(UserDetails user) {
		allUsers.add(user);
		return user;
	}
	
	public UserDetails DeleteUserDetails(String userId) {
		Iterator<UserDetails> user = allUsers;
		for(UserDetails User : allUsers) {
			if(User.getUserId().equals(userId))
				return User;
		}
		return null;
	}
}
