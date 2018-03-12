package lt.vtvpmc.ernestaduglas.spring.DBwithRelations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
