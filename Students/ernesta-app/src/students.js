import React, { Component } from 'react';
import axios from 'axios';
import StudentListElement from './StudentListElement';

class StudentList extends Component{
  constructor(props){
  super(props);
  this.state = {students:[]};

}

componentDidMount(){
  axios.get('http://localhost:8080/api/students')
  .then(response=>{this.setState({students:response.data})})
}

render(){
  const studentList = this.state.students.map(student=>{
    return <StudentListElement key={student.id} student = {student}/>
  })
  return<table>
    <thead>
      <tr>
      <th> Name </th>
      <th> Surname </th>
      </tr>
      </thead>
      <tbody>
        {studentList}
        </tbody>
        </table>
}
}
export default StudentList;
