package com.BikkadIT.CompositePrimaryKey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.CompositePrimaryKey.Service.ServiceI;
import com.BikkadIT.CompositePrimaryKey.model.Employee;

@SpringBootApplication
public class CompositePrimaryKeyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(CompositePrimaryKeyApplication.class, args);
		ServiceI bean = run.getBean(ServiceI.class);
		
		Employee emp=new Employee();
		emp.setEmpId(111);
		emp.setDeptId(222);
		emp.setEmpName("prashant");
		emp.setEmpAddress("cpur");
		emp.setEmpAge(26);
		
		bean.saveEmployee(emp);
		
	}

}
