package pe.codechord.springhbnt.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.codechord.springhbnt.dao.IEventDAO;
import pe.codechord.springhbnt.model.Event;

@Transactional
@Service
public class EventService implements IEventService {
	
	@Autowired
	private IEventDAO eventDAO;

	@Override
	public void addEvent(Event event) {
		eventDAO.addEvent(event);
	}

	@Override
	public List<Event> listEvent() {
		return eventDAO.listEvent();
	}

}
