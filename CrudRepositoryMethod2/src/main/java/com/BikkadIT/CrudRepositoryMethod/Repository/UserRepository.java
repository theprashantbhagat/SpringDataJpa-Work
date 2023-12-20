package com.BikkadIT.CrudRepositoryMethod.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.CrudRepositoryMethod.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public User findByuserId(int uid);
	
	public User findByuserName(String userName);
	
	public User findByuserAddress(String useraddress);
	
	public User findByuserAge(int userAge);
	
	public User findByUserNameAndUserAddress(String uname,String uaddress);
	
	public User findByUserNameOrUserAddress(String uname,String uaddress);

	public List<User>  findByUserAgeGreaterThanEqual(int uage);
	
	public List<User> findByUserAgeGreaterThan(int uage);
	
	public List<User> findByUserAgeLessThanEqual(int uage);

	public List<User> findByUserAgeLessThan(int uage);

	public int countByUserName(String uname);
	
	public List<User> findByUserAgeBetween(int age1,int age2);
	
	
	
	
	
	
	
	
}
