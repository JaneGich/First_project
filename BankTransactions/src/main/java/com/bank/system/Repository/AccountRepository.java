package com.bank.system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.system.Model.Account;
import com.bank.system.Model.Transaction;
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByAccountNumberEquals(String accountNumber);

	Transaction save(Transaction transaction);

}
