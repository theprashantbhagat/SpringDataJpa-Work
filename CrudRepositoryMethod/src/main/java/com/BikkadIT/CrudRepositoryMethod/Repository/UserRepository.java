package com.BikkadIT.CrudRepositoryMethod.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.CrudRepositoryMethod.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	
	/* sql and hql queries */
	
	@Query("from User where userId=:userId")
	public User getUserByIdHQL(int userId);
	
	@Query("from User where userName=:uname")
	public User getUserByNameHQL(String uname);
	
	@Query("from User where userName=:uname and userAge=:uage")
	public User LoginCheck(String uname,int uage);
	
	@Query(value = "select * from USER_DETAILS where USER_ID=:userId",nativeQuery = true )
	public User getUserByIdSQL(int userId);
	
	@Query(value = "select * from USER_DETAILS where USER_NAME=:uname",nativeQuery = true)
    public User getUserByNameSQL(String uname);
	
}
