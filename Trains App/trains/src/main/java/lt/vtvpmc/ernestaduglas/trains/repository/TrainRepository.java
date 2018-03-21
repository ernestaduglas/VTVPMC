package lt.vtvpmc.ernestaduglas.trains.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lt.vtvpmc.ernestaduglas.trains.model.Train;

public interface TrainRepository extends JpaRepository<Train, Long> {

}
