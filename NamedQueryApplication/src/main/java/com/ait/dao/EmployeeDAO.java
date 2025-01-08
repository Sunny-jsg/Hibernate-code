package com.ait.dao;

import java.util.List;

import com.ait.entity.EmployeeEntity;

public interface EmployeeDAO {
	  List <EmployeeEntity> executeNamedQuery(int deptNumber);
	  List<EmployeeEntity>executeNamedNativeQuery(int salary);

}
