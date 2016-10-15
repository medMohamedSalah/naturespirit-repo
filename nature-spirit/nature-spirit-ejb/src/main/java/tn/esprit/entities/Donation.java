package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Donation
 *
 */
@Entity

public class Donation implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Donation;
	private Float Amount_of_money;
	private Date Date_of_transfert;

	@ManyToOne
	private Member member;

	private static final long serialVersionUID = 1L;

	public Donation() {
		super();
	}

	public Integer getId_Donation() {
		return id_Donation;
	}

	public void setId_Donation(Integer id_Donation) {
		this.id_Donation = id_Donation;
	}

	public Float getAmount_of_money() {
		return this.Amount_of_money;
	}

	public void setAmount_of_money(Float Amount_of_money) {
		this.Amount_of_money = Amount_of_money;
	}

	public Date getDate_of_transfert() {
		return this.Date_of_transfert;
	}

	public void setDate_of_transfert(Date Date_of_transfert) {
		this.Date_of_transfert = Date_of_transfert;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}
