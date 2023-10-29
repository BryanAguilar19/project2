import { Link } from "react-router-dom";
import { AccountContext } from "../App";
import { useContext, useEffect, useState } from "react";
import { Account } from "../models/Account";
import { Role } from "../models/Role";

interface props{
    account:Account
    role:Role
}

export function Navbar(props:props) {
    const accountContext = useContext(AccountContext);

    const [isAdmin, setIsAdmin] = useState(false);
    
    if(accountContext.account.role === Role.ADMIN){
        setIsAdmin(true);
    }    

    return (
        <>
        <p>CURRENT USER: Username = {accountContext.account.accountName}; Role = {accountContext.account.role}</p>
            <Link to = "/">Home</Link>
            <span> | </span>
            <Link to = "/login">Login</Link>
            <span> | </span>
            <Link to = "/register">Register</Link>
            <span> | </span>
            <Link to = "/post">Post</Link>
            <span> | </span>
            <Link to = "/allPosts">AllPosts</Link>
            
            {
            isAdmin ?
                (
                    <>
                    <br/>
                    <Link to = "/admin/adminPage">Admin</Link>
                    <span> | </span>
                    <Link to = "/admin/AllUsers">Users</Link>
                    <span> | </span>
                    <Link to = "/admin/AllPosts">Posts</Link>
                    <span> | </span>
                    <Link to = "/admin/AllRequests">Requests</Link>
                    </>
                )
                :
                (
                    <></>
                )
                
            }
            
        </>
    )
}

