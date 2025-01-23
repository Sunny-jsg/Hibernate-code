package com.ait.oto.test;

import java.time.LocalDate;

import com.ait.oto.dao.PersonDAO;
import com.ait.oto.dao.impl.PersonDAOImpl;
import com.ait.oto.entities.Passport;
import com.ait.oto.entities.Person;

public class Tester {
	public static void main(String[] args) {
		PersonDAO dao = new PersonDAOImpl();

		 // Create passport and associate it with Person p1
      /*  Passport passport1 = new Passport();
        passport1.setPassportNo(101);
        passport1.setExpireDate(LocalDate.of(2030, 12, 31));
        Person p1 = new Person();
        p1.setPersonId(10111);
        p1.setPersonName("Raja");
        p1.setPassport(passport1);*/
        // Create passport and associate it with Person p2
       /* Passport passport2 = new Passport();
        passport2.setPassportNo(102);
        passport2.setExpireDate(LocalDate.of(2031, 9, 18));
        Person p2 = new Person();
        p2.setPersonId(10203);
        p2.setPersonName("Radha");
        p2.setPassport(passport2);
        // Save both Person objects with their passports
        dao.savePerson(p1);
        dao.savePerson(p2);*/
		/*
		 * find the person
		 */
	/*	Person person = dao.findPerson(10203);
		System.out.println(person);
		Passport passport = person.getPassport();
		System.out.println(passport);*/
	
	/*
	 * remove person
	 */
		dao.removePerson(10111);
	}   
}
