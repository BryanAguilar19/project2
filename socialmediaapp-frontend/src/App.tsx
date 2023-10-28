import React from 'react';
import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { Navbar } from './components/Navbar';
import { LoginForm } from './components/LoginForm';
import { RegisterForm } from './components/RegisterForm';
import { CreatePostPage } from './pages/CreatePostPage';
import { PostsPage } from './pages/PostsPage';

function App() {
  return (
    <div className="App">
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
    </div>
  );
}

export default App;
