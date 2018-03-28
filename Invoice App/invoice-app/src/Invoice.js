import React, { Component } from 'react';
import axios from 'axios';
import { NavLink} from 'react-router-dom';

class Invoice extends Component {
  constructor(props) {
    super(props);
    this.state = { display: true };

  }

  
  deleteInvoice = (invoiceNr) => {
    axios.delete('http://localhost:8080/api/invoices/' + invoiceNr).then(console.log('istrinta'))
    this.setState({ display: false })
  }


  render() {
    if (this.state.display === false) {
      return (
        <tr></tr>
      )
    }
    else {

      return (
        <tr>
          <td>{this.props.invoice.nr}</td>
          <td>{this.props.invoice.companyName}</td>
          <td>{this.props.invoice.customerName}</td>
          <td>{this.props.invoice.date}</td>
          <td>{this.props.invoice.invoiceAmount}<span> Eur</span></td>
          <td className = "button"><button><NavLink to={'/edit/'+this.props.invoice.nr}>Edit</NavLink></button></td>
          <td className = "button"><button onClick={() => this.deleteInvoice(this.props.invoice.nr)}>Delete</button></td>
        </tr>
      );
    }
  }
}
export default Invoice;