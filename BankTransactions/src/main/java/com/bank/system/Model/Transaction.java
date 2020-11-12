package com.bank.system.Model;

import java.math.BigDecimal;
import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
public class Transaction {
	 @Id
	    @GeneratedValue
	    private Long transactionId;

	    private String accountNumber;

	    private BigDecimal transactionAmount;

	    public Long getTransactionId() {
			return transactionId;
		}

		public void setTransactionId(Long transactionId) {
			this.transactionId = transactionId;
		}

		public String getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}

		public BigDecimal getTransactionAmount() {
			return transactionAmount;
		}

		public void setTransactionAmount(BigDecimal transactionAmount) {
			this.transactionAmount = transactionAmount;
		}

		public Timestamp getTransactionDateTime() {
			return transactionDateTime;
		}

		public void setTransactionDateTime(Timestamp transactionDateTime) {
			this.transactionDateTime = transactionDateTime;
		}

		private Timestamp transactionDateTime;

}
