package com.ait.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.ait.dao.EmployeeDAO;
import com.ait.entity.EmployeeEntity;

public class EmployeeDAOImpl implements EmployeeDAO {
 private EntityManagerFactory factory = Persistence.createEntityManagerFactory("Test");
	@Override
	public List<EmployeeEntity> executeNamedQuery(int deptNumber) {
	EntityManager em = factory.createEntityManager();
	TypedQuery<EmployeeEntity>tq =em.createNamedQuery("query1",EmployeeEntity.class);
	tq.setParameter(1, deptNumber);
	List<EmployeeEntity> resultList = tq.getResultList();
	em.close();
		return resultList;
	}

	@Override
	public List<EmployeeEntity> executeNamedNativeQuery(int salary) {
		EntityManager em = factory.createEntityManager();
             Query q = em.createNamedQuery("query2");
             q.setParameter(1, salary);
             List lst = q.getResultList();
             em.close();
		return lst;
	}

	@Override
	public List<EmployeeEntity> executeCriteriaQuery() {
		EntityManager em = factory.createEntityManager();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<EmployeeEntity> q = cb.createQuery(EmployeeEntity.class);
		Root<EmployeeEntity> r = q.from(EmployeeEntity.class);
		q.select(r).where(cb.and(cb.gt(r.get("Salary"), 40000), cb.lt(r.get("Salary"), 75000)));
		  TypedQuery<EmployeeEntity> tq = em.createQuery(q);
		  List<EmployeeEntity> lst = tq.getResultList();
		                                                           
		return lst;
	}
	

}
