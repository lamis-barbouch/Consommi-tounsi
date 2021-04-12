package tn.esprit.spring.services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Event;
import tn.esprit.spring.entity.Fund;
import tn.esprit.spring.repository.EventRepository;
import tn.esprit.spring.repository.FundRepository;

@Service
public class EventService implements IEventService {
	@Autowired
	EventRepository eventrep;
	
	@Autowired
	FundRepository fundrep;

	@Override
	public void addEvent(Event event) {
		
		Fund f=new Fund();
		f.setAmount(0);
		event.setFund(f);
		eventrep.save(event);
		fundrep.save(f);

	}

	@Override
	public List<Event> eventsLists() {
		//List<Event> eventLists = new List<Event>();
		
		//return (List<Event>) eventrep.findAll();
		return null;
	}

	@Override
	public void updateEvent(Event ev) {
		eventrep.save(ev);
		
	}

	@Override
	public void deleteEvent(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Event findbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Event findEventByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> filterEvent(double cost_event) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> upcomingEvents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> passedEvents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void refundUsers(int eid) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	//public Map<Long, Integer> bestEventsByViews() {
		// TODO Auto-generated method stub
		//return null;
	//}

	@Override
	public List<String> displayBestEventsByViews() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> displayBestEventsByParticipations() {
		// TODO Auto-generated method stub
		return null;
	}

}
