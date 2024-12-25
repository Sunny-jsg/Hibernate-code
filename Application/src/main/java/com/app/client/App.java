package com.app.client;
import com.app.dao.impl.*;
import com.sy.App.Employee;
import com.app.dao.*;
public class App {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAOImpl();
		Employee emp1 = new Employee();
		emp1.setSid(102);
		emp1.setSname("Sunny");
		emp1.setGender("Male");
		emp1.setSalary(15000);
		dao.saveEmployee(emp1);
	}

}
