package com.ait.mtm.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.mtm.dao.BookDAO;
import com.ait.mtm.entities.Book;

public class BookDAOImpl implements BookDAO {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("Test");

	@Override
	public void saveBooks(Book books) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.merge(books);
			tx.commit();
			System.out.println("Book is inserted");
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}

	}

	@Override
	public Book findBook(Integer BookId) {
		EntityManager em = factory.createEntityManager();
		Book find = em.find(Book.class, BookId);
		em.close();
		return find;
	}

	@Override
	public void removeBook(Integer BookId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			Book find = em.find(Book.class, BookId);
			em.remove(find);
			tx.commit();
			System.out.println("Book is deleted.........");

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}

	}

}
