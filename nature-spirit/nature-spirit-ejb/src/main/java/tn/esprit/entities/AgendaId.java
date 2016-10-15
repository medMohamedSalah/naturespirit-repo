package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class AgendaId implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id_Member;
	private Integer id_Event;
    private Date date_Event;

	public AgendaId() {
		super();
	}

	public AgendaId(Integer id_Member, Integer id_Event) {
		super();
		this.id_Member = id_Member;
		this.id_Event = id_Event;
		this.date_Event=new Date();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_Event == null) ? 0 : id_Event.hashCode());
		result = prime * result + ((id_Member == null) ? 0 : id_Member.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AgendaId other = (AgendaId) obj;
		if (id_Event == null) {
			if (other.id_Event != null)
				return false;
		} else if (!id_Event.equals(other.id_Event))
			return false;
		if (id_Member == null) {
			if (other.id_Member != null)
				return false;
		} else if (!id_Member.equals(other.id_Member))
			return false;
		return true;
	}

	public Integer getId_Member() {
		return id_Member;
	}

	public void setId_Member(Integer id_Member) {
		this.id_Member = id_Member;
	}

	public Integer getId_Event() {
		return id_Event;
	}

	public void setId_Event(Integer id_Event) {
		this.id_Event = id_Event;
	}

    public Date getDate_Event() {
		return this.date_Event;
	}

	public void setDate_Event(Date date_Event) {
		this.date_Event = date_Event;
	}
}
