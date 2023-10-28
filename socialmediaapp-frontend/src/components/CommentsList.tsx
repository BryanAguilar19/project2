import { useState, useEffect } from "react";
import { Post } from "../models/Post";
import { getAllPostsAPI } from "../service/PostService";
import { PostCard } from "./PostCard";
import { CommentCard } from "./CommentCard";
import { Comment } from "../models/Comment";

export function PostsList(){

    const [allComments, setAllComments] = useState<Comment[]>([])
    useEffect(()=>{
        getAllPostsAPI().then(response => {
            return response.json()
        })
        .then(json => {setAllComments(json)});
    }, []);
    return (
        <>
            {allComments.map(comment => <CommentCard key={comment.id} comment={comment}></CommentCard>)}
        </>
    )
}
    