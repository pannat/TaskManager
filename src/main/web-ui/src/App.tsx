import React from 'react';
import './App.css';
import {
    Route
} from "react-router-dom"

import { Layout } from 'antd';

import MainHeader from "./components/header/header";
import MainFooter from "./components/footer/footer";
import Aside from "./components/aside/aside";
import Home from "./views/home/home";

class App extends React.Component {
  render() {
      const { Header, Footer, Sider, Content } = Layout
      return (
        <>
            <Layout>
                <Sider>
                    <Aside/>
                </Sider>
                <Layout>
                    <Header className="site-layout-sub-header-background">
                        <MainHeader/>
                    </Header>
                    <Content>
                        <Route path='/' component={Home} />
                    </Content>
                    <Footer>
                        <MainFooter/>
                    </Footer>
                </Layout>
            </Layout>
        </>
    );
  }
}

export default App;
