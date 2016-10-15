package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Details
 *
 */
@Entity

public class Details implements Serializable {

	@EmbeddedId
	private DetailsId detailsId;
	private Integer Quantity;
	private Boolean state; // true -> Member Has Paied  / false -> Member Has not Paied yet

	@ManyToOne
	@JoinColumn(name = "id_Member", referencedColumnName = "id", updatable = false, insertable = false)
	private Member member;

	@ManyToOne
	@JoinColumn(name = "id_Product", referencedColumnName = "id", updatable = false, insertable = false)
	private Product product;

	private static final long serialVersionUID = 1L;

	public Details() {
		super();
	}

    public Details(Integer Quantity,Member member,Product product) {
		super();
		this.Quantity=Quantity;
		this.member=member;
		this.product=product;
		this.state=false; //false -> Member Has not Paied yet
		this.detailsId=new DetailsId(member.getId_Member(),product.getId_Product());
	}

	public Integer getQuantity() {
		return this.Quantity;
	}

	public void setQuantity(Integer Quantity) {
		this.Quantity = Quantity;
	}

	public Boolean getState() {
		return state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	public DetailsId getDetailsId() {
		return detailsId;
	}

	public void setDetailsId(DetailsId detailsId) {
		this.detailsId = detailsId;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
