package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Account;
import com.example.demo.Entity.Comment;
import com.example.demo.Entity.Post;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import javax.websocket.server.PathParam;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    /**
     * 
     * @param post
     * @return
     */
    public List<Comment> findAllCommentsByPost(Post post);

    /**
     * 
     * @param account
     * @return
     */
    @Query(value = "SELECT * FROM comment WHERE accound_id = :accountId")
    public List<Comment> findAllCommentsByAccount(@PathVariable long accountId);
}
