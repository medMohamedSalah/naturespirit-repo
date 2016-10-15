package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Account
 *
 */
@Entity

public class Account implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Account;
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "id_member_fk") private Member member;
	 */

	private Float Credit;

	@ManyToOne
	private Member member;

	private static final long serialVersionUID = 1L;

	public Account() {
		super();
	}

	public Integer getId_Account() {
		return id_Account;
	}

	public void setId_Account(Integer id_Account) {
		this.id_Account = id_Account;
	}

	public Float getCredit() {
		return this.Credit;
	}

	public void setCredit(Float Credit) {
		this.Credit = Credit;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

}
