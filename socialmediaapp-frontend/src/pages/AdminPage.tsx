import { useState } from "react";
import { AccountContext } from "../App";
import { AdminUserView } from "../components/AdminUserView";
import { PostCard } from "../components/PostCard";
import { Account } from "../models/Account";

export function AdminPage(){

    const [allAccounts, setAllAccounts] = useState<Account[]>([])
    
    
    return (
        <>
        <h1>Admin Page</h1>
        <div>
            <h3>Admin User View</h3>
        {/* <AdminUserView/> */}
        {/* {allPosts.map(post => <PostCard refreshPostData={refreshPostData} post={post} key={post.postId}></PostCard>)} */}
        {allAccounts.map(account => <AdminUserAccountsCard account={account} key={account}></AdminUserAccountsCard>)}
        
        </div>
        </>

    )
}

/**
     * admin:
     * - view reports?
     * 
     * users:
     * - view all users
     *   - view user:
     *       -username
     *       -role
     *       -posts?
     *       -comments?
     *   - reset password
     *   - disable user
     *   - change role
     *   - 
     * posts:
     * - delete posts
     * comments:
     * - delete comment
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     */