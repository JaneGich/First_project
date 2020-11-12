package com.bank.system.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.system.Dto.Response;
import com.bank.system.Model.Account;
import com.bank.system.Service.AccountService;

@RestController
@RequestMapping("/api/account")
public class AccountController {
    @Autowired private AccountService accountService;
    @PostMapping("/create")
    public List<Account> create(@RequestBody Account account) {
        accountService.save(account);
        return accountService.findAll();
    }

    @GetMapping("/all")
    public List<Account> all() {
        return accountService.findAll();
    }

    @RequestMapping("/sendmoney")
    public Response sendMoney(
            @RequestBody TransferRequest transferBalanceRequest
            ) {

        return Response.ok().setPayload(
                accountService.sendMoney(
                        transferBalanceRequest
                )
        );
    }
    @RequestMapping("/statement")
    public Response getStatement(
            @RequestBody AccountStatementRequest accountStatementRequest

    ){
        return Response.ok().setPayload(
                accountService.getStatement(accountStatementRequest.getAccountNumber())
        );

    }

}
