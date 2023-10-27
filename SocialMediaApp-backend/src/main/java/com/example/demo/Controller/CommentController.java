package com.example.demo.controller;

import com.example.demo.Service.CommentService;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entity.Comment;
import com.example.demo.Entity.Post;
import com.example.demo.Entity.Account;

import java.util.List;

public class CommentController {
    CommentService commentService;
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/comment")
    public List<Comment> getAllComments(){
        return commentService.getAllComments();

    }

    @GetMapping("/comment/{accountId")
    public List<Comment> getAllCommentsByAccount(@RequestBody long accountId){
        return commentService.getAllCommentsByAccount(accountId);
    }

    @PostMapping("/comment")
    public Comment addComment(@RequestBody Comment comment){
        return commentService.addComment(comment);
    }

    @PutMapping("/comment")
    public Comment updateComment(@RequestBody Comment updateComment){
        return commentService.updateComment(updateComment);

    }
    @DeleteMapping("/comment")
    public void deleteComment(@RequestBody Comment delComment){
        this.commentService.deleteComment(delComment);

    }


}
