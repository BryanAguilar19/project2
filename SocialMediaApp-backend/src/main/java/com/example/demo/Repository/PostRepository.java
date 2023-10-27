package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Account;
import com.example.demo.Entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
    /**
     * 
     * @param account
     * @return
     */
    public List<Post> findPostsByAccount(Account account);
}
