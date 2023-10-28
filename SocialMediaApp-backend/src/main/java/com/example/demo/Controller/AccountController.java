package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    /**
     * Retrieves all of the accounts in the database.
     * 
     * @return A list of the accounts.
     */
    @GetMapping("account")
    public List<Account> getAccounts() {
        return accountService.getAllAccounts();
    }

    /**
     * 
     * @param account The account to be posted.
     */
    @PostMapping("account")
    public void postAccount(@RequestBody Account account) {
        accountService.saveAccount(account);
    }

    @PostMapping("/account/login")
    public ResponseEntity<Account> login(@RequestBody Account submittedAccount) {
        Account account = this.accountService.login(submittedAccount);
        HttpStatus status = HttpStatus.OK;

        if(account == null) {
            status = HttpStatus.UNAUTHORIZED;
        }

        return new ResponseEntity<Account>(account, status);
    }

    @PostMapping("/account/register")
    public ResponseEntity<Account> register(@RequestBody Account submittedAccount) {
        Account account = this.accountService.register(submittedAccount);
        HttpStatus status = HttpStatus.CREATED;

        if(account == null) {
            status = HttpStatus.BAD_REQUEST;
        }

        return new ResponseEntity<Account>(account, status);
    }
}
