package com.BikkadIT.RollBackTransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.RollBackTransaction.model.Employee;
import com.BikkadIT.RollBackTransaction.service.ServiceI;

@SpringBootApplication
public class RollBackTransactionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(RollBackTransactionApplication.class, args);
		
		ServiceI bean = run.getBean(ServiceI.class);
		bean.save();
		
	}

}
