package com.ait.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class StudentCompositeKey implements Serializable {
	@Column(name ="ROLLNO")
	private int RollNumber;
	@Column(name ="SECTION")
	private String section;
	public int getRollNumber() {
		return RollNumber;
	}
	public void setRollNumber(int rollNumber) {
		RollNumber = rollNumber;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	

}
