package com.ait.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.ait.dao.StudentDAO;
import com.ashokit.entity.Student;

public class StudentDAOImpl implements StudentDAO {
	SessionFactory factory;

	public StudentDAOImpl() {
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

		factory = metadata.getSessionFactoryBuilder().build();
	}

	@Override
	public void saveStudent(Student student) {
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			session.save(student);
			System.out.println("Student object is persisted in Database");
			t.commit();
		} catch (Exception ex) {
			t.rollback();
			System.out.println("Issue in persisting Student object....");
			System.out.println(ex);
		} finally {
			session.close();
			// factory.close();
		}

	}

	@Override
	public Student loadStudent(int sid) {
		/*
		 * load() : lazy loading get() : early loading args: 1. classname.class 2. id
		 * value
		 */
		Session session = factory.openSession();

		Student stu = session.load(Student.class, sid);
		try {
			Thread.sleep(30000);
		} catch (Exception e) {

		}
		System.out.println("Name of student: " + stu.getName());
		session.close();
		return stu;
	}

	@Override
	public Student updateStudent(int sid, int marks) {
		Session sc = factory.openSession();
		Student s = sc.get(Student.class, sid);
		Transaction t = sc.beginTransaction();
		try {
			s.setMarks(marks);
			sc.update(s);
			t.commit();
			System.out.println("object is updated..............");

		} catch (Exception e) {
			t.rollback();
			System.out.println("object is not updated...................");
		} finally {
			sc.close();
		}
		return s;

	}

	@Override
	public void deleteStudent(int sid) {
		Session sc = factory.openSession();
		Student s = sc.get(Student.class, sid);
		Transaction t = sc.beginTransaction();
		try {
			sc.delete(s);
			System.out.println(" object is deleted.............");
			t.commit();

		} catch (Exception e) {
			t.rollback();
			System.out.println("object is not deleted.........");
		} finally {
			sc.close();
		}
	}

	@Override
	public void level1cacheTest() {
     Session sc = factory.openSession();
     Session sc1 = factory.openSession();
     Student s1 = sc.get(Student.class, 11011);
     Student s2 = sc.get(Student.class, 22022);
     Student s3 = sc.get(Student.class, 11011);
     Student  s4 = sc1.get(Student.class, 11011);
     
     
	}
	

}
