import React from 'react'

// stateless
const Footer = ({company, website}) => {
    return(
        <fragment>
            <h1 className="alert alert-danger">Hi I am from Footer - {company}</h1>
            <p>This is footer, {website}, @copyright; Publicis Sapient</p>
        </fragment>
    );
}
export default Footer;