package lt.vtvpmc.ernestaduglas.spring.DBwithRelations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model.Student;
import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.service.EducationSystemService;

@CrossOrigin
@RestController
@RequestMapping(value = "api/students")
public class StudentController {
	private EducationSystemService service;

	@Autowired
	public StudentController(EducationSystemService service) {
		this.service = service;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addStudent(@RequestBody Student student) {
		service.addStudnet(student);
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public void deleteStudentById(@PathVariable Long id) {
		service.deleteStudentById(id);
	}
	
	

}
