package lt.itakademija.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lt.itakademija.model.EventRegistration;
import lt.itakademija.model.RegisteredEvent;
import lt.itakademija.model.RegisteredEventUpdate;
import lt.itakademija.repository.SecurityEventsRepository;

@RestController
@RequestMapping(value = "webapi/events")
@Api(value = "events")
public class SecurityServiceController {
	@Autowired
	private final SecurityEventsRepository repository;

	public SecurityServiceController(final SecurityEventsRepository repository) {
		this.repository = repository;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Get registered events", notes = "Returns list of registered events")
	public List<RegisteredEvent> getRegisteredEvents() {
		return repository.getEvents();
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ApiOperation(value = "Add new registered event", notes = "Creates new registered event")
	public RegisteredEvent createEvent(@ApiParam(value = "Registration data", required = true) @RequestBody @Valid EventRegistration registrationData) {
		return repository.create(registrationData);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Delete event", notes = "Deletes event by Id")
	public RegisteredEvent deleteEvent(@ApiParam(value = "Id", required = true)@PathVariable Long id) {
		return repository.delete(id);
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	@ApiOperation(value = "Update registered event", notes = "Updates registered event")
	public RegisteredEvent updateEvent(@ApiParam(value = "id", required = true)@PathVariable Long id, @ApiParam(value = "Update data", required = true) @RequestBody @Valid RegisteredEventUpdate updateData) {
		return repository.update(id, updateData);
	}

}
