package lt.vtvpmc.ernestaduglas.trains.service;

import java.util.List;

import lt.vtvpmc.ernestaduglas.trains.model.Train;
import lt.vtvpmc.ernestaduglas.trains.model.VagonCreate;

public interface TrainService {
	
	void addTrain(Train train);
	void addVagonToTrain(Long trainNr, VagonCreate vagon);
	void deleteVagonFromTrain(Long trainNr, Long vagonNr);
	List<Train> getAllTrains();
	void deleteTrain(Long id);
	

}
