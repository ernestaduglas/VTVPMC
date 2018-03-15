import React, { Component } from 'react';

class Good extends Component{
  constructor(props){
  super(props);
  this.state = {display: true};

}

render(){
  return(
  <tr>
  <td>{this.props.good.name}</td>
  <td>{this.props.good.unit}<span> {this.props.good.unitType}</span></td>
  <td>{this.props.good.totalPrice}<span> eur</span></td>
  <td><button>Delete</button></td>
  </tr>
  );
}
}
export default Good;
