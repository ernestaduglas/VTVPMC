package lt.itakademija.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lt.itakademija.model.EventRegistration;
import lt.itakademija.model.RegisteredEvent;
import lt.itakademija.model.RegisteredEventUpdate;

/**
 * In-memory security events repository. Internally, it uses
 * {@link SequenceNumberGenerator} and {@link DateProvider}.
 *
 * Created by mariusg on 2016.12.19.
 */
@Repository
public final class InMemorySecurityEventsRepository implements SecurityEventsRepository {
	@Autowired
	private final SequenceNumberGenerator sequenceGenerator;
	@Autowired
	private final DateProvider dateProvider;
	private List<RegisteredEvent> eventsList;

	public InMemorySecurityEventsRepository(SequenceNumberGenerator sequenceGenerator, DateProvider dateProvider) {
		this.sequenceGenerator = sequenceGenerator;
		this.dateProvider = dateProvider;
		this.eventsList = new ArrayList<RegisteredEvent>();
	}

	/*
	 * Notes for implementation:
	 * 
	 * This method must use SequenceNumberGenerator#getNext() for generating ID;
	 * This method must use DateProvider#getCurrentDate() for getting dates;
	 */
	@Override
    public RegisteredEvent create(EventRegistration eventRegistration) {
    	RegisteredEvent newEvent = new RegisteredEvent(sequenceGenerator.getNext(), 
    			dateProvider.getCurrentDate(),
    			eventRegistration.getSeverityLevel(),
    			eventRegistration.getLocation(),
    			eventRegistration.getDescription());
    	this.eventsList.add(newEvent);
        return newEvent;
    }

	@Override
	public List<RegisteredEvent> getEvents() {
		return this.eventsList;
	}

	@Override
	public RegisteredEvent delete(Long id) {
		RegisteredEvent deletedEvent=null;
		for(RegisteredEvent event: this.eventsList) {
			if(event.getId()==id) {
				deletedEvent =event;
			}
		}
		this.eventsList.remove(deletedEvent);
		return deletedEvent;
	}

	@Override
	public RegisteredEvent update(Long id, RegisteredEventUpdate registeredEventUpdate) {
		RegisteredEvent updatedEvent = null;
		RegisteredEvent oldEvent = null;
		for(RegisteredEvent event: this.eventsList) {
			if(event.getId()==id) {
				updatedEvent = new RegisteredEvent(id, 
		    			event.getRegistrationDate(),
		    			registeredEventUpdate.getSeverityLevel(),
		    			event.getLocation(),
		    			event.getDescription());
				oldEvent = event;
				
			}
		}
		this.eventsList.remove(oldEvent);
		this.eventsList.add(updatedEvent);
		return updatedEvent;
	}

}
