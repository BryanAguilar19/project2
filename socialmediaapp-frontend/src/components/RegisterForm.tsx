import { ChangeEvent, useState } from "react";

export function RegisterForm() {
    const [firstName, setFirstName] = useState("");
    const [lastName, setLastName] = useState("");
    const [accountName, setAccountName] = useState("");
    const [password, setPassword] = useState("");
    const [email, setEmail] = useState("");
    const [phoneNumber, setPhoneNumber] = useState("");

    const updateInput = (synthEvent: ChangeEvent<HTMLInputElement>) => {
        switch(synthEvent.target.name) {
            case "firstName":
                setFirstName(synthEvent.target.value);
                break;
            case "lastName":
                setLastName(synthEvent.target.value);
                break;
            case "accountName":
                setAccountName(synthEvent.target.value);
                break;
            case "password":
                setPassword(synthEvent.target.value);
                break;
            case "email":
                setEmail(synthEvent.target.value);
                break;
            case "phoneNumber":
                setPhoneNumber(synthEvent.target.value);
                break;
        }
    }

    function register() {
        console.log("Attempting to register!");
    }


    return (
        <>
            <div>
                <label>First Name:</label>
                <input name = "firstName" value = {firstName} onChange = {updateInput}></input>

                <label>Last Name:</label>
                <input name = "lastName" value = {lastName} onChange = {updateInput}></input>

                <label>Account Name:</label>
                <input name = "accountName" value = {accountName} onChange = {updateInput}></input>
                 
                <label>Password:</label>
                <input name = "password" type = "password" value = {password} onChange = {updateInput}></input>

                <label>Email:</label>
                <input name = "email" value = {email} onChange = {updateInput}></input>

                <label>Phone Number:</label>
                <input name = "phoneNumber" value = {phoneNumber} onChange = {updateInput}></input>

                <button onClick = {register}>Register</button>
            </div>
        </>
    )
} 