package com.ait.oto.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="tbl_persons")
public class Person {
	@Id
	@Column(name ="person_id")
	private Integer PersonId;
	@Column(name ="person_name")
	private String PersonName;
	@OneToOne(cascade =CascadeType.PERSIST,fetch =FetchType.EAGER)
	@JoinColumn(name ="passport_id",unique =true,nullable=true)
	private Passport passport;
	public Integer getPersonId() {
		return PersonId;
	}
	public void setPersonId(Integer personId) {
		PersonId = personId;
	}
	public String getPersonName() {
		return PersonName;
	}
	public void setPersonName(String personName) {
		PersonName = personName;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
}
	@Override
	public String toString() {
		return "Person [PersonId=" + PersonId + ", PersonName=" + PersonName + "]";
	}
	

}
