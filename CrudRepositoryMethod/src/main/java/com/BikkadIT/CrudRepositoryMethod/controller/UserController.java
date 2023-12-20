package com.BikkadIT.CrudRepositoryMethod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.CrudRepositoryMethod.model.User;
import com.BikkadIT.CrudRepositoryMethod.service.UserServiceI;

@RestController
public class UserController {

	@Autowired
	private UserServiceI userServiceI;
	
	  
	
	  public User saveUser(User user) {
	  
	  User user2 = userServiceI.saveUser(user);
	  return user2;
	  
	  }
	 
	
	public List<User> saveAllUser(List<User> list) {
		Iterable<User> saveAll =userServiceI.saveAllUser(list);
		return (List<User>) saveAll;
	}
	
	public long CountNoOfRecords() {
		long count = userServiceI.CountNoOfRecords();
		return count;
	}
	 
	public boolean ExistRecord(int Id) {
		boolean existsById = userServiceI.ExistRecord(Id);
		return existsById;
	}
	
	public User getRecordById(int Id) {
		User findById = userServiceI.getRecordById(Id);
		return findById;
	}
	
	public List<User> getAllUser() {
		List<User> findAll = (List<User>) userServiceI.getAllUser();
		return findAll;
	}
	
	public List<User> getMultiRecordsByIds(List<Integer> list) {
		List<User> findAllById = userServiceI.getMultiRecordsByIds(list);
		return findAllById;
	}
	
    public void DeleteRecordById(int id) {
		
    	userServiceI.DeleteRecordById(id);
	}
	
    public void DeleteRecordByObject(User user) {
    	userServiceI.DeleteRecordByObject(user);
		
	}
    public void DeleteAllRecordByMPK(List<Integer> list) {
    	userServiceI.DeleteAllRecordByMPK(list);
		
	}
    public void DeleteAllRecords() {
		userServiceI.DeleteAllRecords();
	}
    
    public User getUserByIdHQL(int userId) {
		User hql = userServiceI.getUserByIdHQL(userId);
		
		return hql;
	}
    
    public User getUserByNameHQL(String uname) {
		User hql = userServiceI.getUserByNameHQL(uname);
		return hql;
	}
    
    public User LoginCheck(String uname, int uage) {
		User loginCheck = userServiceI.LoginCheck(uname, uage);
		return loginCheck;
	}
    
    public User getUserByIdSQL(int userId) {
		User hql = userServiceI.getUserByIdSQL(userId);	
		return hql;
	}
    
    public User getUserByNameSQL(String uname) {
		User hql = userServiceI.getUserByNameSQL(uname);
		return hql;
	}
    
    
}
