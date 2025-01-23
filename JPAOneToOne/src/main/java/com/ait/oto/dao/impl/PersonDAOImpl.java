package com.ait.oto.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.oto.dao.PersonDAO;
import com.ait.oto.entities.Person;

public class PersonDAOImpl implements PersonDAO {
private EntityManagerFactory factory =Persistence.createEntityManagerFactory("Test");
	@Override
	public void savePerson(Person person) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.persist(person);
			tx.commit();
			System.out.println("person object inserted..................");
			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			
		}finally {
			em.close();
		}

	}

	@Override
	public Person findPerson(Integer person_id) {
		EntityManager em = factory.createEntityManager();
		Person find = em.find(Person.class, person_id);
		em.close();
		return find;
	}

	@Override
	public void removePerson(Integer person_id) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			Person find = em.find(Person.class, person_id);
			em.remove(find);
			tx.commit();
			System.out.println("Person object should be deleted............");
			
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
			
		}finally {
			em.close();
		}

	}

}
