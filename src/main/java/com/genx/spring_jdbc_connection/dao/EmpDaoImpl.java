package com.genx.spring_jdbc_connection.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.genx.spring_jdbc_connection.entity.Employee;

public class EmpDaoImpl implements EmpDao {

	private JdbcTemplate jdbcTemp;
	
	public int insert(Employee emp) {
		String query = "INSERT INTO employees(Emp_ID,Emp_Name,Emp_Dept) VALUES(?,?,?)";
		return jdbcTemp.update(query,emp.getID(),emp.getEmpName(),emp.getEmpDept());
	}

	// Delete
	public int delete(int id) {
		String query = "DELETE FROM employees WHERE Emp_ID=?";
		return jdbcTemp.update(query,id);
	}

	// Update
	public void Update(int id, String dept) {
		 String query = "UPDATE employees SET Emp_Dept = ? WHERE Emp_ID = ?";
	     jdbcTemp.update(query, dept, id);
	     System.out.println("Updated Record with ID = " +id);
	     return;
	}
	
	// Show
	public Employee show(int id) {
		String query = "SELECT * FROM employees WHERE Emp_ID=?";
		Employee emp = jdbcTemp.queryForObject(query, new EmployeeMapper(), new Object[]{id});
		return emp;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemp;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemp = jdbcTemplate;
	}

}
