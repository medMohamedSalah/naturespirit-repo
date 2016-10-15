package tn.esprit.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Newsletter
 *
 */
@Entity

public class Newsletter implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Newsletter;
	private int User_Registration_Number;
	private String News_Subject;
	private String News_Contents;

	@OneToMany(mappedBy = "newsletter")
	private List<Member> members;

	private static final long serialVersionUID = 1L;

	public Newsletter() {
		super();
	}

	public Integer getId_Newsletter() {
		return id_Newsletter;
	}

	public void setId_Newsletter(Integer id_Newsletter) {
		this.id_Newsletter = id_Newsletter;
	}

	public int getUser_Registration_Number() {
		return this.User_Registration_Number;
	}

	public void setUser_Registration_Number(int User_Registration_Number) {
		this.User_Registration_Number = User_Registration_Number;
	}

	public String getNews_Subject() {
		return this.News_Subject;
	}

	public void setNews_Subject(String News_Subject) {
		this.News_Subject = News_Subject;
	}

	public String getNews_Contents() {
		return this.News_Contents;
	}

	public void setNews_Contents(String News_Contents) {
		this.News_Contents = News_Contents;
	}

}
