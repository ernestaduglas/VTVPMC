package lt.vtvpmc.ernestaduglas.trains;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lt.vtvpmc.ernestaduglas.trains.model.PassengerClass;
import lt.vtvpmc.ernestaduglas.trains.model.PassengerVagon;
import lt.vtvpmc.ernestaduglas.trains.model.Train;
import lt.vtvpmc.ernestaduglas.trains.model.Vagon;
import lt.vtvpmc.ernestaduglas.trains.service.TrainService;
import lt.vtvpmc.ernestaduglas.trains.service.TrainServiceImpl;

@Component
public class DataInput implements CommandLineRunner {
	@Autowired
	private TrainService trainService = new TrainServiceImpl();

	@Override
	public void run(String... args) throws Exception {
		Train train = new Train("2006", "Pettreson and Sons", "London");
		trainService.addTrain(train);

	}

}
