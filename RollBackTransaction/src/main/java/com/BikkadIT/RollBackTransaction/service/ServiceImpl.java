package com.BikkadIT.RollBackTransaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.RollBackTransaction.Repository.AddressRepository;
import com.BikkadIT.RollBackTransaction.Repository.EmployeeRepository;
import com.BikkadIT.RollBackTransaction.model.Address;
import com.BikkadIT.RollBackTransaction.model.Employee;

import jakarta.transaction.Transactional;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	@Transactional(rollbackOn =Exception.class)
	public void save() {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee();
		emp.setEmpId(111);
		emp.setEmpName("PRASHANT");
		emp.setEmpAddress("chandrapur");
		emp.setEmpSalary(80000.00);
		employeeRepository.save(emp);
		
		int a=10/0;
		
		Address ad=new Address();
		ad.setPincode(442505);
		ad.setArea("Dhanora");
		ad.setState("Maharashtra");
		addressRepository.save(ad);
	}
	
	
}
