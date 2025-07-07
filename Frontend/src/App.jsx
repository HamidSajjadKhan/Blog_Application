// import { useState } from 'react'
import './App.css'
import Navbar from './Components/Navigation/Navbar'
import RegisterAdmin from './pages/Admin/RegisterAdmin'
import SignAdmin from './pages/Admin/SigninAdmin'
import RegisterAuthor from './pages/Author/RegisterAuthor'
import SigninAuthor from './pages/Author/SigninAuthor'
import Home from './pages/Home/Home'
import {BrowserRouter,Routes,Route} from 'react-router-dom'

function App() {
 
  return (
    <BrowserRouter>
    
    <div className='App'>
      <header className='App-header'>
      <Navbar/>
        <div className='main'>
          <Routes>
            <Route  path='/' element ={<Home/>} />
            <Route  path='registerAdmin' element={<RegisterAdmin/>}/>
            <Route  path='registerAuthor' element={<RegisterAuthor/>}/>
            <Route  path='signinAdmin' element={<SignAdmin/>}/>
            <Route  path='signinAuthor' element={<SigninAuthor/>}/>
          </Routes>
        </div>
      </header>
      {/* <Home/> */}
      {/* <RegisterAdmin/> */}
    </div>
    </BrowserRouter>
  )
}

export default App
