package com.ait.test;
import com.ait.dao.impl.*;

import java.util.Scanner;

import com.ait.dao.*;
public class Tester {

	public static void main(String[] args) {
		EmpDAO dao = new EmpDAOImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Emp Number ::");
		int empno = sc.nextInt();
		
		dao.executeProcedure(empno);

	}

}
