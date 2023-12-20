package com.BikkadIT.CrudRepositoryMethod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.CrudRepositoryMethod.model.User;
import com.BikkadIT.CrudRepositoryMethod.service.UserServiceI;

@RestController
public class UserController {

	@Autowired
	private UserServiceI userServiceI;
	
	  
	
	  public User saveUser(User user) {
	  
	  User user2 = userServiceI.saveUser(user); return user2;
	  
	  }
	 
	
	public List<User> saveAllUser(List<User> list) {
		Iterable<User> saveAll =userServiceI.saveAllUser(list);
		return (List<User>) saveAll;
	}
	
	
    
    /* JPA REPOSITORY METHODS */
    
    public Page<User> userPagination() {
		
		Page<User> findAll =userServiceI.userPagination();
		return findAll;
	}
    
    public List<User> sortingUser() {
		List<User> findAll = userServiceI.sortingUser();
		return findAll;
	}
    
    public User getUserById1(int uid) {
		User user = userServiceI.getUserById1(uid);
		return user;
	}
    
    public User getUserByname(String userName) {
    	User userByname = userServiceI.getUserByname(userName);
		return userByname;
    }
    
    public User getUserByAddress(String useraddress) {
    	User address = userServiceI.getUserAddress(useraddress);
		return address;
    }
    
    public User getUserByAge(int userAge) {
    	 User age = userServiceI.getUserAge(userAge);
		return age;
    	
    }
    
    public User getuserNameAnduserAddress(String uname,String uaddress) {
    	User address = userServiceI.getuserNameAnduserAddress(uname, uaddress);
		return address;
    	
    }
    public User getuserNameOruserAddress(String uname,String uaddress) {
    	User address = userServiceI.getuserNameOruserAddress(uname, uaddress);
		return address;
    	
    }
    
    public List<User> getUserAgeGreaterThanEqual(int uage){
    	List<User> list = userServiceI.getUserAgeGreaterThanEqual(uage);
		return list;
    	
    }
    public List<User> getUserAgeGreaterThan(int uage){
    	List<User> list = userServiceI.getUserAgeGreaterThan(uage);
		return list;
    }
    public List<User> getUserAgeLessThanEqual(int uage){
    	List<User> list = userServiceI.getUserAgeLessThanEqual(uage);
		return list;
    }
    public List<User> getUserAgeLessThan(int uage){
    	List<User> list = userServiceI.getUserAgeLessThan(uage);
		return list;
    }
    
    public int countRecordsByName(String uname) {
    	int countRecordsByName = userServiceI.countRecordsByName(uname);
		return countRecordsByName;
    }
    
    public List<User> getUserAgeBetween(int age1, int age2) {
		List<User> ageBetween = userServiceI.getUserAgeBetween(age1, age2);
		return ageBetween;
	}
    
}
