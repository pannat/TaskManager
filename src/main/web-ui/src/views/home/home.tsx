import React from 'react';
import Board from "../../components/board/board";

class Home extends React.Component {
    render() {
        return (
            <div className="content">
                <Board></Board>
            </div>
        );
    }
}

export default Home;
