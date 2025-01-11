package com.ait.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
@NamedStoredProcedureQuery(
		 name="pro1",
		 procedureName ="EMP_EXPERIENCE",
		 parameters = {
				 @StoredProcedureParameter(mode = ParameterMode.IN,type =Integer.class,name ="ENO"),
				 @StoredProcedureParameter(mode = ParameterMode.OUT,type =String.class,name ="NAME"),
				 @StoredProcedureParameter(mode = ParameterMode.OUT,type =Double.class,name ="EXPERIENCE"),
				 
		 }
		 
		)

public class EmployeeEntity {

	@Id
	@Column(name = "empno")
	private Integer EmployeeNumber;
	@Column(name = "ename")
	private String EmployeeName;

	private Double Salary;
	private Integer deptNumber;

	public Integer getEmployeeNumber() {
		return EmployeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
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

	public Integer getDeptNumber() {
		return deptNumber;
	}

	public void setDeptNumber(Integer deptNumber) {
		this.deptNumber = deptNumber;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [EmployeeNumber=" + EmployeeNumber + ", EmployeeName=" + EmployeeName + ", Salary="
				+ Salary + ", deptNumber=" + deptNumber + "]";
	}

}
