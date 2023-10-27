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

    public List<Comment> getAllComments() {
        return null;
    }

    public List<Comment> getAllCommentsByPost() {
        return null;        
    }

    public List<Comment> getAllCommentsByAccount() {
        return null;
    }

    public Comment addComment(Comment comment) {
        return null;
    }

    public Comment updateComment(Comment comment) {
        return null;
    }

    public Comment deleteComment(Comment comment) {
        return null;
    }
}
