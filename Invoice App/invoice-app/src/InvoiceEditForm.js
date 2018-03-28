import React, { Component } from 'react';
import axios from 'axios';
//import Invoice from './Invoice';

class InvoiceEditForm extends Component {
    constructor(props) {
        super(props);
        this.state = {
            name: '',
            amount: 0,
            price: 0,
            unitType: '',
        }
    };

    componentDidMount(){
        console.log(this.props);
    }

    handleChangeFor = (propertyName) => (event) =>{
        this.setState({[propertyName]: event.target.value});
    }

    addGood = event => {
        event.preventDefault();

        const newGood = {
            "name": this.state.name,
            "amount": this.state.amount,
            "price": this.state.price,
            "unitType": this.state.unitType
        };

        axios.put('http://localhost:8080/api/invoices/edit/'+ this.props.match.params.value, newGood).then(console.log('prideta'));
        console.log(newGood);
    }

render() {
    
    return (
        <div>
            <h3>Add Good</h3>
            <form>
                <p>Name: </p>
                <input type="text" name="name" onChange={this.handleChangeFor("name")} value= {this.state.name} />
                <p>Amount: </p>
                <input type="text" name="unit" onChange={this.handleChangeFor("amount")} value = {this.state.amount} />
                <p>Unit type: </p>
                <input type="text" name="unitType" onChange={this.handleChangeFor("unitType")} value = {this.state.unitType} />
                <p>Price per unit: </p>
                <input type="text" name="price" onChange={this.handleChangeFor("price")} value = {this.state.price} />
                <br />
                <button onClick={this.addGood}>Add Good</button>
            </form>
        </div>

    )
}
}

export default InvoiceEditForm;