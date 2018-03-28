import React, { Component } from 'react';
import LoginForm from './LoginForm';
import axios from 'axios';

axios.defaults.withCredentials = true; // leidzia dalintis cookies

class LoginFormContainer extends Component {
  constructor(props) {
    super(props);
    this.state = {
        username : '',
        pass: '',
    };
  }

  onUsernameChange = (event) => { this.setState({ username: event.target.value }) }
  onPassChange = (event) => { this.setState({ pass: event.target.value }) }

  onSubmit = (event) => {
    const userData = {
      "username": this.state.username,
      "pass": this.state.pass
  };

    // let userData = new URLSearchParams();
    // userData.append('username', this.state.username);
    // userData.append('password', this.state.pass);
    axios.post('http://localhost:8080/login', userData,)
      .then((response) => { /* login ok */ })
      .catch((e) => { console.log(e); });
    event.preventDefault();
  };
  render() {
    return <LoginForm username={this.state.username} pass={this.state.pass}
      onUsernameChange={this.onUsernameChange}
      onPassChange={this.onPassChange}
      onSubmit={this.onSubmit} />
  }
}

export default LoginFormContainer;
