import React, { Component } from 'react'
import 'bootstrap/dist/css/bootstrap.css'
class App extends Component {
  render() {
    const name = "Bitan Sarkar";
    return(
      <div>
      <div>
      <h1 className="alert alert-info"> Welcome to React JS</h1>
      <h1 className="alert alert-success"> From {name}</h1>
      </div>
      </div>
      );
    }
  }
  
  export default App;