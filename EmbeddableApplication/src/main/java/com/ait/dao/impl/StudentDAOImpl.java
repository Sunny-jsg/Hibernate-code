package com.ait.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.dao.StudentDAO;
import com.ait.entity.StudentCompositeKey;
import com.ait.entity.StudentEntity;

public class StudentDAOImpl implements StudentDAO {
    private  EntityManagerFactory factory = Persistence.createEntityManagerFactory("Test");
    
	@Override
	public void saveStudent(StudentEntity entity) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.persist(entity);
			tx.commit();
			System.out.println("object is inserted............");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("object is not inserted...........");
		}finally {
			em.close();
		}
		

	}

	@Override
	public StudentEntity fetchStudent(StudentCompositeKey key) {
		EntityManager em = factory.createEntityManager();
		StudentEntity entity =em.find(StudentEntity.class,key );
		em.close();
		
		return entity;
	}

}
