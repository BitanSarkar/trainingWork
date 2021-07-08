import React from 'react'
import './main.css'
// stateless
const Main = (props) => {
    return(
        <div className="app-content">
            <h1>Your main content</h1>
            <h2>Hi my name is {props.name} and my age is {props.age}</h2>
        </div>
    );
}
export default Main;