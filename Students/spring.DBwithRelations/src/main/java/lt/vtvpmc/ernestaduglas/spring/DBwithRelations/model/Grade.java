package lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Grade {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	@OneToOne 
	private Course course;
	private int grade;
	@ManyToOne
	private Student student;
	
	public Grade() {
		
	}
	
	
	public Grade(Course course, int grade, Student student) {
		this.course = course;
		this.grade = grade;
		this.student = student;
	}

	@JsonIgnore
	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	
	

}
