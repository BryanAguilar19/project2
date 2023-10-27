import { Account } from "./Account";

export interface Post {
    id: number,
    account: Account,
    contentImageUrl: string,
    contentText: string,
    likes: number,
    comments: Comment[]
}