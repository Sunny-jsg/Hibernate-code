package com.ait.client;

import com.ait.dao.StudentDAO;
import com.ait.dao.impl.StudentDAOImpl;

import com.ashokit.entity.Student;

public class Tester {
	public static void main(String[] args) {

		StudentDAO dao = new StudentDAOImpl();

		/*
		 * Student student = new Student(); student.setId(33033);
		 * student.setName("MONU"); student.setGender("Male"); student.setMarks(700);
		 * dao.saveStudent(student);
		 */
		//Student stud = dao.loadStudent(22022);
	//	System.out.println(stud);
		//Student s =dao.updateStudent(22022, 800);
		//System.out.println(s);
	// dao.deleteStudent(33033);
		dao.level1cacheTest();
	}

}
