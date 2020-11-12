package com.bank.system.Model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="accountTable")
public class Account {
	@Id
	@GeneratedValue
	private String Id;
	
	String accountNumber;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	String accName;
	BigDecimal  CurrentBalance;
	public BigDecimal getCurrentBalance() {
		return CurrentBalance;
	}
	public void setCurrentBalance(BigDecimal currentBalance) {
		CurrentBalance = currentBalance;
	}

	
	

}
