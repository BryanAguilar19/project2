import { useState, useEffect } from "react";
import { Post } from "../models/Post";
import { PostCard } from "./PostCard";
import { getAllPostsAPI } from "../service/PostService";
interface propsInterace{
    post:Post
}

export function PostsList(){

    const [allPosts, setAllPosts] = useState<Post[]>([])
    useEffect(()=>{
        getAllPostsAPI().then(response => {
            return response.json()
        })
        .then(json => {setAllPosts(json)});
    }, []);
    return (
        <>
            {allPosts.map(post => <PostCard post={post}></PostCard>)}
        </>
    )
    
    // return(
    //     <>
    //     <h1>PostsCard component</h1>          

    //     <PostCard/>
    //     </>
    // )
}