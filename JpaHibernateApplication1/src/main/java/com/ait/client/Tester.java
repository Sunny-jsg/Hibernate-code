package com.ait.client;
import com.ait.dao.*;
import com.ait.dao.impl.*;
import com.ait.entity.StudentEntity;
public class Tester {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAOImpl();
		/*StudentEntity se =new StudentEntity();
		se.setStudentid(105);
		se.setStudentname("Sita");
		se.setGender("Female");
		se.setBranch("EC");
		se.setMarks(565);
		dao.saveStudent(se);*/
		//dao.updateStudentById(101, 600);
		

	}

}
