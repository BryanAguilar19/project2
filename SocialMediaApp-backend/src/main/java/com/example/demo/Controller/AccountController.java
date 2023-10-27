package com.example.demo.Controller;

import com.example.demo.Entity.Account;
import com.example.demo.Service.AccountService;
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
