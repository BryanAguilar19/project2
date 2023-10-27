package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.Comment;
import com.example.demo.Repository.CommentRepository;

@Component
public class CommentService {
    CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    /**
     * 
     * @return
     */
    public List<Comment> getAllComments() {
        return null;
    }

    /**
     * 
     * @return
     */
    public List<Comment> getAllCommentsByPost() {
        return null;        
    }

    /**
     * 
     * @return
     */
    public List<Comment> getAllCommentsByAccount() {
        return null;
    }

    /**
     * 
     * @param comment
     * @return
     */
    public Comment addComment(Comment comment) {
        return null;
    }

    /**
     * 
     * @param comment
     * @return
     */
    public Comment updateComment(Comment comment) {
        return null;
    }

    /**
     * 
     * @param comment
     * @return
     */
    public Comment deleteComment(Comment comment) {
        return null;
    }
}