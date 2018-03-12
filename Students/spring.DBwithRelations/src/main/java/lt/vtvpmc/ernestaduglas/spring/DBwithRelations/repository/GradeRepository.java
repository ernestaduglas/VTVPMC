package lt.vtvpmc.ernestaduglas.spring.DBwithRelations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.vtvpmc.ernestaduglas.spring.DBwithRelations.model.Grade;

public interface GradeRepository extends JpaRepository<Grade, Long> {

}
