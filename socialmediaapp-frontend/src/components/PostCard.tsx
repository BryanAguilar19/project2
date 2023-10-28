import { SyntheticEvent, useContext, useState } from "react";
import { Post } from "../models/Post"
import { postCommentAPI } from "../service/CommentService";
import { putLikePostAPI } from "../service/PostService";
import { AccountContext } from "../App";
import { Comment } from "../models/Comment";

interface propsInterface{
    post:Post
}
export function PostCard(props:propsInterface){

    const accountContext = useContext(AccountContext);
    const [postLikesInput, setPostLikesInput] = useState(0);

    const [commentInput, setCommentInput] = useState("");

    const [postId, setPostIdInput] = useState("");
    const [postAccount, setPostAccountInput] = useState("");
    const [postImageUrl, setPostImageUrlInput] = useState("");
    const [postDescription, setPostDescriptionInput] = useState("");
    const [postComments, setPostCommentsInput] = useState([]);

    const [isClicked, setIsClicked] = useState(false);

    function updateCommentInput(event:SyntheticEvent){
        let commentBox = event.target as HTMLTextAreaElement;
        setCommentInput(commentBox.value);        

        // 
    }   

    /**
     * Likes button click function
     */
    function likePost(){       
                
        // setLikes(likes + 1);        probably wrong logic

        // TODO: create call to backend to update likes
        // let post:Post = {
        //     likes: postLikesInput,
        //     id: props.post.id,
        //     account: accountContext.account,
        //     imageUrl: postImageUrl,
        //     description: postDescription,
        //     comments: postComments
        // }

        if(props.post.postId !== undefined){
            putLikePostAPI(props.post.postId, 1);
        }        
        console.log("Like posted.")
        setIsClicked(!isClicked);
    }
    function unlikePost(){        
                
        // setLikes(likes + 1);        probably wrong logic

        // TODO: create call to backend to update likes
        // let post:Post = {
        //     likes: postLikesInput,
        //     id: props.post.id,
        //     account: accountContext.account,
        //     imageUrl: postImageUrl,
        //     description: postDescription,
        //     comments: postComments
        // }
        if(props.post.postId !== undefined){
            putLikePostAPI(props.post.postId, -1);
        }            
    
        console.log("Unlike posted.");
        setIsClicked(!isClicked);
    }
    

    /**
     * Adds new comment to current post
     */
    function addComment(){
        // TODO: create call to backend to add comment
        const newComment:Comment = {
            
            account: accountContext.account,
            comment: commentInput

        }
        
        if(props.post.postId !== undefined){        
            postCommentAPI(props.post.postId, newComment)
            .catch(res => console.log(res))
        }
        console.log("Comment posted.")

    }
    
     

    return (
        <>
        <div>
            <img src={props.post.imageUrl}></img>
            <br/>
            {/* Probably will need to be displayed hidden or top 5-10 comments */}
            {props.post.description}

            <h6>
                {/* Conditional render like button */}
                
                    {isClicked?
                        (<button onClick={unlikePost}>Unlike</button>)
                        :
                        (<button onClick={likePost}>Like</button>)                        
                    }                        
                        {postLikesInput}                        
                        
                
            Post ID: {props.post.postId}
            </h6>
            <div>
                Comment: <input value={commentInput} onChange={updateCommentInput}></input>
                
                <button onClick = {addComment}>Submit</button>                
            </div>
            
        </div>
        </>
    )
}