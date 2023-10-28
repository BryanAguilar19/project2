import React, { createContext, useState } from 'react';
import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { Navbar } from './components/Navbar';
import { LoginForm } from './components/LoginForm';
import { RegisterForm } from './components/RegisterForm';
import { CreatePostPage } from './pages/CreatePostPage';
import { PostsPage } from './pages/PostsPage';
import { Account } from './models/Account';
import { Role } from './models/Role';

export const AccountContext = createContext(
  {
    account: {
      accountName: "",
      password: "",
      firstName: "",
      lastName: "",
      email: "",
      phoneNumber: "",
      role: Role.PERSONAL
    }, setAccount: (account : Account) => {}
  }
);

function App() {
  const [account, setAccount] = useState<Account>({
    accountId: -1,
    accountName: "",
    password: "",
    firstName: "",
    lastName: "",
    email: "",
    phoneNumber: "",
    role: Role.PERSONAL
  });
  let context = {account, setAccount};

  return (
    <div className="App">
      <AccountContext.Provider value = {context}>
        <BrowserRouter>
          <Navbar></Navbar>
          <Routes>
            <Route path = "/" element = {<></>}></Route>
            <Route path = "/login" element = {<LoginForm></LoginForm>}></Route>
            <Route path = "/register" element = {<RegisterForm></RegisterForm>}></Route>
            <Route path = "/post" element = {<CreatePostPage></CreatePostPage>}></Route>
            <Route path = "/allPosts" element = {<PostsPage></PostsPage>}></Route>
          </Routes>
        </BrowserRouter>
      </AccountContext.Provider>
    </div>
  );
}

export default App;
