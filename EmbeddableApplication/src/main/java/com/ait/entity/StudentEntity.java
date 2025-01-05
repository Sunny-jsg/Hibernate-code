package com.ait.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "STUDENT")
public class StudentEntity {
	@EmbeddedId
	private StudentCompositeKey compositekey;
	@Column(name = "SNAME")
	private String studentName;

	private int marks;

	public StudentCompositeKey getCompositekey() {
		return compositekey;
	}

	public void setCompositekey(StudentCompositeKey compositekey) {
		this.compositekey = compositekey;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	

}
