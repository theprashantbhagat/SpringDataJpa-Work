package com.BikkadIT.CrudRepositoryMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

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
		  
//		  long countNoOfRecords = bean.CountNoOfRecords();
//		  System.out.println(countNoOfRecords);
		  
//		  boolean b = bean.ExistRecord(2);
//		  System.out.println(b);
//	
//	
//		  User id = bean.getRecordById(2);
//		  System.out.println(id);
		  
//		  List<User> allUser = bean.getAllUser();
//		  System.out.println(allUser);
	
	
//		  List<Integer> list = Arrays.asList(2,4);
//		  List<User> multiRecordsByIds = bean.getMultiRecordsByIds(list);
//		  System.out.println(multiRecordsByIds);
	
//		  bean.DeleteRecordById(4);
//		  System.out.println("Record Deleted");
		  
//		  User user=new User();
//		  user.setUserId(2);
//		  bean.DeleteRecordByObject(user);
		  
//		  List<Integer> list = Arrays.asList(1,2);
//		  bean.DeleteAllRecordByMPK(list);
//	
		  
		  //bean.DeleteAllRecords();
		  
//		  User hql = bean.getUserByIdHQL(2);
//		  System.out.println(hql);
		  
//		   User hql = bean.getUserByNameHQL("kunal");
//		  System.out.println(hql);
		  
//		  User check = bean.LoginCheck("santosh",33);
//		  System.out.println(check);
		  
//		  User sql = bean.getUserByIdSQL(3);
//		  System.out.println(sql);
		  
//		  User sql = bean.getUserByNameSQL("ganesh");
//		  System.out.println(sql);
		  
	}

}
