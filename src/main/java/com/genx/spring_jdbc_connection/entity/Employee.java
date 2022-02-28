package com.genx.spring_jdbc_connection.entity;

public class Employee {
	private int ID;
	private String EmpName;
	private String EmpDept;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpDept() {
		return EmpDept;
	}
	public void setEmpDept(String empDept) {
		EmpDept = empDept;
	}
	
	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", EmpName=" + EmpName + ", EmpDept=" + EmpDept + "]";
	}	
}
