import { SyntheticEvent, useState } from "react";

export function CreatePostMenu(){

    const [imageUrl, setImageUrlInput] = useState("");
    const [description, setDescriptionInput] = useState("");
    
    function updateImageUrl(event:SyntheticEvent){
        let image = event.target as HTMLTextAreaElement;
            setImageUrlInput(image.value);       
    }
    function updateContentText(event:SyntheticEvent){
        let text = event.target as HTMLTextAreaElement;
            setDescriptionInput(text.value);
        
    }

    return (
        <>
        Image: <input value={imageUrl} onChange={updateImageUrl}></input>
        Description: <input value={description} onChange={updateContentText}></input>
        
        </>

    )
}