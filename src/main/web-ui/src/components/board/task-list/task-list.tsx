import React from 'react';
import Task from "./task/task";

class TaskList extends React.Component {
    render() {
        return (
            <ul className="tasks">
                <Task></Task>
            </ul>
        );
    }
}

export default TaskList;
