package lt.vtvpmc.ernestaduglas.spring.DBwithRelations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model.Mentor;
import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.service.EducationSystemService;

@RestController
@RequestMapping(value = "api/mentors")
public class MentorController {
	private EducationSystemService service;

	@Autowired
	public MentorController(EducationSystemService service) {
		this.service = service;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Mentor> getAllMentors(){
		return service.getAllMentors();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addMentor(@RequestBody Mentor mentor) {
		service.addMentor(mentor);
	}
	
	

}
