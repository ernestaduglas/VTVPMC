package lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import javax.persistence.CascadeType;;


@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String surname;
	@OneToOne
	@JoinColumn(name = "mentor_id")
	private Mentor mentor;
	@ManyToMany
	private Set<Course> courses = new HashSet<Course>();
	@OneToMany (mappedBy = "student", cascade = CascadeType.REMOVE)
	private List<Grade> grades = new ArrayList<Grade>();
	
	
	
	private Student() {
		
	}
	
	public Student(String name, String surname, Mentor mentor,Set<Course> courses, List<Grade> grades) {
		this.name = name;
		this.surname = surname;
		this.mentor = mentor;
		this.courses = courses;
		this.grades = grades;
	}
	
	public Student(String name, String surname, Mentor mentor,Set<Course> courses) {
		this.name = name;
		this.surname = surname;
		this.mentor = mentor;
		this.courses = courses;
	}
	
	public Student(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	
	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}
	

}
