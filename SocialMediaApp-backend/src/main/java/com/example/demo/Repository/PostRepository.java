package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Account;
import com.example.demo.Entity.Post;
import org.springframework.data.jpa.repository.Query;

public interface PostRepository extends JpaRepository<Post, Long> {
    /**
     * 
     * @param accountId
     * @return
     */
    @Query(value = "FROM post WHERE accountId = :accountId")
    List<Post> findPostsByAccount(Long accountId);
}
