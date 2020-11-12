package com.bank.system.Service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.system.Controller.TransferRequest;
import com.bank.system.Dto.AccountStatement;
import com.bank.system.Model.Account;
import com.bank.system.Model.Transaction;
import com.bank.system.Repository.AccountRepository;
import com.bank.system.Repository.TransactionRepository;

@Service
public interface AccountServiceImp extends AccountService{
	@Autowired
	private  AccountRepository accountRepository;

    @Autowired
     final TransactionRepository transactionRepository;

    public default Account save(Account account){
        accountRepository.save(account);
        return accountRepository.findByAccountNumberEquals(account.getAccountNumber());
    }

    public default List<Account> findAll(){
    	return (List<Account>) accountRepository.findAll();
    }

    public default  Account findByAccountNumber(String accountNumber){
        Account account = accountRepository.findByAccountNumberEquals(accountNumber);
        return account;
    }
    @Override
    public default Transaction sendMoney(TransferRequest transferBalanceRequest) {
        String fromAccountNumber = transferBalanceRequest.getFromAccountNumber();
        String toAccountNumber = transferBalanceRequest.getToAccountNumber();
        BigDecimal amount = transferBalanceRequest.getAmount();
        Account fromAccount = accountRepository.findByAccountNumberEquals(
                fromAccountNumber );
        Account toAccount = accountRepository.findByAccountNumberEquals(toAccountNumber);
        if(fromAccount.getCurrentBalance().compareTo(BigDecimal.ONE) == 1
                && fromAccount.getCurrentBalance().compareTo(amount) == 1){
            fromAccount.setCurrentBalance(fromAccount.getCurrentBalance().subtract(amount));
            accountRepository.save(fromAccount);
            toAccount.setCurrentBalance(toAccount.getCurrentBalance().add(amount));
            accountRepository.save(toAccount);
        }
        return null;
    }
    

}
