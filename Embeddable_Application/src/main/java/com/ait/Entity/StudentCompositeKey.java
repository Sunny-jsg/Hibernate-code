package com.ait.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class StudentCompositeKey implements Serializable {
	@Column(name ="ROLLNO")
private Integer rollNumber;
private String Section;
public Integer getRollNumber() {
	return rollNumber;
}
public void setRollNumber(Integer rollNumber) {
	this.rollNumber = rollNumber;
}
public String getSection() {
	return Section;
}
public void setSection(String section) {
	Section = section;
}

}
