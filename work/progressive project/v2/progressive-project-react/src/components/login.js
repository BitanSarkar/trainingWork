import React, { Component } from 'react'

export default class Login extends Component {
    render(){
        return(
            <div className="container-fluid">
                <div className="jumbotron">
		            <h1 className="display-3">StackQFlow</h1>
	            </div>
	            <div class="container">
		            <h2 class="display-5" >Enter your details for login :</h2>
                    <form method="post" action="login">
                        <table>
                            <tr>
                                <td >Enter
                                    email</td>
                                <td width="300px"><input type="email" class="form-control"
                                    name="email" placeholder="Enter email" /></td>
                            </tr>
                            <tr>
                                <td >Enter
                                    user password</td>
                                <td><input type="password" class="form-control" name="password"
                                    placeholder="Enter password" /></td>
                            </tr>
                            <tr>
                                <td width="250px" height="100px"><input type="submit"
                                    value="Login" 
                                    class="btn btn-info" /></td>
                                <td><input type="reset" value="Reset"
                                 class="btn btn-info" /></td>
                            </tr>
                        </table>
                    </form>
	            </div>
            </div>
        );
    }
}
