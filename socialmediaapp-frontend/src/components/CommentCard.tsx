import { ChangeEvent, SyntheticEvent, useState } from "react";
import { Comment } from "../models/Comment";


interface propsInterface {
    comment: Comment
}

export function CommentCard(props: propsInterface) {
    return (
        <>
            <div>
                <h6>Account: {props.comment.account.accountName}</h6>
                <p>{props.comment.comment}</p>
            </div>
        </>
    )
}
