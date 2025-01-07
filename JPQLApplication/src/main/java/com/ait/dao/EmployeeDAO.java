package com.ait.dao;

import java.util.List;

import com.ait.entity.EmployeeEntity;

public interface EmployeeDAO {
	EmployeeEntity  fetchEmployeeById(int empno);
	List<EmployeeEntity> fetchEmployee();
	List<Object[]> fetchNameAndSalaries();

}
