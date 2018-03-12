package lt.vtvpmc.ernestaduglas.spring.DBwithRelations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model.Course;

public interface CourseRepository extends JpaRepository<Course,Long>{

}
