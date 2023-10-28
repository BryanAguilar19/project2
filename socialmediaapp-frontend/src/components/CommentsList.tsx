import { useState, useEffect } from "react";
import { Post } from "../models/Post";
import { getAllPostsAPI } from "../service/PostService";
import { PostCard } from "./PostCard";

export function PostsList(){

    const [allComments, setAllComments] = useState<Post[]>([])
    useEffect(()=>{
        getAllPostsAPI().then(response => {
            return response.json()
        })
        .then(json => {setAllComments(json)});
    }, []);
    return (
        <>
            {allComments.map(post => <CommentCard post={post}></CommentCard>)}
        </>
    )
    