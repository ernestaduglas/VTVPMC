package lt.vtvpmc.ernestaduglas.spring.DBwithRelations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model.Course;
import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.service.EducationSystemService;

@RestController
@RequestMapping(value = "api/courses")
public class CourseController {
	private EducationSystemService service;

	@Autowired
	public CourseController(EducationSystemService service) {
		this.service = service;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Course> getAllCourses(){
		return service.getAllCourses();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addCourse(@RequestBody Course course) {
		service.addCourse(course);
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public void deleteCourseById(@PathVariable Long id) {
		service.deleteCourseById(id);
	}
	
	
	

}
