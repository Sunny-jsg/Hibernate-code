package com.ait.client;
import com.ait.dao.StudentDAO;
import com.ait.dao.impl.StudentDAOImpl;

import com.ashokit.entity.Student;

public class Tester {
	public static void main(String[] args) {

StudentDAO  dao = new StudentDAOImpl();		

Student student = new Student();
student.setId(33033);
student.setName("MONU");
student.setGender("Male");
student.setMarks(700);
dao.saveStudent(student);

	}

}
