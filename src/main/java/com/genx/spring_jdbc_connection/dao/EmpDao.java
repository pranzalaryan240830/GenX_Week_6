package com.genx.spring_jdbc_connection.dao;

import com.genx.spring_jdbc_connection.entity.Employee;

public interface EmpDao {
	public int insert(Employee emp);
	public int delete(int id);
	public void Update(int id, String Dept);
	public Employee show(int id);
}
