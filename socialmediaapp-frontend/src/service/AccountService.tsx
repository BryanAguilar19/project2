import { Account } from "../models/Account";

export async function APILoginCall(accountName: string, password: string) {
    return await fetch (
        "http://localhost:8080/account/login",
        {
            mode: "cors",
            method: "POST",
            body: JSON.stringify({
                accountName: accountName,
                password: password
            }),
            headers: {
                "access-control-allow-origin": "*",
                "access-control-allow-headers": "GET, POST, OPTIONS",
                "content-type": "application/json"
            }
        }
    )
}

export async function APIRegisterCall(account: Account) {
    return await fetch (
        "http://localhost:8080/account/register",
        {
            mode: "cors",
            method: "POST",
            body: JSON.stringify(account),
            headers: {
                "access-control-allow-origin": "*",
                "access-control-allow-headers": "GET, POST, OPTIONS",
                "content-type": "application/json"
            }
        }
    )
}