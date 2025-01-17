package com.ait.mto.dao;

import com.ait.mto.entities.Loan;

public interface LoanDAO {
	   void saveLoan(Loan loan);
	   Loan fetchLoanDetailsById(Integer loanId);
	   void removeLoan(Integer loanId);

}
