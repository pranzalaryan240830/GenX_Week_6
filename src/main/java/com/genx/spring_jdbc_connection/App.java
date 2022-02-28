package com.genx.spring_jdbc_connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.genx.spring_jdbc_connection.dao.EmpDao;
import com.genx.spring_jdbc_connection.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("................ Connected to My SQL");
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/genx/spring_jdbc_connection/config.xml");
    	EmpDao dao = context.getBean("empDao", EmpDao.class);
    	
    	// Insertion
    	System.out.println("\nInsertion of Data..........\n");
    	Employee e1 = new Employee();
    	e1.setID(1);
    	e1.setEmpName("Ajay Singh");
    	e1.setEmpDept("Revenue");
    	dao.insert(e1);
    	System.out.println("Employee Data Inserted Successfully !\n");
    	Employee e2 = new Employee();
    	e2.setID(2);
    	e2.setEmpName("Akshay Kumar");
    	e2.setEmpDept("IT");
    	dao.insert(e2);
    	System.out.println("Employee Data Inserted Successfully !\n");
    	
    	// Display 
    	System.out.println("Displaying Data of Emp ID = 1 ..........\n");
    	dao.show(1);
    	
    	// Update
    	System.out.println("\nUpdating Dept of Emp ID = 1 to 'HR'  ..........\n");
    	dao.Update(1, "HR");
    	System.out.println("Again Displaying Data of Emp ID = 1 ..........\n");
    	dao.show(1);
    	
    	// Delete
    	System.out.println("Deleting Emp ID = 2 ..........\n");
    	dao.delete(2);
    	System.out.println("............... Deleted Successfully!!\n");
    	dao.show(2);
    	
    }
}
