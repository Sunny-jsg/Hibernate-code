package com.ait.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Employee")
public class EmployeeEntity {
@Id
@Column(name ="empno")
private int EmployeeNumber;
@Column(name ="ename")
private String EmployeeName;

private Double Salary;
private int deptNumber;
public int getEmployeeNumber() {
	return EmployeeNumber;
}
public void setEmployeeNumber(int employeeNumber) {
	EmployeeNumber = employeeNumber;
}
public String getEmployeeName() {
	return EmployeeName;
}
public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}
public Double getSalary() {
	return Salary;
}
public void setSalary(Double salary) {
	Salary = salary;
}
public int getDeptNumber() {
	return deptNumber;
}
public void setDeptNumber(int deptNumber) {
	this.deptNumber = deptNumber;
}
@Override
public String toString() {
	return "EmployeeEntity [EmployeeNumber=" + EmployeeNumber + ", EmployeeName=" + EmployeeName + ", Salary=" + Salary
			+ ", deptNumber=" + deptNumber + "]";
}

}
