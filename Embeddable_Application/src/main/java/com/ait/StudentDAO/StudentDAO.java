package com.ait.StudentDAO;

import com.ait.Entity.StudentCompositeKey;
import com.ait.Entity.StudentEntity;

public interface StudentDAO {
	void saveStudent(StudentEntity entity);
	StudentEntity fetchStudent(StudentCompositeKey compositekey);

}
