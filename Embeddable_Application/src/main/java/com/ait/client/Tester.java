package com.ait.client;
import com.ait.Entity.StudentCompositeKey;
import com.ait.Entity.StudentEntity;
import com.ait.StudentDAO.StudentDAO;
import com.ait.dao.impl.StudentDAOImpl;
public class Tester {
	public static void main(String[] args) {
		StudentDAO dao =new StudentDAOImpl();
		StudentCompositeKey    sk  = new StudentCompositeKey();
		sk.setRollNumber(101);
		sk.setSection("B");
		/*StudentEntity se = new StudentEntity();
		se.setCompositeKey(sk);
		se.setStudentName("Rohit");
		se.setMarks(599);
		dao.saveStudent(se);
		*/
		StudentEntity student = dao.fetchStudent(sk);
		System.out.println("Name::"+student.getStudentName());
		System.out.println("Marks::"+student.getMarks());
		
	}

}
