package tn.esprit.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CommentId implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id_Member;
	private Integer id_Article;
        private Date Date_Of_Comment;

	public CommentId() {
		super();
	}

	public CommentId(Integer id_Member, Integer id_Article) {
		super();
		this.id_Member = id_Member;
		this.id_Article = id_Article;
		this.Date_Of_Comment=new Date();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_Article == null) ? 0 : id_Article.hashCode());
		result = prime * result + ((id_Member == null) ? 0 : id_Member.hashCode());
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
		CommentId other = (CommentId) obj;
		if (id_Article == null) {
			if (other.id_Article != null)
				return false;
		} else if (!id_Article.equals(other.id_Article))
			return false;
		if (id_Member == null) {
			if (other.id_Member != null)
				return false;
		} else if (!id_Member.equals(other.id_Member))
			return false;
		return true;
	}

	public Integer getId_Member() {
		return id_Member;
	}

	public void setId_Member(Integer id_Member) {
		this.id_Member = id_Member;
	}

	public Integer getId_Article() {
		return id_Article;
	}

	public void setId_Article(Integer id_Article) {
		this.id_Article = id_Article;
	}

    public Date getDate_Of_Comment() {
		return this.Date_Of_Comment;
	}

	public void setDate_Of_Comment(Date Date_Of_Comment) {
		this.Date_Of_Comment = Date_Of_Comment;
	}
}
