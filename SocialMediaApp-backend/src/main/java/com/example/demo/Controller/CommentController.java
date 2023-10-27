package com.example.demo.controller;

import com.example.demo.Service.CommentService;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Entity.Comment;
import com.example.demo.Entity.Post;
import com.example.demo.Entity.Account;

import java.util.List;

/**
 * Comment Controller constructor
 */

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class CommentController {
    CommentService commentService;
    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    /**
     * Returns all comments
     * @return
     */
    @GetMapping("/comment")
    public List<Comment> getAllComments(){
        return commentService.getAllComments();

    }

    /**
     * Get all comments by Account ID
     * @param accountId
     * @return
     */
    @GetMapping("/comment/{accountId")
    public List<Comment> getAllCommentsByAccount(@RequestBody long accountId){
        return commentService.getAllCommentsByAccount(accountId);
    }

    /**
     * Add a new comment
     * @param comment
     * @return
     */
    @PostMapping("/comment")
    public Comment addComment(@RequestBody Comment comment){
        return commentService.addComment(comment);
    }

    /**
     * Updates/edits an existing comment
     * @param updateComment
     * @return
     */
    @PutMapping("/comment")
    public Comment updateComment(@RequestBody Comment updateComment){
        return commentService.updateComment(updateComment);

    }

    /**
     * Deletes a comment
     * @param delComment
     */
    @DeleteMapping("/comment")
    public void deleteComment(@RequestBody Comment delComment){
        this.commentService.deleteComment(delComment);

    }


}
