import React from 'react'

let isEmpty = (data) => {
    if(data && data instanceof Array){
        return data.length===0;
    }
    if(data) {
        return Object.keys.length === 0;
    }
    return false;
}

let loading = (OldComponent) => (props) => {
    let output = <OldComponent {...props}/>
    if(isEmpty(props.contacts)){
        output = <p className="text-center">Loading, Please wait</p>
    }
    return output;
}
export default loading;