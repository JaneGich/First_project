package com.bank.system.Service;

import java.util.List;

import com.bank.system.Controller.TransferRequest;
import com.bank.system.Dto.AccountStatement;
import com.bank.system.Model.Account;
import com.bank.system.Model.Transaction;

public interface AccountService {
	List<Account> findAll();
    Account save(Account account);
    Transaction sendMoney(TransferRequest transferBalanceRequest);
    AccountStatement getStatement(String accountNumber);
    

}
