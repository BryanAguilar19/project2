import { ChangeEvent, useState } from "react";
import { useNavigate } from "react-router-dom";

export function LoginForm() {
    const navigate = useNavigate();
    const [accountName, setAccountName] = useState("");
    const [password, setPassword] = useState("");

    const updateInput = (synthEvent: ChangeEvent<HTMLInputElement>) => {
        switch(synthEvent.target.name) {
            case "accountName":
                setAccountName(synthEvent.target.value);
                break;
            case "password":
                setPassword(synthEvent.target.value);
                break;
        }
    }

    function login() {
        console.log("Attempting to login!");
    }

    function redirectToRegister() {
        navigate("/register");
    }

    return (
        <>
            <div>
                <label>Account Name:</label>
                <input name = "accountName" value = {accountName} onChange = {updateInput}></input>
                 
                <label>Password:</label>
                <input name = "password" type = "password" value = {password} onChange = {updateInput}></input>

                <button onClick = {login}>Login</button>
                <button onClick = {redirectToRegister}>Create an account</button>
            </div>
        </>
    )
} 