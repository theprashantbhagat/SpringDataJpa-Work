package com.BikkadIT.CompositePrimaryKey.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.CompositePrimaryKey.model.Employee;
import com.BikkadIT.CompositePrimaryKey.repository.EmployeeRepository;
@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	private EmployeeRepository empRepository;
	
	@Override
	public void saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		empRepository.save(emp);
	}

}
