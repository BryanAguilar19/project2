import React from 'react';
import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import { Navbar } from './components/Navbar';
import { LoginForm } from './components/LoginForm';
import { RegisterForm } from './components/RegisterForm';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Navbar></Navbar>
        <Routes>
          <Route path = "/" element = {<></>}></Route>
          <Route path = "/login" element = {<LoginForm></LoginForm>}></Route>
          <Route path = "/register" element = {<RegisterForm></RegisterForm>}></Route>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
