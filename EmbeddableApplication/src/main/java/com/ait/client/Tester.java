package com.ait.client;
import com.ait.dao.*;
import com.ait.dao.impl.*;
import com.ait.entity.StudentCompositeKey;
import com.ait.entity.StudentEntity;
public class Tester {
	public static void main(String[] args) {
		StudentDAO dao =new  StudentDAOImpl();
		/* insert the data..................
		StudentCompositeKey key = new StudentCompositeKey();
		key.setRollNumber(102);
		key.setSection("B");
		StudentEntity entity =new StudentEntity();
		entity.setCompositekey(key);
		entity.setStudentName("Radha ");
		entity.setMarks(600);
		dao.saveStudent(entity);*/
		/* fetch the data...........................
		StudentCompositeKey compositeKey =new StudentCompositeKey();
		compositeKey.setRollNumber(101);
		compositeKey.setSection("B");
		StudentEntity entity = dao.fetchStudent( compositeKey);
		System.out.println("Name : "+ entity.getStudentName());
		System.out.println("Marks :"+ entity.getMarks());*/
		
	}

}
