package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Agenda
 *
 */
@Entity
public class Agenda implements Serializable {

	@EmbeddedId
	private AgendaId agendaId;
	

	@ManyToOne
	@JoinColumn(name = "id_Member", referencedColumnName = "id", updatable = false, insertable = false)
	private Member member;
	@ManyToOne
	@JoinColumn(name = "id_Event", referencedColumnName = "id", updatable = false, insertable = false)
	private Event event;

	private static final long serialVersionUID = 1L;

	public Agenda() {
		super();
	}

    public Agenda(Member member,Event event) {
		super();
		this.member=member;
		this.event=event;
		this.agendaId=new AgendaId(member.getId_Member(),event.getId_Event());

	}


	public AgendaId getAgendaId() {
		return agendaId;
	}

	public void setAgendaId(AgendaId agendaId) {
		this.agendaId = agendaId;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

}
