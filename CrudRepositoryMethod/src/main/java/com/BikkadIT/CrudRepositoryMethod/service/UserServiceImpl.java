package com.BikkadIT.CrudRepositoryMethod.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.CrudRepositoryMethod.Repository.UserRepository;
import com.BikkadIT.CrudRepositoryMethod.model.User;

@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {

		User user2 = userRepository.save(user);
		return user2;
	}

	@Override
	public List<User> saveAllUser(List<User> list) {
		Iterable<User> saveAll =userRepository.saveAll(list);
		return (List<User>) saveAll;
	}

	@Override
	public long CountNoOfRecords() {
		long count = userRepository.count();
		return count;
	}

	@Override
	public boolean ExistRecord(int Id) {
		boolean existsById = userRepository.existsById(Id);
		return existsById;
	}

	@Override
	public User getRecordById(int Id) {
		User findById = userRepository.findById(Id).get();
		return findById;
	}

	@Override
	public List<User> getAllUser() {
		List<User> findAll = (List<User>) userRepository.findAll();
		return findAll;
	}

	@Override
	public List<User> getMultiRecordsByIds(List<Integer> list) {
		List<User> findAllById = (List<User>) userRepository.findAllById(list);
		return findAllById;
	}

	@Override
	public void DeleteRecordById(int id) {
		
		userRepository.deleteById(id);
	}

	@Override
	public void DeleteRecordByObject(User user) {
		userRepository.delete(user);
		
	}

	@Override
	public void DeleteAllRecordByMPK(List<Integer> list) {
		// TODO Auto-generated method stub
		userRepository.deleteAllById(list);
		
	}

	@Override
	public void DeleteAllRecords() {
		// TODO Auto-generated method stub
		userRepository.deleteAll();
	}

	@Override
	public User getUserByIdHQL(int userId) {
		// TODO Auto-generated method stub
		User hql = userRepository.getUserByIdHQL(userId);
		
		return hql;
	}

	@Override
	public User getUserByNameHQL(String uname) {
		// TODO Auto-generated method stub
		User hql = userRepository.getUserByNameHQL(uname);
		return hql;
	}

	@Override
	public User LoginCheck(String uname, int uage) {
		// TODO Auto-generated method stub
		User loginCheck = userRepository.LoginCheck(uname, uage);
		return loginCheck;
	}
	
	@Override
	public User getUserByIdSQL(int userId) {
		// TODO Auto-generated method stub
		User hql = userRepository.getUserByIdSQL(userId);
		return hql;
	}
	
	@Override
	public User getUserByNameSQL(String uname) {
		// TODO Auto-generated method stub
		User hql = userRepository.getUserByNameSQL(uname);
		return hql;
	}
}
