import React from 'react'

const QuestionCard = ({ question }) => (
    <div className="card" style={{ width: "700px", height: "150px", padding: "10px", margin: "10px" }}>
        <div className="row">
            <div className="col-md-8">
                <div className="card-body">
                    <h4 className="card-title">{question.question}</h4>
                </div>
            </div>
        </div>
    </div >
)

export default QuestionCard;