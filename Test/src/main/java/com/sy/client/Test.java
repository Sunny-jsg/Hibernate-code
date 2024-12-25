package com.sy.client;
import com.sy.dao.*;
import com.sy.dao.impl.*;
import com.sy.sunny.Employee;
public class Test {
    public static void main(String[] args) {
		EmployeeDAO dao =  new  EmployeeDAOImpl();
		Employee emp = new Employee();
		emp.setSid(101);
		emp.setSname("Raju");
		emp.setGender("Male");
		emp.setSalary(10000);
		dao.saveEmployee(emp);
	}
}
