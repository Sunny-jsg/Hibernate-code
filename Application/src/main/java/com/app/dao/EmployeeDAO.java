package com.app.dao;

import com.sy.App.Employee;

public interface EmployeeDAO {
	void saveEmployee(Employee employee);
     Employee loadStudent(int sid);
     Employee updateEmployee(int sid, int salary);
     void deleteEmployee(int sid);
	
	

}
