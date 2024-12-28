package com.app.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.app.dao.EmployeeDAO;
import com.sy.App.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	SessionFactory factory;

	public EmployeeDAOImpl() {
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

		factory = metadata.getSessionFactoryBuilder().build();

	}

	@Override
	public void saveEmployee(Employee employee) {
	Session session = factory.openSession();
	Transaction t = session.beginTransaction();
	try {
		session.save(employee);
		System.out.println("Employee object is persist in database");
		t.commit();
	} catch (Exception e) {
		t.rollback();
		System.out.println("issue in  persisting in database");
		System.out.println(e);
	}finally {
		session.close();
		//factory.close();
	}

	}

	@Override
	public Employee loadStudent(int sid) {
		/*
		 * load()  :  lazy loading
		 * get() : early loading
		 * args :  1. classname.class
		 *             2.  id value
		 *    
		 */
		      Session session = factory.openSession();
		    //  Employee emp = session.get(Employee.class, sid);
		      Employee emp =session .load(Employee.class, sid);
		      try {
				Thread.sleep(3000);
			} catch (Exception e) {
				
			}
		      System.out.println("Name of Student : "+ emp.getSname());
		      session .close();
		return emp;
	}

	@Override
	public Employee updateEmployee(int sid, int salary) {
		Session session  = factory.openSession();
		Employee e = session.get(Employee.class, sid);
		Transaction t = session.beginTransaction();
		try {
			e.setSalary(salary);
			session.update(e);
			t.commit();
			System.out.println("object  is updated .........................");
			
		} catch (Exception e2) {
			t.rollback();
			System.out.println("object is not updated ......................");
			
		}
		finally {
			session.close();
		}
		return e;
	}

	@Override
	public void deleteEmployee(int sid) {
		Session session = factory.openSession();
		Employee e = session.get(Employee.class, sid);
		Transaction t = session.beginTransaction();
		try {
			session.delete(e);
			System.out.println("object is deleted............");
			t.commit();
		} catch (Exception e2) {
			t.rollback();
			System.out.println("object is not delected ..................");
		}finally {
			session.close();
		}
		
	}

}
