package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Account;
import com.example.demo.entity.Comment;
import com.example.demo.entity.Post;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.PostRepository;

@Component
public class PostService {
    PostRepository postRepository;
    AccountRepository accountRepository;

    @Autowired
    public PostService(PostRepository postRepository, AccountRepository accountRepository) {
        this.postRepository = postRepository;
        this.accountRepository = accountRepository;
    }
    
    /**
     * Retrieves all the posts currently in the database.
     * 
     * @return The list of posts.
     */
    public List<Post> getAllPosts() {
        return this.postRepository.findAll();
    }

    /**
     * Retrieves all the posts that were created by a specific user.
     * 
     * @param account The account from which the posts are associated with.
     * @return The list of posts.
     */
    public List<Post> getAllPostsByAccountId(long accountID) {
        return this.postRepository.findPostsByAccountId(accountID);
    }

    /**
     * Adds a new post to the database. 
     * 
     * @param post The post to be added.
     * @return The post that was added. Returns null if it was unable to add
     * the post.
     */
    public Post addPost(Post post) {
        if(post.getAccount() == null || post.getImageUrl() == null || post.getDescription() == null) {
            return null;
        }

        Optional<Account> account = this.accountRepository.findById(post.getAccount().getAccountId());
        
        if(!account.isPresent()) {
            return null;
        }

        post.setAccount(account.get());
        post.setNumberOfLikes(0);

        if(post.getComments() == null) {
            post.setComments(new ArrayList<Comment>());
        } else {
            post.getComments().clear();
        }

        return this.postRepository.save(post);        
    }

    /**
     * Updates a post that is currently in the database.
     * 
     * @param updatedPost The updated post.
     * @return The post that was updated. Returns null if no such post with
     * the given id exists in the database.
     */
    public Post updatePost(Post updatedPost) {
        long postId = updatedPost.getPostId();
        Optional<Post> post = this.postRepository.findById(postId);

        if(!post.isPresent()) {
            return null;
        }

        Post postToUpdate = post.get();
        postToUpdate.setImageUrl(updatedPost.getImageUrl());
        postToUpdate.setDescription(updatedPost.getDescription());
        postToUpdate.setNumberOfLikes(updatedPost.getNumberOfLikes());

        return this.postRepository.save(postToUpdate);
    }

    /**
     * Deletes a post from the database.
     * 
     * @param post The post to be deleted.
     */
    public void deletePost(Post post) {
        this.postRepository.delete(post);
    }
}
