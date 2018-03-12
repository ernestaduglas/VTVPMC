import React, { Component } from 'react';

class StudentListElement extends Component{
  constructor(props){
  super(props);
  this.state = {display: true};

}

render(){
  return(
  <tr>
  <td>{this.props.student.name}</td>
  <td>{this.props.student.surname}</td>
  </tr>
  );
}
}
export default StudentListElement;
