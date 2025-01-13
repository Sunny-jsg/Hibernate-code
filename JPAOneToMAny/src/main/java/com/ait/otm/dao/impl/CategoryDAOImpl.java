package com.ait.otm.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.otm.dao.CategoryDAO;
import com.ait.otm.entities.CategoryEntity;

public class CategoryDAOImpl implements CategoryDAO {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("Test");

	@Override
	public void saveCategory(CategoryEntity entity) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.persist(entity);
			tx.commit();
			System.out.println("Category with products are persisted in database");

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();

		} finally {
			em.close();
		}

	}

	@Override
	public CategoryEntity fetchCategory(Integer CategoryId) {
		EntityManager em = factory.createEntityManager();
		CategoryEntity entity = em.find(CategoryEntity.class, CategoryId);
		em.close();
		return entity;
	}

	@Override
	public void removeCategory(Integer CategoryId) {
		EntityManager em = factory.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		CategoryEntity entity = em.find(CategoryEntity.class, CategoryId);
		tx.begin();
		try {
			em.remove(entity);
			tx.commit();
			System.out.println("Category with products is removed from database ");
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}

	}

}
