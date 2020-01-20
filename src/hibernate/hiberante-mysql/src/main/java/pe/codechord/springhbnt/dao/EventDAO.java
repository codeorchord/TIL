package pe.codechord.springhbnt.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import pe.codechord.springhbnt.model.Event;

@Repository
@EnableTransactionManagement
public class EventDAO implements IEventDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void addEvent(Event event) {
		this.sessionFactory.getCurrentSession().save(event);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Event> listEvent() {
		return this.sessionFactory.getCurrentSession().createQuery("FROM Event e ORDER BY id").list();
	}

}
