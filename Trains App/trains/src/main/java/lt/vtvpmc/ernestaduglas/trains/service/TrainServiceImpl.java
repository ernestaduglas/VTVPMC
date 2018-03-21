package lt.vtvpmc.ernestaduglas.trains.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ernestaduglas.trains.model.Train;
import lt.vtvpmc.ernestaduglas.trains.model.Vagon;
import lt.vtvpmc.ernestaduglas.trains.repository.TrainRepository;
import lt.vtvpmc.ernestaduglas.trains.repository.VagonRepository;

@Service
public class TrainServiceImpl implements TrainService {
	@Autowired
	private TrainRepository trainRepo;
	@Autowired 
	private VagonRepository vagonRepo;

	@Transactional
	@Override
	public void addTrain(Train train) {
			trainRepo.save(train);
		}

	@Transactional
	@Override
	public void addVagonToTrain(Long trainNr, Vagon vagon) { //papildyti del count
		vagon.setTrain(trainRepo.findById(trainNr).get());
		vagonRepo.save(vagon);

	}

	@Transactional
	@Override
	public void deleteVagonFromTrain(Long trainNr, Long vagonNr) {
		vagonRepo.delete(vagonRepo.findById(vagonNr).get());
	}

	@Transactional
	@Override
	public List<Train> getAllTrains() {
		return trainRepo.findAll();
	}

	@Transactional
	@Override
	public void deleteTrain(Long id) {
		trainRepo.deleteById(id);

	}

}
