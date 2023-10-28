import { useState, useEffect } from "react";
import { getAllPostsAPI } from "../service/PostService";
import { CommentCard } from "./CommentCard";
import { Comment } from "../models/Comment";
import { getAllCommentsAPI } from "../service/CommentService";

export function CommentsList() {
    const [allComments, setAllComments] = useState<Comment[]>([])

    useEffect(() => {
        getAllCommentsAPI()
            .then(response => {
                return response.json()
            })
            .then(json => {
                setAllComments(json)
            });
    }, []);

    return (
        <>
            {allComments.map(comment => <CommentCard key={comment.id} comment={comment}></CommentCard>)}
        </>
    )
}
    