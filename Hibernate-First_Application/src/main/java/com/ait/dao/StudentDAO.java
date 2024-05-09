package com.ait.dao;

import com.ashokit.entity.Student;

public interface StudentDAO {
	void saveStudent(Student student);
	Student loadStudent(int sid);
	Student updateStudent(int sid, int marks);
	void deleteStudent(int sid);
     void level1cacheTest();

}
