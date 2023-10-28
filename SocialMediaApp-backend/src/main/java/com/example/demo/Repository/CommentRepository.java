package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Account;
import com.example.demo.entity.Comment;
import com.example.demo.entity.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import javax.websocket.server.PathParam;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    /**
     * 
     * @param post
     * @return
     */
    @Query(nativeQuery = true, value = "SELECT * FROM  comment WHERE post = :post")
    List<Comment> findAllCommentsByPost(@PathVariable Post post);

    /**
     *
     * @param accountId
     * @return
     */
    @Query(nativeQuery = true, value = "SELECT * FROM comment WHERE account_id = :accountId")
    List<Comment> findAllCommentsByAccount(@PathVariable long accountId);
}
