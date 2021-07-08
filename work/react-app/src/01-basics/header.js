import React from 'react'

// stateless
const Header = ({company}) => {
    return(
        <div>
            <h1 className="alert alert-danger">Hi I am from Header - {company}</h1>
        </div>
    );
}
export default Header;