package com.ait.dao;

import com.ait.entity.StudentEntity;

public interface StudentDAO {
	StudentEntity saveStudent(StudentEntity studententity);

	StudentEntity loadStudentById(int studentid);

	StudentEntity updateStudentById(int studentid, int new_marks);

	void deletestudentById(int studentid);

	void testEntityStates();

}
