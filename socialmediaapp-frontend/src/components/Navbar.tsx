import { Link } from "react-router-dom";
import { AccountContext } from "../App";
import { useContext } from "react";

export function Navbar() {
    const accountContext = useContext(AccountContext);

    return (
        <>
        <p>CURRENT USER: Username = {accountContext.account.accountName}; Role = {accountContext.account.role}</p>
            <Link to = "/">Home</Link>
            <Link to = "/login">Login</Link>
            <Link to = "/register">Register</Link>
            <Link to = "/post">Post</Link>
            <Link to = "/allPosts">AllPosts</Link>
        </>
    )
}