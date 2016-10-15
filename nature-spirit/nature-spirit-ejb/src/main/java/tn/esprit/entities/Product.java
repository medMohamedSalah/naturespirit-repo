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
 * Entity implementation class for Entity: Product
 *
 */
@Entity

public class Product implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Product;
	private String Type_Product;
	private Float Price;
	private int Availability;

	@ManyToOne
	private Admin admin;

	@OneToMany(mappedBy = "product")
	private List<Details> details;

	private static final long serialVersionUID = 1L;

	public Product() {
		super();
	}

	public Integer getId_Product() {
		return id_Product;
	}

	public void setId_Product(Integer id_Product) {
		this.id_Product = id_Product;
	}

	public String getType_Product() {
		return this.Type_Product;
	}

	public void setType_Product(String Type_Product) {
		this.Type_Product = Type_Product;
	}

	public Float getPrice() {
		return this.Price;
	}

	public void setPrice(Float Price) {
		this.Price = Price;
	}

	public int getAvailability() {
		return this.Availability;
	}

	public void setAvailability(int Availability) {
		this.Availability = Availability;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public List<Details> getDetails() {
		return details;
	}

	public void setDetails(List<Details> details) {
		this.details = details;
	}

}
