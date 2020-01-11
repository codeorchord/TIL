package pe.codechord.springhbnt.dao;

import java.util.List;

import pe.codechord.springhbnt.model.Event;

public interface IEventDAO {
	public void addEvent(Event event);
	public List<Event> listEvent();
}
