package com.ait.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.entity.DemoEntity;

public class Test {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Test");
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		for(int i =0;i<=7;i++) {
		DemoEntity de = new DemoEntity();
		de.setName("AAA");
		em.persist(de);
		}
		tx.commit();
		em.close();
		factory.close();

	}

}
