package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity

public class Admin implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Admin;
	private String First_Name;
	private String Last_Name;
	private Date Date_Birth;
	private String Email;
	private String Login;
	private String Password;
	private String Profile_Picture;

	@OneToMany(mappedBy = "admin")
	private List<Reclamation> reclamations;

	@OneToMany(mappedBy = "admin")
	private List<Alert> alerts;

	@OneToMany(mappedBy = "admin")
	private List<Member> members;

	@OneToMany(mappedBy = "admin")
	private List<Product> products;

	@OneToMany(mappedBy = "admin")
	private List<Sea_Mission> sea_missions;

	@OneToMany(mappedBy = "admin")
	private List<Event> events;

	@OneToMany(mappedBy = "admin")
	private List<Photography_Competition> photography_competitions;

	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}

	public Integer getId_Admin() {
		return this.id_Admin;
	}

	public void setId_Admin(int id_Admin) {
		this.id_Admin = id_Admin;
	}

	public String getFirst_Name() {
		return this.First_Name;
	}

	public void setFirst_Name(String First_Name) {
		this.First_Name = First_Name;
	}

	public String getLast_Name() {
		return this.Last_Name;
	}

	public void setLast_Name(String Last_Name) {
		this.Last_Name = Last_Name;
	}

	public Date getDate_Birth() {
		return this.Date_Birth;
	}

	public void setDate_Birth(Date Date_Birth) {
		this.Date_Birth = Date_Birth;
	}

	public String getEmail() {
		return this.Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public String getLogin() {
		return this.Login;
	}

	public void setLogin(String Login) {
		this.Login = Login;
	}

	public String getPassword() {
		return this.Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}

	public String getProfile_Picture() {
		return this.Profile_Picture;
	}

	public void setProfile_Picture(String Profile_Picture) {
		this.Profile_Picture = Profile_Picture;
	}

	public List<Reclamation> getReclamations() {
		return reclamations;
	}

	public void setReclamations(List<Reclamation> reclamations) {
		this.reclamations = reclamations;
	}

	public List<Alert> getAlerts() {
		return alerts;
	}

	public void setAlerts(List<Alert> alerts) {
		this.alerts = alerts;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Sea_Mission> getSea_missions() {
		return sea_missions;
	}

	public void setSea_missions(List<Sea_Mission> sea_missions) {
		this.sea_missions = sea_missions;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public List<Photography_Competition> getPhotography_competitions() {
		return photography_competitions;
	}

	public void setPhotography_competitions(List<Photography_Competition> photography_competitions) {
		this.photography_competitions = photography_competitions;
	}

	public void setId_Admin(Integer id_Admin) {
		this.id_Admin = id_Admin;
	}

	// les getters et les setters de les relations 1..* de l'admin

}
