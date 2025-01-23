package com.ait.oto.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_passports")
public class Passport {
	@Id
	@Column(name ="passport_id")
	private Integer PassportNo;
	@Column(name ="expire_date")
	private LocalDate ExpireDate;
	public Integer getPassportNo() {
		return PassportNo;
	}
	public void setPassportNo(Integer passportNo) {
		PassportNo = passportNo;
	}
	public LocalDate getExpireDate() {
		return ExpireDate;
	}
	public void setExpireDate(LocalDate expireDate) {
		ExpireDate = expireDate;
	}
	@Override
	public String toString() {
		return "Passport [PassportNo=" + PassportNo + ", ExpireDate=" + ExpireDate + "]";
	}
	

}
