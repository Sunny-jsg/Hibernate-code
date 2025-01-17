package com.ait.mto.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.mto.dao.LoanDAO;
import com.ait.mto.entities.Loan;

public class LoanDAOImpl implements LoanDAO {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("Test");

	@Override
	public void saveLoan(Loan loan) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.merge(loan);
			tx.commit();
			System.out.println("Loan object is persisted succesfully .............");

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}

	}

	@Override
	public Loan fetchLoanDetailsById(Integer loanId) {
		EntityManager entityManager = factory.createEntityManager();
		Loan loan = entityManager.find(Loan.class, loanId);
		entityManager.close();
		return loan;
	}

	@Override
	public void removeLoan(Integer loanId) {
		EntityManager em = factory.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			Loan loan = em.find(Loan.class, loanId);
			em.remove(loan);
			tx.commit();
			System.out.println("Loan object is deleted..............");

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}

	}

}
