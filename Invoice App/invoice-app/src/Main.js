import React from 'react';
import './App.css';
import { Route, Switch } from 'react-router-dom';
import InvoiceList from './InvoiceList';
import InvoiceForm from './InvoiceForm';
import InvoiceEditForm from './InvoiceEditForm';

  const Main = () => (
    <Switch>
      <Route exact path='/' component={InvoiceList}></Route>
      <Route exact path='/newInvoice' component={InvoiceForm}></Route>
      <Route exact path="/edit/:value" name = "/edit/:value"  component={InvoiceEditForm}></Route>
    </Switch>
  );

  export default Main;