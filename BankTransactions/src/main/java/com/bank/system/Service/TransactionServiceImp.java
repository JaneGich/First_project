package com.bank.system.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bank.system.Repository.TransactionRepository;

public interface TransactionServiceImp {
	  @Autowired
	    private TransactionRepository transactionRepository;
}
