package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Mission_SailorId implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id_Member;
	private Integer id_SeaMission;
	private Date start_Date;
	private Date end_Date;

	public Mission_SailorId() {
		super();
	}

	public Mission_SailorId(Integer id_Member, Integer id_SeaMission) {
		super();
		this.id_Member = id_Member;
		this.id_SeaMission = id_SeaMission;
		this.start_Date = new Date();
		this.end_Date = new Date();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_Member == null) ? 0 : id_Member.hashCode());
		result = prime * result + ((id_SeaMission == null) ? 0 : id_SeaMission.hashCode());
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
		Mission_SailorId other = (Mission_SailorId) obj;
		if (id_Member == null) {
			if (other.id_Member != null)
				return false;
		} else if (!id_Member.equals(other.id_Member))
			return false;
		if (id_SeaMission == null) {
			if (other.id_SeaMission != null)
				return false;
		} else if (!id_SeaMission.equals(other.id_SeaMission))
			return false;
		return true;
	}

	public Integer getId_Member() {
		return id_Member;
	}

	public void setId_Member(Integer id_Member) {
		this.id_Member = id_Member;
	}

	public Integer getId_SeaMission() {
		return id_SeaMission;
	}

	public void setId_SeaMission(Integer id_SeaMission) {
		this.id_SeaMission = id_SeaMission;
	}

	public Date getStart_Date(){
		return start_Date;
	}

	public void setStart_Date(Date start_Date){
		this.start_Date=start_Date;
	}

    public Date getEnd_Date(){
		return end_Date;
	}

	public void setEnd_Date(Date end_Date){
		this.end_Datee=end_Date;
	}


}
