import React, { Component } from 'react'
import QuestionList from './question-list';


class Question extends Component {
    state = {
        questions: []
    }

    // where you hit to end point 
    componentDidMount() {
        // fetch, axios, jQuery 
        setInterval(()=>{
            fetch("http://localhost:4040/questions")
            .then(resp => resp.json())
            .then(data => this.setState({ questions: data }))
        }, 1000);
        
    }

    render() {
        return (
            <div className="container">
                <div className="row">
                    <h2>All Question</h2>
                    <div className="col">
                        <QuestionList questions={this.state.questions} />
                    </div>
                </div>
            </div>
        );
    }
}

export default Question;