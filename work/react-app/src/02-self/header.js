import React from 'react'
import InnerFooter from './innerfooter';
import InnerHeader from './innerheader';
// stateless
const Header = (props) => {
    return(
        <div>
            <h1 className="alert alert-danger">Hi I am from Header - {props.company}</h1>
            <div className="d-flex flex-row justify-content-between">
                <InnerHeader/>
                <InnerFooter/>
            </div>
        </div>
    );
}
export default Header;