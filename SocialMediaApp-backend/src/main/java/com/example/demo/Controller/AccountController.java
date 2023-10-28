package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AccountController {
    //Instantiating 'accountService' object
    AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService){
        this.accountService = accountService;
    }

    @PostMapping("accountRegister")
    public void postAccountAPI(@RequestBody Account account){
        accountService.saveAccount(account);
    }

    @GetMapping("account")
    public List<Account> getAccountAPI(){
        return accountService.getAllAccounts();
    }
}
