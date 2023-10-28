import { Account } from "./Account";

export interface Post {
    id: number,
    account: Account,
    imageUrl: string,
    description: string,
    likes: number,
    comments: Comment[]
}