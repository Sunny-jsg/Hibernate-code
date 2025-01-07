package com.ait.test;

import java.util.List;

import com.ait.dao.*;
import com.ait.dao.impl.*;
import com.ait.entity.EmployeeEntity;

public class Tester {
	public static void main(String[] args) {

		EmployeeDAO dao = new EmployeeDAOImpl();
		/*
		 * Selecting a single Employee EmployeeEntity emp = dao.fetchEmployeeById(104);
		 * System.out.println(emp);
		 */
		/*
		 * Selecting all Employee List<EmployeeEntity> lst = dao.fetchEmployee();
		 * lst.forEach(System.out:: println);
		 */
		/* Selecting employee only name and salary column 
		List<Object[]> lst = dao.fetchNameAndSalaries();
		lst.forEach(obj -> {
			System.out.println(obj[0]  +  " ,"   + obj[1]);
		});*/

	}
}
