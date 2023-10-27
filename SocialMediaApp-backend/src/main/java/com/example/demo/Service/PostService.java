package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.Entity.Account;
import com.example.demo.Entity.Post;
import com.example.demo.Repository.PostRepository;

@Component
public class PostService {
    PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }
    
    /**
     * Retrieves all of the posts currently in the database.
     * 
     * @return The list of posts.
     */
    public List<Post> getAllPosts() {
        return this.postRepository.findAll();
    }

    /**
     * Retrieves all of the posts that were created by a specific user.
     * 
     * @param account The account from which the posts are associated with.
     * @return The list of posts.
     */
    public List<Post> getAllPostsByAccount(Account account) {
        return this.postRepository.findPostsByAccount(account);
    }

    /**
     * Adds a new post to the database. 
     * 
     * @param post The post to be added.
     * @return The post that was added. Returns null if it was unable to add
     * the post.
     */
    public Post addPost(Post post) {
        if(this.postRepository.findById(post.getId()).isPresent()) {
            return null;
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
        long postId = updatedPost.getId();
        Optional<Post> post = this.postRepository.findById(postId);

        if(!post.isPresent()) {
            return null;
        }

        Post postToUpdate = post.get();
        postToUpdate.setContentImageUrl(updatedPost.getContentImageUrl());
        postToUpdate.setContentText(updatedPost.getContentText());
        postToUpdate.setLikes(updatedPost.getLikes());

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
