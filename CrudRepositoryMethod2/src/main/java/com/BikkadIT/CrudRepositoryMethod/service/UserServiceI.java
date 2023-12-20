package com.BikkadIT.CrudRepositoryMethod.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.BikkadIT.CrudRepositoryMethod.model.User;

public interface UserServiceI {

	public User saveUser(User user);
	
	public List<User> saveAllUser(List<User> list);
	
	
	
	/* JPA repository methods */
	
	public Page<User> userPagination();
	
	public List<User> sortingUser();
	
	public User getUserById1(int uid);
	
	public User getUserByname(String userName);
	
	public User getUserAddress(String useraddress);
	
	public User getUserAge(int userAge);
	
	public User getuserNameAnduserAddress(String uname,String uaddress);
	
	public User getuserNameOruserAddress(String uname,String uaddress);
	
	public List<User> getUserAgeGreaterThanEqual(int uage);
	
	public List<User> getUserAgeGreaterThan(int uage);
	
    public List<User> getUserAgeLessThanEqual(int uage);
	
	public List<User> getUserAgeLessThan(int uage);
	
	public int countRecordsByName(String uname);
	
	public List<User> getUserAgeBetween(int age1,int age2);
	
	
	
	
	
	
	
	
}
