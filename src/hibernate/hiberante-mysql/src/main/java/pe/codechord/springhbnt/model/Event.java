package pe.codechord.springhbnt.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Survey.Event")
public class Event implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5274992200602985168L;

	@Id
	@Column(name="id")
	@GeneratedValue
	private Long id;

	@Column(name="title")
    private String title;
	
	@Column(name="event_date")
    private Timestamp date;

    public Event() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
