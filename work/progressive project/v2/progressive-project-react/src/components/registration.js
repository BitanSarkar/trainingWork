import React, { Component } from 'react'

export default class Regsitration extends Component {
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
                                    username</td>
                                <td width="300px"><input type="text" class="form-control"
                                    name="text" placeholder="Enter username" /></td>
                            </tr>
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
                                <td >Select gender</td>
                                <td>
                                    <input type="radio" name="gender" value="male"/> <span >male</span>
                                    <input type="radio" name="gender" value="female"/> <span>female</span>
                                </td>
                            </tr>
                            <tr>
                                <td width="250px" height="100px"><input type="submit"
                                    value="Register" 
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
