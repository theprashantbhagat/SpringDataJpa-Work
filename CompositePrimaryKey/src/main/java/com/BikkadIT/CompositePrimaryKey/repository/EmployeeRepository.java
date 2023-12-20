package com.BikkadIT.CompositePrimaryKey.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.CompositePrimaryKey.model.Employee;
import com.BikkadIT.CompositePrimaryKey.model.EmployeePKid;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, EmployeePKid> {

}
