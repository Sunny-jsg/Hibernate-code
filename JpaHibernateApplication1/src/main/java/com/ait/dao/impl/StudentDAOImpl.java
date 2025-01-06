package com.ait.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ait.dao.StudentDAO;
import com.ait.entity.StudentEntity;

public class StudentDAOImpl implements StudentDAO {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Test");
	@Override
	public StudentEntity saveStudent(StudentEntity studententity) {
		EntityManager em  =emf.createEntityManager();
		EntityTransaction tx  =em.getTransaction();
		tx.begin();
		try {
		em.persist(studententity);
		tx.commit();
		System.out.println(" Inserted in database.................");
		}
		catch(Exception e){
			tx.rollback();
			System.out.println("Not inserted in database........................");
			
		}
		finally {
			em.close();
		}
		return studententity;
	}

	@Override
	public StudentEntity loadStudentById(int studentid) {
	   EntityManager em1 = emf.createEntityManager();
	      /* find() : early loading
	       * getReference() : lazy loading
	       */
	   StudentEntity s = em1.find(StudentEntity.class, studentid);
	   em1.close();
		return s;
	}

	@Override
	public StudentEntity updateStudentById(int studentid, int new_marks) {
		EntityManager em2 =emf.createEntityManager();
		 StudentEntity s = em2.find(StudentEntity.class, studentid);
		EntityTransaction tx =em2.getTransaction();
		tx.begin();
		s.setMarks(new_marks);
		tx.commit();
		em2.close();
		return s;
	}

	@Override
	public void deletestudentById(int studentid) {
		EntityManager em2 =emf.createEntityManager();
		 StudentEntity s = em2.find(StudentEntity.class, studentid);
		EntityTransaction tx =em2.getTransaction();
		tx.begin();
		em2.remove(s);
		tx.commit();
		em2.close();

		
	}

	@Override
	public void testEntityStates() {
	EntityManager entitymanager  = emf.createEntityManager();
	    /* 
	     * create new student
	     */
	     
	 //  StudentEntity em =new StudentEntity();//Transient State
	   /*em.setStudentname("Radha");
	   em.setStudentid(101);
	   em.setBranch("CSE");
	   em.setGender("Female");
	   em.setMarks(504);*/
	     StudentEntity em = entitymanager.find(StudentEntity.class, 101);
	   /* EntityTransaction tx =entitymanager.getTransaction();
	    tx.begin();
	    entitymanager.persist(em);//Persistent state
	    tx.commit();*/
	    entitymanager.detach(em);//Detach state
	    em.setMarks(605);//The changes made to an entity in detach state does not effect.
	    EntityTransaction t = entitymanager.getTransaction();
	    t.begin();
	    entitymanager.merge(em);//moved from detached state to persistent state
	    t.commit();
	    entitymanager.close();
	   
		
	}
	




		
	}
