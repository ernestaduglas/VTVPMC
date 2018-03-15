import React, { Component } from 'react';
import axios from 'axios';

class InvoiceForm extends Component {
    constructor(props) {
        super(props);
        this.state = {
            companyName: '',
            customerName: '',
        };

    }

    handleCompanyNameChange = event => {
        this.setState({ companyName: event.target.value });
    }

    handleCustomerNameChange = event => {
        this.setState({ customerName: event.target.value });
    }

    
    addInvoice = event => {
        event.preventDefault();

        const newInvoice = {
            "companyName": this.state.companyName,
            "customerName": this.state.customerName
        };

        axios.post('http://localhost:8080/invoices', newInvoice).then(console.log('prideta'));
        console.log(newInvoice);
    }

    render() {
        return (
            <div>
            <div>
                <form>
                    <p>Company name: </p>
                    <input type="text" name="companyName" onChange={this.handleCompanyNameChange} />
                    <p>Customer name: </p>
                    <input type="text" name="customerName" onChange={this.handleCustomerNameChange} />
                    <br/>
                    <button onClick={this.addInvoice}>Add new Invoice</button>
                </form>
            </div>
            </div>
            
        )
    }
}
export default InvoiceForm;
