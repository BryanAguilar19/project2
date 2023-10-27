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
     * 
     * @return
     */
    public List<Post> getAllPosts() {
        return null;
    }

    /**
     * 
     * @return
     */
    public List<Post> getAllPostsByAccount() {
        return null;
    }

    /**
     * 
     * @param post
     * @return
     */
    public Post addPost(Post post) {
        return null;        
    }

    /**
     * 
     * @param post
     * @return
     */
    public Post updatePost(Post post) {
        return null;
    }

    /**
     * 
     * @param post
     * @return
     */
    public Post deletePost(Post post) {
        return null;
    }
}
