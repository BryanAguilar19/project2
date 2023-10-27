package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
        return null;
    }

    /**
     * Retrieves all of the posts that were created by a specific user.
     * 
     * @return The list of posts.
     */
    public List<Post> getAllPostsByAccount() {
        return null;
    }

    /**
     * Adds a new post to the database. 
     * 
     * @param post The post to be added.
     * @return The post that was added. Returns null if it was unable to add
     * the post.
     */
    public Post addPost(Post post) {
        return null;        
    }

    /**
     * Updates a post that is currently in the database.
     * 
     * @param post The updated post.
     * @return The post that was updated. Returns null if no such post with
     * the given id exists in the database.
     */
    public Post updatePost(Post post) {
        return null;
    }

    /**
     * Deletes a post from the database.
     * 
     * @param post The post to be deleted.
     * @return The deleted post. Returns null if no such post with
     * the given id exists in the database.
     */
    public Post deletePost(Post post) {
        return null;
    }
}
