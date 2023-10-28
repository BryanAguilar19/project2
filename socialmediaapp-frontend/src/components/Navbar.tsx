import { Link } from "react-router-dom";

export function Navbar() {
    return (
        <>
            <Link to = "/">Home</Link>
            <Link to = "/login">Login</Link>
            <Link to = "/register">Register</Link>
            <Link to = "/post">Post</Link>
            <Link to = "/allPosts">AllPosts</Link>
        </>
    )
}