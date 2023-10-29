import { Account } from "../models/Account"

interface props {
    account: Account
}

export function AdminUserAccountCard(props: props) {
    return (
        <>
            <div>                
                <h6>Account ID: {props.account.accountId}</h6> 
                <h6>Username: {props.account.accountName}</h6> 
                <h6>Password: {"**********"}</h6> 
                <h6>First Name: {props.account.firstName}</h6> 
                <h6>Last Name: {props.account.lastName}</h6> 
                <h6>Email: {props.account.email}</h6> 
                <h6>Phone Number: {props.account.phoneNumber}</h6> 
                <h6>Role: {props.account.role}</h6> 
            </div>
        </>
    )
}

// accountId?: number,
// accountName: string,
// password: string,
// firstName: string,
// lastName: string,
// email: string,
// phoneNumber: string,
// role: Role