import { AdminUserAccountsList } from "../components/AdminUserAccountsList";

export function AdminPage(){
    
    return (
        <>
        <h1>Admin Page</h1>
        <div>
            <h3>Admin User View</h3>
            <AdminUserAccountsList/>        
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