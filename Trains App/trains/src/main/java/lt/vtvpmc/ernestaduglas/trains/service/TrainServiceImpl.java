package lt.vtvpmc.ernestaduglas.trains.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lt.vtvpmc.ernestaduglas.trains.model.CargoVagon;
import lt.vtvpmc.ernestaduglas.trains.model.Locomotive;
import lt.vtvpmc.ernestaduglas.trains.model.PassengerVagon;
import lt.vtvpmc.ernestaduglas.trains.model.Train;
import lt.vtvpmc.ernestaduglas.trains.model.VagonCreate;
import lt.vtvpmc.ernestaduglas.trains.model.VagonType;
import lt.vtvpmc.ernestaduglas.trains.repository.TrainRepository;
import lt.vtvpmc.ernestaduglas.trains.repository.VagonRepository;

@Service
public class TrainServiceImpl implements TrainService {
	@Autowired
	private TrainRepository trainRepo;
	@Autowired
	private VagonRepository vagonRepo;

	private static Logger logger = LogManager.getLogger(TrainServiceImpl.class);

	@Transactional
	@Override
	public void addTrain(Train train) {
		trainRepo.save(train);
		logger.info("Train No. " + train.getNr() + " added");
	}

	@Transactional
	@Override
	public void addVagonToTrain(Long trainNr, VagonCreate vagon) {
		VagonType vagonType =vagon.getVagonType();
		switch (vagonType) {
		case CARGO:
			CargoVagon cargo = new CargoVagon();
			cargo.setCompany(vagon.getCompany());
			cargo.setCount(vagon.getCount());
			cargo.setPrice(vagon.getPrice());
			cargo.setCapacity(vagon.getCapacity());
			cargo.setMaxWeight(vagon.getMaxWeight());
			cargo.setTrain(trainRepo.findById(trainNr).get());
			vagonRepo.save(cargo);
			break;
		case PASSENGER:
			PassengerVagon passenger = new PassengerVagon();
			passenger.setCompany(vagon.getCompany());
			passenger.setCount(vagon.getCount());
			passenger.setPrice(vagon.getPrice());
			passenger.setCapacity(vagon.getCapacity());
			passenger.setPassangerClass(vagon.getPassangerClass());
			passenger.setTrain(trainRepo.findById(trainNr).get());
			vagonRepo.save(passenger);
			break;
		case LOCOMOTIVE:
			Locomotive locomotive = new Locomotive();
			locomotive.setCompany(vagon.getCompany());
			locomotive.setCount(vagon.getCount());
			locomotive.setPrice(vagon.getPrice());
			locomotive.setCapacity(vagon.getCapacity());
			locomotive.setType(vagon.getType());
			locomotive.setTrain(trainRepo.findById(trainNr).get());
			vagonRepo.save(locomotive);
			break;
			default:
				logger.error("Unable to create vagon, vagon type not found");
		}

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
