package com.BikkadIT.CrudRepositoryMethod.service;

import java.util.List;

import com.BikkadIT.CrudRepositoryMethod.model.User;

public interface UserServiceI {

	public User saveUser(User user);
	
	public List<User> saveAllUser(List<User> list);
	
	public long CountNoOfRecords();
	
	public boolean ExistRecord(int Id);
	
	public User getRecordById(int Id);
	
	public List<User> getAllUser();
	
	public List<User> getMultiRecordsByIds(List<Integer> list);
	
	public void DeleteRecordById(int id);
	
	public void DeleteRecordByObject(User user);
	
	public void DeleteAllRecordByMPK(List<Integer> list);
	
	public void DeleteAllRecords();
	
	public User getUserByIdHQL(int userId);

	public User getUserByNameHQL(String uname);
	
	public User LoginCheck(String uname,int uage);

	public User getUserByIdSQL(int userId);
	
	public User getUserByNameSQL(String uname);
	
	
	
}
