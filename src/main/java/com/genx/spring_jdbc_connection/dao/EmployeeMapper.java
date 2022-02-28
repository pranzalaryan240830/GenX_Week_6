package com.genx.spring_jdbc_connection.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.genx.spring_jdbc_connection.entity.Employee;

public class EmployeeMapper implements RowMapper<Employee>{
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
	      Employee emp = new Employee();
	      emp.setID(rs.getInt("Emp_ID"));
	      emp.setEmpName(rs.getString("Emp_Name"));
	      emp.setEmpDept(rs.getString("Emp_Dept"));
	      return emp;
	   }
}
