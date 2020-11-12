package com.bank.system.Dto;

import java.math.BigDecimal;
import java.util.List;

import com.bank.system.Model.Transaction;

public class AccountStatement {
	public AccountStatement() {
		super();
		// TODO Auto-generated constructor stub
	}
	BigDecimal currentBalance;
    List<Transaction> transactionHistory;
}
