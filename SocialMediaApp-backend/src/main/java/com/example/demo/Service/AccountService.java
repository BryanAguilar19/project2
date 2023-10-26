package com.example.demo.Service;

import com.example.demo.Entity.Account;
import com.example.demo.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountService {
    //'AccountRepository' object
    AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    //Getting all Accounts
    public List<Account> getAllAccounts(){
        return accountRepository.findAll();
    }

    //Saving all Accounts
    public void saveAllAccounts(Account account){
        accountRepository.save(account);
    }
}
