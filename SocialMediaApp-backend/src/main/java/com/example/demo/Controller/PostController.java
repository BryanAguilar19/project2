package com.example.demo.controller;

import com.example.demo.entity.Post;
import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PostController {
    private PostService postService;

    @Autowired
    public PostController(PostService postService){
        this.postService = postService;
    }

    /**
     * Retrieves a list of all posts.
     * 
     * @return A list of Post objects representing all posts in the system.
     */
    @GetMapping("/post")
    public List<Post> getAllPost() {
        return this.postService.getAllPosts();
    }

    /**
     * Retrieves posts associated with a specific account.
     * 
     * @param id Unique identifier of the account to fetch posts.
     * @return A list of posts associated with the account identified by 'accountId'.
     */
    @GetMapping("/account/{id}/post")
    public List<Post> getAllPostByAccount(@PathVariable("id") long id){
        return this.postService.getAllPostsByAccountId(id);
    }

    /**
     * Method to create a new post
     * 
     * Body: 
     * {
     *   "imageUrl": "The image url",
     *   "description": "The post description",
     *   "account": {
     *      "accountId": ID of the account that is posting
     *   }
     * }
     * 
     * @param post The post to be created, provided as JSON in the request body.
     */
    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
        return this.postService.addPost(post);
    }

    /**
     * Updates an existing post with new information.
     * @param post The post object containing updated information for the post to be modified.
     *
    @PutMapping("post")
    public void updatePost(Post post){
        postService.updatePost(post);
    }

    /**
     * Deletes a post based on its information.
     * @param post The post object containing information about the post to be deleted.
     *
    @DeleteMapping("post")
    public void deletePost(Post post){
        postService.deletePost(post);
    }
    */
}
