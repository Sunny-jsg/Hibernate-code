package com.ait.dao;

import com.ait.entity.StudentCompositeKey;
import com.ait.entity.StudentEntity;

public interface StudentDAO {
	void saveStudent(StudentEntity entity);
	StudentEntity fetchStudent(StudentCompositeKey key);

}
