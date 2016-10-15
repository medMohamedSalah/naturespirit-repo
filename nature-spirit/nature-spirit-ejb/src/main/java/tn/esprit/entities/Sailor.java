package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Sailor
 *
 */
@Entity

public class Sailor extends Member implements Serializable {

	
	private String Num_Sailor;
	private static final long serialVersionUID = 1L;

	public Sailor() {
		super();
	}

	

	public String getNum_Sailor() {
		return this.Num_Sailor;
	}

	public void setNum_Sailor(String Num_Sailor) {
		this.Num_Sailor = Num_Sailor;
	}

}
