package com.app.client;
import com.app.dao.impl.*;
import com.sy.App.Employee;
import com.app.dao.*;
public class App {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAOImpl();
		/* insert the object in database.....
		 * Employee emp1 = new Employee();
		emp1.setSid(104);
		emp1.setSname("Kiran");
		emp1.setGender("Female");
		emp1.setSalary(12000);
		dao.saveEmployee(emp1);*/
	/*	select the object in database..........
	 * Employee emp1 = dao.loadStudent(102);
		System.out.println(emp1);*/
		/* update the table in database
		 * Employee e = dao.updateEmployee(101, 18000);
		System.out.println(e);*/
		/* delete the object in database..........
	 dao.deleteEmployee(104);*/
	}

}
