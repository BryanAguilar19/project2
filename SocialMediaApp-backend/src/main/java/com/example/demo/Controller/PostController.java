package com.example.demo.Controller;

import com.example.demo.Entity.Account;
import com.example.demo.Entity.Post;
import com.example.demo.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PostController {
    PostService postService;

    @Autowired
    public PostController(PostService postService){
        this.postService = postService;
    }

    /**
     * Method to create a new post
     * @param post The post to be created, provided as JSON in the request body.
     */
    @PostMapping("post/insert")
    public void insertPost(@RequestBody Post post){
        postService.addPost(post);
    }

    /**
     * Retrieves a list of all posts.
     *  @return A list of Post objects representing all posts in the system.
     */
    @GetMapping("post")
    public List<Post> getAllPost(){
        return postService.getAllPosts();
    }

    /**
     * Retrieves posts associated with a specific account.
     * @param accountId Unique identifier of the account to fetch posts.
     * @return A list of posts associated with the account identified by 'accountId'.
     */
    @GetMapping("post/account/{accountId}")
    public List<Post> getAllPostByAccount(@PathVariable("accountId") Long accountId){
        return postService.getAllPostsByAccount(accountId);
    }

    /**
     * Deletes a post based on its information.
     * @param post The post object containing information about the post to be deleted.
     */
    @GetMapping("post/delete")
    public void deletePost(Post post){
        postService.deletePost(post);
    }

    /**
     * Updates an existing post with new information.
     * @param post The post object containing updated information for the post to be modified.
     */
    @GetMapping("post/update")
    public void updatePost(Post post){
        postService.updatePost(post);
    }





}
