package com.example.demo.Repository;

import com.example.demo.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountRepository extends JpaRepository<Account, Integer> {
}
