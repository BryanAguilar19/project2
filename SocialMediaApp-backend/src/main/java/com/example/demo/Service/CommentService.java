package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.Account;
import com.example.demo.Entity.Comment;
import com.example.demo.Entity.Post;
import com.example.demo.Repository.CommentRepository;

@Component
public class CommentService {
    CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    /**
     * Retrieves all of the comments that are currently in the database.
     * 
     * @return The list of comments.
     */
    public List<Comment> getAllComments() {
        return null;
    }

    /**
     * Retrieves all of the comments that are associated with a particular post.
     * 
     * @param post The post from which the comments are associated with.
     * @return The list of comments.
     */
    public List<Comment> getAllCommentsByPost(Post post) {
        return null;        
    }

    /**
     * Retrieves all of hte comments that are associated with a particular
     * account.
     * 
     * @param account The account from which the comments are associated with.
     * @return The list of comments.
     */
    public List<Comment> getAllCommentsByAccount(Account account) {
        return null;
    }

    /**
     * Adds a new comment to the database.
     * 
     * @param comment The comment to be added.
     * @return The comment that was added. Return null if it was unable to add
     * the comment.
     */
    public Comment addComment(Comment comment) {
        return null;
    }

    /**
     * Updated a comment that is currently in the database.
     * 
     * @param comment The updated comment.
     * @return The comment that was updated. Returns null if no such comment
     * with the given id exists in the database.
     */
    public Comment updateComment(Comment comment) {
        return null;
    }

    /**
     * Deletes a comment form the database.
     * 
     * @param comment The comment to be deleted.
     * @return The deleted comment. Returns null if no such comment with the
     * given id exists in the database.
     */
    public Comment deleteComment(Comment comment) {
        return null;
    }
}