import { Account } from "./Account";

export interface Post {
    postId?: number,
    account: Account,
    imageUrl: string,
    description: string,
    numberOfLikes: number,
    comments: Comment[]
}