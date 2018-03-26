package lt.vtvpmc.ernestaduglas.trains.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import lt.vtvpmc.ernestaduglas.trains.model.Train;
import lt.vtvpmc.ernestaduglas.trains.model.VagonCreate;
import lt.vtvpmc.ernestaduglas.trains.service.TrainService;
import lt.vtvpmc.ernestaduglas.trains.service.TrainServiceImpl;

@RestController
@RequestMapping(value = "api/trains")
@Api("train")
public class TrainController {
	@Autowired
	private TrainService trainService = new TrainServiceImpl();
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Train> getAllTrains(){
		return trainService.getAllTrains();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void addTrain(@RequestBody @ApiParam Train train) {
		trainService.addTrain(train);
	}
	
	@RequestMapping(path= "/{id}", method = RequestMethod.DELETE)
	public void deleteTrain(@PathVariable @ApiParam Long id) {
		trainService.deleteTrain(id);

	}
	
	@RequestMapping(path= "/{trainNr}", method = RequestMethod.PUT)
	public void addVagonToTrain(@PathVariable @ApiParam Long trainNr, @RequestBody @ApiParam VagonCreate vagon) {
		trainService.addVagonToTrain(trainNr, vagon);

	}

	 @RequestMapping(path= "/{trainNr}/{vagonNr}", method = RequestMethod.PUT)
	 public void deleteVagonFromTrain(@PathVariable @ApiParam Long trainNr, @PathVariable @ApiParam Long vagonNr) {
	 trainService.deleteVagonFromTrain(trainNr, vagonNr);
	
	 }


}
