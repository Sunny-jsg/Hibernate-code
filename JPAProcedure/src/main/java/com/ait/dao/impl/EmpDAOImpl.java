package com.ait.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import com.ait.dao.EmpDAO;

public class EmpDAOImpl implements EmpDAO {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("Test");

	@Override
	public void executeProcedure(int empno) {
		EntityManager em = factory.createEntityManager();
		StoredProcedureQuery query = em.createNamedStoredProcedureQuery("pro1");

		query.setParameter("ENO", empno);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		query.execute();

		String s1 = (String) query.getOutputParameterValue("NAME");
		double d = (Double) query.getOutputParameterValue("EXPERIENCE");
		System.out.println("NAME  ::  " +  s1);
		System.out.println("EXPERIENCE ::  "  +  d);

		tx.commit();
		em.close();
		factory.close();

	}

}
