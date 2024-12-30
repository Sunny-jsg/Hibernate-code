package com.ait.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;



@Entity
@Table(name = "TBL_STUDENT")
public class StudentEntity {
	@Id
	@Column(name = "Student_id")
	private int studentid;
	@Column(name = "Student_name")
	private String studentname;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "Marks")
	private int marks;
	@Column(name = "Branch")
	private String branch;
	@Column(name = "CREATED_ON")
	@CreationTimestamp
   private LocalDateTime createdon;
	@Column(name = "UPDATED_ON")
	@UpdateTimestamp
	private LocalDateTime updatedon;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public LocalDateTime getCreatedon() {
		return createdon;
	}
	public void setCreatedon(LocalDateTime createdon) {
		this.createdon = createdon;
	}
	public LocalDateTime getUpdatedon() {
		return updatedon;
	}
	public void setUpdatedon(LocalDateTime updatedon) {
		this.updatedon = updatedon;
	}
	@Override
	public String toString() {
		return "StudentEntity [studentid=" + studentid + ", studentname=" + studentname + ", gender=" + gender
				+ ", marks=" + marks + ", branch=" + branch + ", createdon=" + createdon + ", updatedon=" + updatedon
				+ "]";
	}
	
	
}
