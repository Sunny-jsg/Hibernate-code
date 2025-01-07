package com.ait.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.ait.constants.AppConstants;
import com.ait.dao.EmployeeDAO;
import com.ait.entity.EmployeeEntity;

public class EmployeeDAOImpl implements EmployeeDAO {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("Test");

	@Override
	public EmployeeEntity fetchEmployeeById(int empno) {
		EntityManager em = factory.createEntityManager();
		TypedQuery<EmployeeEntity> tq = em.createQuery(AppConstants.QUERY1, EmployeeEntity.class);
		tq.setParameter(1, empno);
		EmployeeEntity e = tq.getSingleResult();
		em.close();
		return e;
	}

	@Override
	public List<EmployeeEntity> fetchEmployee() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<EmployeeEntity> tq = em.createQuery(AppConstants.QUERY2, EmployeeEntity.class);
		List<EmployeeEntity> lst = tq.getResultList();
		em.close();

		return lst;
	}

	@Override
	public List<Object[]> fetchNameAndSalaries() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<Object[]> tq = em.createQuery(AppConstants.QUERY3, Object[].class);
		List<Object[]> resultList = tq.getResultList();
		em.close();

		return resultList;
	}

}
