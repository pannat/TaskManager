import React from 'react';
import { Menu } from 'antd';

class Aside extends React.Component {
    render() {
        return (
            <aside className="aside">
                <div className="logo">
                    <h1 className="main-title">Task manager</h1>
                </div>
                <Menu theme="dark" mode="inline" defaultSelectedKeys={['1']}>
                    <Menu.Item key="1">
                        Список задач
                    </Menu.Item>
                    <Menu.Item key="2">
                        Статистика
                    </Menu.Item>
                </Menu>
            </aside>
        );
    }
}

export default Aside;
