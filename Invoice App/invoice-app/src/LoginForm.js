import React from 'react';

const LoginForm = ({username, pass, onPassChange, onUsernameChange, onSubmit},context) => {
  return (<form onSubmit={onSubmit}>
  <input type="text" value={username} onChange={onUsernameChange}/><br/>
  <input type="password" value={pass} onChange={onPassChange}/><br/>
  <input type="submit"/>
  </form>);
  };
export default LoginForm;
