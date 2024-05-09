package com.ait.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.dao.ProductDAO;
import com.ait.entity.ProductEntity;

public class ProductDAOImpl implements ProductDAO {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public ProductEntity saveproduct(ProductEntity product) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.persist(product);
			tx.commit();
			System.out.println("product inserted in to the database ..........................");
		} catch (Exception e) {
			tx.rollback();
			System.out.println("Error in inserting the product.................." + e);
		} finally {
			em.close();
		}
		return product;
	}

	@Override
	public ProductEntity loadProductById(Integer Product_Id) {
		EntityManager em = factory.createEntityManager();
		/*
		 * find() : early load getReference() : lazy load
		 */
		ProductEntity p = em.find(ProductEntity.class, Product_Id);
		em.close();
		return p;
	}

	@Override
	public ProductEntity updateproductById(Integer product_id, double new_UnitPrice) {
		EntityManager em = factory.createEntityManager();
		ProductEntity p = em.find(ProductEntity.class, product_id);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		p.setUnitPrice(new_UnitPrice);
		tx.commit();
		em.close();
		return p;
	}

	@Override
	public void deleteproductById(Integer Product_Id) {
		EntityManager em = factory.createEntityManager();
		ProductEntity p = em.find(ProductEntity.class, Product_Id);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.remove(p);
		tx.commit();
		em.close();

	}

}
