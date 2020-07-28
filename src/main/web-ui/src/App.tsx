import React from 'react';
import './App.css';
import {
    Route
} from "react-router-dom"

import Header from "./components/header/header";
import Footer from "./components/footer/footer";
import Aside from "./components/aside/aside";
import Home from "./views/home/home";

class App extends React.Component {
  render() {
      return (
        <>
            <Header></Header>
            <Aside></Aside>
            <main>
                <Route path='/' component={Home} />
            </main>
            <Footer></Footer>
        </>

    );
  }
}

export default App;
