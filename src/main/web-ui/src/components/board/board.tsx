import React from 'react';
import TaskList from "./task-list/task-list";

class Board extends React.Component {
    render() {
        return (
            <div className="content">
                <TaskList></TaskList>
            </div>
        );
    }
}

export default Board;
