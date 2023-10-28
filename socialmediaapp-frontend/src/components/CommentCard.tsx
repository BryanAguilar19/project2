import { ChangeEvent, SyntheticEvent, useState } from "react";


export function CommentCard(){

    const [commentInput, setCommentInput] = useState("");
    
    function updateCommentInput(event:SyntheticEvent){
        let commentBox = event.target as HTMLTextAreaElement;
        setCommentInput(commentBox.value);        
    }    


    function addComment(){
    
        let comment:Comment = {
            
            comment: string

        }
    

    return (
        <>
            <div>
                Comment: <input value={commentInput} onChange={updateCommentInput}></input>
                
                <button onClick = {addComment}>Submit</button>                
            </div>
        </>

    )
}
}