import React, {useEffect, useState} from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import * as serviceWorker from './serviceWorker';

interface Task {
    id:number
    challenge:string,
}

const Task = ({task}: { task: Task | null }) => {
    return <div>
        {task && <h1>{task.challenge}</h1>}
        {!task && <h3>Loading...</h3>}
    </div>
};


function loadRandomTask():Promise<Task> {
    return fetch("https://gofycz.herokuapp.com/api/random-task")
        .then(data => data.json());
}

const App = () => {
    const [task, setTask] = useState<Task | null>(null)

    const randomTask = () => {
        setTask(null);
        loadRandomTask()
            .then(task => setTask(task))
            .catch(error => console.error(error))
    }

    useEffect(() => {
        randomTask()
    }, []);

    return <div>
        <Task task={task}/>
        <button onClick={randomTask}>Done</button>
    </div>
}

ReactDOM.render(<App/>, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.register();
