import React, { Component } from 'react';
import axios from 'axios';
import Invoice from './Invoice';

class InvoiceList extends Component {
  constructor(props) {
    super(props);
    this.state = { invoices: [] };

  }

  componentDidMount() {
    axios.get('http://localhost:8080/invoices')
      .then(response => { this.setState({ invoices: response.data }) })
  }


  render() {
    const invoiceList = this.state.invoices.map(invoice => {
      return <Invoice key={invoice.nr} invoice={invoice} />
    })
    return (
      <div>
        <table>
          <thead>
            <tr>
              <th> Invoice No. </th>
              <th> Company Name </th>
              <th> Customer Name </th>
              <th> Date </th>
              <th> Invoice Amount </th>
            </tr>
          </thead>
          <tbody>
            {invoiceList}
          </tbody>
        </table>
      </div>
    )
  }
}
export default InvoiceList;