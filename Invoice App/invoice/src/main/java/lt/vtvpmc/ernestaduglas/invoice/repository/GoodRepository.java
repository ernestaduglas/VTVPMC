package lt.vtvpmc.ernestaduglas.invoice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.vtvpmc.ernestaduglas.invoice.model.Good;

public interface GoodRepository extends JpaRepository<Good, Long> {

}
