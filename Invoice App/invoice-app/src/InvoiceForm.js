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

    handleChangeFor = (propertyName) => (event) => {
        this.setState({ [propertyName]: event.target.value });

    }

    addInvoice = event => {
        event.preventDefault();

        const newInvoice = {
            "companyName": this.state.companyName,
            "customerName": this.state.customerName
        };

        axios.post('http://localhost:8080/invoices', newInvoice).catch(function (error) {
            if (error.response) {
                console.log("please fill all the fields");
        }
            console.log(newInvoice);
        });
    }

    render() {
        return (
            <div>
                <div>
                    <form>
                        <p>Company name: </p>
                        <input type="text" name="companyName" onChange={this.handleChangeFor("companyName")} value={this.state.companyName} />
                        <p>Customer name: </p>
                        <input type="text" name="customerName" onChange={this.handleChangeFor("customerName")} value={this.state.customerName} />
                        <br />
                        <button onClick={this.addInvoice}>Add new Invoice</button>
                    </form>
                </div>
            </div>

        )
    }
}
export default InvoiceForm;
