import React, { Component } from 'react'
import Header from './header'
import Main from './main'
import Footer from './footer'

class App extends Component {
    render() {
        const company = "Publicis Sapient"
        const website = "https://ww.ps.com"
        const empName = "Bitan Sarkar"
        const empAge = 52
        return (
            <div>
                <Header company={company}></Header>
                <Main name={empName} age={empAge}/>
                <Footer website={website} company = {company}/>
            </div>
        )
    }
}
export default App;