package com.ait.mto.test;

import com.ait.mto.dao.impl.LoanDAOImpl;
import com.ait.mto.entities.Customer;
import com.ait.mto.entities.Loan;
import com.ait.mto.dao.*;

public class Tester {

	public static void main(String[] args) {
		LoanDAO dao = new LoanDAOImpl();
		/*
		 * call saveLoan()
		 */
		/*
		 * Loan pLoan = new Loan(); pLoan.setLoanId(11011);
		 * pLoan.setLoanType("PERSONAL LOAN"); pLoan.setAmount(500000.00); Loan vLoan =
		 * new Loan(); vLoan.setLoanId(22022); vLoan.setLoanType("VEHICLE LOAN");
		 * vLoan.setAmount(110000.00); Loan hLoan = new Loan(); hLoan.setLoanId(33033);
		 * hLoan.setLoanType("HOME LOAN"); hLoan.setAmount(210000.00);
		 * 
		 * Customer customer = new Customer(); customer.setCustomerId(101);
		 * customer.setCustomerName("RAM"); pLoan.setCustomer(customer);
		 * vLoan.setCustomer(customer); hLoan.setCustomer(customer);
		 * dao.saveLoan(pLoan); dao.saveLoan(vLoan); dao.saveLoan(hLoan);
		 */
		/*
		 * call fetchLoanDetailsById()
		 */
	/*	Loan loan = dao.fetchLoanDetailsById(22022);
		System.out.println(loan);
		Customer c = loan.getCustomer();
		System.out.println(c);*/
		/*
		 * removeLoanById()
		 */
		dao.removeLoan(22022);

	}

}
