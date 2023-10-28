import { useState } from "react";
import { Post } from "../models/Post"

interface propsInterface{
    post:Post
}
export function PostCard(props:propsInterface){

    const [likes, setLikes] = useState(0);
    const likeClicked = () => {
        setLikes(likes + 1);        
    };

    return (
        <>
        <div>
            <img src={props.post.imageUrl}></img>
            <br/>
            {/* Probably will need to be displayed hidden or top 5-10 comments */}
            {props.post.description}

            <h6>
            Likes: <button onClick={likeClicked}>{likes}</button>
            Post ID: {props.post.id}
            
            </h6>
            
        </div>
        </>
    )
}