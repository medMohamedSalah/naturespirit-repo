package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;

@Embeddable
public class DetailsId implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id_Member;
	private Integer id_Product;
	private Date date_Of_Purchase;

	public DetailsId() {
		super();
	}

	public DetailsId(Integer id_Member, Integer id_Product) {
		super();
		this.id_Member = id_Member;
		this.id_Product = id_Product;
		this.date_Of_Purchase = new Date();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date_Of_Purchase == null) ? 0 : date_Of_Purchase.hashCode());
		result = prime * result + ((id_Member == null) ? 0 : id_Member.hashCode());
		result = prime * result + ((id_Product == null) ? 0 : id_Product.hashCode());
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
		DetailsId other = (DetailsId) obj;
		if (date_Of_Purchase == null) {
			if (other.date_Of_Purchase != null)
				return false;
		} else if (!date_Of_Purchase.equals(other.date_Of_Purchase))
			return false;
		if (id_Member == null) {
			if (other.id_Member != null)
				return false;
		} else if (!id_Member.equals(other.id_Member))
			return false;
		if (id_Product == null) {
			if (other.id_Product != null)
				return false;
		} else if (!id_Product.equals(other.id_Product))
			return false;
		return true;
	}

	public Integer getId_Member() {
		return id_Member;
	}

	public void setId_Member(Integer id_Member) {
		this.id_Member = id_Member;
	}

	public Integer getId_Product() {
		return id_Product;
	}

	public void setId_Product(Integer id_Product) {
		this.id_Product = id_Product;
	}

	public Date getDate_Of_Purchase() {
		return date_Of_Purchase;
	}

	public void setDate_Of_Purchase(Date date_Of_Purchase) {
		this.date_Of_Purchase = date_Of_Purchase;
	}

}
