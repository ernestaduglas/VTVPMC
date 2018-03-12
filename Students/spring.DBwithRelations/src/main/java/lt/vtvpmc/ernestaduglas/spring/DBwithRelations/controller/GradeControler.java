package lt.vtvpmc.ernestaduglas.spring.DBwithRelations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model.Grade;
import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.service.EducationSystemService;

@RestController
@RequestMapping(value = "api/grades")
public class GradeControler {
	private EducationSystemService service;

	@Autowired
	public GradeControler(EducationSystemService service) {
		this.service = service;
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Grade> getAllGrades(){
		return service.getAllGrades();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void addGrade(@RequestBody Grade grade) {
		service.addGrade(grade);
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void deleteGrade(@RequestBody Grade grade) {
		service.deleteGrade(grade);
	}

}
