package lt.vtvpmc.ernestaduglas.spring.DBwithRelations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model.Course;
import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model.Grade;
import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model.Mentor;
import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model.Student;
import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.repository.CourseRepository;
import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.repository.GradeRepository;
import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.repository.MentorRepository;
import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.repository.StudentRepository;

@Service
public class EducationSystemServiceImpl implements EducationSystemService {
	private StudentRepository studentRepo;
	private MentorRepository mentorRepo;
	private CourseRepository courseRepo;
	private GradeRepository gradeRepo;
	
	@Autowired
	public EducationSystemServiceImpl(StudentRepository studentRepo, 
			MentorRepository mentorRepo, CourseRepository courseRepo, GradeRepository gradeRepo) {
		this.studentRepo = studentRepo;
		this.mentorRepo = mentorRepo;
		this.courseRepo = courseRepo;
		this.gradeRepo = gradeRepo;
	}
	
	@Transactional
	@Override
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}
	
	@Transactional
	@Override
	public void addStudnet(Student student) {
		studentRepo.save(student);
	}
	
	@Transactional
	@Override
	public void deleteStudentById(Long id) {
		studentRepo.deleteById(id);
	}
	
	@Transactional
	@Override
	public List<Mentor> getAllMentors(){
		return mentorRepo.findAll();
	}
	
	@Transactional
	@Override
	public void addMentor(Mentor mentor) {
		mentorRepo.save(mentor);
	}
	
	@Transactional
	@Override
	public List<Course> getAllCourses(){
		return courseRepo.findAll();
	}
	@Transactional
	@Override
	public void addCourse(Course course) {
		courseRepo.save(course);
	}
	
	@Transactional
	@Override
	public void deleteCourseById(Long id) {
		courseRepo.deleteById(id);
	}
	
	@Transactional
	@Override
	public List<Grade> getAllGrades(){
		return gradeRepo.findAll();
	}
	
	@Transactional
	@Override
	public void addGrade(Grade grade) {
		gradeRepo.save(grade);
	}
	
	@Transactional
	@Override
	public void deleteGrade(Grade grade) {
		gradeRepo.delete(grade);
	}
	

}
