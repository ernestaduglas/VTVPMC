package lt.vtvpmc.ernestaduglas.spring.DBwithRelations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model.Course;
import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model.Grade;
import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model.Mentor;
import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model.Student;
import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.service.EducationSystemService;

@Component
public class DataInput implements CommandLineRunner {
	private EducationSystemService service;
	
	
	@Autowired
	public DataInput(EducationSystemService service) {
		this.service = service;
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Creating mentors
		Mentor mary = new Mentor("Mary", "Hopkins");
		Mentor jane = new Mentor("Jane", "Adams");
		service.addMentor(mary);
		service.addMentor(jane);
		
// 		Creating courses
		Course math = new Course("Mathematics", "Learning to calculate");
		Course lit = new Course("Literature", "Modern English literature");
		service.addCourse(math);
		service.addCourse(lit);
		
		Set<Course> basics = new HashSet<Course>();
		basics.add(math);
		basics.add(lit);
		
//		Creating students
		Student john = new Student("John", "Petterson", mary, basics);
		Student paul = new Student("Paul", "Kevins", jane, basics); 
		
		service.addStudnet(john);
		service.addStudnet(paul);
	
		
//		Creating grades
		Grade grade1 = new Grade(math, 7, john);
		Grade grade2 = new Grade(lit, 10, john);
		Grade grade3 = new Grade(lit, 9, paul);
		
		service.addGrade(grade1);
		service.addGrade(grade2);
		service.addGrade(grade3);	

	}

}
