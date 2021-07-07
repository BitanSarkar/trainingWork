import React from 'react'

import InnerFooter from './innerfooter';
import InnerHeader from './innerheader';
// stateless
const Footer = (props) => {
    return(
        <fragment>
            <h1 className="alert alert-danger">Hi I am from Footer - {props.company}</h1>
            <div className="d-flex flex-row justify-content-between">
                <InnerHeader/>
                <InnerFooter/>
            </div>
            <p>This is footer, {props.website}, @copyright; Publicis Sapient</p>
        </fragment>
    );
}
export default Footer;