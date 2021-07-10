import React from 'react'
import loading from './loading';
import QuestionCard from './question-card';

const QuestionList = ({ questions }) => (
    <div>
        {
            questions.map(q => <QuestionCard question={q} key={q.id} />)
        }
    </div>
)

export default loading(QuestionList);