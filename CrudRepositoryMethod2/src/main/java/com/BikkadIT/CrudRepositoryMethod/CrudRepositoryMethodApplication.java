package com.BikkadIT.CrudRepositoryMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;

import com.BikkadIT.CrudRepositoryMethod.controller.UserController;
import com.BikkadIT.CrudRepositoryMethod.model.User;

@SpringBootApplication
public class CrudRepositoryMethodApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CrudRepositoryMethodApplication.class, args);
		
		  UserController bean = context.getBean(UserController.class);
		  
			/*
			 * User u=new User(); u.setUserName("Prashant"); u.setUserAddress("Chandrapur");
			 * u.setUserAge(25);
			 * 
			 * bean.saveUser(u);
			 */
//		  User u=new User();
//		  u.setUserName("kunal"); 
//		  u.setUserAddress("pune");
//		  u.setUserAge(25);
//		  
//		  User u1=new User();
//		  u1.setUserName("manish"); 
//		  u1.setUserAddress("mumbai");
//		  u1.setUserAge(24);
//		  
//		  User u2=new User();
//		  u2.setUserName("Tushar"); 
//		  u2.setUserAddress("Chandrapur");
//		  u2.setUserAge(26);
//		 
//		  List<User> list=new ArrayList<>();
//		  list.add(u);
//		  list.add(u1);
//		  list.add(u2);
//		  
//		  List<User> saveAllUser = bean.saveAllUser(list);
//		  System.out.println(saveAllUser);

		  
		  /* JPA REPOSITORY METHODS */
//		  
//		  Page<User> userPagination = bean.userPagination();
//		//  System.out.println(userPagination);
//		  for(User u:userPagination) {
//			  System.out.println(u);
//		  }
		  
//		  List<User> sortingUser = bean.sortingUser();
//		  System.out.println(sortingUser);
//		  for(User u:sortingUser) {
//			  System.out.println(u);
//		  }
		  
			/* Our own repository methods */
		  
//		  User userById1 = bean.getUserById1(1);
//		  System.out.println(userById1);
		  
//		  User userByname = bean.getUserByname("pb");
//		  System.out.println(userByname);
		  
//		  User userByAddress = bean.getUserByAddress("motya");
//		  System.out.println(userByAddress);
		  
			/* ================================== */
		  
//		  User age = bean.getUserByAge(25);
//		  System.out.println(age);
		  
		  
//		  User user = bean.getuserNameAnduserAddress("pb", "pra");
//		  System.out.println(user);
		  
//		  User user = bean.getuserNameOruserAddress("pb", "pr");
//		  System.out.println(user);
		  
//		  List<User> ageGreaterThanEqual = bean.getUserAgeGreaterThanEqual(22);
//		  System.out.println(ageGreaterThanEqual);
		  
//		  List<User> ageGreaterThan = bean.getUserAgeGreaterThan(22);
//		  System.out.println(ageGreaterThan);
		  
//		  List<User> lessThanEqual = bean.getUserAgeLessThanEqual(22);
//		  System.out.println(lessThanEqual);
//		  
//		  List<User> lessThan = bean.getUserAgeLessThan(22);
//		  System.out.println(lessThan);
		  
//		  int countRecordsByName = bean.countRecordsByName("pb");
//		  System.out.println(countRecordsByName);
//		  
		  List<User> list = bean.getUserAgeBetween(22, 26);
		  System.out.println(list);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
