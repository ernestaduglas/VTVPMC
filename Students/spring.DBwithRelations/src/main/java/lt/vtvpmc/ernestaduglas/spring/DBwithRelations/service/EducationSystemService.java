package lt.vtvpmc.ernestaduglas.spring.DBwithRelations.service;

import java.util.List;

import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model.Course;
import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model.Grade;
import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model.Mentor;
import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model.Student;

public interface EducationSystemService {
	
	List<Student> getAllStudents();
	void addStudnet(Student student);
	void deleteStudentById(Long id);
	
	List<Mentor> getAllMentors();
	void addMentor(Mentor mentor);
	
	List<Course> getAllCourses();
	void addCourse(Course course);
	void deleteCourseById(Long id);
	
	List<Grade> getAllGrades();
	void addGrade(Grade grade);
	void deleteGrade(Grade grade);
	

}
