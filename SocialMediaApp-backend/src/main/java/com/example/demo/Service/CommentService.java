package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Account;
import com.example.demo.entity.Comment;
import com.example.demo.entity.Post;
import com.example.demo.repository.CommentRepository;

@Component
public class CommentService {
    CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    /**
     * Retrieves all the comments that are currently in the database.
     * 
     * @return The list of comments.
     */
    public List<Comment> getAllComments() {
        return this.commentRepository.findAll();
    }



    /**
     * Retrieves all of hte comments that are associated with a particular
     * account.
     * 
     * @param account The account from which the comments are associated with.
     * @return The list of comments.
     */
    public List<Comment> getAllCommentsByAccount(long accountId) {
        return this.commentRepository.findAllCommentsByAccount(accountId);
    }

    /**
     * Adds a new comment to the database.
     * 
     * @param comment The comment to be added.
     * @return The comment that was added. Return null if it was unable to add
     * the comment.
     */
    public Comment addComment(Comment comment) {
        return this.commentRepository.save(comment);
    }

    /**
     * Updated a comment that is currently in the database.
     * 
     * @param updatedComment The updated comment.
     * @return The comment that was updated. Returns null if no such comment
     * with the given id exists in the database.
     */
    public Comment updateComment(Comment updatedComment) {
        long commentId = updatedComment.getId();
        Optional<Comment> comment = this.commentRepository.findById(commentId);

        if(!comment.isPresent()) {
            return null;
        }

        Comment commentToUpdate = comment.get();
        commentToUpdate.setComment(updatedComment.getComment());

        return this.commentRepository.save(commentToUpdate);
    }

    /**
     * Deletes a comment form the database.
     * 
     * @param comment The comment to be deleted.
     */
    public void deleteComment(Comment comment) {
        this.commentRepository.delete(comment);
    }
}