package tn.esprit.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Member
 *
 */
@Entity

public class Member implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id_Member;
	private String First_Name;
	private String Last_Name;
	private Date Date_Birth;
	private String Email;
	private String Password;
	private String Profil_Picture;
	private String Role;

	@ManyToOne
	private Newsletter newsletter;

	@OneToMany(mappedBy = "member")
	private List<Account> accounts;

	@OneToMany(mappedBy = "member")
	private List<Reclamation> reclamations;

	@OneToMany(mappedBy = "member")
	private List<Alert> alerts;

	@OneToMany(mappedBy = "member")
	private List<Donation> donations;

	@OneToMany(mappedBy = "member")
	private List<Photography_Competition> photoCompetitions;

	@OneToMany(mappedBy = "journalist")
	private List<Photography_Competition> photoCompetition_journalists;

	@ManyToOne
	private Admin admin;

	// les relations de journalists

	@OneToMany(mappedBy = "journalist")
	private List<Article> articles;

	// les relations de classe d'association

	@OneToMany(mappedBy = "member")
	private List<Details> details;

	@OneToMany(mappedBy = "member")
	private List<Agenda> agendas;

	@OneToMany(mappedBy = "member")
	private List<Comment> comments;

	@OneToMany(mappedBy = "sailor")
	private List<Mission_Sailor> mission_sailors;

	private static final long serialVersionUID = 1L;

	public Member() {
		super();
	}

	public Integer getId_Member() {
		return id_Member;
	}

	public void setId_Member(Integer id_Member) {
		this.id_Member = id_Member;
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

	public String getPassword() {
		return this.Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
	}

	public String getProfil_Picture() {
		return this.Profil_Picture;
	}

	public void setProfil_Picture(String Profil_Picture) {
		this.Profil_Picture = Profil_Picture;
	}

	public String getRole() {
		return this.Role;
	}

	public void setRole(String Role) {
		this.Role = Role;
	}

   ////////////////////////////////////

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

    
	public Newsletter getNewsletter() {
		return newsletter;
	}

	public void setNewsletter(Newsletter newsletter) {
		this.newsletter = newsletter;
	}

   /////////////////////////////////////////

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
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

	public List<Donation> getDonations() {
		return donations;
	}

	public void setDonations(List<Donation> donations) {
		this.donations = donations;
	}

	public List<Photography_Competition> getPhotoCompetitions() {
		return photoCompetitions;
	}

	public void setPhotoCompetitions(List<Photography_Competition> photoCompetitions) {
		this.photoCompetitions = photoCompetitions;
	}

	public List<Photography_Competition> getPhotoCompetition_journalists() {
		return photoCompetition_journalists;
	}

	public void setPhotoCompetition_journalists(List<Photography_Competition> photoCompetition_journalists) {
		this.photoCompetition_journalists = photoCompetition_journalists;
	}
    
	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public List<Details> getDetails() {
		return details;
	}

	public void setDetails(List<Details> details) {
		this.details = details;

	}

	public List<Agenda> getAgendas() {
		return agendas;
	}

	public void setAgendas(List<Agenda> agendas) {
		this.agendas = agendas;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Mission_Sailor> getMission_sailors() {
		return mission_sailors;
	}

	public void setMission_sailors(List<Mission_Sailor> mission_sailors) {
		this.mission_sailors = mission_sailors;
	}

}
