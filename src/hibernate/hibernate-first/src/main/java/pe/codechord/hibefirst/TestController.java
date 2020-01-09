package pe.codechord.hibefirst;

import java.sql.Date;
import java.util.Locale;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pe.codechord.hibefirst.domain.Event;
import pe.codechord.hibefirst.util.HibernateUtil;

/**
 * Handles requests for the application home page.
 */
@Controller
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Insert", locale);
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Event theEvent = new Event();
        theEvent.setTitle("The Event");
        theEvent.setDate(new Date(System.currentTimeMillis()));
        session.save(theEvent);

        session.getTransaction().commit();

        HibernateUtil.getSessionFactory().close();
        
		return "insert";
	}
	
}
