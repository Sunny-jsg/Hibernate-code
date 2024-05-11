package com.ait.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.Entity.StudentCompositeKey;
import com.ait.Entity.StudentEntity;
import com.ait.StudentDAO.StudentDAO;

public class StudentDAOImpl implements StudentDAO {
 private EntityManagerFactory    factory =Persistence.createEntityManagerFactory("test");
	@Override
	public void saveStudent(StudentEntity entity) {
		EntityManager em =factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.persist(entity);
			tx.commit();
			System.out.println("object will inserted...............");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("object will not inserted ..........."+e);
		}finally {
			em.close();
		}
	}

	@Override
	public StudentEntity fetchStudent(StudentCompositeKey compositekey) {
		EntityManager em =factory.createEntityManager();
		StudentEntity entity = em.find(StudentEntity.class, compositekey);
		em.close();
		return entity;
	}

}
