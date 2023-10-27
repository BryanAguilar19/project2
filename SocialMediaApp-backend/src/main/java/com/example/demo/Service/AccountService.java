package com.example.demo.Service;

import com.example.demo.Entity.Account;
import com.example.demo.Entity.Role;
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

    /**
     * 
     * @return
     */
    public Account getAccountByAccountName() {
        return null;
    }

    /**
     * 
     * @param role
     * @return
     */
    public List<Account> getAccountsByRole(Role role) {
        return null;
    }

    /**
     * 
     * @return
     */
    public List<Account> getAllActiveAccounts() {
        return null;
    }

    /**
     * Saves a new account to the database.
     * 
     * @param account
     */
    public void saveAccount(Account account){
        accountRepository.save(account);
    }

    /**
     * 
     * @param account
     * @return
     */
    public Account updateAccount(Account account) {
        return null;
    } 

    /**
     * 
     * @param account
     * @return
     */
    public Account deleteAccount(Account account) {
        return null;
    }
}
