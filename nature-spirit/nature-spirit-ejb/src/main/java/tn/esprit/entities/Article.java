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
 * Entity implementation class for Entity: Article
 *
 */
@Entity

public class Article implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Article;
	private String Subject;
	private String Image;

	@ManyToOne
	private Member journalist;

	@OneToMany(mappedBy = "article")
	private List<Comment> comments;

	private static final long serialVersionUID = 1L;

	public Article() {
		super();
	}

	public Integer getId_Article() {
		return id_Article;
	}

	public void setId_Article(Integer id_Article) {
		this.id_Article = id_Article;
	}

	public String getSubject() {
		return this.Subject;
	}

	public void setSubject(String Subject) {
		this.Subject = Subject;
	}

	public String getImage() {
		return this.Image;
	}

	public void setImage(String Image) {
		this.Image = Image;
	}

	public Member getJournalist() {
		return journalist;
	}

	public void setJournalist(Member journalist) {
		this.journalist = journalist;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

}
