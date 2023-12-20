package com.BikkadIT.CompositePrimaryKey.model;

public class EmployeePKid {

	private int empId;
	
	private int deptId;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "EmployeePKid [empId=" + empId + ", deptId=" + deptId + "]";
	}
	
}
