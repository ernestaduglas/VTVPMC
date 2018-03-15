import React, { Component } from 'react';
import axios from 'axios';
import Good from './Good';

class GoodsList extends Component{
    constructor(props){
    super(props);
    this.state = {goods:[]};
  
  }
  
  
  render(){
    const goodsList = this.state.goods.map(good=>{
      return <Good key={good.id} good = {good}/>
    })
    return<table>
      <thead>
        <tr>
        <th> Name </th>
        <th> Number of units </th>
        <th> Total price </th>
        </tr>
        </thead>
        <tbody>
          {goodsList}
          </tbody>
          </table>
  }
  }
  export default GoodsList;