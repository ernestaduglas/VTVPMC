import React from 'react';
import './App.css';
import { NavLink} from 'react-router-dom';

const Navigation = () => (
    <nav>
      <ul>
        <li><NavLink to='/'>Home</NavLink></li>
        <li><NavLink to='/newinvoice'>Create new Invoice</NavLink></li>
        <li><NavLink to='/login'>Login</NavLink></li>
      </ul>
    </nav>
  );

  export default Navigation;
  