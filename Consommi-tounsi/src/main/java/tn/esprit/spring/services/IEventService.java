package tn.esprit.spring.services;

import java.util.List;
import java.util.Map;

import tn.esprit.spring.entity.Event;

public interface IEventService {
	
	public void addEvent(Event event);//by admin
	public List<Event> eventsLists();//by admin and client
	public void updateEvent(Event ev);//by admin
	public void deleteEvent(int id) ;//by admin
	public Event findbyId(int id);//by admin and client
	public Event findEventByName(String name);//by admin and client
	public List<Event> filterEvent(double cost_event);//by admin and client
	public List<Event> upcomingEvents();//by admin and client
	public List<Event> passedEvents();//by admin and client
	public void refundUsers(int eid);//by admin
	//public Map<Long, Integer> bestEventsByViews();//by admin and client
	public List<String> displayBestEventsByViews();//by admin and client
	public List<String> displayBestEventsByParticipations();//by admin and client
}
