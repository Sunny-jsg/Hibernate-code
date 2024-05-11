package com.ait.Entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "Student_Record")
public class StudentEntity {
	@EmbeddedId
	private StudentCompositeKey compositeKey;
	@Column(name ="SNAME")
	private String StudentName;
	private Integer Marks;
	public StudentCompositeKey getCompositeKey() {
		return compositeKey;
	}
	public void setCompositeKey(StudentCompositeKey compositeKey) {
		this.compositeKey = compositeKey;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public Integer getMarks() {
		return Marks;
	}
	public void setMarks(Integer marks) {
		Marks = marks;
	}

}
