package com.sy.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.sy.dao.EmployeeDAO;
import com.sy.sunny.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
        SessionFactory factory;
        public EmployeeDAOImpl(){
        	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();

    		Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

    		factory = metadata.getSessionFactoryBuilder().build();
        	
        }
        @Override
	public void saveEmployee(Employee employee) {
		Session session = factory.openSession();
		Transaction  t =session.beginTransaction();
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
			factory.close();
		}
		
	}

}
