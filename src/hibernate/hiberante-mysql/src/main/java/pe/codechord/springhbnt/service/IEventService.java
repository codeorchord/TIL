package pe.codechord.springhbnt.service;

import java.util.List;

import pe.codechord.springhbnt.model.Event;

public interface IEventService {
	public void addEvent(Event event);
	public List<Event> listEvent();
}
