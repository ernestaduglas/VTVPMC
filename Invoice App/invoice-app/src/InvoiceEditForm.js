import React, { Component } from 'react';
import axios from 'axios';
//import Invoice from './Invoice';

class InvoiceEditForm extends Component {
    constructor(props) {
        super(props);
        this.state = {
            name: '',
            unit: 0,
            price: 0,
            unitType: '',
        }
    };


    handleGoodNameChange = event => {
        this.setState({name: event.target.value});
    }
    handleGoodUnitChange = event => {
        this.setState({unit: event.target.value});
    }
    handleGoodPriceChange = event => {
        this.setState({price: event.target.value});
    }
    handleGoodUnitTypeChange = event => {
        this.setState({unitType: event.target.value});
    }

    addGood = event => {
        event.preventDefault();

        const newGood = {
            "name": this.state.name,
            "unit": this.state.unit,
            "price": this.state.price,
            "unitType": this.state.unitType
        };

        axios.put('http://localhost:8080/invoices/'+ this.props.match.params.value, newGood).then(console.log('prideta'));
        console.log(newGood);
    }

render() {
    
    return (
        <div>
            <h3>Add Good</h3>
            <form>
                <p>Name: </p>
                <input type="text" name="name" onChange={this.handleGoodNameChange} />
                <p>Unit: </p>
                <input type="text" name="unit" onChange={this.handleGoodUnitChange} />
                <p>Unit type: </p>
                <input type="text" name="unitType" onChange={this.handleGoodUnitTypeChange} />
                <p>Price per unit: </p>
                <input type="text" name="price" onChange={this.handleGoodPriceChange} />
                <br />
                <button onClick={this.addGood}>Add Good</button>
            </form>
        </div>

    )
}
}

export default InvoiceEditForm;