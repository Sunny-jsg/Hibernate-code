package com.ait.test;
import java.util.List;

import com.ait.dao.*;
import com.ait.dao.impl.*;
import com.ait.entity.EmployeeEntity;
public class Tester {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAOImpl();
		/*List<EmployeeEntity> lst = dao.executeNamedQuery(20);
		lst.forEach(System.out::println);*/
		/*List<EmployeeEntity> lst = dao.executeNamedNativeQuery(40000);
		lst.forEach(System.out::println);*/
		List<EmployeeEntity> list = dao.executeCriteriaQuery();
		list.forEach(System.out::println);
	}

}
