package tn.esprit.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Event
 *
 */
@Entity

public class Event implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Event;
	private String Subject_Event;
	private String Description_Event;

	@ManyToOne
	private Admin admin;

	@OneToMany(mappedBy = "event")
	private List<Agenda> agendas;

	private static final long serialVersionUID = 1L;

	public Event() {
		super();
	}

	public Integer getId_Event() {
		return id_Event;
	}

	public void setId_Event(Integer id_Event) {
		this.id_Event = id_Event;
	}

	public String getSubject_Event() {
		return this.Subject_Event;
	}

	public void setSubject_Event(String Subject_Event) {
		this.Subject_Event = Subject_Event;
	}

	public String getDescription_Event() {
		return this.Description_Event;
	}

	public void setDescription_Event(String Description_Event) {
		this.Description_Event = Description_Event;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public List<Agenda> getAgendas() {
		return agendas;
	}

	public void setAgendas(List<Agenda> agendas) {
		this.agendas = agendas;
	}

}
