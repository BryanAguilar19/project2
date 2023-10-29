package com.example.demo.service;

import com.example.demo.entity.Account;
import com.example.demo.entity.Role;
import com.example.demo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

@Component
@Transactional
public class AccountService {
    //'AccountRepository' object
    private AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    public Account login(Account submittedAccount) {
        Account account = this.getAccountByAccountName(submittedAccount.getAccountName());

        if(account == null || !submittedAccount.getPassword().equals(account.getPassword())) {
            return null;
        }

        return account;
    }

    public Account register(Account submittedAccount) {
        Account account = this.getAccountByAccountName(submittedAccount.getAccountName());

        if(account != null) {
            return null;
        }

        submittedAccount.setDisabled(false);

        return this.saveAccount(submittedAccount);
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
    public Account saveAccount(Account account){
        return this.accountRepository.save(account);
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

    private Account getAccountByAccountName(String accountName) {
        Optional<Account> account = this.accountRepository.findAccountByAccountName(accountName);

        if(!account.isPresent()) {
            return null;
        }

        return account.get();
    }
}
